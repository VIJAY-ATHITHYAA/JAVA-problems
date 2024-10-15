import java.util.Scanner;

class Area{
    long len,bre;
    Area(long len,long bre){
        this.len = len;
        this.bre = bre;
    }
    void findArea(){
        System.out.println("Area = "+(len*bre));
    }
}

public class AreaRect{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lenght: ");
        long len = sc.nextLong();
        System.out.println("Enter the breath: ");
        long bre = sc.nextLong();
        Area a = new Area(len,bre);
        a.findArea();
    }
}