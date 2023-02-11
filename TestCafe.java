import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCafe {
    public static void main(String[] args) {
        
        CafeUtil cafeCommand = new CafeUtil();

        //Guest Greeting
            System.out.println("---Guest Greeting---");
            String customerGreeting = cafeCommand.customerGreeting("Jake");
            System.out.println(customerGreeting);
            
        //Streak Goal
            System.out.println("---Streak Goal---");
            int streakGoal = cafeCommand.getStreakGoal();
            System.out.println("You reached the rewards total, your points total is: " + streakGoal);

        //Order totals
            System.out.println("---Order Totals---");
            double[] orderTotal = {3.50, 1.50, 4.00, 4.50};
            System.out.printf("Your order total is: $%s.", cafeCommand.getOrderTotal(orderTotal)); 
        
        //Menu Items
            System.out.println("");
            System.out.println("---Menu Items---");
            List <String> cafeMenu = Arrays.asList(
                "Drip Coffee",
                "Cappuccino",
                "Latte",
                "Mocha"
            );

            ArrayList<String> menu = new ArrayList<String>();
            menu.addAll(cafeMenu);
            cafeCommand.displayMenu(menu);
        

        //Add Customer
        System.out.println("--Add New Customer--");
        ArrayList<String> customers = new ArrayList<String>();
        //--Test 4 Times --
        for (int i = 0; i < 4; i++){
            cafeCommand.addCustomer(customers);
        }

    }
}


