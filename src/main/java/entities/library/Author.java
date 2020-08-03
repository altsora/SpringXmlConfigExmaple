package entities.library;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "Author: " + firstName + " " + lastName + ", " + age + " year(s)";
    }
}
