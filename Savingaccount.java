package BFactory;

public   class Savingaccount extends Bankaccount {
    int s = 6;

    @Override
    void createaccount() {
        System.out.println("saving account created");

    }

    @Override
    void interstrate(int p) {
        int si;
        si = (p * s) / 100;

        System.out.println("The interest amount is : "+si);
    }
}
