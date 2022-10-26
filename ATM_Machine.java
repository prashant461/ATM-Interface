import java.util.Scanner;

public class ATM_Machine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;

        String username="prashant112";
        int userPin=2020;
        Operation op=new Operation();

        System.out.println("WELCOME!!");

        System.out.print("Enter your username: ");
        String name=sc.next();
        System.out.println("Enter your PIN: ");
        int pin=sc.nextInt();

        if(username.equals(name) && pin==userPin){
            System.out.println("You can now able to perform following Operation");
            while(true){
                System.out.println("***********************************************************");
                System.out.println("Enter 1 for Withdraw\nEnter 2 for Deposit\nEnter 3 for Check Balance\nEnter 4 for Transaction History\nEnter 5 for exit");
                System.out.println("Enter your choice here:");
                choice=sc.nextInt();

                switch (choice){
                    case 1:
                        System.out.print("Enter how much amount you want to withdraw:");
                        int wamount=sc.nextInt();
                        op.withdraw(wamount);
                        break;

                    case 2:
                        System.out.print("Enter how much amount you want to deposit:");
                        int damount=sc.nextInt();
                        op.deposit(damount);
                        break;

                    case 3:
                        op.checkBalance();
                        break;

                    case 4:
                        op.TransactionHistory();
                        break;

                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("Please enter valid choice:");
                }
            }

        }
        else{
            System.out.println("You enter wrong details");
        }
    }
}
