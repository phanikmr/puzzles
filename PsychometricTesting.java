import java.util.Scanner;

public class PsychometricTesting {

    static int[] passedCandidates(int[] scores, int[] lowerL, int[] higherL){
        int[] result = new int[lowerL.length];
        for(int i=0;i<lowerL.length;i++){
            int count = 0;
            for (int j=0; j<scores.length; j++){
                if(scores[j]>= lowerL[i] && scores[j]<=higherL[i])
                    count++;
            }
            result[i]=count;
        }
        return result;
    }

    static int[] readArray(int n, Scanner sc){
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = sc.nextInt();
        }
        return temp;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int scores[] = readArray(n,sc);
        int l = sc.nextInt();
        int lowerL[] = readArray(l,sc);
        int h = sc.nextInt();
        int higherL[] = readArray(h,sc);
        int[] passed = passedCandidates(scores, lowerL,higherL);
        for (int count:
             passed) {
            System.out.println(count);
        }
    }
}
