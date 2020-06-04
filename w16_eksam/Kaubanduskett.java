import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kaubanduskett{
    private List<Pood> poed = new ArrayList<>();

    public List<Pood> getPoed() {
        return poed;
    }

    public void lisaPood(Pood pood) {
        poed.add(pood);
    }

    public Integer getPoodideArv() {
        return poed.size();
    }

    public void prindi() {
        for(int i = 0; i < poed.size(); i++) {
            System.out.println(poed.get(i));
        }
    }

    public void getLahtiolekuInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Mis kell on");
        String time = input.nextLine();
        double aeg = Double.parseDouble(time);
        for(int i = 0; i < poed.size(); i++) {
                if (poed.get(i).getAvamine() > aeg) {
                    return;
                }else if(aeg > 24.01) {
                    System.out.println("Sisesta korrektne aeg!");
                }else if(poed.get(i).getSulgemine() <= aeg) {
                    return;
                }else{
                    System.out.println(poed.get(i).getNimi() + " on avatud!");
                }
            }
        }

    public void getKülastatuseArv() {
        for(int i = 0; i < poed.size(); i++) {
        System.out.println(poed.get(i).getNimi() + "i on külastatud " + poed.get(i).getKülastatavus() + " korda.");
        }
    }

    public void getKülastamine() {
        Scanner input = new Scanner(System.in);
        System.out.println("Millist poodi külastada soovite?");
        String pood = input.nextLine();
        if (pood == "Toidupood") {
            poed.get(0).addKülastaja(1);
        } else if (pood == "Riidepood") {
            poed.get(1).addKülastaja(1);
        } else if (pood == "Ehtepood") {
            poed.get(2).addKülastaja(1);
        } else if (pood == "Lillepood") {
            poed.get(3).addKülastaja(1);
        } 
    }

    public static String getNädalapäev() {
        Scanner input = new Scanner(System.in);
        System.out.println("Mis nädalapäev on? (E/T/K/N/R/L/P)");
        String päev = input.nextLine();
        return päev;
    }
}
