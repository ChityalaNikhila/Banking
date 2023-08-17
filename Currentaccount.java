package BFactory;

public class Currentaccount extends Bankaccount{
    int c=7;
    @Override
    void createaccount() {
        System.out.println("current account created");

    }
    @Override
    void interstrate(int p){
        int si;
        si=(p*c)/100;

        System.out.println("The interest amount is : "+si);
    }


}
