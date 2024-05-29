package Hard.CheckBrackets;

public class Main {
    public static void main(String[] args) {
        String bracker1 = "[ { () } ]";
        String bracker2 = "[ [ { ] } ]";

        System.out.println(ValidBrackers.isValid(bracker1));
        System.out.println(ValidBrackers.isValid(bracker2));


    }
}
