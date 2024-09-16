package NouvelleFactureLabo;

public class Facture {
    private Produit[] produits = new Produit[30];
    private int compteur;

    public void ajouterNonTaxable(NonTaxable produit) {
        assert compteur < 30;
        produits[compteur++] = produit;
    }

    public void ajouterTaxeDouble(TaxeDouble produit) {
        assert compteur < 30;
        produits[compteur++] = produit;
    }

    public void ajouterProduit(Produit produit) {
        assert compteur < 30;
        produits[compteur++] = produit;
    }

    public double prixTotal() {
        double total = 0.0;
        for (int i = 0; i < compteur; i++) {
            total += produits[i].prix();
        }
        return total;
    }
}
