package com.example.week05;

public class Book {
    // unique identifier of an article
    private int bookId;

    // Title of the book
    private String headline;
    // Name of the author
    private String author;
    // Short text to be displayed on main page
    private String summary;
    // Full text of the article
    private String content;
    // Resource ID of associated image (e.g. R.drawable.my_image)
    private int imageDrawableId;


    public Book(int bookId, String headline, String author, String summary, String content, int imageDrawableId) {
        this.bookId = bookId;
        this.headline = headline;
        this.author = author;
        this.summary = summary;
        this.content = content;

        // Added this line for temporary way of showing images
        this.imageDrawableId = imageDrawableId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int articleID) {
        this.bookId = articleID;
    }


    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }
}
