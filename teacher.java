package ujianpbo;

public class teacher extends person {
    private int numCourses = 0;
    private String[] courses = new String[30];

    public teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false;
            }
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        boolean found = false;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                found = true;
                
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                break;
            }
        }
        return found;
    }

    public String toString() {
        return "Teacher: " + super.toString();
    }
}