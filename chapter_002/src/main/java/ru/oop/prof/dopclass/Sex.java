package ru.oop.prof.dopclass;

/**
 * класс пол не знал как его организовать, пока только так, если переменная получает, значение 1
 * то возвращает значение String М если 2 то Ж, в противном случае будет требовать указать пол
 *
 * проверьте мою эту дурость обязательно я час потратил,
 * зациклило на создании класса правильно ли я этот момент продумал
 * класс Sex т.е. пол
 * удалось только передавать ссылку на объект м ж или "укажите пол" если это значение надо будет вывести,
 * то ссылку надо будет присвоить стринговому значению,
 * есть наверно шанс что я думаю в правильно направении
 * или может я ещё тупой и не знаю как это реализовать правильно и за каким то передаю ссылку
 *
 */
public class Sex {
    private String Mann = "М";
    private String Woomen = "Ж";
    private int sex;

    public Sex(int sex){
        this.sex = sex;
    }

    public Sex(){
        this.sex = sex;
    }

    public String opredeleniePollaPOznacheniu(int sex){
        String result;
        if (sex == 1){
            result = this.Mann;
        } else if (sex ==2){
            result = this.Woomen;
        } else {
            result = "укажите пол";
        }
        return result;
    }
}


