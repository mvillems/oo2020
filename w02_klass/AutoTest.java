public class AutoTest{
    public static void main(String[] args){
        Auto auto1 = new Auto();
        Auto auto = new Auto(Mark.Volvo, Omanik.Helen, Asukoht.kodu, 70);
        Auto[] autod = {auto, auto1};
        
        for (int i = 0; i < autod.length; i++){
            System.out.println("Auto mark on " + autod[i].getMark());
            System.out.println(autod[i].getKütusejääk());
            System.out.println("Auto asukoht on" + autod[i].getAsukoht());
        }
    }
}