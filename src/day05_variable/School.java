package day05_variable;

public class School {
            /*Task: declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages*/

    public static void main(String[] args) {


        int numberOfStudentsInGrade1 = 30;
        int numberOfStudentsInGrade2 = 40;
        int numberOfStudentsInGrade3 = 25;
        int numberOfStudentsInGrade4 = 10;
        int numberOfStudentsInGrade5 = 38;
        System.out.println(numberOfStudentsInGrade1 + numberOfStudentsInGrade2
                + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5);
        int totalNumberOfStudents=numberOfStudentsInGrade1+numberOfStudentsInGrade2+numberOfStudentsInGrade3+numberOfStudentsInGrade4+numberOfStudentsInGrade5;
        double numberOfDaysInaYear = 100.5;
        double numberOfSnowDaysInaYear = 10;
        double averageGpaInSchool = 3.5;

        System.out.println("Number of Studentd in Grade 1:" +numberOfStudentsInGrade1);
        System.out.println("Number of Studentd in Grade 2:" +numberOfStudentsInGrade2);
        System.out.println("Number of Studentd in Grade 3:" +numberOfStudentsInGrade3);
        System.out.println("Number of Studentd in Grade 4:" +numberOfStudentsInGrade4);
        System.out.println("Number of Studentd in Grade 5:" +numberOfStudentsInGrade5);
        System.out.println("Total Number of Students " +totalNumberOfStudents);
        System.out.println(numberOfDaysInaYear);
        System.out.println("numberOfDaysInaYear = " + numberOfDaysInaYear);
        System.out.println(averageGpaInSchool);

    }




    }
