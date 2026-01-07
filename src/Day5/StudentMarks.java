//package Day5;
/* Create an interface Student with methods getMarks() and displayDetails(). 
Implement a class EngineeringStudent that implements this interface and stores marks for three subjects. */

interface Student {
    void getMarks(int subject1, int subject2, int subject3);
    void displayDetails();
}
class EngineeringStudent implements Student {
    int subject1, subject2, subject3;

    public void getMarks(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public void displayDetails() {
        System.out.println("Marks in Subject 1: " + subject1);
        System.out.println("Marks in Subject 2: " + subject2);
        System.out.println("Marks in Subject 3: " + subject3);
    }
}

public class StudentMarks {
    
    public static void main(String[] args) {
        EngineeringStudent engstudent=new EngineeringStudent();
        engstudent.getMarks(85, 90, 78);
        engstudent.displayDetails();
    }
}
