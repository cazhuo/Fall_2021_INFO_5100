package assignment3;

public class Psychiatrist {

    public Psychiatrist () {
    }

    //asks moody object about its mood
    public void examine(Moody moodyObject) {
        System.out.println("How are you feeling today?");
        moodyObject.queryMood();
    }


    //a moodyObject is observed to either laugh or cry
    public void observe(Moody moodyObject) {
        moodyObject.ExpressFeelings();
        System.out.println(moodyObject.toString());
    }

    //returns message about self: “Subject laughs a lot”
    public String toString(Moody moodyObject) {
        return moodyObject.toString();
    }

}
