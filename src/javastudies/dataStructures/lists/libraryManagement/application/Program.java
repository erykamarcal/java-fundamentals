package javastudies.dataStructures.lists.libraryManagement.application;

import javastudies.dataStructures.lists.libraryManagement.entities.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> bookList = new ArrayList<>();

        System.out.print("How many books will be registered? ");
        int bookCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= bookCount; i++) {
            System.out.println("book #" + i + ": ");
            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            while (hasBookId(bookList, id)) {
                System.out.println("Id already taken. Try again: ");
                id = scanner.nextInt();
                scanner.nextLine();
            }
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("available Quantity: ");
            int availableQuantity = scanner.nextInt();
            bookList.add(new Book(id, title, author, availableQuantity));
        }

        System.out.println("Enter the book id to borrow: ");
        int id = scanner.nextInt();

        Book bookFound = (bookList.stream().
                filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null));
        if (bookFound == null) {
            System.out.println("This book id does not exist!");
        } else if (bookFound.getAvailableQuantity() > 0) {
            bookFound.borrowBook();
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book unavailable");
        }

        System.out.println("Library catalog: ");

        for (Book book : bookList) {
            System.out.println(book);
        }

        scanner.close();
    }

    public static boolean hasBookId(List<Book> booklist, int id) {
        Book bookFound = booklist.stream().filter(livro -> livro.getId() == id).findFirst().orElse(null);
        return bookFound != null;
    }
}
