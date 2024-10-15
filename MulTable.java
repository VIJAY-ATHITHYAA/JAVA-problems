
import java.util.Scanner;

// Print the multiplication table of 5 using 
// while loop and use a destructor to deallocate the memory.

public class MulTable {
    int n,rang;

    public MulTable(int n,int ran) {
      this.n = n;
      rang = ran;
    }
    
    void mulTable()
    {  
       if(rang == 0)
        { 
            System.out.println("you have given O Table");
            return;
        }
      else{
        for(int i=1;i<=rang;i++)
            {
               System.out.println(n+" X "+i+" = "+(n*i));
            }
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the Table: ");
        int n = sc.nextInt();
        System.out.println("Enter the Range: ");
        int rag = sc.nextInt();
        MulTable m = new MulTable(n,rag);
        m.mulTable();    
        System.gc();         
    }
}
