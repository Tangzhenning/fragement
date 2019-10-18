package com.example.week05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/***
 * A class to simulate some data source existing. Use to practice intents and lists/RecyclerView
 * before going into APIs.
 *
 * Example usage:
 *      Article articleObject1 = FakeDatabase.getArticleById(1);
 *      System.out.println(articleObject1.getHeadline());
 *
 * Output:
 *      Diamonds, Warlords and Mercenaries: Russia’s New Playbook in Africa
 */
public class BookDatabase {


    /***
     * Retrieves an Article object using the provided id.
     */
    public static Book getBookById(int bookId) {
        return books.get(bookId);
    }

    /***
     * Return an ArrayList containing all the articles in the database.
     */
    public static ArrayList<Book> getAllBooks() {
        return new ArrayList<Book>((List) Arrays.asList(books.values().toArray()));
    }


    // You can ignore everything below this for now.
    private static final HashMap<Integer, Book> books = new HashMap<>();

    static {
        books.put(1, new Book(
                1,
                "Book 1",
                "Author 1",
                "Summary 1",
                "Content 1",
                R.drawable.article1_image
        ));
        books.put(2, new Book(
                2,
                "Book 1",
                "Author 1",
                "Summary 1",
                "Content 1",
                R.drawable.article1_image
        ));

        books.put(3, new Book(
                3,
                "Book 1",
                "Author 1",
                "Summary 1",
                "Content 1",
                R.drawable.article1_image
        ));

        books.put(4, new Book(
                4,
                "Book 1",
                "Author 1",
                "Summary 1",
                "Content 1",
                R.drawable.article1_image
        ));

        books.put(5, new Book(
                5,
                "Book 1",
                "Author 1",
                "Summary 1",
                "Content 1",
                R.drawable.article1_image
        ));

        books.put(6, new Book(
                6,
                "Book 1",
                "Author 1",
                "Summary 1",
                "Content 1",
                R.drawable.article1_image
        ));

        books.put(7, new Book(
                7,
                "Book 2",
                "Author 3",
                "Summary 10",
                "Content 1111",
                R.drawable.article6_image
        ));

    }
}