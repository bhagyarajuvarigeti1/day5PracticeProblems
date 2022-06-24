import jdk.jfr.Percentage;

import java.util.Scanner;

public class flipCoin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int heads=0,tails=0;
        int flips=0;
        while (flips<100){
        if(Math.random()<0.5){
            tails++;
        }
        else {heads++;}
        flips++;
        }
        double Percentage_of_Head = (heads*100)/flips;
        double Percentage_of_tail=(tails*100)/flips;
        System.out.println(Percentage_of_Head+"  "+Percentage_of_tail);
    }
}
