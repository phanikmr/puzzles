import java.util.Scanner;

public class BuyingShowTickets {


    static long waitingTime(int[] tickets, int p)
    {
        int tP = 0, ticketsP = tickets[p];
        for (int i = 0, n = tickets.length; i < n; ++i) {
            tP += Math.min(tickets[i], ticketsP - ((i > p)? 1: 0));
        }
        return tP;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        System.out.println(waitingTime(arr,p));
    }

}
