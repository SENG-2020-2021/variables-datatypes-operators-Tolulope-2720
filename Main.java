class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day, amount the debtor has paid and assign values to them
   byte days_default=4;
   float amount_perday=400;
   float amount_paid=20700;
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
    float total_amount;
    int days_paid;
    int days_not_paid;
    float amount_left;
    int amount_remain;
   // calculate and print total amount the debtor is to pay
    total_amount=amount_paid+days_default*amount_perday+amount_paid%amount_perday;
    
    System.out.println("Your total amount to pay "+total_amount);
   // calculate and print the days the debtor paid for
    days_paid=(int)(amount_paid/amount_perday);
    System.out.println("You have paid for "+days_paid+" day(s)");
  // calculate and print the amount whose day was not captured because the amount was incomplete
    amount_remain=(int)(amount_paid%amount_perday);
    System.out.println("Amount left to complete a day "+amount_remain);
   // calculate and print amount the debtor is left to pay
    amount_left=days_default*amount_perday+amount_paid%amount_perday;
    System.out.println("Amount left to pay "+amount_left);
   // calculate and print days the debtor has not payed for
    days_not_paid=days_default;
    if(amount_paid%amount_perday>0)
    days_not_paid+=1;
    System.out.println("You have not paided for "+days_not_paid+" day(s)");
   //kindly remove the statement below when you are done with the assignment
   
  }
}