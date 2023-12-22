package EX7;

public abstract class Employe {

        protected String nom;
        protected String prenom;


        public Employe() {}

        public Employe(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }


        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }


        @Override
        public String toString() {
            return "Employe{" +
                    "nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    '}';
        }


        public abstract double gains();
    }


