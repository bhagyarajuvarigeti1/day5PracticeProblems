import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N value");
        int N=in.nextInt();
        System.out.print(1);
        for(int i=2;i<N;i++){
            if(N%i == 0 && prime(i)){
                System.out.print(" , " +i);
            }
        }
    }
    public static boolean prime(int i){
        for(int j=2;j<i;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}
