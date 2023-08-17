package BFactory;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Broker bf = new Broker();
        System.out.println("Enter the account name  : \n 1. Saving \n 2. Current \n 3. Loan");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str;
        switch (a) {
            case 1:
                str = "saving";
                break;
            case 2:
                str = "current";
                break;
            case 3:
                str = "loan";
                break;
            default:
                str = null;
                System.out.println("please enter a valid account");
        }
        Bankaccount ba = bf.getInstance(str);
        ba.createaccount();
        System.out.println("Please enter  amount");
        int p = sc.nextInt();
        ba.interstrate(p);
    }
}





