import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvidencijaPolaznika  {

public static void main (String [] args){

    ArrayList<Polaznik> polaznici = new ArrayList<>();
    Scanner unos = new Scanner(System.in);

    int izbor;

    do{
        System.out.println("1.Unos novog polaznika.");
        System.out.println("2.Ispis svih polaznika.");
        System.out.println("3.Pretrazivanje po email adresi.");
        System.out.println("0.Izlaz");
        System.out.println("Odaberite opciju: ");

        izbor = unos.nextInt();
        unos.nextLine();

        switch(izbor){
            case 1:
                System.out.println("Unesite ime:");
                String ime = unos.nextLine();

                System.out.println("Unesite prezime: ");
                String prezime = unos.nextLine();

                System.out.println("Unesite email: ");
                String email = unos.nextLine();

                polaznici.add(new Polaznik(ime, prezime, email));
                System.out.println("Polaznik uspjesno dodan");
                break;


            case 2:

                if (polaznici.isEmpty()){
                    System.out.println("Nema unesenih polaznika");
                } else{
                    System.out.println(" Popis polaznika: ");
                    for(Polaznik p  : polaznici){
                        System.out.println(p);
                    }
                }
                break;

            case 3:
                System.out.println("Unesite email za pretragu: ");
                String trazeniEmail = unos.nextLine();

                boolean pronadjen = false;

                for (Polaznik p : polaznici){
                    if(p.getEmail().equalsIgnoreCase(trazeniEmail))
                    {
                        System.out.println("Pronadjen polaznik: ");
                        System.out.println(p);

                        pronadjen = true;
                        break;
                    }
                }

                if(!pronadjen){
                    System.out.println("Polaznik sa tim emailom ne postoji!");
                }
                break;

            case 0:
                System.out.println("Izlaz iz programa");
                break;

                default:
                System.out.println("Neispravan odabir.");
        }
    }while( izbor != 0);

    unos.close();


}
}