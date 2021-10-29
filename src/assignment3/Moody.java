package assignment3;

public abstract class Moody {
    String mood;

    public Moody(String mood){
        this.mood = mood;
    }

    // Return the mood : sad or happy – depending on which object sends the message
    public abstract String getMood();

    // Each Object expresses a different motion
    public abstract void ExpressFeelings();


    //an object responds according to how it feels, print ”I feel Happy(or Sad) today!!”
    public void queryMood() {
            System.out.println("I feel " + mood + " today!!");
        }

    }




