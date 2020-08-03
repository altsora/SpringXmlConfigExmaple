package entities.library;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private Author author;
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Book: " + name + " (" + author.getFirstName() + " " + author.getLastName() + ")";
    }
}
