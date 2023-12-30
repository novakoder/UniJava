package Minuscole;
import java.util.Scanner;

public class Minuscole {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Inserire una stringa > ");
        String s = in.nextLine();
        s = s.toLowerCase();

        StringBuilder ris = new StringBuilder();
        char c;

        for(int i=0; i < s.length(); i = i+1) {
            c = s.charAt(i);

            if(i%2 != 0)
                ris.append(Character.toUpperCase(c));
            else
                ris.append(c);
        }

        System.out.print("Stringa modificata > " + ris);
    }
}
