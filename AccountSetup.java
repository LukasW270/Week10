import java.util.*;

public class AccountSetup{
    public static void main(String[] args){

        String user; String pass;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a user name: ");
        user = input.nextLine();

        System.out.print("Enter a password that is at least 8 characters: ");
        pass = input.nextLine();

        int passLength = pass.length();

        while (passLength < 8){

            System.out.print("Enter a password that is at least 8 characters: ");
            pass = input.nextLine();

            passLength = pass.length();

            if (passLength < 8){
                continue;
            }
            else{
                break;
            }
        }

        input.close();

        System.out.println("Your user name is " + user.toLowerCase() + " and your password is " + pass.toLowerCase());

        }

    }