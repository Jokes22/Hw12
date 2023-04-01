public class Main {

    public static void main(String[] args) {
task1();
    }
    public static void task1 () {
        Book Teenager = new Book("Подросток", 1875);
        System.out.println("Teenager.getNameBook() = " + Teenager.getNameBook());
        System.out.println("Teenager.getAge() = " + Teenager.getAge());
        Author Teenager1 = new Author("Федор", "Достоевский");
        System.out.println("Teenager1.getAuthor() = " + Teenager1.getAuthor());
        System.out.println("Teenager1.getAuthorSurname() = " + Teenager1.getAuthorSurname());
        Book Auditor = new Book("Ревизор", 1836);
        System.out.println("Auditor.getNameBook() = " + Auditor.getNameBook());
        System.out.println("Auditor.getAge() = " + Auditor.getAge());
        Author Book1 = new Author("Николай", "Гоголь");
        System.out.println("Book1.getAuthor() = " + Book1.getAuthor());
        System.out.println("Book1.getAuthorSurname() = " + Book1.getAuthorSurname());
        Teenager.setAge(1900);
        Auditor.setAge(2000);
        System.out.println("Teenager.getAge() = " + Teenager.getAge());
        System.out.println("Auditor.getAge() = " + Auditor.getAge());
    }

}