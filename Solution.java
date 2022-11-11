import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] errorCodes = new String[n];
        for (int i = 0; i < n; ++i) {
            errorCodes[i] = "no";
        }
        boolean allValid = true;
        String[][] inputStr = new String[n][2]; 
        for (int i = 0; i < n; ++i) {
            inputStr[i] = scanner.nextLine().split(" ");
        }
        
        for (int i = 0; i < n; ++i) {
            if (inputStr[i][1].equals("true")) {
                allValid = true;
            } else {
                allValid = false;
            }

            if (!allValid) {
                errorCodes[i] = inputStr[i][2];
            }
        }

        if (allValid) {
            System.out.print("Yes");
        } else {
            System.out.println("No");
            for (int i = 0; i < n; ++i) {
                if (!errorCodes[i].equals("no")) {
                    if (i == n-1) {
                        System.out.println(errorCodes[i]);
                    } else {
                        System.out.print(errorCodes[i] + " ");
                    }
                }
            }
        }
    }
}