package semester1.Tutorium; /**
 * Created by fabia on 01.12.2015.
 */

public class TutZweiZwei {
    public static void main(String[] args){

        int[] numbers = new int[12];

        for(int c = 0; c < numbers.length; c++){
            numbers[c] = (int)(Math.random() * 100);
        }

        for(int value: numbers){
            System.out.println(value);
        }

        System.out.println("Kleinster Wert: " + min(numbers));
        System.out.println("Größter Wert: " + max(numbers));

        int[] sorted = order(numbers);
        for(int value: sorted){
            System.out.println(value);
        }

    }

    public static int min(int[] numbers){
        int min = numbers[0];
        for(int value: numbers){
            if(value < min){
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] numbers){
        int max = 0;
        for(int value: numbers){
            if(value > max){
                max = value;
            }
        }
        return max;
    }

    public static int[] order(int[] numbers){


        int[] sorted = new int[numbers.length];
        int min = 9999;
        for(int i = 0; i < numbers.length; i++){

            for(int c = 0; c < numbers.length; c++){
                if(numbers[i] < min){
                    min = numbers[i];
                }
                sorted[i] = min;
                numbers[i] = 9999;
            }
        }

        return sorted;
    }
}
