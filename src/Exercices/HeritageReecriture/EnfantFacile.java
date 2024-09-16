package Exercices.HeritageReecriture;

public class EnfantFacile extends Parent {
    @Override
    public void methodeAppelante() {
        System.out.println("Appel - enfant");
        this.methodeB();
    }

    @Override
    public void methodeB() {
        System.out.println("Methode B - Enfant");
    }
}
