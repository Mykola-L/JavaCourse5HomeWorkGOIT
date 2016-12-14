package Module2;

/**
 * Created by Liubov on 14.12.2016.
 */

public class Task3 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double withdrawal = 250;
        double totalToWithdraw=withdrawal+0.05*withdrawal;
        for (int i=0; i<balances.length;i++)  {
            if (balances[i]>=totalToWithdraw){
                balances[i] -=totalToWithdraw ;
                System.out.println("\n"+ownerNames[i]+ " " + withdrawal + " " + balances[i]);
            }else
                System.out.println("\n"+ownerNames[i]+ " "+"No");
        }
    }
}