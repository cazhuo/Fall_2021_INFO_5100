package assignment3;

public class Happy extends Moody{

    public Happy() {
        super("happy");
    }


    @Override
    public String getMood() {
        return this.mood;
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString() {
        return "Subject laughs a lot";
    }
}
