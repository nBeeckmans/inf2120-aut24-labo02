package NouvelleFacture;

public class Facture {
    private Produit produits[] = new Produit[30];
    private int nombreElements = 0;

    public void ajouterProduitNonTaxable( NonTaxable produit ) {
        assert nombreElements < 30;
        produits[nombreElements] = produit;
        nombreElements++;
    }
    public void ajouterProduitTaxeSimple( TaxeSimple produit ) {
        assert nombreElements < 30;
        produits[nombreElements] = produit;
        nombreElements++;
    }
    public void ajouterProduitTaxeDouble( TaxeDouble produit ) {
        assert nombreElements < 30;
        produits[nombreElements] = produit;
        nombreElements++;
    }

    // ceci permet de remplacer les trois methodes precedentes
    public void ajouterProduit( Produit produit ) {
        assert nombreElements < 30;
        produits[nombreElements] = produit;
        nombreElements++;
    }

    public double prixTotal() {
        double total = 0.0;
        for (Produit produit : produits) {
            total += produit.prix();
        }

        return total;
    }
}
