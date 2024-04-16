import java.util.*;

public class Monogram {
    public static void main(String[] args){

        String firstName; String initial; String lastName;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        firstName = input.next();

        System.out.print("Enter your middle initial: ");
        initial = input.next();

        System.out.print("Enter your last name: ");
        lastName = input.next();

        input.close();

        String one; String two; String three;

        one = firstName.substring(0,1);
        one = one.toLowerCase();

        two = lastName.substring(0,1);
        two = two.toUpperCase();

        three = initial.substring(0,1);
        three = three.toLowerCase();

        System.out.println();
        System.out.println("Your monogram is: " + one + two + three);

    }
}
