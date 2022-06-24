import java.util.Scanner;

class PowerOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N value");
        int N = in.nextInt();
        if(0>N && N>31){
            System.exit(0);
        }
        for(int i=0;i<N;i++){
            System.out.println((int)Math.pow(2,i));
        }

    }
}
