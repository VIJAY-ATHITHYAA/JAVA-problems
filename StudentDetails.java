import java.util.*;
class Student{
    int rollno,age;
    String name,dept;
    void setDetails(String name,int rollno,String dept,int age){
        this.rollno = rollno;
        this.age = age;
        this.dept = dept;
        this.name = name;
    }
    void display(){
        System.out.println("\nName : "+name+"\nAge : "+age+"\ndept: : "+dept+"\nRollNo: "+rollno);
    }
}

public class StudentDetails{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[5];
        int age,roll;
        String dept,name;
        for(int i=0;i<5;i++){
            s[i] = new Student();
            System.out.println("Enter the Student "+(i+1)+" details:\n");
            System.out.println("Name: ");
            name = sc.nextLine();
            System.out.println("Age: ");
            age = sc.nextInt();
            System.out.println("RollNo: ");
            roll = sc.nextInt();
            sc.nextLine();
            System.out.println("Dept: ");
            dept = sc.nextLine();
            s[i].setDetails(name,roll,dept,age);
        }
       System.out.println("Enter the Student Rollno: ");
       int key = sc.nextInt();
       int flag = 0;
       for(int i=0;i<5;i++){
           if(s[i].rollno==key){
               flag = 1;
               s[i].display();
           }
       }
       if(flag==0)
          System.out.println("RollNo does Not Match!!");
    }
}