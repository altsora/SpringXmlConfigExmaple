import entities.library.Author;
import entities.library.Book;
import entities.library.Library;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class MainTest {
    private static ApplicationContext context;

    @BeforeClass
    public static void beforeClass() {
        context = new ClassPathXmlApplicationContext("config/config.xml");
        showBeans();
    }

    @Test
    public void initContext() {
        assertNotNull(context);
    }

    @Test
    public void createKingAndBrown() {
        Author king = context.getBean("king", Author.class);
        assertNotNull(king);
        Author brown = (Author) context.getBean("brown");
        assertNotNull(brown);
        System.out.println(king);
        System.out.println(brown);
    }

    @Test
    public void createBooks() {
        Book it = context.getBean("it", Book.class);
        Book inferno = context.getBean("inferno", Book.class);
        Book origin = context.getBean("origin", Book.class);
        assertNotNull(it);
        assertNotNull(inferno);
        assertNotNull(origin);
        System.out.println(it);
        System.out.println(inferno);
        System.out.println(origin);
    }

    @Test
    public void createLibrary() {
        Library library = context.getBean(Library.class);
        assertNotNull(library);
        library.showLib();
    }

    private static void showBeans() {
        String[] beans = context.getBeanDefinitionNames();
        System.out.println("Beans:");
        IntStream.range(0, beans.length)
                .forEach(i -> System.out.println("\t" + (i + 1) + ".\t" + beans[i]));
    }
}