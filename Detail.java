import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Detail {


    public String matricule;
    public String nom;
    public String prenom;
    public String adresse;
    public String dateNaissance;
    public String lieuNaissance;
    public String numerTelephone;

    Scanner scan=new Scanner(System.in);

    public Detail()
    {

    }


    public Detail(String matricule, String nom, String prenom, String adresse, String dateNaissance, String lieuNaissance, String numerTelephone) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.numerTelephone = numerTelephone;
    }

    public String getMatricule() {
        return this.matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return this.lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getNumerTelephone() {
        return this.numerTelephone;
    }

    public void setNumerTelephone(String numerTelephone) {
        this.numerTelephone = numerTelephone;
    }

    @Override
    public String toString() {
        return "{" +
            " matricule='" + getMatricule() + "'" +
            ", nom='" + getNom() + "'" +
            ", prenom='" + getPrenom() + "'" +
            ", adresse='" + getAdresse() + "'" +
            ", dateNaissance='" + getDateNaissance() + "'" +
            ", lieuNaissance='" + getLieuNaissance() + "'" +
            ", numerTelephone='" + getNumerTelephone() + "'" +
            "}";
    }

    public Detail saisieDetail()
    {
        System.out.println("Saisie les information d'une Detail: ");
        System.out.println("ENtrer le matricule: ");
        String matricule=scan.next();
        System.out.println("Entrer le nom: ");
        String nom=scan.next();
        System.out.println("Entrer le prenom :");
        String prenom=scan.next();
        System.out.println("Entrer l'Adresse: ");
        String adresse=scan.next();
        System.out.println("Entrer la date de naissance: ");
        String dateNaissance=scan.next();
        System.out.println("Entrer le Lieu de naissance: ");
        String lieuNaissance=scan.next();
        System.out.println("entrer le numero de telephone: ");
        String numerTelephone=scan.next();
        Detail pers=new Detail(matricule,nom, prenom,adresse,dateNaissance,lieuNaissance, numerTelephone);
        return pers;
    }   
    
    public static void main(String[] args) {
        Detail Kaba = new Detail();
        System.out.println(Kaba.saisieDetail().toString());
    }
}