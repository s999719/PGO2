import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String indexNumber;
    private String email;
    private String address;
    private List<Double> grades;

    public Student(String firstName, String lastName, String indexNumber, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        if (grades.size() >= 20) {
            throw new IllegalStateException("Student może mieć maksymalnie 20 ocen");
        }
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Student nie ma ocen");
        }
        double sumaOcen = 0;
        for (double grade : grades) {
            sumaOcen += grade;
        }
        double sredniaOcen = sumaOcen / grades.size();
        return roundToNearestHalf(sredniaOcen);
    }

    private double roundToNearestHalf(double value) {
        return Math.round(value * 2) / 2.0;
    }
}