package xyz;


public class Encapsulation {
    
    private String name;
    private int rollNumber;
    private double marks;

   
    public void Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

   
    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    
    public boolean isPassed() {
        return marks >= 40;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Status: " + (isPassed() ? "Pass" : "Fail"));
    }

    
    public static void main(String[] args) {
        Encapsulation student = new Encapsulation ();
        student.displayInfo();
        student.setMarks(99);
        student.setRollNumber(3308);
        student.setName("Bhargavi");
        System.out.println("\nAfter updating marks:");
        student.displayInfo();
    }
}


