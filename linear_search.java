import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        int[] arr = {12, 45, 77, 46, 55, 102, 32, 99};
        int target = 55;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;
        }
    }
    return -1;
}
}
