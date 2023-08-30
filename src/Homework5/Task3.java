package Homework5;

import java.util.ArrayList;

/**
 * НОП (наибольшая общая подпоследовательность) двух строк — это самая длинная последовательность символов, которая содержится и в первой, и во второй строке,
 * в том же порядке, но не обязательно подряд. Другими словами, это максимально длинная последовательность символов, которая является "общей" для обеих строк.
 */
public class Task3 {
    public static void main(String[] args) {

        String a = "AGGTAB";
        String b = "GXTXAYB";
        System.out.println(findComString(a, b));
    }

    public static String findComString(String a, String b) {
        int[][] matrix = new int[a.length() + 1][b.length() + 1];
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    int maxLen = (i == 0 || j == 0) ? 0 : matrix[i - 1][j - 1];
                    matrix[i][j] = maxLen + 1;
                } else {
                    int maxLen = (i == 0 || j == 0) ? 0 : Math.max(
                            matrix[i - 1][j], matrix[i][j - 1]);
                    matrix[i][j] = maxLen;
                }
            }
        }

        int i = a.length() - 1;
        int j = b.length() - 1;
        ArrayList<Character> restList = new ArrayList<>();
        while (i >= 0 && j >= 0) {
            if (a.charAt(i) == b.charAt(j)) {
                restList.add(a.charAt(i));
                i--;
                j--;
            } else {
                if (matrix[i - 1][j] >= matrix[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }
        StringBuilder reBuilder = new StringBuilder(restList.size());
        for (int k = restList.size() - 1; k >= 0; k--) {
            reBuilder.append(restList.get(k));
        }
        return reBuilder.toString();
    }

}
