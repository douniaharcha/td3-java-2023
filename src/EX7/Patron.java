package EX7;

public class Patron extends Employe {

        private double salaire;

        // Constructeurs
        public Patron() {}

        public Patron(String nom, String prenom, double salaire) {
            super(nom, prenom);
            this.salaire = salaire;
        }


        public double getSalaire() {
            return salaire;
        }

        public void setSalaire(double salaire) {
            this.salaire = salaire;
        }


        @Override
        public double gains() {
            return salaire;
        }


        @Override
        public String toString() {
            return "Patron{" +
                    "nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", salaire=" + salaire +
                    '}';
        }
    }


