public class SecondNewProblem {
    public static void main(String[] args) {
        int arr[]={-3,-2,1,5,8,6,8};
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for (int i = 0; i < (arr.length); i++) {
             if (max<arr[i]) {
                max=arr[i];
             }
             } int count  =0;
             for (int i = 0; i < arr.length; i++) {
                if (max==arr[i]) {
                        count=count++;                  }

             }
             
            int result=n-count;
              System.out.println(result);
        
    
}
}