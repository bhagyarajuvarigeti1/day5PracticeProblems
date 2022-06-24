import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter year");
        int year = in.nextInt();
        if(year<10000 && year>999){
            System.out.println(year + " is not a  4 digit number");
            System.exit(0);
        }
        if(year%400 == 0){
            System.out.println(year + " is a leap year");
        }
        else if (year%100 == 0){
        System.out.println(year + " is not a leap year");
        }
        else if(year%4 == 0){
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
