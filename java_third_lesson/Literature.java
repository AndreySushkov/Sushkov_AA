public class Literature {
    private int id;
    private String type;
    private String title;
    private int yearOfPublication;
    private String nameOfPublishing;
    private int numberOfPages;
    private String author;

    public Literature(int id, String type, String title, int yearOfPublication, String nameOfPublishing, int numberOfPages, String author) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.nameOfPublishing = nameOfPublishing;
        this.numberOfPages = numberOfPages;
        this.author = author;
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
