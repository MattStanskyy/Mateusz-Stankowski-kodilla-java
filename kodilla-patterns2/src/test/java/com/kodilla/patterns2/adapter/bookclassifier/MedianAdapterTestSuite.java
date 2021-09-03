package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author 1", "Title 1", 2001, "qwerty"));
        bookSet.add(new Book("Author 2", "Title 2", 2002, "azerty"));
        bookSet.add(new Book("Author 3", "Title 3", 2003, "asdfgh"));
        bookSet.add(new Book("Author 4", "Title 4", 2004, "zxcvbn"));
        bookSet.add(new Book("Author 5", "Title 5", 2005, "tyuiop"));
        bookSet.add(new Book("Author 6", "Title 6", 2006, "mnbors"));

        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int result = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(result,2004);
    }
}
