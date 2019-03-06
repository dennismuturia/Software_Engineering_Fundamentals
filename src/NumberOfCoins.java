public class NumberOfCoins {
    static int coinNumber(int amount){
        //The types of coins
        int[] coinType = new int[]{1, 5, 10, 20};
        //I will be checking for all instances
        int count = 0;
        if(amount <= 0){
            return count;
        }
        for(int i = coinType.length-1; i >= 0; i--){
            if(amount > coinType[i]){
                count +=1;
                amount = amount - coinType[i];
                i = i + 1;
            }
            else if(amount == coinType[i]){
                count +=1;
                amount = amount - coinType[i];
            }
            else if (amount <= 0){
                return count;
            }
        }
        return  count;
    }
}
