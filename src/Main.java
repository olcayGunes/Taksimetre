import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        double gidilenKm, odenecekTutar, kmUcreti = 2.20, acilisUCreti = 10;

        System.out.print("Kaç kilometre yol gidildi: ");
        gidilenKm = input.nextDouble();

        odenecekTutar = acilisUCreti+(gidilenKm*kmUcreti);

        odenecekTutar = odenecekTutar<=20 ? 20 : odenecekTutar;

        System.out.println("Ödemeniz gereken tutar: "+odenecekTutar+"TL'dir.");
    }
}
