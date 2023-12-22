package EX5;

public class Moto extends Vehicule {

    private int nbRoues = 2;

    public Moto(int nbPassager) {
        super(nbPassager);
    }

    @Override
    public String toString() {
        return super.toString() + ", Nombre de roues : " + nbRoues;
    }
}
