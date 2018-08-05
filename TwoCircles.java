import java.util.Scanner;

public class TwoCircles {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T != 0){

            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int R1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();
            int R2 = sc.nextInt();

            double dist = distance(X1,Y1,X2,Y2);
            double R = R1+R2;
            if(pointsMatch(X1,Y1,X2,Y2)) {
                System.out.println("Concentric");
            }else if(dist == R) {
                System.out.println("Touching");
            }else if(dist < R) {
                System.out.println("Intersecting");
            }else if(dist > R) {
                System.out.println("Disjoint-OutSide");
            }else {
                System.out.println("Disjoint-Inside");
            }
            T--;
        }
    }

    public static double distance(int x1,int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2,2));
    }

    public static boolean pointsMatch(int x1,int y1, int x2, int y2) {
        return x1==x2 && y1 == y2;
    }

}
