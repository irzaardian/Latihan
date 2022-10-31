import java.util.ArrayList;
import java.util.Scanner;

public class FileNameCreator {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int element = 4;
        int i = 0;
        int sfx = 1;
        while (i < element) {
            String temp = sc.nextLine();
            String[] parts = temp.split(" ");
            if (!input.contains(parts[0])) {
                input.add(temp);
                i++;
            } else {
                if (parts[parts.length - 1].contains("(") && parts[parts.length - 1].contains(")")) {
                    String digits = parts[parts.length - 1].replaceAll("[^0-9]", "");
                    if (sfx == Integer.parseInt(digits)) {
                        sfx = Integer.parseInt(digits);
                        input.add(temp);
                        i++;
                    } else {
                        sfx++;
                        input.add(temp);
                        i++;
                    }
                } else {
                    sfx++;
                    input.add(temp + " (" + sfx + ")");
                    i++;
                }
            }
        }
        for (int x = 0; x < input.size(); x++) {
            System.out.println(input.get(x));
        }
        sc.close();
    }
}
