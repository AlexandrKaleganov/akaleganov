package ru.job4j.prof;
/**
 * В задании было сказанно пофантаируйте ну вообщем я нафантазировал...
 *
 * Учитель, Пациент, Врач, являются наследниками класса Profession
 *
 * Все остальные созданые классы находятся в пакете ru.job4j.prof.dopclass;
 * Пациент и Студент являются наследниками от класса Human
 * Auto Lift и Pc  - наследники класса Equipment
 *
 * 1 класс Инженер на него было большая часть дня потрачена инженера он умеет  чиниь только чинить
 * но есть ещё класс Utils  это типо диагностический центр там инженеру дат оборудование
 * и происходит диагностика  позволяет ли квалификация инженера починить оборудование? ,
 * не привысил ли срок эксплуатации сраока гарантии?
 * и если всё нормально то идет обращение в класс Engineer к методу  mends и инженер   ремонтирует 100%  - гарантия деваться некуда
 * тестовый класс на инженера и утилиты всё в одном сделано EngineerTest
 *
 * 2 клас учитель он учит студентов, и когда класс учител учит студентов, то у студентов повышаются знания))
 * intelect возрастает это обычный инт он просто прибавляется на +5 каждый раз как учитель преподаёт урок Студенту
 * ещё учитель может принимать экзамен и если знания у студента достаточно Intelect 100 или больше то
 * в зачётную книжку студенту ставится Зачёт, если знаний недостаточно то  в зачётку ставится НЕЗАЧЁТ  эти константы беруться из класса Knijka
 *
 * 3 Класс доктор может диагностировать пациентов и лечить их обратите вниманеи что у мациентов есть показатель уровня здоровья health
 * при создании класса пациент ему рандомно присваиваится дабл значение от 0 до 100 типо как при рождении сколько бог дал здоровья столь и есть
 * диагноз у пациента по умолчанию - не проходил обследование
 * вот врач его диагностирует и ставит диагноз либо здоров либо болен и в диагозе меняется запис - т.е. если здоровье меньше 70
 * то он болен, если больше то здоров, в тестировании класса доктор, я продиагностировал пациента и отправил его на лечение
 * во время лечения у пациента уровень зоровья увеличивается на 30 едениц,  и после врач опять предлогает пациенту пройти обследование
 * я пробывал несколько раз но разброс великоват, пациент либо зоров как бык, либо болень что лечить бесполено)))
 */