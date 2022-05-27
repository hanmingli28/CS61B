public class TriangleDrawer {
    public static void drawTriangle(int N) {
        int col = 0;
        int row = 0;
        int SIZE = N;
        String a = "*";
        while (row < SIZE){
            while (col <= row) {
                System.out.print(a);
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
            col = 0;
        }
    }
      
    public static void main(String[] args) {
       drawTriangle(10);
    }
 }