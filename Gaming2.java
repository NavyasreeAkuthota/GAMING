import java.util.Scanner;
import java.util.concurrent.*;

public class Gaming2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1.Word Puzzle\n2.Jumbel word");
        System.out.println("Enter the game of your choice: \nPress number");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                WordPuzzle();
                break;
            case 2:
                JumbleWord();
                break;
            default:
                System.out.println("Enter valid choice: ");
                break;
        }
    }

    public static void WordPuzzle() {
        String[] a = { "Youtube", "Whatsapp", "Twitter", "Telegram", "Instagram","Webinar" };
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int j = ThreadLocalRandom.current().nextInt(a.length);
            String original = a[j];
            String org = shuffle(original);
            System.out.println(org);
            System.out.println("Enter answer: ");
            String ans = sc.next();
            if (original.equalsIgnoreCase(ans)) {
                System.out.println("Correct!\n");
                count++;
            } else {
                System.out.println("Wrong!\n");
            }
        }
        System.out.println("Your score: " + count);
    }

    private static String shuffle(String original) {
        int i = original.length();
        char[] origin = original.toCharArray();
        int j = ThreadLocalRandom.current().nextInt(i);
        int k = ThreadLocalRandom.current().nextInt(i);
        int l = ThreadLocalRandom.current().nextInt(i);
        origin[j] = '*';
        origin[k] = '*';
        origin[l] = '*';
        return new String(origin);
    }

    public static void JumbleWord() {
        int count = 0;
        String[] a = { "Laptop", "cable", "Charger", "Mobile","Ipod","Mouse"};
        for(int m = 0;m<a.length;m++)
        {
            int i = ThreadLocalRandom.current().nextInt(a.length);
            String original = a[i];
            String org = shuffleLetters(original);
            System.out.println(org);
            System.out.println("Enter your answer: ");
            String ans = sc.next();
            if (original.equalsIgnoreCase(ans)) {
                System.out.println("Correct!");
                count = count + 1;
            } else
                System.out.println("Wrong!");
        }System.out.println("total score: "+count);
    }

    private static String shuffleLetters(String original) {
        char[] origi = null;
        for (int k = 0; k < 10; k++) {
            int j = ThreadLocalRandom.current().nextInt(original.length());
            int l = ThreadLocalRandom.current().nextInt(original.length());
            origi = original.toCharArray();
            char temp = origi[j];
            origi[j] = origi[l];
            origi[l] = temp;
        }
        return new String(origi);
    }

}