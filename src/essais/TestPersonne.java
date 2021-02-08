package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args){
        Personne jean = new Personne("Jean", "popl", new AdressePostale(12, "rue juir", 75015, "PAris"));
        System.out.println(jean.adressePostale.codePostal);
    }
}
