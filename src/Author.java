public class Author {
    private String author;
private String authorSurname;
    public Author(String author, String authorSurname) {
        this.author = author;
        this.authorSurname = authorSurname;
    }


    public String getAuthor() {
        return this.author;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }
}