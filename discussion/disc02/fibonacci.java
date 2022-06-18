public class fibonacci {
    public static int fib(int n) {
        int first = 0;
        int snd = 1;
        int ans=0;
        if (n==1){
            ans = first;
        } else if (n==2){
            ans= snd;
        } else {
            for(int i=0; i<n-2; i+=1){
                ans = first + snd;
                first = snd;
                snd = ans;
            }
        }
        return ans;
    }
    
    /* A better solution with recursion */
    public static int fib2(int n, int k, int f0, int f1){
        if (n==k){
            return f0;
        } else {
            return fib2(n, k+1, f1, f0+f1);
        }
    }
    public static void main(String[] args) {
//        for (int j=1; j<40 ; j+=1){
//            System.out.println(fib(j));
//        }
        System.out.println(fib2(8,0,0,1));
    }
}

