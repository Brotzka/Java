package semester1.Blatt5;

/**
 * Created by fabia on 09.11.2015.
 */
public class Temperaturumwandlung {

    public static void main(String[] args){
        int fahrenheit;

        System.out.println("Fahrenheit\tCelsius");


        for(fahrenheit = 0; fahrenheit <= 300; fahrenheit++){
            float celsius = (5.0f/9.0f) * (fahrenheit - 32);

            System.out.println(fahrenheit + "\t\t\t" + String.format("%.2f",celsius));
        }
    }
}
