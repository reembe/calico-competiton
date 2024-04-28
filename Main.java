import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = scanner.nextInt(); // Number of blocks
            scanner.nextLine(); // Move to the next line
            String S = scanner.nextLine(); // Initial state of blocks
            String E = scanner.nextLine(); // End state of blocks

            if (canCompleteCourse(S, E, N)) {
                System.out.println("YES");
            } else {
                System.out.println("banned");
            }
        }

        scanner.close();
    }

    private static boolean canCompleteCourse(String S, String E, int N) {
        int count = 0;
        if(S.length() == 4) return true;
        for(int i = 0; i < N; i++){
            if(S.substring(i,i+1).equals(E.substring(i,i+1))){
                count++;
                if(count > 4) return false;
                if(count == 4 && (i + 1 < N) && S.substring(i+1,i+2).equals("-")){
                    return false;
                }
            }
            else{
                count = 0;
            }
        }
        return true;
    }
}

// import java.util.ArrayList;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int T = scanner.nextInt();
//         ArrayList<Integer> results = new ArrayList<>();
//         for (int t = 0; t < T; t++) {
//             int N = scanner.nextInt();
//             int M = scanner.nextInt();
//             scanner.nextLine(); // Consume newline character

//             char[][] grid = new char[N][M];
//             for (int i = 0; i < N; i++) {
//                 String line = scanner.nextLine();
//                 grid[i] = line.toCharArray();
//             }

//             int[][] dp = new int[N][M];
//             boolean waterBucketUsed = false;

//             dp[0][0] = (grid[0][0] == 'D') ? 1 : 0; // Start position
//             for (int i = 0; i < N; i++) {
//                 for (int j = 0; j < M; j++) {
//                     if (i == 0 && j == 0) continue; // Skip the start position

//                     if (grid[i][j] == 'L' && !waterBucketUsed) {
//                         // Use water bucket to turn lava into obsidian
//                         for (int k = 0; k < N; k++) {
//                             if (grid[k][j] == 'L') grid[k][j] = 'O';
//                         }
//                         for (int k = 0; k < M; k++) {
//                             if (grid[i][k] == 'L') grid[i][k] = 'O';
//                         }
//                         waterBucketUsed = true;
//                     }

//                     if (grid[i][j] == 'O' || grid[i][j] == 'D') {
//                         int maxFromTop = (i > 0) ? dp[i - 1][j] : 0;
//                         int maxFromLeft = (j > 0) ? dp[i][j - 1] : 0;
//                         dp[i][j] = Math.max(maxFromTop, maxFromLeft) + ((grid[i][j] == 'D') ? 1 : 0);
//                     }
//                 }
//             }

//             results.add((dp[N - 1][M - 1] == 0) ? -1 : dp[N - 1][M - 1]);
//         }

//         for (int result : results) {
//             if (result == -1) {
//                 System.out.println("IMPOSSIBLE");
//             } else {
//                 System.out.println(result);
//             }
//         }
//     }
// }


// // import java.util.Scanner;
// // import java.util.ArrayList;

// // public class Main {

// //     public static String concatenateString(String S) {
// //         if (S.startsWith("calico")) {
// //             return S.substring(0, 6).toUpperCase() + S.substring(6);
// //         } else if (S.startsWith("alico")) {
// //             return "CALICO" + S.substring(5);
// //         } else if (S.startsWith("lico")) {
// //             return "CALICO" + S.substring(4);
// //         } else if (S.startsWith("ico")) {
// //             return "CALICO" + S.substring(3);
// //         } else if (S.startsWith("co")) {
// //             return "CALICO" + S.substring(2);
// //         } else if (S.startsWith("o")) {
// //             return "CALICO" + S.substring(1);
// //         } else {
// //             return S;
// //         }
// //     }

// //     public static void main(String[] args) {
// //         Scanner scanner = new Scanner(System.in);
// //         ArrayList<String> inputStrings = new ArrayList<>();

// //         int T = scanner.nextInt();  // Number of test cases
// //         scanner.nextLine();  // Consume newline character

// //         // Read all input lines
// //         for (int i = 0; i < T; i++) {
// //             inputStrings.add(scanner.nextLine());  // Add input string to the list
// //         }

// //         scanner.close();

// //         // Process and print output
// //         for (String S : inputStrings) {
// //             System.out.println(concatenateString(S));  // Output the concatenated string
// //         }
// //     }
// // }
