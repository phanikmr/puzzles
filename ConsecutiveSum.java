import java.util.Scanner;

public class ConsecutiveSum {

    static long countConsecutive(long N)
    {
        long count = 0;
        for (long L = 1; L * (L + 1) < 2 * N; L++)
        {
            double a =  ((1.0 * N-(L * (L + 1)) / 2) / (L + 1));
            if (a-(long)a == 0.0)
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(countConsecutive(num));
    }
}
