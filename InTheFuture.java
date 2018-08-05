import java.util.Scanner;

public class InTheFuture {

    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        if(A>=K && P>=0){
            System.out.println(-1);
            return;
        }
        if(A<K && P==0){
            System.out.println(1);
            return;
        }
        int days = 0;
        int a = 0;
        int k = 0;
        while (true){
            days++;
            a += A;
            k += K;
            if(k-a > P)
                break;
        }
        System.out.println(days);
    }
}
