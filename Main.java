
public class Main {

    public static void main(String[] args) {
        Studentmanager manager = new Studentmanager();
        Student student= new Student(1, "John Doe", 20, "Computer Science", "john.doe@example.com");
        student.displayStudent();
        
        Student s1 = new Student(
                2,
                "Sanjay",
                22,
                "IT",
                "sanjay@gmail.com"
        );

        Student s2 = new Student(
                3,
                "Suresh",
                23,
                "CSE",
                "suresh@gmail.com"
        );

       
        System.out.println("===== ADD STUDENTS =====");

        manager.add(s1);
        manager.add(s2);

        
        System.out.println("\n===== VIEW STUDENTS =====");

        manager.view();

        
        System.out.println("\n===== SEARCH STUDENT =====");

        manager.search(3);

        System.out.println("\n===== UPDATE STUDENT =====");

        manager.update(
                2,
                "San",
                21,
                "IT",
                "san@gmail.com"
        );

       
        System.out.println("\n===== AFTER UPDATE =====");

        manager.view();

        System.out.println("\n===== DELETE STUDENT =====");

        manager.delete(3);
        System.out.println("\n===== AFTER DELETE =====");

        manager.view();
    }
}
