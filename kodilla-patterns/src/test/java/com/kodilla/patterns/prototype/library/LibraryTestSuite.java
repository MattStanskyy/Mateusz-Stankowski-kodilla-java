package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        //creating the Library with books
        Library library = new Library("Library 1");
        Book book11 = new Book("Book title: 11", "Author: 11", LocalDate.of(2011, 12, 21));
        library.getBooks().add(book11);
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Book title: " + n, "Author: " + n, LocalDate.of(2000 + n, 1 + n,10 + n))));

        //making a shallow copy of Library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library  2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of Library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library  3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book11);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(10, library.getBooks().size());
        assertEquals(10, clonedLibrary.getBooks().size());
        assertEquals(11, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
