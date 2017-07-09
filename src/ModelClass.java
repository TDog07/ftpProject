/**
 * Created by Titian Borman on 09.07.2017.
 */
public class ModelClass {

    //Daten
    private int ergebnis;

    //Berechnungen
    private void calculate (int first, int second) {

        ergebnis = first + second;
    }

    //Ausgabe
    public int getCalculate() {
        return ergebnis;
    }
}
