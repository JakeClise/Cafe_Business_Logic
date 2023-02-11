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

    public void displayMenu(ArrayList<String> menuItems){
        for(int id = 0; id <menuItems.size(); id ++){
            System.out.printf("( %s %s ) ", id, menuItems.get(id));
        }
    }
    
    public void addCustomer(ArrayList<String> customerList){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello there %s!!", userName);
        customerList.add(userName);
        System.out.println(customerList);
    }
}