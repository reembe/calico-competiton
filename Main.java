import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static String concatenateString(String S) {
        if (S.startsWith("calico")) {
            return S.substring(0, 6).toUpperCase() + S.substring(6);
        } else if (S.startsWith("alico")) {
            return "CALICO" + S.substring(5);
        } else if (S.startsWith("lico")) {
            return "CALICO" + S.substring(4);
        } else if (S.startsWith("ico")) {
            return "CALICO" + S.substring(3);
        } else if (S.startsWith("co")) {
            return "CALICO" + S.substring(2);
        } else if (S.startsWith("o")) {
            return "CALICO" + S.substring(1);
        } else {
            return S;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputStrings = new ArrayList<>();

        int T = scanner.nextInt();  // Number of test cases
        scanner.nextLine();  // Consume newline character

        // Read all input lines
        for (int i = 0; i < T; i++) {
            inputStrings.add(scanner.nextLine());  // Add input string to the list
        }

        scanner.close();

        // Process and print output
        for (String S : inputStrings) {
            System.out.println(concatenateString(S));  // Output the concatenated string
        }
    }
}
