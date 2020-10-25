import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kap7GradesTest {
        int grade;

    @Test
    public void studentTest(){
        String[] students = {"john", "paul", "mie"};

        assertEquals(students[2], "mie");
        assertEquals(students[0], "john");
    }

    /*@Test
    public void grades(){

        assertTrue(grade());
    }*/

}