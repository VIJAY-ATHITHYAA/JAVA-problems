import java.util.*;
// Write a program to get a polynomial degree of a polynomial and its coefficient as input and get the
// input for the variable in the polynomial and compute the value of the expression 
// (Use static methods and variables). 

class PolyCal
{
    static int degree;
    static int coeff[];
    static void getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Degree: ");
        degree = sc.nextInt();
        coeff = new int[degree+1];
        System.out.println("Enter the Coeffiecents: ");
        for(int i=0;i<=degree;i++)
        {
            System.out.println("Enter for X^"+i);
            coeff[i] = sc.nextInt();
        }
        System.out.println("The Given Expression :");
        for(int i=0;i<=degree;i++)
        {
            System.out.print(coeff[i]+"X^"+i+"+");
        }
        System.out.println();
    }
    static void CalPoly(int x)
    {
       int sum = coeff[0];
       for(int i=1;i<=degree;i++)
       {
          sum+=(coeff[i]*Math.pow(x,i));
       }
       System.out.println("The Computed Value = "+sum);
    }
}

public class Poly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PolyCal.getInput();
        System.out.println("Enter the Value to Compute: ");
        int x = sc.nextInt();
        PolyCal.CalPoly(x);
    }
}
