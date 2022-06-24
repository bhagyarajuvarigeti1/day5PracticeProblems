import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two values");
        int x=in.nextInt();
        int y=in.nextInt();
        int temp=x;
        x=x>y?x:y;
        y=temp<y?temp:y;
        System.out.println("Remainder = " +x%y);
        System.out.println("quotient = " + (int)((x-(x%y))/y));
    }
}
