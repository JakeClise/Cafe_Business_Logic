public class TestCafe {
    public static void main(String[] args) {
        
        CafeUtil cafeCommand = new CafeUtil();

        //Guest Greeting
            String customerGreeting = cafeCommand.customerGreeting("Jake");
            System.out.println(customerGreeting);
            
        //Streak Goal
            int streakGoal = cafeCommand.getStreakGoal();
            System.out.println("You reached the rewards total, your points total is: " + streakGoal);

        //Order totals
            double[] orderTotal = {3.50, 1.50, 4.00, 4.50};
            System.out.printf("Your order total is: $%s.", cafeCommand.getOrderTotal(orderTotal)); 
    }
}


