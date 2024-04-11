public class StudentGroup {
    private Student[] students;
    private static int maxSize = 15;
    private int currentSize;

    public StudentGroup() {
        this.students = new Student[maxSize];
        this.currentSize = 0;
    }

    public void addStudent(Student student) {
        if (currentSize >= maxSize) {
            throw new IllegalStateException("Grupa jest pełna");
        }
        if (contains(student)) {
            throw new IllegalStateException("Student już należy do grupy");
        }
        students[currentSize++] = student;
    }

    //
    private boolean contains(Student student) {
        for (int i = 0; i < currentSize; i++) {
            if (students[i].equals(student)) {
                return true;
            }
        }
        return false;
    }
}