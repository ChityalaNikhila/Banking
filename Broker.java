package BFactory;

public class Broker {
    public Bankaccount getInstance(String str){
    if(str == "current"){
        return new Currentaccount();
    }
        else if (str == "loan") {
        return new Loanaccount();
    }
        else
                return new Savingaccount();

}
}
