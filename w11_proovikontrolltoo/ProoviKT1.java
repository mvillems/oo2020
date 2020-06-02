import java.util.Scanner;

public class ProoviKT1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Mitme nurgaga hulknurk on?");
        String tekst = input.nextLine();
        Integer arv = Integer.valueOf(tekst);
        int[] kordx = new int[arv];
        int[] kordy = new int[arv];

        for(int i = 0; i < arv; i++){
            System.out.println((i+1) + ". x-kordinaat");
            String xkord = input.nextLine();
            Integer x = Integer.valueOf(xkord);
            kordx[i] = x;   
            System.out.println((i+1) + ". y-kordinaat");
            String ykord = input.nextLine();
            Integer y = Integer.valueOf(ykord);
            kordy[i] = y;
       }
        
        //kordinaatide väljaprint
        for(int i = 0; i < kordx.length; i++){
            System.out.println(i+1 + ". x-kordinaat= " + kordx[i]);
            System.out.println(i+1 + ". y-kordinaat= " + kordy[i]);
        }

        //külgede pikkuste arvutamine
        double[] küljed = new double[arv];
        for(int  i = 0; i < küljed.length; i++){
            if(i == (küljed.length-1)){
                küljed[i] = Math.sqrt(Math.pow((kordx[0]-kordx[i]), 2) + Math.pow((kordy[0]-kordy[i]), 2));
            }else{
                küljed[i] = Math.sqrt(Math.pow((kordx[i+1]-kordx[i]), 2) + Math.pow((kordy[i+1]-kordy[i]), 2));
            }
        }

        for(int i = 0; i < küljed.length; i++){
            System.out.println(küljed[i]);
        }

        //võrdkülgsuse kontrollimine
        for(int i = 0; i < (küljed.length+1); i++){
            if(i == (küljed.length-1)){
                if(Math.abs(küljed[i] - küljed[0]) < 0.2){
                    System.out.println("Külg " + (i+1) + " ja 1 on võrdsed!");
                }else{
                    System.out.println("Külg " + (i+1) + " ja 1 ei ole võrdsed!");
                }
            }else if(Math.abs(küljed[i] - küljed[i+1]) < 0.2){
                System.out.println("Külg " + (i+1) + " ja " + (i+2) + " on võrdsed!");
            }else{
                System.out.println("Külg " + (i+1) + " ja " + (i+2) + " ei ole võrdsed!");
            }
        }
    }
}