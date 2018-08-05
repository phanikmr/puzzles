import java.util.Scanner;

public class LargestSubsetSum {

    static int getMaximumSumWithLCMN(int N)
    {
        int sum = 0;
        int LIM = (int) Math.sqrt(N);
        for (int i = 1; i <= LIM; i++) {
            if (N % i == 0) {
                if (i == (N / i))
                    sum += i;
                else
                    sum += (i + N / i);
            }
        }

        return sum;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            int n = sc.nextInt();
            System.out.println(getMaximumSumWithLCMN(n));
            T--;
        }
    }
}
