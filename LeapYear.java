import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        
        //import scanner Sysem.in
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Year ");
        int year = input.nextInt();

        boolean isLeapYear = 
        ( year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println("Is " + year + " is a Leap Year? " + isLeapYear);
    }
    
}
