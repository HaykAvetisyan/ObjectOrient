package BraceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "((((((((((((5565((Hayk))[]";
        // st = (((([
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();


    }
}
