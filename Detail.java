import java.util.Scanner;

public class Detail {

    public static void main(String[] args)
    {

        saisie();
    }

    public static void saisie()
    {

        Scanner sc = new Scanner(System.in);

        System.out.println(" nom : ");
        String nom = sc.next();
        System.out.println(" prénom : ");
        String prenom = sc.next();
        System.out.println("Veuillez saisir l'adresse : ");
        String adresse = sc.next();
        System.out.println("Veuillez saisir la date de naissance : ");
        String datedenaissance = sc.next();
        System.out.println(" lieu de naissance : ");
        String lieudenaissance = sc.next();
        System.out.println(" numéro de téléphone : ");
        int telephone = sc.nextInt();

        System.out.println("La personne s'appelle " + prenom + nom + ", elle habite a " + adresse + ". Elle est née le " + datedenaissance + " a " + lieudenaissance + "et son numéro de téléphone est : " + telephone);

        
    }

    
    
}
