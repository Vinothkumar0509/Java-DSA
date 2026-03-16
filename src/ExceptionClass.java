import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Optional;

public class ExceptionClass {


    // Checked Exception
    void defineCheckedException() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/abc.txt");
    }


    // Un Checked Exception
    // Signup: new Password , repeat Password -> 1234 (Stored In DB)
    // sign: username, password -> sign in password must match with signup password
    void unCheckedException(String signupPassword, String signInPassword) {
//        if(signupPassword == null) {
//           throw new NullPointerException("cannot divide by Zero");
//        } else {
//            boolean isMatch = signupPassword.equals(signInPassword);
//            System.out.println(isMatch);
//        }

        try {
            if(signupPassword == null) {  // Objects.isNull(signupPassword)
                signupPassword = "";
            }

            boolean isMatch = signupPassword.equals(signInPassword);
            System.out.println(isMatch);
        } catch (NullPointerException ex) {
            System.out.println("Exception: "+ ex.getMessage());
        }


    }

    void arithmaticException() {
        int i = 10;
        int j = 0;
        int output = i/j;

        System.out.println(output);
    }


}