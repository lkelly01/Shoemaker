import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] lisArr = {1, 2, 3, 5, 4, 6, 10, 11, 12};
        System.out.println(lis(lisArr, 9));
    }

    public static int lis(int arr[], int n) {
        int subseqArr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
         subseqArr[i] = 1; 
        }
        
        System.out.println(Arrays.toString(subseqArr));

        for (int i = 0; i < n - 1; i++) {
          for (int j = i + 1; j < n; j++) {
            if (arr[j] > arr[j - 1] && subseqArr[j] < subseqArr[j - 1] + 1) {
             subseqArr[j] = subseqArr[i] + 1;
            } else {
                break;
            }
          }
        }

        System.out.println(Arrays.toString(subseqArr));
        
        int max = 1;
        
        for (int i = 0; i < n; i++) {
          if (max < subseqArr[i]) {
            max = subseqArr[i]; 
          }
        }
        
        return max;
    }
}