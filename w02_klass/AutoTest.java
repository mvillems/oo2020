public class AutoTest{
    public static void main(String[] args){
        Auto auto1 = new Auto(Mark.Ford, "töö", 70, "Liisa");
        Auto auto = new Auto(Mark.BMW, "kodu", 35, "Peeter");
        Auto[] autod = {auto, auto1};
        
        for (int i = 0; i < autod.length; i++){
            autod[i].prindiAndmed();
            
        }
        autod[0].vahetaOmanik("Helen");
        autod[1].vahetaAsukoht("pood");

        for (int i = 0; i < autod.length; i++){
            autod[i].prindiAndmed();
        }
    }
}