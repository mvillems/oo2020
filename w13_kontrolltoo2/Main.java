import java.time.Instant;
import java.util.Timer;

public class Main {

    public static void main(String[] args) {

        Pendel pendel = new Pendel(1.0);
        Hammasratas hammasratas = new Hammasratas(5);
        double võnkumine = (2 * Math.PI) * (Math.sqrt(Pendel.getPikkus() / 9.8));
        int kordus = 0;
        int hamcounter = 0;
        System.out.println(võnkumine + " kestab üks võnge");
        while (kordus <= 60) {
            if(kordus % 2 == 0) {
                System.out.println(Tiksumine.TIK);
            } else if(kordus % 2 == 1){
                System.out.println(Tiksumine.TAK);
            }
            ++kordus;
            if (kordus % Hammasratas.getHammastearv() == 0){
                ++hamcounter;
                System.out.println("Hammasratta " + hamcounter + " ring");
            }
        }
    }
}
    