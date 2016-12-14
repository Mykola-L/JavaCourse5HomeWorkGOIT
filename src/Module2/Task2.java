package Module2;

/**
 * Created by Liubov on 14.12.2016.
 */

public class Task2 {
    public static void main(String[] args) {
        double balance = 1000.0;
        double commission = 5.0;
        double sumToWithdraw = 900;
        double totalSumToWithdraw = sumToWithdraw + sumToWithdraw * (0.01 * commission);
        if (balance>=totalSumToWithdraw){
            balance -=totalSumToWithdraw ;
            System.out.println("OK" + " " + commission + " " + balance);
        }else
            System.out.println("No");


    }

}