package EX4;

public class TestBatiment {

    public static void main(String[] args) {

        Batiment batiment1 = new Batiment();
        System.out.println("Batiment 1 : " + batiment1);

        Batiment batiment2 = new Batiment("5 Rue de casablanca");
        System.out.println("Batiment 2 : " + batiment2);


        Maison maison1 = new Maison();
        System.out.println("Maison 1 : " + maison1);

        Maison maison2 = new Maison("10 Rue de settat", 3);
        System.out.println("Maison 2 : " + maison2);


        Immeuble immeuble1 = new Immeuble();
        System.out.println("Immeuble 1 : " + immeuble1);

        Immeuble immeuble2 = new Immeuble("15 Rue de tanger", 10);
        System.out.println("Immeuble 2 : " + immeuble2);
    }
}
