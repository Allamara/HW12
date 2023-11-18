public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("a1", "a2");
        Author a2 = new Author("a3", "a4");
        Book book1 = new Book("title1", 2022, a1);
        Book book2 = new Book("title2", 2023, a2);
        Book book3 = new Book ("title2",2022, new Author("a3", "a4"));

        System.out.println(book1.getTitle() + " - " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ". " + book1.getYear());
        book1.setYear(2021);
        System.out.println(book1.getYear());

        if (book1.equals (book3)){


    }
}