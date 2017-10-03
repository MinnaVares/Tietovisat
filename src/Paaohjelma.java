import java.util.Scanner;

/**
 * Created by Administrator on 3.10.2017.
 */
public class Paaohjelma {
    public static void main(String[] args) {
        Peli1 peli1 = new Peli1();
        String pelivalinta = "";
        while(true) {
            System.out.println("Mitä peliä haluat pelata? \nValitse: \n1) Peli 1\n2) Peli 2\n3) Peli 3");
            Scanner lukija = new Scanner(System.in);
             pelivalinta = lukija.next();
            if ("1".equals(pelivalinta)) {
                peli1.pelaa();
            }
            if ("2".equals(pelivalinta)){
                //peli2.pelaa();
            }
            if ("3".equals(pelivalinta)){
                //peli3.pelaa
            }
            if(pelivalinta=="En halua"){
                System.out.println("Haluatko lopettaa?");
                pelivalinta = lukija.next();
                if (pelivalinta=="kyllä"){
                    break;
                }else {continue;}
            }
            System.out.println("Hienosti pelattu! \nHaluatko pelata uudestaan?");

        }


    }
}

