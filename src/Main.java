import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    //Willkommen zum Tutorial für alle, die nicht auf den Idioten hier hören wollen...

    /*  -------------------- Glossar -------------------------

    package = ordner
    class = Klasse / Datei

     */

    public static void main(String[] args) {        //public static void main (psvm) --> Herz des Programms hier wird alles Koordiniert

        // -------------------- Abkürzungen --------------------
        /*

        psvm --> public static void main
        sout --> System.out.println();
        souf --> System.out.printf("");

         */
        // -------------------- Variablen --------------------

        int zahl = 12;                              //int (Integer) --> Variable die eine Zahl ohne Kommastellen speichert.
        Double kommazahl = 3.19;                    //Double --> Variable die eine Zahl mit Kommastelle speichert.
        String text = "Ich bin ein String";         //String --> Variable die einen Text speichert
        boolean wahrheitswert = true;               //boolean --> Variable die einen Wahrheitswert (true/false) speichert.

        // -------------------- Komplexe Variablen --------------------

        ArrayList<String> array = new ArrayList<>();    //Array --> Speicherung von mehreren Objekten in einer Liste z.b. 121,123,423
        array.add("Objekt eins");                       //Beispiel ein Objekt hinzuzufügen
        array.add("Objekt zwei");

        System.out.println( array.get(0) );             //Arrays fangen bei 0 an zu zählen. Array.get(0) gibt das erste Objekt der Liste

        // -------------------- Rechnen --------------------

        int ergebniss = 6 + 8;                      //Einfache Rechnungen können wie beim Taschenrechner einfach eingetippt werden.
        Double ergebniss2 = 6.4 * 8.13;             //Einfache Rechnungen können wie beim Taschenrechner einfach eingetippt werden.

        // -------------------- Strings zusammenfügen --------------------

        String text1 = "Mein Name ist ";
        String name = "Paul";

        String ergebnisstext = text1 + name;

        // -------------------- Abfragen mit if --------------------

        String passwort1 = "1234";
        String passwort2 = "1234";

        if (passwort1 == passwort2) {           //If = Wenn --> Wenn passwort1 und passwort2 gleich sind wir alles in den { } ausgeführt

            System.out.println("Die Passwörter stimmen überein");

        } else {                                //else = sonst --> Wenn die Passwörter nicht gleich sind, wird alles in den { } nach dem else ausgeführt.

            System.out.println("Die Passwörter stimmen nicht überein");

        }

        // -------------------- Abfragen mit switch --------------------

        String postiton = "Norden";

        switch (postiton) {                 //switch --> Mit switch können mehrere Fälle abgefragt werden

            case "Norden":                  //case --> Ein case ist ein Fall der eintreten kann. [Achtung nach case kommt ein :]
                System.out.println("Die Position ist Norden");
                break;                      //[Cases werden mit "break;" beendet]

            case "Süden":                   //case --> Ein case ist ein Fall der eintreten kann. [Achtung nach case kommt ein :]
                System.out.println("Die Position ist Süden");
                break;                      //[Cases werden mit "break;" beendet]

            case "Westen":                  //case --> Ein case ist ein Fall der eintreten kann. [Achtung nach case kommt ein :]
                System.out.println("Die Position ist Westen");
                break;                      //[Cases werden mit "break;" beendet]

            case "Osten":                   //case --> Ein case ist ein Fall der eintreten kann. [Achtung nach case kommt ein :]
                System.out.println("Die Position ist Osten");
                break;                      //[Cases werden mit "break;" beendet]

        }

        // -------------------- While schleifen --------------------

        int anfang = 0;                     //Fängt bei 0 an zu zählen
        int ende = 10;                      //Zählt bis 10

        while (anfang < ende) {             //while --> etwas wird so oft ausgeführt bis alles in den () wahr ist

            System.out.println("Durchgang " + anfang);      //Zeigt wo man aktuell ist
            anfang += 1;                    //Den zähler um eins erhöhen mit =+

        }

        // -------------------- for schleifen --------------------

        for (int i = 0; i <= 10; i++) {     //for --> Für(int i = 0; solange i kleiner als 10) wird alles in den { } ausgeführt

            System.out.println(i);      //Schreibt den zwischenstand

        }

    }


}