package ru.oop.prof;
/**
 * доктор, умеед тиагностировать пациента
 * и пытается лечить его
 * методы доктора не будут возвращать значение, он будет просто ставить диагноз пациенту
 * и просто лечить пациента
 */

import ru.oop.prof.dopclass.*;

public class Doctor extends Profession {
    Position position;
    int kabinet;

    public int getKabinet() {
        return kabinet;
    }

    public Position getPosition() {
        return position;
    }

    public Doctor(String name, Sex sex, int experience, Education education, Position position, int kabinet) {
        super(name, sex, experience, education);
        this.position = position;
        this.kabinet = kabinet;
    }

    public void pacientDiagnoztika(Pacient pacient) {
        String result = "";
        if (pacient.getHealth() < 70.0) {
            pacient.setDiagnoz(Diagnoz.БОЛЕН);
            result = "Пациент " + pacient.getName() + " имеет уровень здоровья " + pacient.getHealth() + ". Диагноз: " + pacient.getDiagnoz();
        } else {
            pacient.setDiagnoz(Diagnoz.ЗДОРОВ);
            result = "Пациент " + pacient.getName() + " имеет уровень здоровья " + pacient.getHealth() + ". Диагноз: " + pacient.getDiagnoz();
        }
        System.out.println(result);
    }

    public void lecarsPacient(Pacient pacient) {
            pacient.setHealth(30.0);
            System.out.println("Пациент пролечен, нобходимо пройти диагностику");
        }
}


