public class Jagamine {

    public static void main(String[] args) {
        int[] array = {4, 2, 10, 2, 9, 3, 7}; //õunad korvides
        int summa = 0;
        int vasak = 0;
        int vasakult = 0;
        int parem = 0;
        int paremalt = 0;

        for (int i = 0; i < array.length; i++) { //õunu kokku
            summa = summa + array[i];
        }
        System.out.println("Õunu on kokku " + summa);

        double keskmine = summa / 2; //õunte keskpiir
        System.out.println("Keskmine õunte arv on " + keskmine);

        int vahemälu = 0;
        for(int i = 0; i < array.length; i++) { //vasakult poolt õunte arv
            vahemälu = vahemälu + array[i];
            if (vahemälu <= keskmine + 1) {
                vasak = vasak + array[i];
            }
        }
        vahemälu = 0;
        for (int i = array.length; i > 0; i--) { //paremalt poolt õunte arv
            vahemälu = vahemälu + array[i-1];
            if (vahemälu <= keskmine + 1) {
                parem = parem + array[i-1];
            }
        }

        System.out.println("Jüri saab " + vasak + " õuna ja Mari saab " + parem + " õuna");
    }
}