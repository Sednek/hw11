import homework.Book;
import homework.Author;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Alexander", "Pushkin");
        Author lermontov = new Author("Mikhail", "Lermontov");

        Book onegin = new Book("Evgeniy Onegin", pushkin, 1833);
        Book heroOfOurTime = new Book("Hero of out time", lermontov, 1838);

        heroOfOurTime.setPublicationYear(2023);

        System.out.println("Title - " + heroOfOurTime.getTitle());
        System.out.println("Author - " + heroOfOurTime.getAuthor().getName() + " " + heroOfOurTime.getAuthor().getSurName() );
        System.out.println("Publication year - " + heroOfOurTime.getPublicationYear());

        System.out.println(" ");

        System.out.println("Title - " + onegin.getTitle());
        System.out.println("Author - " + onegin.getAuthor().getName() + " " + heroOfOurTime.getAuthor().getSurName() );
        System.out.println("Publication year - " + onegin.getPublicationYear());

    }
}