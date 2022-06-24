import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter X value");
        int x=in.nextInt();
        System.out.println("Enter Y value");
        int y=in.nextInt();
        int temp=x;
        x=y;
        y=temp;
        System.out.println("X value is :" +x +"     Y value is :" +y);
    }
}
