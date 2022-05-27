public class FindArrayMax {
    public static int whileMax(int[] m) {
        int len, a, b;
        int i=0;
        int target=0;
        len = m.length;
        while (i < len-1) {
            a = m[i];
            b = m[i+1];
            if (a > b) {
                if (target < a) {
                    target = a;
                }
            } else{
                if (target < b) {
                    target = b;
                }
            }
            i += 1;
        }
        return target;
    }

    public static int forMax(int[] m) {
        int a, b;
        int target=0;
        for (int i=0; i < m.length-1; i+=1) {
            a = m[i];
            b = m[i+1];
            if (a > b) {
                if (target < a) {
                    target = a;
                }
            } else{
                if (target < b) {
                    target = b;
                }
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 66, 23,100, 6};  
        System.out.println(whileMax(numbers)); 
        System.out.println(forMax(numbers));     
     }
}
