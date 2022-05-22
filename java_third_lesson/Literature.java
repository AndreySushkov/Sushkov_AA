/*
 * Создать программу на языке Java для определения класса в некоторой предметной области. Описать свойства, конструктор,
 * методы геттеры/сеттеры, перекрыть метод toString() для выводв полной информации об объекте в отформатированном виде.
 * Вариант 10) Литература
 * */

public class Literature {
    private int id;     //id
    private String type;    //тип литературы
    private String title;   //название
    private int yearOfPublication;  //год издания
    private String nameOfPublishing;    //название издательства
    private int numberOfPages;  //количество страниц
    private String author;  //автор

    public Literature(int id, String type, String title, int yearOfPublication, String nameOfPublishing) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.nameOfPublishing = nameOfPublishing;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameOfPublishing() {
        return nameOfPublishing;
    }
    public void setNameOfPublishing(String nameOfPublishing) {
        this.nameOfPublishing = nameOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "Book \"" + title + "\" " + author + " " + yearOfPublication + " edition";
    }
}
