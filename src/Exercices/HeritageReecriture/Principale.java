package Exercices.HeritageReecriture;

import java.util.Scanner;

public class Principale {

    public static void main(String [] args) {
        Parent parent = new Parent();
        parent.methodeAppelante();

        attendre();

        Parent parent2 = new EnfantDifficile();
        parent2.methodeAppelante();

        attendre();
        EnfantDifficile enfant = new EnfantDifficile();
        enfant.methodeAppelante();

        attendre();
        EnfantFacile enfantFacile = new EnfantFacile();
        enfantFacile.methodeAppelante();

        attendre();
        Parent parent3 = new EnfantFacile();
        parent3.methodeAppelante();
    }


    /**
     * Alternative a la classe clavier
     */
    public static void attendre() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}

