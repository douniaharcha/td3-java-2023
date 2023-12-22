package EX6;

import EX1.Point;

public class Disque extends Figure {



        private Point centre;
        private double rayon;


        public Disque() {}

        public Disque(Point centre, double rayon) {
            this.centre = centre;
            this.rayon = rayon;
        }

        public Disque(Point centre, double rayon, String nom) {
            this.centre = centre;
            this.rayon = rayon;
            this.nom = nom;
        }


        public Point getCentre() {
            return centre;
        }

        public void setCentre(Point centre) {
            this.centre = centre;
        }

        public double getRayon() {
            return rayon;
        }

        public void setRayon(double rayon) {
            this.rayon = rayon;
        }


        @Override
        public double getPerimeter() {
            return 2 * Math.PI * rayon;
        }

        @Override
        public double getAire() {
            return Math.PI * rayon * rayon;
        }
    }

