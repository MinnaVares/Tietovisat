import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Kysymys> lista = new ArrayList<>();
        Kysymys k1 = new Kysymys("Kuka on Academic Workin toimitusjohtaja?", "Tommi Teräsvirta", "Stefan Heinrichs", "Jukka Pulkkinen", 1);
        Kysymys k2 = new Kysymys("Kuka on Suomen ensimmäinen presidentti?", "Ståhlberg", "Svinhufvud", "Relander", 0);
        Kysymys k3 = new Kysymys("Mitä tarkoittaa %d?", "String", "Liukuluku", "Kokonaisluku", 2);
        Kysymys k4 = new Kysymys("Kannattaako tyhjää catch -haaraa koodata?", "Tottakai", "Ilman muuta", "Ei", 2);
        Kysymys k5 = new Kysymys("Paljonko on 3+4*2?", "14", "11", "12", 1);
        Kysymys k6 = new Kysymys("Mikä oli Koiviston presidenttikausi?", "1972-1984", "1982-1994", "1986-1994", 1);
        Kysymys k7 = new Kysymys("Kuka näyttelee Macgyveria?", "Richard Anderson", "Chuch Norris", "Dana Elcar", 0);
        Kysymys k8 = new Kysymys("Mitä tapahtuu 15.joulukuuta?", "Suomen itsenäisyyspäivä", "20 valmista IT-konsulttia valmistuu", "Presidentin vaalit", 1);
        Kysymys k9 = new Kysymys("Mikä maa voitti Euroviisut vuonna 2014?", "Itävalta", "Ruotsi", "Ukraina", 0);
        Kysymys k10 = new Kysymys("Missä seuraavista tietorakenteideista hyödynnetään FIFO -periaatetta?", "Pino", "Jono", "Keko", 1);

        lista.add(k1);
        lista.add(k2);
        lista.add(k3);
        lista.add(k4);
        lista.add(k5);
        lista.add(k6);
        lista.add(k7);
        lista.add(k8);
        lista.add(k9);
        lista.add(k10);

        Collections.shuffle(lista);

        int pisteet = 0;

        for (Kysymys k : lista) {
            if (k.kysy()) {
                pisteet++;
            }

        }
        System.out.println("Pisteet: " + pisteet + "/10");


    }
}
