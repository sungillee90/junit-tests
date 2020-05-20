import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;

public class StudentTest {

    @Test
    public void testIfIdMatches() {
        Student sung = new Student (1L);
        // static because you want to access the CLASS
        // expected:1000734727L   method called getID()
        assertEquals(1L, sung.getId());

    }

//    @Test
//    public void testIfNameMatches() {
//        assertEquals("sung", Student.getName());
//        assertNotEquals("Sung", Student.getName());
//        assertSame("sung", Student.getName());
//    }
//
//    @Test
//    public void testIfGradeAdded() {
//        assertEquals(85, Student.addGrade(85));
//    }
//
//    @Test
//    public void testIfReturnsAvg() {
//        assertEquals(80.0, Student.getGradeAverage(80d),0);
//    }
}
