public class Main {

    public static void main(String[] args) {
task1();
    }
    public static void task1 () {
        Author teenager = new Author("Федор", "Достоевский");
        Book Teenager = new Book("Подросток", 1875, teenager  );
        System.out.println("Teenager.getNameBook() = " + Teenager.getNameBook());
        System.out.println("Teenager.getAge() = " + Teenager.getAge());
        System.out.println("Teenager.getAuthor() = " + Teenager.getAuthor().getAuthor());
        System.out.println("Teenager.getAuthor() = " + Teenager.getAuthor().getAuthorSurname());
        Author auditor = new Author("Николай", "Гоголь");
        Book Auditor = new Book("Ревизор", 1836, teenager );
        System.out.println("Auditor.getNameBook() = " + Auditor.getNameBook());
        System.out.println("Auditor.getAge() = " + Auditor.getAge());
        System.out.println("Auditor.getAuthor() = " + Auditor.getAuthor().getAuthor());
        System.out.println("Auditor.getAuthor() = " + Auditor.getAuthor().getAuthorSurname());
    }

}