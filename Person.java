public class Person {
   String nom;
   String prenom;
   //Constructeur
   Person(String nom, String prenom){
      this.nom = nom;
      this.prenom = prenom;
   }
   public static void main(String[] args) {
      Person obj = new Person("Diarietou", "Toure");
      System.out.println(obj.nom + " " + obj.prenom);
   }
}
