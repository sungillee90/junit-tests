import java.util.ArrayList;

public class Student {
    //The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.

    // Created VARIABLES(properties/fields) to make the constructor.
//    private String studentName;
    private long studentId;
//    private ArrayList<Long> grades;

    // Constructor
    public Student(long anId) {
        this.studentId = anId;
//        this.studentName = aName;

        // initializes the grades property as an empty ArrayList. so we don't waste memory initializing the array VERY IMPORTANT
//        this.grades = new ArrayList<>();
        // init!
    }

    // GETTER
    public  long getId() {
        return this.studentId;
    }

//    public static String getName() {
//        return "sung";
//    }
//
//    public static int addGrade(int i) {
//        return i;
//    }
//
//    public static double getGradeAverage(double v) {
//        return v;
//    }
}
