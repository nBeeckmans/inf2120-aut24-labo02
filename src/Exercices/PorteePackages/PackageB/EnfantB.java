package Exercices.PorteePackages.PackageB;

import Exercices.PorteePackages.PackageA.Parent;
public class EnfantB extends Parent {
    public void acces() {
        System.out.println(super.protectedInt);
        System.out.println(super.publicInt);
        // pas possible
        //System.out.println(super.packageInt);
        //System.out.println(super.privateInt);

    }
}
