package assignment6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();

        Student s1=new Student(001, "Harry",3.3, parseDate("1998-12-24"));
        Student s2=new Student(002, "Ron",3.0, parseDate("1997-07-01"));
        Student s3=new Student(003, "Hermione",4.0, parseDate("1997-10-31"));
        Student s4=new Student(004, "Draco",3.8, parseDate("1997-11-06"));
        Student s5=new Student(005, "Luna",3.6, parseDate("1998-01-15"));

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println("*** Sort by ascending order of 'name' : ***");
        Collections.sort(students, (a, b) -> a.getName().compareTo(b.getName()));
        for (Student s : students) {
            System.out.println(s.getName());
        }

        System.out.println("*** Sort by descending order of 'gpa' : ***");
        Collections.sort(students, (a,b) -> (int)(b.getGpa()*10) - (int)(a.getGpa()*10));
        for (Student s : students) {
            System.out.println(s.getGpa());
        }


        System.out.println("*** Sort by ascending order of 'dateOfBirth' : ***");
        Collections.sort(students, (a,b) -> a.getDateOfBirth().getYear() - b.getDateOfBirth().getYear());
        for (Student s : students) {
            System.out.println(s.getDateOfBirth());
        }
    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
