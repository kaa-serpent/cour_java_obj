package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args){
        AdressePostale adressePostale = new AdressePostale(12, "rue juir", 75015, "PAris");
        Personne jean = new Personne("Jean", "popl", adressePostale);
        System.out.println(jean.adressePostale.codePostal);
    }
}
