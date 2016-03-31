package semester1.Klausuren.WS1213;

/**
 * Created by fabia on 24.01.2016.
 */
public class Aufgabe6 {
    public static void main(String[] args){
        System.out.println("1. Ausgabe: " + wasTuIch(408));
        System.out.println("1. Ausgabe: " + wasTuIch(-9));
    }

    public static int wasTuIch(int a){
        int b, c, d;

        if(a < 0)
            b = -a;
        else
            b = a;

        for(c = 0; b > 0; c = c + d){
            d = b % 10;
            b = b / 10;
            System.out.println("d = " + d + " | b = " + b + " | c = " + c);
        }

        return c;
    }
}
