import java.util.Arrays;
import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int[] nums = new int[3];
        for (int i=0;i < 3 ; i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[2] + "  is the largest amoung the three numbers");
    }
}
