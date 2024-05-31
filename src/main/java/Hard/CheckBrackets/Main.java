package Hard.CheckBrackets;

public class Main {
    public static void main(String[] args) {
        String bracker1 = "[ { () } ]";
        String bracker2 = "[ [ { ] } ]";

        System.out.println(ValidBrackets.isValid(bracker1));
        System.out.println(ValidBrackets.isValid(bracker2));


    }
}
