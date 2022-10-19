import java.util.Objects;

public class DokuTest {
    static int sumCapital(String password){
        int sum = 0;
        char[] characters = password.toCharArray();
        for (char character : characters) {
            if (Character.isUpperCase(character)) {
                sum++;
            }
        }
        return sum;
    }

    static String lastThreeChars(String password){
        char[] characters = password.substring(password.length() - 3).toCharArray();
        StringBuilder sum = new StringBuilder();
        for(int i = characters.length-1; i >= 0; i--){
            sum.append(characters[i]);
        }
        return sum.toString();
    }

    static int sumDigit(String password){
        int sum = 0;
        char[] characters = password.toCharArray();
        for (char character : characters) {
            if (Character.isDigit(character)) {
                sum = sum + Character.getNumericValue(character);
            }
        }
        return sum;
    }

    static String password(String[] passwords, String checkString){
        String[] token = checkString.split("(?<=\\d)(?=\\D)|(?=\\d)(?<=\\D)");
        for(String password : passwords){
            boolean sameCapital = Integer.parseInt(token[0]) == sumCapital(password);
            boolean sameDigit = Integer.parseInt(token[2]) == sumDigit(password);
            boolean sameLastThree = Objects.equals(token[1], lastThreeChars(password));
            if(sameCapital && sameDigit && sameLastThree){
                return password;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String checkString = "4dro6";
        String[] passwords = {"PASS6word"};
        String correct = password(passwords, checkString);
        System.out.println(correct);
    }
}