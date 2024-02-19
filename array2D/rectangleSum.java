
import java.util.Scanner;

public class rectangleSum {
    static int main(){
                Scanner sc=new Scanner (System.in);
                int l1= sc.nextInt();
                int r1= sc.nextInt();
                int l2= sc.nextInt();
                int r2= sc.nextInt();
                int r= sc.nextInt();
                int c= sc.nextInt();
                int [][] matrix = new int [r][c];

                for (int i=0; i<r; i++){
                    for (int j=0; j<c; j++){
                        matrix[i][j]= sc.nextInt();
                    }

                }
                findSum2(matrix[][], l1, r1, l2, r2);
            }
    static int findSum2(matrix[][], int l1, int r1, int l2, int r2) {
        int sum = 0;
        findPrefixSumMatrix(matrix);
        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1) {
                sum += class1[i][r2] - class1[i][r1 - 1];
            }

                else {
                    sum+= class1[i][r2];

                }
                return sum;
            
            
        }
    }

    
    static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
                
            }
}

