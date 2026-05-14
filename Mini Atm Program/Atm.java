import java.util.*;
class Atm {

    float Balance;
    int PIN =  5674;
    Scanner input = new Scanner(System.in);

    public void checkpin() {
        
        for (int i = 1; i<=3; i++) {
            System.out.println("Enter Your Pin");
            int enteredpin = input.nextInt();
            if (enteredpin == PIN) {
                menu();
                break;
            } else if (enteredpin != PIN) {
                System.out.println("Invalid Pin");
                System.out.println((3-i ) + "Chances Left");
                
            } else if (i == 3){
                System.out.println("Your card is blocked");
            }

        }
    }

    public void menu() {

        System.out.println("Enter Your Choice");

        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        

        int opt = input.nextInt();

        if (opt == 1) {

            checkBalance();
           

        } else if (opt == 2) {

            WithdrawMoney();
          
        } else if (opt == 3) {

            DepositMoney();
           

        } else if (opt == 4) {

            return ;

        } else {

            System.out.println("Print A Valid Number Mother Fucker");
        }

    }

    public void checkBalance(){
        System.out.println("Balance" + Balance);
        menu();
    }
    public void WithdrawMoney(){
        System.out.println("Enter Withdrawal Amount Here:");
        float Amount = input.nextFloat();
        if (Amount > Balance) {
            System.out.println("Insufficent Fund");  
        } 
        else { Balance = Balance - Amount;
            System.out.println("Balance" + Balance);
        }
        menu();
    }

    public void DepositMoney(){
        System.out.println("Enter Deposit Amount Here:");
        Float Amount = input.nextFloat();
        Balance = Amount + Balance;
        System.out.println("Amount SuccesFully Deposit");
        menu();
    }

    public static void main(String[] args) {
        Atm obj = new Atm();
        obj1.
    }
} 






