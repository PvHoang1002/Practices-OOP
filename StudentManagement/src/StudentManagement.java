public class StudentManagement {
    Student[] students = new Student[100];
    int index = 0;

    /**
     * Check same group.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }

    public static void main(String[] args) {

    }

    /**
     * Add student to array.
     */

    public void addStudent(Student newStudent) {
        this.students[this.index] = new Student(newStudent);
        this.index++;
    }

    /**
     * Group students.
     */
    public String studentsByGroup() {
        String studentList = "";
        int[] mark = new int[this.index];
        for (int i = 0; i < this.index; i++) {
            if (mark[i] == 0) {
                mark[i] = 1;
                studentList = studentList + this.students[i].getGroup() + "\n";
                studentList = studentList + this.students[i].getInfo() + "\n";
                for (int j = i + 1; j < this.index; j++) {
                    if (sameGroup(this.students[i], this.students[j])) {
                        mark[j] = 1;
                        studentList = studentList + this.students[j].getInfo() + "\n";
                    }
                }
            }
        }
        return studentList;
    }

    /**
     * Remove student.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < this.index; i++) {
            if (this.students[i].getId().equals(id)) {
                for (int j = i; j < this.index - 1; j++) {
                    this.students[j] = this.students[j + 1];
                }
                this.index--;
                break;
            }
        }
    }
}

