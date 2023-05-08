/* The single responsibility principle states that every Java class must perform a single functionality. 
Implementation of multiple functionalities in a single class mashup the code and if any modification 
is required may affect the whole class. It precise the code and the code can be easily maintained. 
Let's understand the single responsibility principle through an example.
*/

class Student {
    public void addStudent() {
        System.out.println("Add Student.");
    }
}

class PrintDetails {
    public void printDetail() {
        System.out.println("Print Details.");
    }
}

class Percentage {
    public void percentage() {
        System.out.println("Percentage Calculate.");
    }
}

class SRP {
    public static void main(String[] args) {
        Student s = new Student();
        s.addStudent();

        PrintDetails p = new PrintDetails();
        p.printDetail();

        Percentage pe = new Percentage();
        pe.percentage();
    }
}