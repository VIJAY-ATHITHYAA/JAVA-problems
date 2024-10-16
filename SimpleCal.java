// Implement a simple calculator and use this keyword to set the user input (+, -, * ,/, %  and operand values). 
// Use separate method for every operation. 
// Use switch case to call the corresponding function in the class.
import java.util.Scanner;

public class SimpleCal {
    char opt;
    int op1,op2;
    public SimpleCal(char opt,int op1,int op2) {
       this.opt = opt;
       this.op1 = op1;
       this.op2 = 
    }
    void sum()
    {
        System.out.println("Sum = "+(op1+op2));
    }
    void sub()
    {
        System.out.println("Sub = "+(op1-op2));
    }
    void mul()
    {
        System.out.println("Mul = "+(op1*op2));
    }void div()
    {
        System.out.println("Div = "+(op1/op2));
    }
    void mod()
    {
        System.out.println("Mod = "+(op1%op2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Operator :");
        char opt = sc.next().charAt(0);
        System.out.println("Enter A and b Operands: ");
        int op1 = sc.nextInt();
        int op2 = sc.nextInt();
        SimpleCal s = new SimpleCal(opt,op1,op2);
        switch(opt)
        {
            case '+':
               s.sum();
               break;
            case '-':
               s.sub();
               break;
            case '*':
               s.mul();
               break;
            case '/':
               s.div();
               break;
            case '%':
               s.mod();
               break;
        }
    }
}
