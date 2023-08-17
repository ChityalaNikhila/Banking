package BFactory;

public class Loanaccount extends Bankaccount {
    int l = 10;

    @Override
    void createaccount() {
        System.out.println("loan account created");

    }


        @Override
        void interstrate(int p){
            int si;
            si=(p*l)/100;

            System.out.println("The interest amount is : "+si);
        }




}
