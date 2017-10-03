import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Kysymys {
    String kysymys;
    List<String> vaihtoehdot = new ArrayList<>();
    String vastaus;
    public Kysymys(String kysymysteksti, String vaihtoehto1, String vaihtoehto2, String vaihtoehto3, int oikeaVaihtoehto) {
        this.kysymys = kysymysteksti;
        this.vaihtoehdot.add(vaihtoehto1);
        this.vaihtoehdot.add(vaihtoehto2);
        this.vaihtoehdot.add(vaihtoehto3);
        if (oikeaVaihtoehto == 0) {
            this.vastaus = "A";
        } else if (oikeaVaihtoehto == 1) {
            this.vastaus = "B";
        } else {
            this.vastaus = "C";
        }
    }
    public boolean kysy() {
        System.out.println(kysymys);
        System.out.println("Valitse vaihtoehdoista (A, B, C):"
                + "\nA - " + vaihtoehdot.get(0)
                + "\nB - " + vaihtoehdot.get(1)
                + "\nC - " + vaihtoehdot.get(2) + "\n");
        Scanner in = new Scanner(System.in);
        String vastaa = null;
        outer:
        for (; ; ) {
            vastaa = in.nextLine();
            switch (vastaa) {
                case "a":
                case "A":
                    if ("A".equals(this.vastaus)) {
                        oikein();
                        return true;
                    } else {
                        vaarin();
                        return false;
                    }
                case "b":
                case "B":
                    if ("B".equals(this.vastaus)) {
                        oikein();
                        return true;
                    } else {
                        vaarin();
                        return false;
                    }
                case "c":
                case "C":
                    if ("C".equals(this.vastaus)) {
                        oikein();
                        return true;
                    } else {
                        vaarin();
                        return false;
                    }
                default:
                    System.out.println("Et valinnut vastausta!");
                    continue;
            }
        }
    }
    private void oikein() {
        System.out.println("Vastasit oikein!\n");
    }
    private void vaarin() {
        System.out.println("Väärin!!!\nParempaa onnea ensi kerralla!\n");
    }
}