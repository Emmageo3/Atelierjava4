import java.util.Scanner;

public class Calcul
{
    public static void main(String[] args) {
        
    }
    public static int somme()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier nombre : ");
        int a = sc.nextInt();
        System.out.println("Veuillez saisir le second nombre : ");
        int b = sc.nextInt();

        int somme = a + b;

        return somme;
    }
    public static int difference()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier nombre : ");
        int a = sc.nextInt();
        System.out.println("Veuillez saisir le second nombre : ");
        int b = sc.nextInt();

        int difference =  a - b;

        return difference;
    }
    public static int quotient()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier nombre : ");
        int a = sc.nextInt();
        System.out.println("Veuillez saisir le second nombre : ");
        int b = sc.nextInt();

        int quotient = a / b;

        return quotient;
    }
    public static int produit()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier nombre : ");
        int a = sc.nextInt();
        System.out.println("Veuillez saisir le second nombre : ");
        int b = sc.nextInt();

        int produit = a * b;

        return produit;
    }
}