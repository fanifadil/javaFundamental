package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class LatihanArray {
    public int n = initApp();
    public int[] storage = tampungData();


    public static void main(String[] args) {
        LatihanArray obj = new LatihanArray();
        obj.sortKecilBesar();
        obj.sortBesarKecil();
    }

    public int initApp(){
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan N = ");
        int input = s.nextInt();
        return input;
    }

    public int[] tampungData() {
        Scanner s = new Scanner(System.in);
        int[] data = new int[this.n];
        for(int i = 0; i < data.length; i++){
            System.out.println("Masukan Data = " + i);
            data[i] = s.nextInt();
        }
        System.out.println("Data Array = " + Arrays.toString(data));
        return data;
    }

    public void sortKecilBesar(){
        for (int i = 0; i < storage.length; i++){
            for(int j=0; j< storage.length; j++){
                if (storage[i] < storage[j]){
                    int tmp = storage[i];
                    storage[i] = storage[j];
                    storage[j] = tmp;
                }
            }
        }
        System.out.println("Kecil ke Besar = " +Arrays.toString(storage));
    }

    public void sortBesarKecil(){
        for (int i = 0; i < storage.length; i++){
            for (int j=0; j < storage.length-1; j++){
                if(storage[j] < storage[j+1]){
                    int tmp = storage[j];
                    storage[j] = storage[j+1];
                    storage[j+1] = tmp;
                }
            }
        }
        System.out.println("Besar ke Kecil = " +Arrays.toString(storage));
    }
}
