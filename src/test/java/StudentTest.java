import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;

public class StudentTest {
    // todo DRY!
    //  Since there are Student sung = new Student again, again and again;
    Student sung;

    @Before
    public void initializeSetting() {
        sung = new Student (1L, "Sung");
    }

    @Test
    public void testIfIdMatches() {
        // id should be a long number used to represent a
        // "unique user" in our application.
//        Student sung = new Student(1L,"Sung");
        // sung.getId() -> GETTER
        assertEquals(1L, sung.getId());
    }

    @Test
    public void testIfNameWorks() {
        //name is a String that holds the name of the student.
//        Student sung = new Student(1L,"Sung");
        assertEquals("Sung",sung.getName());
    }

    // todo ADDITIONAL TEST WAS PERFORM TO MAKE SURE
    //  another thought process!
    @Test
    public void testIfGradeWorks() {
//        sung.getGrades().size(); // should be 0 bc I did not make any grade.
        assertEquals(0,sung.getGrades().size());
    }

    @Test
    public void testIfAddGradeWorks() {
        sung.addGrade(80);
//        sung.getGrades().get(0); // 80
        assertEquals(80.0, sung.getGrades().get(0),0);
        assertTrue(80 ==  sung.getGrades().get(0));
        assertFalse(90 ==  sung.getGrades().get(0));
        // add another grade
        sung.addGrade(100);
        assertEquals(100, sung.getGrades().get(1),0);
    }

    @Test
    public void testIfAvgWorks() {
        assertEquals(0,sung.getAverage(),0);
        sung.addGrade(100);
        sung.addGrade(70);
        sung.addGrade(80);
        // 250 / 3 = 83.333

        sung.getAverage();

        assertEquals(83.33, sung.getAverage(), 0.1);

        sung.addGrade(60);
        assertEquals(77.5,sung.getAverage(),0.1);

    }


}
