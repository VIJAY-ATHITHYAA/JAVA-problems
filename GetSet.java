// Write a JAVA program to get the details in a Stationary shop (Item ID, Name, Color, Price) using getter and setter 
// (Use array of objects)
import java.util.*;
class Stationary{
     int id;
     String name;
     String color;
     int price;
    void setDetails(int id,String name,String color,int price)
    {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
    }
    void getdetails()
    {
        System.out.println("Product-Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Price: "+price);
    } 
}
public class GetSet {
    public static void main(String[] args) {
        int id,price;
        String color,name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Items Count: ");
        int n = sc.nextInt();
        Stationary s[] = new Stationary[n];
        for(int i=0;i<n;i++)
        {
            s[i] = new Stationary();
            System.out.println("Enter the Detail :Item "+i);
            System.out.print("Product-Id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println();
            System.out.print("Price: ");
            price= sc.nextInt();
            sc.nextLine();
            System.out.println();
            System.out.print("Name: ");
            name= sc.nextLine();
            System.out.println();
            System.out.print("Color : ");
            color= sc.nextLine();
            System.out.println();
           s[i].setDetails(id, name, color, price);
        }
       System.out.println("Enter the Id to Search: ");
       int id1 = sc.nextInt();
       for(int i=0;i<n;i++)
       {
          if(s[i].id == id1)
          {
            s[i].getdetails();
          }
       }
    }
}
