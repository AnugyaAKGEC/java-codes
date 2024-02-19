
import java.util.Scanner;
public class rectanglesumusingrowsandcols {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l1, l2, r1, r2, total, up, upleft, ans;
        l1 = sc.nextInt();
        r1 = sc.nextInt();
        l2 = sc.nextInt();
        r2 = sc.nextInt();

        int[][] matrix = new int[l2][r2];
        rectanglesum3(matrix);
        total =  matrix[l2][r2];
        left = matrix[l2][r1];
        up = matrix[l1][r2];
        upleft = matrix[l1][r1];
        ans = total - left - up + upleft;
        System.out.println(ans);
        findSum2( matrix, l1, r1, l2, r2);

    }

   

    static void rectangleSum3(int[][] matrix) {
        int r = matrix.length;
        if (r > 0) {
            int c = matrix[0].length;

        }
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 1; j < r; j++) {
                matrix[i][j] += matrix[i - 1][j];
            }

        }
    }

    static void findprefixsum(int[][] matrix) {
      int r = matrix.length;
        if (r > 0) {
            int c = matrix[0].length;

        }
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
 }
    static int findSum2(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        findPrefixSumMatrix(matrix);
        for (int i = l1; i <= l2; i++) {
            if (r1 > 0) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            }
            else {
                sum += matrix[i][r2];
            }
            
        }

        return sum;
    
  }
}
