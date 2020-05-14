public class RaamaturiiulTest {

    public static void main(String[] args) {
        RaamatuRiiul raamaturiiul = new RaamatuRiiul();
        raamaturiiul.lisaRaamat(new Raamat("Kevade", "Oskar Luts", "1957"));
        raamaturiiul.lisaRaamat(new Raamat("Suvi", "Oskar Luts", "1958"));
        raamaturiiul.lisaRaamat(new Raamat("Sügis", "Oskar Luts", "1959"));
        raamaturiiul.lisaRaamat(new Raamat("Talv", "Oskar Luts", "1960"));
        raamaturiiul.lisaRaamat(new Raamat("Tõde ja Õigus", "Tammsaare", "1934"));

        raamaturiiul.prindi();
        System.out.println(raamaturiiul.getRaamatuteArv());
    }
    
}