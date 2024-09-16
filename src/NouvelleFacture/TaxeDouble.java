package NouvelleFacture;

public class TaxeDouble extends Produit {
    public TaxeDouble(String nom, double prix) {
        super(nom, prix);
    }


    @Override
    public double prix() {
        return super.getPrix() * 1.09975;
    }
}
