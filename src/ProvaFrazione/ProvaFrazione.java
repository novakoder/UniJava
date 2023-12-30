package ProvaFrazione;
import prog.utili.Frazione;
import prog.io.ConsoleInputManager;

public class ProvaFrazione {

    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        int num1 = in.readInt("Numeratore f1 > ");
        int den1 = in.readInt("Denominatore f1 > ");
        int num2 = in.readInt("Numeratore f2 > ");
        int den2 = in.readInt("Denominatore f2 > ");

		/*Frazione f1;
		Frazione f2;
		f1 = new Frazione(1,2);
		f2 = new Frazione(2,3);*/

        //oppure
		/*Frazione f1, f2;
		f1 = new Frazione(1,2);
		f2 = new Frazione(2,3);*/

        //oppure
        Frazione f1 = new Frazione(num1,den1);
        System.out.println("Frazione f1 creata > " + f1.toString());
        Frazione f2 = new Frazione(num2,den2);
        System.out.println("Frazione f2 creata > " + f2); //chiamata implicita al metodo toString

		/*Frazione ris;
		ris = f1.piu(f2);*/
        //oppure
        Frazione ris = f1.piu(f2);
        System.out.println("Frazione somma > " + ris);

        f1 = f1.piu(f2);
        System.out.println();
        System.out.println("Frazione f1 > " + f1.toString());
        System.out.println("Frazione f2 > " + f2.toString());
        System.out.println("Frazione ris > " + ris.toString());

        f1 = f2;
        System.out.println();
        System.out.println("Frazione f1 > " + f1.toString());
        System.out.println("Frazione f2 > " + f2.toString());
        System.out.println("Frazione ris > " + ris.toString());

        f2 = new Frazione(5,9);
        System.out.println();
        System.out.println("Frazione f1 > " + f1.toString());
        System.out.println("Frazione f2 > " + f2.toString());
        System.out.println("Frazione ris > " + ris.toString());

        boolean b = f1.isMaggiore(f2);
        System.out.println("f1.isMaggiore(f2) > " + b);
        b = f1.isMinore(f2);
        System.out.println("f1.isMinore(f2) > " + b);
        b = f1.equals(f2);
        System.out.println("f1.equals(f2) > " + b);
    }
}