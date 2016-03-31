package semester1.Blatt9;

/**
 * Created by fabia on 09.12.2015.
 */
public class Pizza {
    String name;

    // Es werden Default-Durchmesser festgelegt
    int[] durchmesser = {26,32,50};

    private float preisD26; // Preis für 26cm
    private float preisD32; // Preis für 32cm
    private float preisD50; // Preis für 50cm

    /**
     *
     * @param name
     * @param preisD26
     * @param preisD32
     * @param preisD50
     */
    public Pizza(String name, float preisD26, float preisD32, float preisD50){
        this.name = name;
        this.preisD26 = preisD26;
        this.preisD32 = preisD32;
        this.preisD50 = preisD50;
    }
}
