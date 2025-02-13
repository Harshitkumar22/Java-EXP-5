class Person{    // Base class
    String name;
    public Person(String name){
        this.name=name;
    }

    public void showDetails(){
        System.out.println("Name: " + name);
    }

    public void performRole(){   // Default implementation (does nothing)
    }
}

class Staff extends Person{
    String staffId;
    public Staff(String name, String staffId){
        super(name);
        this.staffId=staffId;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Staff ID: " + staffId);
    }
}

class Professor extends Staff{
    String subject;
    public Professor(String name, String staffId, String subject){
        super(name, staffId);
        this.subject=subject;
    }

    public void performRole(){
        System.out.println(name + " is conducting a lecture on " + subject);
    }
}

class Student extends Person{
    String studentId;

    public Student(String name, String studentId){
        super(name);
        this.studentId=studentId;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Student ID: " + studentId);
    }
}

class GraduateStudent extends Student{
    String researchTopic;

    public GraduateStudent(String name, String studentId, String researchTopic){
        super(name, studentId);
        this.researchTopic=researchTopic;
    }

    public void performRole(){
        System.out.println(name + " has submitted a thesis on " + researchTopic);
    }
}

public class University{  // Main class to demonstrate polymorphism
    public static void main(String[] args){
        Person p1=new Professor("Satyam Sir", "S101", "OOPS");
        Person p2=new GraduateStudent("Harshit", "G202", "AI Research");

        Person[] people={p1, p2};   // Array of Person (Polymorphism)

        for (Person person : people){
            person.showDetails();
            person.performRole();  // Calls overridden method automatically
            System.out.println();
        }
    }
}
