package semester1.Blatt9;

/**
 * Created by fabia on 09.12.2015.
 */
public class Speisekarte {
    public static void main(String[] args){

        Pizza[] pizzas = new Pizza[5];

        pizzas[0] = new Pizza("Pizza Ananas", 4.00f, 5.50f, 10.00f);
        pizzas[1] = new Pizza("Pizza Sucuk", 4.00f, 5.00f, 10.00f);
        pizzas[2] = new Pizza("Pizza Scampi", 5.00f, 7.00f, 12.00f);
        pizzas[3] = new Pizza("Pizza Margherita", 3.00f, 4.00f, 9.50f);
        pizzas[4] = new Pizza("Pizza Schinken", 3.50f, 4.50f, 10.50f);
    }
}
