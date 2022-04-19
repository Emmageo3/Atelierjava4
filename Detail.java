import java.util.Scanner;

public class Detail
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String [] tableau = new String[6];

        System.out.println("Quel est votre nom ?");
        tableau[0] = sc.nextLine();

        System.out.println("Quel est votre prénom ?");
        tableau[1] = sc.nextLine();

        System.out.println("Quel est votre adresse ?");
        tableau[2] = sc.nextLine();

        System.out.println("Quel est votre date de naissance ?");
        tableau[3] = sc.nextLine();

        System.out.println("Quel est votre lieu de naissance ?");
        tableau[4] = sc.nextLine();

        System.out.println("Quel est votre numéro de téléphone ?");
        tableau[5] = sc.nextLine();

        for(int i = 0; i < tableau.length; i++)
        {
            System.out.println(tableau[i]);
        }
    }
}