package Exercices.HeritageReecriture;

public class Parent {

    public void methodeA() {
        System.out.println("Methode A - parent");
    }

    public void methodeB() {
        System.out.println("Methode B - parent");
    }

    public void methodeAppelante() {
        System.out.println("Appel - parent");
        this.methodeA();
    }
}
