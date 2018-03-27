package ru.collection.rabota;
/**
 * @author Alexande Kaleganov
 * @since ProgrReadInputFileCONSOLE v.1.0
 * <p>
 * начало работы программы
 * программа считывает информацию с csv файла,
 * csv файл находится в корне проекта в папке file
 * при старте программы необходимо указать путь к файлу в нашем случае это "file//google.csv"
 * далее программа читает файл и вывоит в консоль
 */

import ru.collection.rabota.interfaceprogramm.Inputmenu;
import ru.collection.rabota.interfaceprogramm.OutputInterfac;

import java.io.FileNotFoundException;


public class StartPO {
    private final Inputmenu rid;
    private final OutputInterfac outt;


    StartPO(Inputmenu rid, OutputInterfac outt) {
        this.rid = rid;
        this.outt = outt;
    }

    public void arbeitenProgramm() {
        Redactorcoda redactor = new Redactorcoda();
        try {
            redactor.formatADDfullist(this.rid.input());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.outt.conclusion(redactor.getFulllist());

    }

    public static void main(String[] args) {
        StartPO startPO = new StartPO(new Readfile(), new OutputFileconsole());
        startPO.arbeitenProgramm();
    }


}
