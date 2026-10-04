package week2;

import java.util.Random;

public class Students {

    private String studentID;
    private String name;
    private String major;

    public static void main(String[] arg) {

        Students student = new Students();

        System.out.println(student.getStudentID("67xxx"));
        System.out.println(student.getFullname("Watcharin", "Sukpasoed"));

        // สุ่มคะแนน 0 - 100
        Random random = new Random();
        float score = random.nextInt(101);

        System.out.println("Score : " + score);
        System.out.println(student.getGrade(score));

        String firstname = "Watcharin";
        String lastname = "Sukpasoed";

        System.out.println("firstname is : " + firstname);
        System.out.println("lastname is : " + lastname);
        System.out.println("(from computer science)");
    }

    public String getStudentID(String studentID) {
        return "This is student ID : " + studentID;
    }

    public String getFullname(String fname, String lname) {
        return "This is fullname : " + fname + " " + lname;
    }

    public String getGrade(float score) {

        if (score >= 80) {
            return "Grade A";
        } else if (score >= 70) {
            return "Grade B";
        } else if (score >= 60) {
            return "Grade C";
        } else if (score >= 50) {
            return "Grade D";
        } else {
            return "Grade F";
        }
    }
}