import java.util.ArrayList;
import java.util.Collection;

public class Student {
    //The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.

    // Created VARIABLES(properties/fields) to make the constructor.
    private long studentId;
    private String studentName;
    private ArrayList<Integer> grades;

    // Constructor
    public Student(long id, String name) {
        this.studentId = id;
        this.studentName = name;

        // initializes the grades property as an empty ArrayList. so we don't waste memory initializing the array VERY IMPORTANT
        this.grades = new ArrayList<>();
        // init!
    }


    // GETTER
    public  long getId() {
        return this.studentId;
    }

    // GETTER
    public String getName() {
        return this.studentName;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int grade) {
       this.grades.add(grade);
    }

    public double getAverage() {
        if(this.grades.size() == 0) {
            return 0;
        }
        double sum = 0;

        for (int grade: grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
