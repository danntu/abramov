
import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Введите x->");
        int x=sc.nextInt();
        System.out.print("Введите y->");
        int y=sc.nextInt();
        
       // version a
       if (x>y) System.out.println("max = "+x);
       else System.out.println("max = "+y);
       
       //version b       
       if (x<y) System.out.println("min = "+x);
       else System.out.println("min = "+y);
       
    }
}
