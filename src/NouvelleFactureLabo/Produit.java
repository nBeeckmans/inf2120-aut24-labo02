package NouvelleFactureLabo;

public class Produit {
    private double prix;
    private String nom;

    public Produit(double prix, String nom) {
        this.prix = prix;
        this.nom = nom;
    }


    public double prix() {
        return 0.0;
    }

    protected double getPrix() {
        return prix;
    }
}
