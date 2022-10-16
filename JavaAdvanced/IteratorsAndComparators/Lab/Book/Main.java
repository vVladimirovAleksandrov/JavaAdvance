package JavaAdvanced.IteratorsAndComparators.Lab.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 20002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        // Library library = new Library(bookOne, bookTwo, bookThree);

        // for (Book item : library) {
        //     System.out.println(item.getTitle());
        // }

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        books.sort(new BookComparator());
        for (Book book : books) {
            System.out.println(book.getTitle() + book.getYear());
        }

    }
}
