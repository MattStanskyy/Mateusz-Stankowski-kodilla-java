package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics theAverageStatistics = new Statistics();
        return theAverageStatistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics theMedianStatistics = new Statistics();
        return theMedianStatistics.medianPublicationYear(books);
    }
}
