public class SixProblem {

         static boolean chkPair(int A[], int size, int x)
    {
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) {
                if (A[i] + A[j] == x) {
                    return true;
                }
            }
        }
 
        return false;
    }
 
    public static void main(String[] args)
    {
 
        int A[] = {2,3,4,5,6,7};
        int x = 9;
        int size = A.length;
 
        if (chkPair(A, size, x)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
