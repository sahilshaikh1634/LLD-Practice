package org.sahil.LLD.SOLID.Invoice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Book {
    private String name;
    private String authorName;
    private int year;
    private int price;
    private String isbn;
}