public class Book {
    private String nameBook;
    private int age;
    private Author author;
    public Book(String nameBook, int age, Author author) {
        this.nameBook = nameBook;
        this.age = age;
        this.author = author;
    }


    public String getNameBook() {
        return this.nameBook;
    }

    public int getAge() {
        return this.age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public Author getAuthor() {
        return author;
    }
}
