package EsString;

public class EsString {
    public static void main(String[] args){
        String s = "rotator";
        boolean palindroma = true;

        for (int sx = 0, dx = s.length() - 1; sx < dx; sx = sx + 1, dx = dx - 1) {
            if (s.charAt(sx) != s.charAt(dx)) {
                palindroma = false;
                break;
            }
        }

        if (palindroma) {
            System.out.println("La stringa è palindroma");
        } else {
            System.out.println("La stringa non è palindroma");
        }
    }
}
