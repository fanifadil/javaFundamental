package Day9;

import java.util.Scanner;

public class QuizSatu {

    public int getN() {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukan N =");
        int input = s.nextInt();
        return input;
    }

    public String[][] buatKerangka() {
        int n = getN();
        String[][] arr = new String[n][n];
//        isiKerangkaFibo(arr);
        isiKerangkaPola2(arr);
        return arr;
    }

    public void isiKerangkaFibo(String[][] arr) {
        String[] arrFibo = KumpulanDeret.deretFiboString(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = arrFibo[j];
                } else if (i < arr.length / 2 && i < j && i + j < arr.length - 1) {
                    arr[i][j] = "A";
                } else if (j > arr.length / 2 && i < j && i + j > arr.length - 1) {
                    arr[i][j] = "B";
                } else if (i > arr.length / 2 && i > j && i + j > arr.length - 1) {
                    arr[i][j] = "C";
                } else if (j < arr.length / 2 && i > j && i + j < arr.length - 1) {
                    arr[i][j] = "D";
                }
            }
        }
    }

    public void isiKerangkaPola2(String[][] arr) {
        String[] arrFibo = KumpulanDeret.deretFiboHurufString(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i <= j && i <= arr.length / 2 && i + j <= arr.length - 1) {
                    arr[i][j] = arrFibo[i];//String.valueOf(i);
                } else if (i < j && j > arr.length / 2 && i + j > arr.length - 1) {
                    arr[i][j] = arrFibo[arr.length - 1 - j];//String.valueOf(arr.length - 1 - j);
                } else if (i >= j && i > arr.length / 2 && i + j >= arr.length - 1) {
                    arr[i][j] = arrFibo[arr.length - 1 - i];//String.valueOf(arr.length - 1 - i);
                } else if (i > j && j < arr.length / 2 && i + j < arr.length - 1) {
                    arr[i][j] = arrFibo[j];//String.valueOf(j);
                } else {
                    arr[i][j] = "0";
                }
            }
        }
    }

    public void cetakKerangka() {
        String[][] arrData = buatKerangka();
        for (int i = 0; i < arrData.length; i++) {
            for (int j = 0; j < arrData.length; j++) {
                System.out.printf("%3s", arrData[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QuizSatu q = new QuizSatu();
        q.cetakKerangka();
    }

}
