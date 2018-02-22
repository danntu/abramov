import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite a->");
        int a = sc.nextInt();

        System.out.print("Vvedite b->");
        int b = sc.nextInt();

        System.out.println("Summa a+b = "+(a+b));
        System.out.println("Raznost a-b = "+(a-b));
        System.out.println("Proizvedenie a*b = "+(a*b));
    }
}
