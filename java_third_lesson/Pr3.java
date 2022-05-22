/*
* Создать программу на языке Java для определения класса в некоторой предметной области. Описать свойства, конструктор,
* методы геттеры/сеттеры, перекрыть метод toString() для выводв полной информации об объекте в отформатированном виде.
* Вариант 10) Литература
* */

public class Pr3 {
    public static void main(String[] attr) {
        Literature Dune = new Literature(123, "science fiction", "Dune", 1965, "NoName publish house");
        Dune.setAuthor("Frank Herbert");
        Dune.setNumberOfPages(554);
        System.out.println(Dune);
        System.out.println(Dune.getType());
    }
}
