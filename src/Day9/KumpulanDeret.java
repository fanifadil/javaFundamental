package Day9;

public class KumpulanDeret {
    public static int[] deretFibo(int n){
        int [] arrFibo = new int[n];
        arrFibo[0] = 1;
        arrFibo[1] = 1;
        for (int i = 2; i< arrFibo.length; i++) {
            arrFibo[i] = arrFibo[i-1] + arrFibo[i-2];
        }
        return arrFibo;
    }

    public static String[] deretFiboString(int n){
        int[] arrFibo = deretFibo(n);
        String[] arrFiboString = new String[n];
        for (int i = 0; i < arrFiboString.length; i++){
            arrFiboString[i] = String.valueOf(arrFibo[i]);
        }
        return arrFiboString;
    }

    public static String[] deretGanjil(int n){
        String[] arrGanjil = new String[n];
        for (int i = 0; i < arrGanjil.length; i++){
            if (i % 2 == 0){
                arrGanjil[i] = String.valueOf(i+1);
            } else {
                arrGanjil[i] = " ";
            }
        }
        return arrGanjil;
    }

    public static String[] deretFiboHurufString(int n){
        int[] arrFibo = deretFibo(n);
        String[] arrFiboString = new String[n];
        char huruf = 'A';
        for (int i = 0; i < arrFiboString.length; i++){
            if (i%2 == 0){
                arrFiboString[i] = String.valueOf(arrFibo[i/2]);
            } else {
                arrFiboString[i] = String.valueOf(huruf);
                ++huruf;
            }

        }
        return arrFiboString;
    }
}
