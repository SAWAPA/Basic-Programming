// this is how sort array by for loop and find the missing number

import java.util.Arrays;

public class SortAndFoundNum {
    public static void main(String[] args) {
        int [] arr1 = {3, 1, 4, 5, 2, 7, 8, 9, 10};

        demo1(arr1);
    }

    public static void demo1(int[] arr){
        int temp = 0;
        int num = 1;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                num++;
            }
            
        }
        System.out.println("Not Found: " + num);
    }
}
