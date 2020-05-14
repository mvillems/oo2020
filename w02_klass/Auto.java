public class Auto {

    private Mark mark;
    private Omanik omanik;
    private Asukoht asukoht;
    private int kütusejääk;

    public Auto(Mark mark, Omanik omanik, Asukoht asukoht, int kütusejääk){
        this.mark = mark;
        this.omanik = omanik;
        this.asukoht = asukoht;
        this.kütusejääk = kütusejääk;
    }

    public Auto() {
        mark = Mark.Audi;
        omanik = Omanik.Jaak;
        asukoht = Asukoht.mujal;
        kütusejääk = 45;
    }

    public String getMark() {
        if (mark == Mark.Volvo) {
            return "Volvo";
        } else if (mark == Mark.BMW) {
            return "BMW";
        } else if (mark == Mark.Ford) {
            return "Ford";
        } else if (mark == Mark.Audi) {
            return "Audi";
        } else {
            return "Vali õige auto mark!";
        }
    }

    public void action() {
        if (mark == Mark.Volvo) {
            System.out.println("Selle auto omanik on " + Omanik.Helen);
        } else if (mark == Mark.BMW) {
            System.out.println("Selle auto omanik on " + Omanik.Peeter);
        } else if (mark == Mark.Audi) {
            System.out.println("Selle auto omanik on " + Omanik.Liisa);
        } else {
            System.out.println("Selle auto omanik on " + Omanik.Jaak);
        }
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

    public String getAsukoht() {
        if (asukoht == Asukoht.kodu) {
            return "Kodu";
        } else if (asukoht == Asukoht.pood) {
            return "Pood";
        } else if (asukoht == Asukoht.töö) {
            return "Töö";
        } else if (asukoht == Asukoht.mujal) {
            return "Mujal";
        }
        return null;
    }
    
}