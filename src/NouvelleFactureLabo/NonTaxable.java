package NouvelleFactureLabo;

public class NonTaxable extends Produit {

    public NonTaxable(double prix, String nom) {
        super(prix, nom);
    }

    @Override
    public double prix() {
        return super.getPrix();
    }
}
