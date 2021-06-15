import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class PersonTester {

    private ArrayList<Person> people;

    @Before
    public void setUp() {
        this.people = new ArrayList<>();
        people.add(new Person("Joe",true));
        people.add(new Person("Dave",false));
        Person dave = new Person("Dave",true);
        people.add(dave);
        people.add(dave);
        people.add(new Person("Dave",true));

    }


    @Test
    public void testPerson() {
//        Person dave = new Person("Dave");
//        Person dave2 = new Person("Dave");

//        assertEquals(dave,dave2);
//        assertSame(dave,dave2);

        assertEquals("Dave", this.people.get(2).getName());
        assertSame(this.people.get(2), this.people.get(3).getName());

    }

    @Test
    public void arrayTest() {
        int[] arrayOfInts = {1,2,3,4};
        int[] yetMoreInts = {1,2,3,4};

//        assertEquals(arrayOfInts,yetMoreInts);
        assertArrayEquals(arrayOfInts,yetMoreInts);
    }

    @Test
    public void testForCool() {
        assertTrue(this.people.get(0).isCool());
        assertTrue("Joe is super cool.", this.people.get(0).isCool());
        assertFalse("David has never been cool.", this.people.get(1).isCool());
    }
}
