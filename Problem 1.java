

import java.util.Scanner;
class student
{
    String name;
    int roll;
    double marks;
    int attendance;
    student(String name,int roll,int attendance)
    {
        this.name = name;
        this.roll = roll;
        this.attendance = attendance;
    }
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name = name;
    }
    int getRoll()
    {
        return roll;
    }
    void setRoll(int roll)
    {
        this.roll = roll;
    }
    double getMarks()
    {
        return marks;
    }
    void setMarks(double marks)
    {
        if(marks<0)
        {
            this.marks = 0;
        }
        else if(marks > 100)
        {
            this.marks = 100;
        }
        else 
        {
            this.marks = marks;
        }
    }
    int getAttendance()
    {
        return attendance;
        
    }
    void setAttendance(int attendance)
    {
        this.attendance = attendance;
    }
}
public class Main
{
    public static void main(String args[])
    {
        String name;
        int roll;
        double marks;
        int attendance;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("------------------------------------------Enter details of student------------------------------------");
        System.out.println("Enter Name:");
        name = Scanner.nextLine();
        System.out.println("Enter Roll Number:");
        roll = Scanner.nextInt();
        System.out.println("Enter Marks:");
        marks = Scanner.nextDouble();
        System.out.println("Enter Attendance:");
        attendance = Scanner.nextInt();
        student s1 = new student(name,roll,attendance);
        s1.setMarks(marks);
        System.out.println("Name: "+s1.name+"  "+" Marks: "+s1.marks+"  "+" Roll No.: "+s1.roll+"  "+" Attendance: "+s1.attendance);
        if(s1.attendance>75)
        {
            s1.setMarks(s1.marks+10);
        }
        System.out.println("After change: Name: "+s1.name+"  "+" Marks: "+s1.marks+"  "+" Roll No.: "+s1.roll+"  "+" Attendance: "+s1.attendance);
        System.out.println("--------------------------------------------------------------------------------------------------------");

    }

}
