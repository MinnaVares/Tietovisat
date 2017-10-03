import java.util.Scanner;

/**
 * Created by Administrator on 3.10.2017.
 */
public class Paaohjelma {
    public static void main(String[] args) {
        Peli1 peli1 = new Peli1();
        Tietovisa peli2 = new Tietovisa();
        Peli3 peli3 = new Peli3();
        String pelivalinta = "";
        while(true){
            System.out.println("Mitä peliä haluat pelata? \nValitse: \n1) Peli 1\n2) Peli 2\n3) Peli 3");
            Scanner lukija = new Scanner(System.in);
             pelivalinta = lukija.next();
            if ("1".equals(pelivalinta)) {
                peli1.pelaa();
            }
            if ("2".equals(pelivalinta)){
                peli2.pelaaTosissaan();
            }
            if ("3".equals(pelivalinta)){
                peli3.pelaa();
            }
            if (!"3".equals(pelivalinta)||!"2".equals(pelivalinta)||!"1".equals(pelivalinta)){
                System.out.println("Haluatko lopettaa?(Y/N)");
                pelivalinta = lukija.next();
                if ("Y".equals(pelivalinta)){
                    break;
                }else{
                    continue;
                }
            }
            System.out.println("Hienosti pelattu! \nHaluatko pelata uudestaan?(Y/N)");
            pelivalinta = lukija.next();
            if ("Y".equals(pelivalinta)){
                break;
            } else{
                continue;
            }

        }


    }
}

