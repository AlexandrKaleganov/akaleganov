package ru.collection.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        if (this.tasks.size() == 0) {  // если длинна списка ровна нулю то мы просто добавим элемент
            this.tasks.add(task);
        } else if (this.tasks.size() < task.getPrioriti()) {  //иначе если новый нужный индекс больше длинны массива, то:
            if (this.tasks.getLast().getPrioriti() < task.getPrioriti()) { //мы проверим чья позиция больше
                this.tasks.add(task);        //если позиция нового элемента больше то мы добавим его в конец списка
            } else { //иначе мы поставим его вместо последнего элемента а последний элемент двинем
                this.tasks.add(this.tasks.size() - 1, task);
            }
        } else {
            this.tasks.add(task.getPrioriti() - 1, task);
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}
