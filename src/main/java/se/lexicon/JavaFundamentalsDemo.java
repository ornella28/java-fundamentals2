package se.lexicon;

public class JavaFundamentalsDemo {

    void main(){

        int speed = 100;

        IO.println("Speed is " + speed);
        speed = 120;
        IO.println("Speed is " + speed);

        double salary;
        salary = 5555.55;

        float area = 2.21f;

        long balance = 9999999999999999L;

        boolean isActive = true;

        char grade = 'A';

        int number1 = 10;
        int number2 = 5;
        IO.println(number1 / number2);
        IO.println(number1 % number2);

        int a = 10, b = 20;
        System.out.println(a == b);
        boolean isEqual = a == b;
        IO.println("a == b" + isEqual);

        int age = 22;

        if (age >= 18){
            System.out.println("you are eligible to vote");
        } else  {
            System.out.println("you are not eligible to vote");
        }

        int marks = 85;
        if (marks >= 90){
            System.out.println("Grade: A");
        } else if (marks >= 80){
            System.out.println("Grade: B");
        } else if (marks >= 70){
            System.out.println("Grade: C");
        } else if (marks >=55 || marks <=60){
            System.out.println("Grade: FX");
        }
        else {
            System.out.println("Grade: F");
        }


        int day = 3;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                    System.out.println("Tuesday");
                    break;

            default:
                System.out.println("INVALID DAY");
        }


    }
}
