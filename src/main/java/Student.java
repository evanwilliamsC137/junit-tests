import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private String name;
    private long id;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public long getId() {
        return id;
    }

    public static ArrayList<Integer> grades =new ArrayList<Integer>();


    public void addGrade(int grade) {
        if(grade>=0 && grade<=100){
            grades.add(grade);
        } else
            System.out.println("Invalid grade.");
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        return grades/grades.size();
    }
}
