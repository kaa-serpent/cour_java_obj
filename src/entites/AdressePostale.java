package entites;

public class AdressePostale {
    public int numRue;
    public String nomRue;
    public int codePostal;
    public String ville;

    public AdressePostale(int numRue, String nomRue, int codePostal, String ville) {
        this.numRue = numRue;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}
