package NouvelleFactureLabo;

public class TaxeDouble extends Produit {
    public TaxeDouble(double prix, String nom) {
        super(prix,nom);
    }

    @Override
    public double prix() {
        return getPrix() * 1.09975;
    }
}
