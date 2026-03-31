public class BestTimeToBuyAndSellStock {

    public static int Stock(int [] DayPrices){

        int min = DayPrices[0];
        int maxProfit =0;
        for (int i=1;i< DayPrices.length;i++){
            if (DayPrices[i]< min){
                min = DayPrices[i];
            }
            else{
                int currentProfit = DayPrices[i]-min;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;

                }
            }

        }
    return maxProfit;    

    }

public static void main (String args[]){
    int[] Prices = {1,2,610,23,58,97};
    int Profit = Stock(Prices);
    System.out.println(Profit);
}
    
}
