package NouvelleFacture;

public class NonTaxable extends Produit {


    public NonTaxable(String nom, double prix) {
        super(nom, prix);
    }

    public double prix() {
        return super.getPrix();
    }
}
