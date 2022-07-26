package Day9;

import java.util.Scanner;

public class Quiz {
    public int getN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai N : ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    public int[] iniFibo(int n) {
        int[] arrFibo = new int[n];
        arrFibo[0] = 1;
        arrFibo[1] = 1;
        for (int i = 2; i < n; i++) {
            arrFibo[i] = arrFibo[i - 1] + arrFibo[i - 2];
        }
        return arrFibo;
    }

    public void buatCross() {
        int n = getN();
        int[] arrF = iniFibo(n);
        int lala;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    lala = arrF[i];
                    System.out.printf("%3s", lala);
                } else if (i + j == n - 1) {
                    lala = arrF[j];
                    System.out.printf("%3s", lala);
                } else if (i <= n / 2 && i + j < n && i < j) {
                    System.out.printf("%3s", "A");
                } else if (j >= n - i && i < j) {
                    System.out.printf("%3s", "B");
                } else if (i + j < n && i > j) {
                    System.out.printf("%3s", "D");
                } else {
                    System.out.printf("%3s", "C");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Quiz q = new Quiz();
        q.buatCross();
    }
}
