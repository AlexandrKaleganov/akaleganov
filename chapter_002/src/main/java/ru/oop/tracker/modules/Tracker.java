package ru.oop.tracker.modules;

/**
 * Item add(Item item) добавление заявок - и мы просто делаем один шаг по элемену++
 * public void replace(String id, Item item); редактирование заявок здесь у нас водит id  заявки и новые данные заявки
 * в методе id  присваивается объекту итем и после мы шагаем по массиву и ищем заявку с таким же id а когда накодим присваиваем этой заявке
 * новые знавения с входящей заявке при этом id  останется преждним
 * public void delete(String id); удаление заявок  ну здесь я придумал так - иду по массиву заявок нахоу заявку с нужным id
 * и присваиваю ей значеие null
 * public Item[] findAll(); получение списка всех заявок - этот метод нам просто возвращает массив заявок
 * public Item[] findByName(String key); получение списка по имени  - в этом методе я создал новый массив и шёл по старому массиву,
 * находил все заявки с похожим именем, для удобства поиска я спецально сделал чтобы мы могли искать совпадения
 * например если мы ищемвсе заявки в имени которых есть слово "хелп" - он их вернёт
 * public Item findById(String id); получение заявки по id находим заявку с нужным id и возвращаем пользвателю, ничего заумного
 * public Items getItemsIndex(int i)  - этот метод для удобства проверки по сути он нам в дальнейшем и не понадобится
 * по сути вроде ниего сложного но подумать и почитать литературу пришлось.главное опыта набраться а потом как говорится:
 * "опыт не пропьёшь, хотя попытки были..." ;)
 */
public class Tracker {
    private Items[] items = new Items[100];
    private int index = 0;

    public Items add(Items item) {
        this.items[index++] = item;
        return item;
    }

    public void replace(String id, Items items) {
        items.setId(id);
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                this.items[i] = items;
                break;
            }
        }
    }

    public void delete(String id) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId().equals(id)) {
                items[i] = null;
                break;
            }
        }
    }

    public Items[] findAll() {
        return items;
    }
    public Items[] findByName(String key) {
        int k = 0;
        Items[] res = new Items[items.length];
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getName().contains(key)) {
                res[k++] = this.items[i];
            }
        } return res;
    }

    public Items getItemsIndex(int i) {
        return this.items[i];
    }

    public Items findById(String id) {
        Items res = null;
        for (Items it:this.items) {
            if (it.getId().equals(id)) {
                res = it;
                break;
            }
        } return res;
    }

}
