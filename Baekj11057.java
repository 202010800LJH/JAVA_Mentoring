import java.util.Scanner;

public class Baekj11057 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 10007;
        int[][] A = new int[n][10];
        for (int i=0; i<10; i++) A[0][i] = 1;
        for (int i=1; i<n; i++){
            for (int j=0; j<10; j++){
                for (int k=0; k<=j; k++){
                    A[i][j] += A[i-1][j-k];
                    A[i][j] %= mod;
                }
            }
        }
        int temp = A[n-1][0];
        for (int i=1; i<10; i++){
            temp += A[n-1][i];
            temp %= mod;
        }
        System.out.println(temp);
    }
}
