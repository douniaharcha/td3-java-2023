package EX7;

public class TravailleurHoraire extends Employe {

        private double retribution;
        private int heures;


        public TravailleurHoraire() {}

        public TravailleurHoraire(String nom, String prenom, double retribution) {
            super(nom, prenom);
            this.retribution = retribution;
            this.heures = 0;
        }


        public double getRetribution() {
            return retribution;
        }

        public void setRetribution(double retribution) {
            this.retribution = retribution;
        }

        public int getHeures() {
            return heures;
        }

        public void setHeures(int heures) {
            this.heures = heures;
        }


        @Override
        public double gains() {
            return retribution * heures;
        }


        @Override
        public String toString() {
            return "TravailleurHoraire{" +
                    "nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", retribution=" + retribution +
                    ", heures=" + heures +
                    '}';
        }
    }

