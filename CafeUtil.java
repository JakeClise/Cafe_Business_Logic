import java.util.ArrayList;
public class CafeUtil {

    public String customerGreeting(String name){
        return String.format("Welcome to the Cafe, %s, how can I help you today?", name);
    }


    public int getStreakGoal(){
        int sum = 0;

        for(int i = 1; i <= 10; i = i +1){
            sum = sum + i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double orderTotal = 0;
        for (int i = 0; i < prices.length; i++){
            orderTotal = orderTotal + prices[i];
        }
        return orderTotal;    
    }

    void displayMenu(ArrayList<String> menuItems){


    }
}