import java.util.Scanner;

public class FirstProblem {
    public static int linearnumber (int number[],int key,int n)
    {
        for (int i = 0; i <n; i++) {
          if (number[i]==key) {
            return i;
            
          }
           
        } return -1;
    }
    public static void main(String[] args) {
       int number[]={2,4,6,7 }; 
        int n=number.length;
        int key=7;
        int index= linearnumber(number, key,n);
        if (index==-1) 
            System.out.println("0");
        else{
            System.out.println("1");
        }
    }
}
