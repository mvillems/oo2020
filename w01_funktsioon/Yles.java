import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Yles{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Mitme arvulist rida soovid!");
        int pikkus = input.nextInt();
        System.out.println(pikkus);
        input.close();
        int[] array = new int[pikkus];
        Random rand = new Random();
        for (int i = 0; i > pikkus; i++){
            array[i] = rand.nextInt(10);
        }
        System.out.println("Sorteerimata rida: " + Arrays.toString(array));
        Bubblesort(array);
    }
    public static void Bubblesort(int[] array){
        int loop = 0;
        int pikkus = array.length;
        int temp;
        for (int i = 0; i < pikkus; i++){
            for(int j = 0; j < (pikkus-1); j++){
                if(array[j] > array[j+1]){
                    loop += 1;
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorteeritud rida: " + Arrays.toString(array));
        System.out.println("Rida sorteeriti " + loop + " korda!");
    }
}