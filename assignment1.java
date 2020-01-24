import java.util.Scanner;

public class assignment1{

    public static void main(String args[]) {

        Scanner cx = new Scanner(System.in);

        String usersName;
        int usersAge;
        int usersIncome;
        int num1 = 12;
        int num2 = 30;

        System.out.println("Please enter your name:    ");
        usersName = cx.nextLine();

        System.out.println("Please enter your age:    ");
        usersAge = cx.nextInt();

        System.out.println("Please enter your Monthly Income:    ");
        usersIncome = cx.nextInt();

        cx.close();

        System.out.println("Hello, " +  usersName + ".  Nice to see you again!");
        if(usersAge>=num2) {
            System.out.println("You old fart!");
            }
        else{
            System.out.println("You young buck!");
        }

        System.out.println("Wow! $" +  (usersIncome*num1) + " in a year! Cha-ching!");
        
    }

}