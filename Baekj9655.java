import java.util.Scanner;
public class Baekj9655 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("찬영이 이김");
        }
        else System.out.println("상근이 이김");
    }
}
