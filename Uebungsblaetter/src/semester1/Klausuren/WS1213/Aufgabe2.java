package semester1.Klausuren.WS1213;

/**
 * Created by fabia on 24.01.2016.
 */
public class Aufgabe2 {
    public static void main(String[] args){
        String text = "FABIAN";
        char[] textArray = text.toCharArray();

        textArray = encrypt(textArray, 5);

        for(char one: textArray){
            System.out.print(one);
        }
    }

    public static char[] encrypt(char[] text, int num){
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        if(num <= 0){
            return null;
        } else {

            for(char letter: text){
                // Prüfen, ob nu Großbuchstaben vorliegen
                if(letter >= 'A' && letter <='Z'){
                    // Nichts tun
                } else {
                    return null;
                }
            }

            // Jerder Buchstabe wurde auf Gültigkeit getestet
            // Gegebenes Array durchlaufen
            for(int t = 0; t < text.length; t++){

                // Alphabet durchlaufen
                for(int a = 0; a < alphabet.length; a++){

                    // Text-Buchstabe stimmt mit Alphabet überein
                    if(text[t] == alphabet[a]){

                        // Falls die Verschiebung die Gesamtzahl der Buchstaben im Alphabet übersteigt
                        // wird von vorne begonnen
                        if((a + num) >= alphabet.length){
                            int z = (a + num) - alphabet.length;
                            text[t] = alphabet[z];
                            break;
                        } else {
                            text[t] = alphabet[a + num];
                            break;
                        }
                    }
                }
            }
            return text;
        }
    }
}
