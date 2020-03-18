package march.practice.chapter_1;

public class PasswordChecker {

    final String PASSWORD = "Very Secret Password";

    String checkPassword(String unverifiedPassword){
        return unverifiedPassword.equals(PASSWORD) ? "Password is correct" : "Password is incorrect";
    }
}
