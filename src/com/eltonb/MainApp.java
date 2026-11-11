package com.eltonb;

public class MainApp {
    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.go();
    }

    private void go() {
        Student[] students = generateStudents();

        Student[] csStudents = filterByDepartment(students, "CS");
        System.out.println(csStudents); //should output Turing, Church, Dijkstra

        Student sagan = new Student("Carl", "Sagan", "ASTR", 2.79, 60);
        Student[] students1 = append(students, sagan);
        System.out.println(students1); //should output all students + Sagan at the end

        Student[] students2 = removeFirst(students1);
        System.out.println(students1); //Turing is removed, all other students are outputted
    }

    private Student[] filterByDepartment(Student[] students, String cs) {
        return null;
    }

    private Student[] append(Student[] students, Student sagan) {
        return null;
    }

    private Student[] removeFirst(Student[] students1) {
        return null;
    }

    private Student[] generateStudents() {
        Student[] students = new Student[10];
        students[0] = new Student("Alan", "Turing", "CS", 3.87, 77);
        students[1] = new Student("Claude", "Shannon", "EE", 3.19, 100);
        students[2] = new Student("Isaac", "Newton", "PHYS", 3.91, 102);
        students[3] = new Student("Leonard", "Euler", "MATH", 3.82, 120);
        students[4] = new Student("Charles", "Darwin", "BIO", 3.01, 108);
        students[5] = new Student("Alonzo", "Church", "CS", 3.61, 98);
        students[6] = new Student("Edgser", "Dijkstra", "CS", 3.09, 107);
        students[7] = new Student("Albert", "Einstein", "PHYS", 3.62, 54);
        students[8] = new Student("Karl", "Gauss", "MATH", 2.78, 71);
        students[9] = new Student("Stephen", "Hawking", "PHYS", 3.03, 131);
        return students;
    }
}
