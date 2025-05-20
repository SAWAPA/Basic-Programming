// Find the sum of the numbers

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Num: ");
        int num = sc.nextInt();

        int temp = 0;

        System.out.println(sum(num, temp));
    }

    public static int sum(int n, int temp){
        if(n == 0){
            return temp;
        }

        return sum(n - 1, temp + n);
    }
}
