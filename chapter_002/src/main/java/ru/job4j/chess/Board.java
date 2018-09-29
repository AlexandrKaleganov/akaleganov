package ru.job4j.chess;

import ru.job4j.chess.exception.FigureNotFoundException;
import ru.job4j.chess.exception.ImpossibleMoveException;
import ru.job4j.chess.exception.OccupiedWayException;

public class Board {
    private Figure[] figures = new Figure[32];
    private int position = 0;

    private boolean searshLenght() {
        return false;
    }

    /**
     * принимает фигуру и проверяет не занята ли данная клетка другой фигурой после добавляет её
     *
     * @param newFigure
     */
    public void add(Figure newFigure) {
        boolean add = true;
        int temp = 0;
        for (int i = 0; i < this.figures.length; i++) {
            if (this.figures[i] != null) {
                if (this.figures[i].hashCode() == newFigure.hashCode()) {
                    add = false;
                }
            } else {
                temp = i;
            }
        }
        if (!add) {
            System.out.println(newFigure + ", фигуру нельзя поставить на клетку");

        } else {
            this.figures[temp] = newFigure;
        }
    }

    public boolean move(Cell source, Cell dest) throws OccupiedWayException, FigureNotFoundException, ImpossibleMoveException {
        boolean result = true;
        int temp = 0;
        boolean start = true;
        Cell[] way;
        //ищем фигуру в массиве
        for (int i = 0; i < this.figures.length; i++) {
            if ((this.figures[i] != null) &&
                    (this.figures[i].hashCode() == source.hashCode())) {
                start = false;
                temp = i;
                break;
            }
        }
       //  если фигура не найдена, то кидаем исключение FigueNotFound
        if (!start) {
            //если фигура найдена то проверяем может ли она пойти по заданному пути
            if (!this.figures[temp].isCondition(source, dest)) {
                throw new ImpossibleMoveException();  //если нет то выбросим исключение
            } else {
                way = this.figures[temp].way(source, dest);    //получили массив путь фигуры
                for (int i = 0; i < way.length; i++) {  //проходим новым массивом по старовм
                    for (int j = 0; j < this.figures.length; j++) {
                        if ((way[i] != null && this.figures[j] != null)) {
                            if (way[i].hashCode() == this.figures[j].hashCode()) {
                                //если хешкоды фигуры совпали то знаит на пути хода фигуры стоит другая фигура
                                //хешкоды у всех фигур переопределины хитрым образом x*10+y,
                                // что даёт нам точный координаты на пример x=3 y =2 хешкод получится 32
                                result = false;
                                break;
                            }
                        }
                    }
                }
                if (!result) {
                    throw new OccupiedWayException();
                } else {
                    this.figures[temp] = this.figures[temp].figureCopy(dest);
                }
            }
        } else {
            throw new FigureNotFoundException();
        }
        return result;
    }

    public Figure[] getFigures() {
        return figures;
    }
}