import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] sizeInShopStr = scanner.nextLine().split(" ");
        int m = Integer.parseInt(scanner.nextLine());
        String[] sizeRequestedStr = scanner.nextLine().split(" ");
        boolean canReturn = true;

        for (int i = 0; i < m; ++i) {
            if (sizeRequestedStr[i].equals("XS")) {
                for (int j = 0; j < n; ++j) {
                    if (sizeInShopStr[j].contains("M") || sizeInShopStr[j].contains("L") || sizeInShopStr[j].equals("S") || sizeInShopStr[j].equals("XS")) {
                        canReturn = true;
                        sizeInShopStr[j] = "P";
                    } else {
                        canReturn = false;
                    }
                }
            } else if (sizeRequestedStr[i].equals("S")) {
                for (int j = 0; j < n; ++j) {
                    if (sizeInShopStr[j].contains("M") || sizeInShopStr[j].contains("L") || sizeInShopStr[j].equals("S")) {
                        canReturn = true;
                        sizeInShopStr[j] = "P";
                    } else {
                        canReturn = false;
                    }
                }
            } else if (sizeRequestedStr[i].equals("M")) {
                for (int j = 0; j < n; ++j) {
                    if (sizeInShopStr[j].contains("M") || sizeInShopStr[j].contains("L")) {
                        canReturn = true;
                        sizeInShopStr[j] = "P";
                    } else {
                        canReturn = false;
                    }
                }
            } else if (sizeRequestedStr[i].equals("L")) {
                for (int j = 0; j < n; ++j) {
                    if (sizeInShopStr[j].contains("L")) {
                        canReturn = true;
                        sizeInShopStr[j] = "P";
                    } else {
                        canReturn = false;
                    }
                }
            } else if (sizeRequestedStr[i].equals("XL")) {
                for (int j = 0; j < n; ++j) {
                    if (sizeInShopStr[j].contains("XXL")) {
                        canReturn = true;
                        sizeInShopStr[j] = "P";
                    } else {
                        canReturn = false;
                    }
                }
            } else if (sizeRequestedStr[i].contains("XXL")) {
                for (int j = 0; j < n; ++j) {
                    if (sizeInShopStr[j].contains("XXXL")) {
                        canReturn = true;
                        sizeInShopStr[j] = "P";
                    } else {
                        canReturn = false;
                    }
                }
            } else if (sizeRequestedStr[i].contains("XXS")) {
                for (int j = 0; j < n; ++j) {
                    if (sizeInShopStr[j].contains("M") || sizeInShopStr[j].contains("L") || sizeInShopStr[j].equals("S") || sizeInShopStr[j].equals("XS")) {
                        canReturn = true;
                        sizeInShopStr[j] = "P";
                    } else {
                        canReturn = false;
                    }
                }
            }
        }

        if (canReturn) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        
    }
}