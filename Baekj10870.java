import java.util.Scanner;
public class Baekj10870 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] P = new int[20];
        P[0]=0;
        P[1]=1;
        if (n<=20 && n>=0){
            for (int i=2; i<=19; i++){
                P[i] = P[i-1] + P[i-2];
            }
        }
        System.out.println(P[n]);
    }
}
