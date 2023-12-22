package EX3;

public class Cercle extends Centre {

        private double rayon;

        public Cercle(int x, int y, char nom, double rayon) {
            super(x, y, nom);
            this.rayon = rayon;
        }

        @Override
        public void affiche() {
            super.affiche();
            System.out.println("Rayon : " + rayon);
        }
    }
