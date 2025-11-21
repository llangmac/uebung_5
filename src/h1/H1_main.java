package h1;

import java.util.Arrays;

public class H1_main {

    public static void main(String[] args) {

        //Array Init
        int[] myArray = {10, 7, 6, 5};

        //Austausch der Werte
        for(int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];

            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        //Ausgabe des gedrehten Arrays
        System.out.println(Arrays.toString(myArray));

    }

}
