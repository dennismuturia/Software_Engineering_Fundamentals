public class Main {

    public static void main(String[] args) {
        /*
        *This first is to findout the number of coins in a given coin types
         */
        int amount = 1000000;
        NumberOfCoins numberOfCoins  = new NumberOfCoins();
        System.out.println(numberOfCoins.coinNumber(amount));

    }
}
