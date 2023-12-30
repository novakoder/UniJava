package ConfrontoFrazioni;
import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class ConfrontoFrazioni {
    public static void main(String[] args){
        int num, den;
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        //lettura e costruzione della prima frazione
        num = in.readInt("Numeratore prima frazione> ");
        den = in.readInt("Denominatore prima frazione> ");
        Frazione f1 = new Frazione(num, den);

        //lettura e costruzione della seconda frazione
        num = in.readInt("Numeratore seconda frazione> ");
        den = in.readInt("Denominatore seconda frazione> ");
        Frazione f2 = new Frazione(num, den);

        //confronto ...
        if (f1.equals(f2))
            out.println("Le due frazioni sono uguali");
        else
            out.println("Le due frazioni sono diverse");
    }
}