import java.util.Scanner;

/**
 * secondProblem
 */
public class secondProblem {

    public static void main(String[] args) {
        int arr[]={2,4,6,7,9,3};
       int n=arr.length; 
      
          int max=Integer.MIN_VALUE;
         for (int i = 0; i <n; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
            
        }int secondmax=Integer.MIN_VALUE;
        for (int i = 0; i <n; i++) {
            if (max==arr[i]) {
                continue;
            }
            if (secondmax<arr[i]) {
                secondmax=arr[i];
                
            }
        }System.out.println(secondmax);
    }
}