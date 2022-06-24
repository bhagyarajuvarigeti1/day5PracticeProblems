import java.util.Scanner;
class HarmonixNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N value");
        int N=in.nextInt();
        if(N == 0){
            System.exit(0);
        }
        System.out.print("1/1");
        for(int i=2;i<=N;i++) {
            System.out.print("+1/" + i);
        }
    }
}
