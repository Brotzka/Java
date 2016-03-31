package semester1.Blatt3;

/**
 * Created by fabian on 27.10.15.
 */
public class Wuerfelwurf {
    public static void main(String[] args){

        double randNum = 0.00;

        while(randNum >= 7 || randNum < 1){
            randNum = Math.random() * 10;

            if(randNum >= 1 && randNum < 7){

                if(randNum >= 1 && randNum < 2){
                    System.out.println("Eins gewürfelt");
                } else if(randNum >= 2 && randNum < 3){
                    System.out.println("Zwei gewürfelt");
                } else if(randNum >= 3 && randNum < 4){
                    System.out.println("Drei gewürfelt");
                } else if(randNum >= 4 && randNum < 5){
                    System.out.println("Vier gewürfelt");
                } else if(randNum >= 5 && randNum < 6){
                    System.out.println("Fünf gewürfelt");
                } else if(randNum >= 6 && randNum < 7){
                    System.out.println("Sechs gewürfelt");
                }
            }
        }
    }
}
