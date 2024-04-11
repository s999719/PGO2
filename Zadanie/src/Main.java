// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        StudentGroup group = new StudentGroup();

        Student student1 = new Student("Michał", "Rybak", "123456", "michal@mail.com", "Wawa");
        Student student2 = new Student("Kuba", "Werulik", "789012", "kuba@mail.com", "Łódź");
        Student student3 = new Student("Ola", "Kowalska", "345678", "ola@mail.com", "Kielce");
        Student student4 = new Student("Kasia", "Nowak", "901234", "kasia@mail.com", "Gdnańsk");

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        try {
            group.addStudent(student3);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 0; i < 15; i++) {
                group.addStudent(new Student("Test", "Test", "00000", "test@mail.com", "Test"));
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());




            student1.addGrade(4.5);
            student1.addGrade(3.0);
            student1.addGrade(5.0);

            student2.addGrade(4.0);
            student2.addGrade(3.5);

            student3.addGrade(3.5);
            student3.addGrade(4.5);
            student3.addGrade(4.5);
            student3.addGrade(3.0);
            student3.addGrade(3.0);
            student3.addGrade(3.0);


            System.out.println("student 1: " + student1.policzSrednia());
            System.out.println("student 2: " + student2.policzSrednia());
            System.out.println("student 3: " + student3.policzSrednia());
        }
    }
}