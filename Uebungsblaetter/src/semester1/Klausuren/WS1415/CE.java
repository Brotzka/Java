package semester1.Klausuren.WS1415;

/**
 * Created by fabia on 25.01.2016.
 */
public class CE {
    public static void main(String[] args){
        System.out.println("\n" + wasTueIch('A', 5));

        System.out.println("\n");

        System.out.println(wasTueIch('Z', 3));

    }

    public static char wasTueIch(char c, int k){
        int t = (int) c;
        System.out.println(t);
        t = t - 'A';
        System.out.println(t);
        t = t + k;
        System.out.println(t);
        t = t % 26;
        System.out.println(t);
        t = t + 'A';
        System.out.println(t);
        return (char) t;
    }
}
