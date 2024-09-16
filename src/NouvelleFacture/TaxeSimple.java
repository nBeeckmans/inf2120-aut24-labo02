package NouvelleFacture;

public class TaxeSimple extends Produit {

    public TaxeSimple(String nom, double prix) {
        super(nom, prix);
    }


    public double prix() {
        return super.getPrix() * 1.05;
    }
}
