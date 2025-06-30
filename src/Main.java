import java.util.Scanner;

public class Main {
    public static void main(String [] args){
//        int age = 32;
//        int year = 2025;
//        int quantity = 1;
//
//        double price = 19;
//        double temperature = -12.6;
//        double gpa = 3.75;
//
//        char greet = 'H';
//        char symbol = '&';
//        char currency = '$';
//
//        boolean isGood = true;
//
//        String name = "klaus";
//        String food = "rice and beans";
//        String email = "fake123@gmail.com";
//
//
//        System.out.println("hello "+ name + "i like " + food);

        //input in java
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("What is your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("Your GPA is "+ gpa);
        System.out.println("you are "+ age + " years old");

        System.out.println("Are you a student? (true / false)");
        boolean isStudent = scanner.nextBoolean();

        if(isStudent){
            System.out.print("you are enrolled as a student");
        }else{
            System.out.println("You are not enrolled");
        }



        System.out.println("hello " + name);

        scanner.close();//this is important we need to close the action

    }
}
