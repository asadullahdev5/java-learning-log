import java.util.*;

class AtmMachine {

    float Balance;
    int PIN; 5674;

    public void checkpin() {

        System.out.println("Enter Your Pin");

        Scanner input = new Scanner(System.in);

        int enteredpin = input.nextInt();

        if (enteredpin == PIN) {

            menu();

        } else {

            System.out.println("Invalid Pin");
        }
    }

    public void menu() {

        System.out.println("Enter Your Choice");

        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner input = new Scanner(System.in);

        int opt = input.nextInt();

        if (opt == 1) {

            checkBalance();
            break ;

        } else if (opt == 2) {

            WithdrawMoney();
            break ;

        } else if (opt == 3) {

            DepositMoney();
            break ;

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
        Scanner input  = new Scanner(System.in);
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
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter Deposit Amount Here:");
        Float Amount = input.nextFloat();
        Balance = Amount + Balance;
        System.out.println("Amount SuccesFully Deposit");
        menu();
    }
}




