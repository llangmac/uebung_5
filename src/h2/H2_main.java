package h2;

import java.util.Arrays;

public class H2_main {

    public static void main(String[] args) {

        int n = 48889, digits = 0;
        int[] a = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};

        //Bestimmen der Länge des Integers
        digits = String.valueOf(Integer.toString(n)).length();
        //Integer wird temporär als String gespeichert
        String temp = Integer.toString(n);

        //Hilfszähler für den For-Loop
        int x = 0;
        //Array a von hinten nach vorne mit Ziffern von n füllen
        for(int i = digits ; i > 0; i--) {
            x++;
            a[a.length - i] = Integer.parseInt(Character.toString(temp.charAt(x - 1)));
        }
        //Ausgabe von N in einem Array
        System.out.println(Arrays.toString(a));

    }

}
