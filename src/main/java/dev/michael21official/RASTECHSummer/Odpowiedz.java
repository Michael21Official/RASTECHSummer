package dev.michael21official.RASTECHSummer;

import java.util.*;

public class Odpowiedz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Wczytaj liczbę kaczuszek i maksymalną szerokość rzędu
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Wczytaj wysokość i szerokość każdej kaczuszki
        int[][] kaczuszki = new int[n][2];
        for (int i = 0; i < n; i++) {
            kaczuszki[i][0] = sc.nextInt();
            kaczuszki[i][1] = sc.nextInt();
        }

        // Znajdź maksymalną sumę wysokości kaczuszek, których suma szerokości nie przekracza m
        int[][][] dp = new int[n+1][m+1][10];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (j >= k) {
                        dp[i][j][k] = Math.max(dp[i-1][j][k], dp[i-1][j-k][k-1] + kaczuszki[i-1][0]);
                    } else {
                        dp[i][j][k] = dp[i-1][j][k];
                    }
                }
            }
        }
        int maxSum = dp[n][m][1];
        for (int k = 2; k <= 9; k++) {
            maxSum = Math.max(maxSum, dp[n][m][k]);
        }
        System.out.println(maxSum);
    }
}
