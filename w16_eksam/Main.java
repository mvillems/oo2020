public class Main {
    public static void main(String[] args) {
        Kaubanduskett kaubanduskett = new Kaubanduskett();
        kaubanduskett.lisaPood(new Pood(PoodideNimekiri.Toidupood, 8.00, 21.00, 0));
        kaubanduskett.lisaPood(new Pood(PoodideNimekiri.Riidepood, 9.00, 20.00, 0));
        kaubanduskett.lisaPood(new Pood(PoodideNimekiri.Ehtepood, 10.00, 21.00, 0));
        kaubanduskett.lisaPood(new Pood(PoodideNimekiri.Lillepood, 12.00, 18.00, 0));

        Kaubanduskett.getNädalapäev();
        System.out.println();
        kaubanduskett.getLahtiolekuInfo();
        System.out.println();
        kaubanduskett.getKülastamine();
        System.out.println();
        kaubanduskett.getKülastatuseArv();
        
    }
}