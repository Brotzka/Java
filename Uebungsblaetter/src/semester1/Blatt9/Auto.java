package semester1.Blatt9;

/**
 * Created by Fabian on 08.12.2015.
 */
public class Auto {
    private String marke, farbe, model;
    private int hubraum, baujahr;

    public Auto(String marke, String farbe, String model, int hubraum, int baujahr){
        this.marke = marke;
        this.farbe = farbe;
        this.model = model;
        this.baujahr = baujahr;

        if(hubraum <= 0){
            this.hubraum = 1600;
        } else {
            this.hubraum = hubraum;
        }
    }

    public int getHubraum(){
        return this.hubraum;
    }

    public void setHubraum(int ccm){
        if(ccm > 0){
            this.hubraum = ccm;
        }
    }

    public String getMarke(){
        return this.marke;
    }

    public String getModel(){
        return this.model;
    }
}
