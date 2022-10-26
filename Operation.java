import java.util.HashMap;
import java.util.Map;

public class Operation {
    ATM atm=new ATM();
    Map<Integer,String> tHistory=new HashMap<>();

    public void withdraw(int amount){
        if(amount<=atm.getBalance()){
            atm.setBalance(atm.getBalance()-amount);
            tHistory.put(amount," Withdrawn!!");
            System.out.println("Collect your cash now!!");
            System.out.println("Available balance is "+atm.getBalance());
        }
        else{
            System.out.println("Your A/c don't have that much amount!");
        }

    }

    public void deposit(int amount){
        atm.setBalance(atm.getBalance()+amount);
        tHistory.put(amount," deposited!!");
        System.out.println(amount+" Deposited successfully!");
        System.out.println("Available balance is "+atm.getBalance());
    }

    public void checkBalance(){
        System.out.println("Your current balance is "+atm.getBalance());
    }

    public void TransactionHistory(){
        for(Map.Entry<Integer,String> m:tHistory.entrySet()){
            System.out.println(m.getKey()+m.getValue());
        }
    }
}
