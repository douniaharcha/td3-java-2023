package EX3;

public class Centre extends Point {


        private char nom;

        public Centre(int x, int y, char nom) {
            super(x, y);
            this.nom = nom;
        }

        public void affNom() {
            System.out.println("Nom : " + nom);
        }

        @Override
        public void affiche() {
            super.affiche();
            affNom();
        }
    }

