package entities.library;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Library {
    private String owner;
    private List<Author> authors;
    private Map<Integer, Book> bookMap;

    public Library(String owner) {
        this.owner = owner;
    }

    public void showLib() {
        System.out.println("Library by " + owner + ":");
        bookMap.forEach((k, v) -> System.out.println("\tBook " + k + ":\t" + v.getName()));
    }
}
