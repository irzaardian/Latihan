import java.util.Random;

public class Soal6 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] firstname = { "admiring",
                "adoring",
                "affectionate",
                "beautiful",
                "blissful",
                "bold",
                "charming",
                "clever",
                "cool",
                "dazzling",
                "determined",
                "distracted" };
        String[] lastname = {
                "agnesi",
                "albattani",
                "allen",
                "babbage",
                "banach",
                "banzai",
                "cannon",
                "carson",
                "cartwright",
                "darwin",
                "davinci",
                "dewdney"
        };
        int firstname_pick = random.nextInt(firstname.length);
        int lastname_pick = random.nextInt(lastname.length);

        System.out.println(firstname[firstname_pick] + "_" + lastname[lastname_pick]);
    }
}
