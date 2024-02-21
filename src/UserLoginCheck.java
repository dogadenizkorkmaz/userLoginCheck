import java.util.Scanner;
public class UserLoginCheck {
    public static void main(String[] args) {

        String userName, password, resetPassword, newPassword; //define valur

        Scanner doa = new Scanner(System.in); //define scanner

        System.out.print("Enter Your Username :"); //get userName value from user
        userName = doa.nextLine();

        System.out.print("Enter Your Password :"); // get password value from user
        password = doa.nextLine();

        if(userName.equals("patika")){ //status: correct username

            if(password.equals(("java123"))) { //status: correct password
                System.out.print("Login successful!");

            }else{ //status: correct username and wrong password
                System.out.print("Your password is incorrect. Would you like to reset it? yes / no: ");
                resetPassword=doa.nextLine();

                if (resetPassword.equals("yes")){ //get value for request from user
                    System.out.print("Please enter your New Password: ");
                    newPassword= doa.nextLine();

                    if (newPassword.equals(password)) { //user entered the wrong password again

                        System.out.print("Your new password cannot be the same as the password you entered incorrectly.");

                    }else {
                        if(newPassword.equals("java123")) { //user entered the Current password
                            System.out.print("Your new password cannot be the same as Current Password");

                        }else {
                            System.out.print("New password defined...  Login successful"); //user created new password
                        }
                    }

                } else {
                    System.out.println("Login Failed.Please try again."); //user denial
                }
            }

        } else{
            System.out.println("Username is Wrong. Please try again."); //status: wrong username
        }
    }
}