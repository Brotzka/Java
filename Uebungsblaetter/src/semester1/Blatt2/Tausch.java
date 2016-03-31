package semester1.Blatt2;

public class Tausch
{

    public static void main(String[] args)
    {
        int x = 5;
        int y = 7;

        // Vor dem Tausch
        System.out.println(x);
        System.out.println(y);

        // Tausch
        x = x * y;
        y = x / y;
        x = x / y;

        // Nach dem Tausch
        System.out.println(x);
        System.out.println(y);
    }
}
