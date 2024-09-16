package NouvelleFacture;

public class Produit {
    private String nom;
    private Double prix;
    // La classe Double est un un conteneur qui enrobe double... ceci nous sera utile lors de l'utilisation d'ArrayList<Double>

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix; // ceci est legal en Java meme si this.prix et prix n'ont techniqument pas le meme type !
    }

    public double prix() {
        return 0.0; // Ceci n'est pas une bonne pratique ! On developpera l'exemple avec l'abstraction :D
    }

    public Double getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }
}

