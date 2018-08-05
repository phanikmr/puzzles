import java.util.Scanner;

public class FindTheWinner {

    static String findTheWinner(int[] andrea, int[] maria, boolean isEven){
        int scoreA = 0;
        int scoreM = 0;

        for(int i=isEven?0:1; i<andrea.length; i=i+2){
            scoreA += andrea[i]-maria[i];
            scoreM += maria[i]-andrea[i];
        }
        return scoreA > scoreM ? "Andrea" : "Maria";
    }

    static int[] readArray(int n, Scanner sc){
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = sc.nextInt();
        }
        return temp;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] andrea = readArray(m,sc);
        int n = sc.nextInt();
        int[] maria = readArray(n, sc);
        boolean isEven = sc.next().equals("Even")?true:false;
        System.out.println(findTheWinner(andrea,maria, isEven));
    }
}
