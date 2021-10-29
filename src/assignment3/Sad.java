package assignment3;

public class Sad extends Moody {

    public Sad() {
        super("sad");
    }


    @Override
    public String getMood() {
        return this.mood;
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("'waah' 'boo hoo' 'weep' 'sob'");
    }

    public String toString() {
        return "Subject cries a lot";
    }


}
