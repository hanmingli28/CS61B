public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        int[] b = new int[a.length];
        for (int i=0; i<a.length; i+=1){
            if (a[i]<=0){
                b[i] = a[i];
                continue;
            }
            for (int j=i; j<i+n+1; j+=1){
                if (j>=a.length){
                    break;
                }
                b[i] += a[j];
            }
        }
        for (int k=0; k<a.length; k+=1){
            a[k]=b[k];
        }
    }
  
    public static void main(String[] args) {
      int[] a = {1, 2, -3, 4, 5, 4};
      int n = 3;
      windowPosSum(a, n);
  
      // Should print 4, 8, -3, 13, 9, 4
      System.out.println(java.util.Arrays.toString(a));
    }
}