package h3;

import java.util.Arrays;

public class H3_main {

    public static void main () {
        int input = 136279;
        int[][] einheiten = new int[2][15];

        //Hilfsarray für Wertezuweisung
        int[] werte = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        //For-Loop für Übertragung von 'Werte' in 'einheiten[1]'
        for(int i = 0; i < 15; i++) {
            einheiten[0][i] = werte[i];
        }

        //Loop der werte Array durchgeht und Teilbarkeit überprüft
        for(int x = 0; x < 15; x++) {
            //Teilung durch werte[x] min. 1 sichergestellt
            if(werte[x] <= input){
                //einheiten[1][x] - bekommt in der zweiten Reihe den Teilfaktor von input - rest/werte[x]
                einheiten[1][x] = (input - (input % werte[x]))/werte[x];
                //Input wird auf den Rest aus der voherigen Teilung gesetzt
                input = input % werte[x];
            }

            System.out.print("[ " +einheiten[0][x] + " " + einheiten[1][x] + " ]");
        }
    }
}