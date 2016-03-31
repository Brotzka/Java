package semester1.Test;

/**
 * Created by fabia on 24.01.2016.
 */
public class MethodChaining {
    private String Attr1, Attr2, Attr3, Attr4;

    public MethodChaining(){}

    public MethodChaining withAttr1(String attr1){
        this.Attr1 = attr1;
        return this;
    }

    public MethodChaining withAttr2(String attr2){
        this.Attr2 = attr2;
        return this;
    }

    public MethodChaining setAttr3(String attr3){
        this.Attr3 = attr3;
        return this;
    }

    public MethodChaining setAttr4(String attr4){
        this.Attr4 = attr4;
        return this;
    }

    public String toString(){
        return this.Attr1 + ", " + this.Attr2 + ", " + this.Attr3 + ", " + this.Attr4;
    }


    public static void main(String[] args){
        MethodChaining Test = new MethodChaining()
                .withAttr1("semester1/Test")
                .withAttr2("Bauer")
                .setAttr3("Franz")
                .setAttr4("Weinreich");

        System.out.println(Test);
    }
}
