package university;

import school.School;

public class Student {
    public static void main(String[] args) {
        School school = new School(200, "Kozlova 5");
        System.out.println(school.number);
        System.out.println(school.address);
        System.out.println(school.getNumber());
        System.out.println(school.getAddress());

        school.number = 112;
        school.address = "Tolbyhina 4";
        school.setAddress("Lenina 9");
        school.setNumber(23);
    }
}
