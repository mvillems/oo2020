import java.util.Scanner;

public class Pood {
    private PoodideNimekiri nimi;
    double avamine;
    double sulgemine;
    int külastamine;

    public Pood(PoodideNimekiri nimi, double avamine, double sulgemine, int külastamine) {
        this.nimi = nimi;
        this.avamine = avamine;
        this.sulgemine = sulgemine;
        this.külastamine = külastamine;
    }

    public PoodideNimekiri getNimi() {
        return nimi;
    }

    public double getAvamine() {
        if(Kaubanduskett.getNädalapäev() == "P") {
            return avamine = avamine + 1.0;
        } else if (Kaubanduskett.getNädalapäev()  == "L") {
            return avamine = avamine - 1.0;
        } else {
            return avamine;
        }
    }

    public double getSulgemine() {
        if(Kaubanduskett.getNädalapäev()  == "P") {
            return avamine = avamine - 1.0;
        } else if (Kaubanduskett.getNädalapäev()  == "L") {
            return avamine = avamine + 1.0;
        } else {
            return avamine;
        }
    }

    public int getKülastatavus() {
        return külastamine;
    }

    public String toString() {
        return nimi + " avatakse " + avamine + ". Pood suletakse " + sulgemine;
    }

    public int addKülastaja(int külaline) {
        külastamine = külastamine + külaline;
        return külastamine;
        
    }

}