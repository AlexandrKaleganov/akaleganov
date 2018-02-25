package ru.oop.tracker.modules;

/**
 * я так и не понял заким использовался интерфйс в данном случае... ,
 * к примеру мы могли сделать метод  в этом классе, который бы возвращал сканнер некст лайн.
 * и было бы тоже самое
 */
public class Tracker {
    private Items[] items = new Items[100];
    private int index = 0;

    /**
     * добавление заявок - и мы просто делаем один шаг по элемену++
     * @param item
     * @return
     */
    public Items add(Items item) {
        this.items[index++] = item;
        return item;
    }

    /**
     * редактирование заявок здесь у нас водит id  заявки и новые данные заявки
     * в методе id  присваивается объекту итем и после мы шагаем по массиву и ищем заявку с таким же id а когда накодим присваиваем этой заявке
     * новые знавения с входящей заявке при этом id  останется преждним
     * @param id
     * @param items
     */
    public void replace(String id, Items items) {
        items.setId(id);
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                this.items[i] = items;
                break;
            }
        }
    }

    /**
     * удаление заявок  ну здесь я придумал так - иду по массиву заявок нахоу заявку с нужным id
     * и присваиваю ей значеие null
     * @param id
     */
    public void delete(String id) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId().equals(id)) {
                items[i] = null;
                break;
            }
        }
    }

    /**
     * получение списка всех заявок - этот метод нам просто возвращает массив заявок
     * @return
     */
    public Items[] findAll() {
        return items;
    }

    /**
     * получение списка по имени  - в этом методе я создал новый массив и шёл по старому массиву,
     * находил все заявки с похожим именем, для удобства поиска я спецально сделал чтобы мы могли искать совпадения
     * например если мы ищемвсе заявки в имени которых есть слово "хелп" - он их вернёт
     * @param key
     * @return
     */
    public Items[] findByName(String key) {
        int k = 0;
        Items[] res = new Items[items.length];
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getName().contains(key)) {
                res[k++] = this.items[i];
            }
        } return res;
    }

    /**
     * получение заявки по id находим заявку с нужным id и возвращаем пользвателю, ничего заумного
     * @param id
     * @return
     */
    public Items findById(String id) {
        Items res = null;
        for (Items it:this.items) {
            if (it.getId().equals(id)) {
                res = it;
                break;
            }
        } return res;
    }

    /**
     * этот метод для удобства проверки по сути он нам в дальнейшем и не понадобится
     * @param i
     * @return
     */
//    public Items getItemsIndex(int i) {
//        return this.items[i];
//    }

}
