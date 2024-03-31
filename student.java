package ujianpbo;

public class student extends person {
    private int numCourses = 0;
    private String[] courses = new String[30];
    private int[] grades = new int[30];

    public student(String name, String address) {
        super(name, address);
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades() {
        System.out.println("Grades:");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }

    public String toString() {
        return "Student: " + super.toString();
    }
}
