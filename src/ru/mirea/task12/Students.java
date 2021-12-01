package ru.mirea.task12;

public class Students implements Comparable<Students>{
    private int ID;
    private int marks;
    private String name;
    private String surname;

    public Students(){
        this.ID = (int)(Math.random() * 10001);
        this.name = "Oleg";
        this.surname = "Cryst";
        this.marks = (int) (Math.random() * 101);
    }

    public Students(int ID, String name, String surname){
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.marks = (int) (Math.random() * 101);
    }

    public Students(int ID){
        this.ID = ID;
        this.name = "Ivan";
        this.surname = "March";
        this.marks = (int) (Math.random() * 101);
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "\n"+ ID + " - " + name + " " + surname + ";  Marks: " + marks;
    }

    @Override
    public int compareTo(Students student) {
        return Integer.compare(this.ID, student.ID);
    }
}
