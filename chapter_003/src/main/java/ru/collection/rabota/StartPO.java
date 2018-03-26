package ru.collection.rabota;
/**
 *  @author Alexande Kaleganov
 * @since ProgrReadInputFileCONSOLE v.1.0
 *
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
        try {
            this.outt.conclusion(this.rid.input("введите путь к файлу формата \"file//google.csv \", или введите \"exit\" для выхода из программы"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        StartPO startPO = new StartPO(new Readfile(), new OutputFileconsole());
        startPO.arbeitenProgramm();
    }
}
