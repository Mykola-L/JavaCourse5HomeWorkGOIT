package Module2;

/**
 * Created by Liubov on 14.12.2016.
 */

public class Task4  {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double fund = 250;
        for (int i=0; i<balances.length;i++)  {
            balances[i] +=fund ;
            System.out.println("\n"+ownerNames[i]+ " " + balances[i]);
        }
    }
}