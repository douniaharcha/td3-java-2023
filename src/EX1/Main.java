package EX1;

public class Main {

    public static void main(String[] args){
        // Création d'un objet PointA
        PointA pointA = new PointA(3, 5);

        // Utilisation de la méthode affiche
        pointA.affiche();

        // Déplacement du point
        pointA.deplace(1, -1);

        // Utilisation à nouveau de la méthode affiche
        pointA.affiche();

    }
}