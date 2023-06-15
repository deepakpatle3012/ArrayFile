import java.lang.reflect.Array;
import java.util.Arrays;

public class ThirdProblem {
         public static void arraysolution(int arr[]){
        int n = arr.length;
            Arrays.sort(arr);
        int max = 0;
        int min = 0;
        for(int i=n-1; i>=0; i--) {
            int max1 = arr[i];
            if(max1%2 == 0) {
                max = max1;
                break;
            }
        }
        for(int i=0; i<n; i++) {
            int min1 = arr[i];
            if(min1%2 == 1) {
                min = min1;
                break;
            }
        }
        int d = max-min;
        System.out.println(d);
    }
                 public static void main(String[] args) {
         int arr[]={1,2,8,12};
         arraysolution(arr);
    }
}