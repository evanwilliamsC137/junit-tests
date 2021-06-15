import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;


//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;


public class MyFirstTest {


    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void assertAreDifferent() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages,moreLanguages);

    }


    @Test
    public void assertArrayEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers,otherNumbers);
    }

    @Test
    public void assertTrueFalse() {
        String language = "PHP";

        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }

}

