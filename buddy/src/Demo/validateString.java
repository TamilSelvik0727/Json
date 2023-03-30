package Demo;

public class validateString {
    public static void main(String[] args) {
        String input1 = "aximsoft123!axim*1";
        String input2 = "axim1234";

        String pattern = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[@#$%^&+=!*()_])[a-zA-Z0-9@#$%^&+=!*()_]+$";

        boolean isValid1 = input1.matches(pattern);
        boolean isValid2 = input2.matches(pattern);

        System.out.println("Input 1 is valid? " + isValid1);
        System.out.println("Input 2 is valid? " + isValid2);
    }
}

	
