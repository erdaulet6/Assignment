public class Main{
    public static void main(String[] args) {
        // Creating objects of Student and Aspirant classes
        Student student = new Student("Yerasyl", "Doktarbek", "Group A", 4.5);
        Aspirant aspirant = new Aspirant("Ramazan", "Kaliev", "Group B", 5.0, "Research Topic");

        // Creating an array of type Student containing both Student and Aspirant objects
        Student[] students = {student, aspirant};

        // Calling getScholarship() method for each array element
        for (Student s : students) {
            System.out.println(s.firstName + " " + s.lastName + ": Scholarship amount - $" + s.getScholarship());
        }
    }
}


