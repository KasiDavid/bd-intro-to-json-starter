package com.bloomtech;

import com.google.gson.annotations.SerializedName;

public class Book {
    private String title;
    private String authorName;
    private String firstSentence;
    @SerializedName("first_publish_year")
    private int firstPublishYear;
    @SerializedName("author_name")
    private String[] authorNameArray;
    @SerializedName("ia")
    private String[] firstSentenceArray;

    public Book(String title, String author, String firstSentence, int firstPublishYear, String[] authorArray, String[] firstSentenceArray) {
        this.title = title;
        this.authorName = author;
        this.firstSentence = firstSentence;
        this.firstPublishYear = firstPublishYear;
        this.authorNameArray = authorArray;
        this.firstSentenceArray = firstSentenceArray;
    }

    public String getAuthorName() {
        int i = 0;
        while (this.authorName == null) {
            this.authorName = authorNameArray[i];
            i++;
        }
        return authorName;
    }

    public String getFirstSentence() {
        if (firstSentence == null) {
            firstSentence = firstSentenceArray[0];
        }
        return firstSentence;
    }

    @Override
    public String toString() {
        return "\""+title+"\""+" by "+getAuthorName() + "(" +firstPublishYear+ ") \n" +getFirstSentence();
    }
}
