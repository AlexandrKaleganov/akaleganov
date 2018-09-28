package ru.job4j.chess;

import ru.job4j.chess.exception.ImpossibleMoveException;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author Alexander KAleganov
 * тут мы будем описывать абстрактное поведение игуры
 * как я понял абстрактные классы это практически те же интерфейсы, только мы
 * можем реализовывать методы
 */
public abstract class Figure {
    /**
     * автоматическая генерация положения фигыру на доске
     */


    private Cell begincoordinat;

    /**
     * если мы не хотим изначально указывать клетку фигуры
     * то генератор её сам сгенерирует
     */
    Figure() {
        this.begincoordinat = new Cell(new Random().nextInt(8) + 1, new Random().nextInt(8) + 1);
    }

    Figure(Cell begincoordinat) {
        this.begincoordinat = begincoordinat;
    }

    /**
     * может ли фигура пойти по заданым координатам если да, то вернуть пройденный путь
     *
     * @param source
     * @param dest
     * @return
     * @throws ImpossibleMoveException
     */
    abstract public Cell[] way(Cell source, Cell dest);

    abstract boolean isCondition(Cell source, Cell dest);

    abstract Figure figureCopy(Cell dest);


    public Cell getBegincoordinat() {
        return begincoordinat;
    }

    /**
     * переопределим метод экуалс, зараза ссылки сравнивает
     * этим макаром мы сможем сравнивать между собой все слассы наследникик
     * будь то слон, будь то ладья или другие фигуры, он удет сравнивать только координаты
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        boolean test = true;
        if (obj instanceof Figure) {
            Figure valid = (Figure) obj;
            if (obj != null && begincoordinat.getX() == valid.begincoordinat.getX() && begincoordinat.getY() == valid.begincoordinat.getY()) {
                test = true;
            } else {
                test = false;
            }
        } else {
            test = false;
        }
        return test;
    }

    @Override
    public int hashCode() {

        return this.getBegincoordinat().hashCode();
    }

    /**
     * переопределим метод toString  от класса Object для удобстав вывода
     *
     * @return
     */
    @Override
    public String toString() {
        return "На клетке" + "X: " + begincoordinat.getX() + "; Y: " + begincoordinat.getY() + "стоит фигура" + this.getClass();
    }

}
