/* Teha programm, milles on kasutusel klass.
Klassil peaks olema 4-5 muutujat ja minimaalselt 3 käsklust.
Tuua välja 4-5 eksemplaari ja näidata kuidas nad erinevalt töötavad. */

public class Auto {

    private Mark mark;
    private String asukoht;
    private int kütusejääk;
    private String omanik;

    public Auto(Mark mark, String asukoht, int kütusejääk, String omanik){
        this.mark = mark;
        this.asukoht = asukoht;
        this.kütusejääk = kütusejääk;
        this.omanik = omanik;
    }

    public Auto() {
    }


    public Mark getMark() {
        return mark;
    }

    public String getKütusejääk() {
        if (kütusejääk <= 10) {
            return "Tangi seda autot!";
        } else if (kütusejääk >= 11) {
            if (kütusejääk <= 60) {
                return "Võid rahulikult sõita ringi!";
            }
        } else if (kütusejääk >= 61) {
            if (kütusejääk <= 70) {
                return "Paak on praktiliset täis!";
            }
        }
        return null;
    }

    public void vahetaOmanik(String uusOmanik) {
        this.omanik = uusOmanik;
    }

    public String getAsukoht() {
        return asukoht;
    }

    public void vahetaAsukoht(String asukoht) {
        this.asukoht = asukoht;
    }

    public String getNimi() {
        return omanik;
    }

    public void prindiAndmed() {
        System.out.println("Auto mark on " + mark);
        System.out.println("Auto asukoht on " + asukoht);
        System.out.println("Auto omanik on " + omanik);
        getKütusejääk();
    }

}