import java.util.Scanner;
class ATM{
   float balance;
   int PIN = 3456;
   public void checkpin(){
          System.out.println("Enter PIN:");
          Scanner Sc = new Scanner(System.in);
          int enteredpin = Sc.nextInt();
          if(enteredpin == PIN){
                    menu();
          }
          else{
                    System.out.println("Enter valid Pin.");
          }
   }
   public void menu(){
                    System.out.println("Enter Your Choice:");
                    System.out.println("1. Check A/C Balance");
                    System.out.println("2. Withdraw Money");
                    System.out.println("3. Deposit Money");
                    System.out.println("4. Exit");
                    Scanner Sc = new Scanner(System.in);
                    int option = Sc.nextInt();
                    if(option == 1){
                              checkbalance();
                    }
                    else if(option == 2){
                              Withdrawmoney();
                    }
                    else if(option == 3){
                              Depositmoney();
                    }
                    else if (option == 4){
                              return;
                    }
                    else {
                              System.out.println("Enter a valid choice");
                    }
   }
   public void checkbalance(){
                    System.out.println("Balance: "+ balance);
                    menu();
          }

   public void  Withdrawmoney(){
                    System.out.println("Enter Money to withdraw: ");
                    Scanner Sc = new Scanner(System.in);
                    float amount = Sc.nextFloat();
                    if(amount>balance){
                              System.out.println("Insufficient Balance");
                    }
                    else{
                              balance = balance + amount;
                              System.out.println("Money withdrawl Successful");
                    }
                    menu();
   }
   public void Depositmoney(){
          System.out.println("Enter the amount:");
          Scanner Sc = new Scanner(System.in);
          float amount = Sc.nextFloat();
          balance = balance + amount;
          System.out.println("Money Successfully Deposited");
          menu();
   }
}
public class Main{
          public static void main(String args[]){
                    ATM obj = new ATM();
                    obj.checkpin();
          }
}
