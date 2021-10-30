package assignment3;

public class Main {

    public static void main(String[] args) {

        Psychiatrist psyc = new Psychiatrist();

        Happy happyPatient = new Happy();
        Sad sadPatient = new Sad();

        psyc.examine(happyPatient);
        psyc.observe(happyPatient);
        System.out.println();
        psyc.examine(sadPatient);
        psyc.observe(sadPatient);

    }

}
