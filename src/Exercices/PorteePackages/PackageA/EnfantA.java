package Exercices.PorteePackages.PackageA;

public class EnfantA extends Parent {
    public void acces() {
        System.out.println(publicInt);
        System.out.println(protectedInt);
        System.out.println(packageInt);
        // pas possible
        //System.out.println(privateInt);
    }
}
