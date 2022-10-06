public class Book {
    private String author;
    private String name; 
    private int year;
    private int pages; 

    public Book(String author, String name, int year, int pages) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }
    public Book() {
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}

//ТЕСТ в другую папку перекинуть

public class BookTest {
    public static void main(String[] args){
        Book book = new Book();

        book.setAuthor("Paul");
        book.setName("Dad and Son");
        book.setYear(2003);
        book.setPages(115);

        System.out.println(book);
    }
}