public class Pendel {
    static double pikkus;
    Hammasratas hammasratas;

    public Pendel(double pikkus) {
        Pendel.pikkus = pikkus;
        hammasratas = null;
    }

    public static double getPikkus() {
        return pikkus;
    }

    public Hammasratas getHammasratas() {
        return hammasratas;
    }
}