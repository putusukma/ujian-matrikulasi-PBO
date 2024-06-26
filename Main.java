package ujianpbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String studentName = scanner.nextLine();
        System.out.print("Masukkan alamat mahasiswa: ");
        String studentAddress = scanner.nextLine();
        Student student = new Student(studentName, studentAddress);

        System.out.print("Masukkan nama dosen: ");
        String teacherName = scanner.nextLine();
        System.out.print("Masukkan alamat dosen: ");
        String teacherAddress = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAddress);

        student.addCourseGrade("Matematika", 85);
        student.addCourseGrade("Fisika", 90);
        teacher.addCourse("Matematika");
        teacher.addCourse("Fisika");

        System.out.println(student);
        student.printGrades();
        System.out.println("Rata-rata nilai: " + student.getAverageGrade());
        System.out.println(teacher);

        scanner.close();
    }
}
