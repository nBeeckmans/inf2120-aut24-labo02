package Bonus;

public class UsineSimple {

    public static void main(String []args) {
        Objet objetInconnu = getObjet(1);

        System.out.println(objetInconnu.getClass().getName());

        objetInconnu = getObjet(2);

        System.out.println(objetInconnu.getClass().getName());

    }

    public static Objet getObjet(int nombre) {
        return switch(nombre) {
            case 1 -> new ObjetUn();
            case 2 -> new ObjetDeux();
            default -> null;
        };
    }
}
