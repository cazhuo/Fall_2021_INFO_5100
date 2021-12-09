package assignment6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter year of birth using yyyy format\n");
        System.out.print("for example: 1995\n");
        while(sc.hasNext()){
            String dateOfBirthString = sc.next();
            try {
                if (dateOfBirthString.length() != 4) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.print("Wrong date format, please use yyyy format\n");
                continue;
            }
            Date dateOfBirth;
            try {
                dateOfBirth = new SimpleDateFormat("yyyy").parse(dateOfBirthString);
            } catch (Exception e) {
                System.out.print("Wrong date format, please use yyyy format\n");
                continue;
            }
            Date dateNow = new Date(System.currentTimeMillis());
            int age = dateNow.getYear() - dateOfBirth.getYear();
            try {
                if (age >= 16) {
                    System.out.println("Applicant is eligible to apply.");
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println(String.format("The age of the applicant is %d which is too early to apply for a driving license", age));
            }
        }
    }
}
