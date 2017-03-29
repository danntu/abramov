
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
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
