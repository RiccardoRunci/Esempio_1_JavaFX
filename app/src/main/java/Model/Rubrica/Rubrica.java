package Model.Rubrica;
import Model.Persona.Persona;
import java.util.Set;
import java.util.HashSet;

public class Rubrica
{
    private String nomeRubrica;
    private Set<Persona> insiemePersone;
    public Rubrica() {}
    public Rubrica(String nomeRubrica)
    {
        this.nomeRubrica = nomeRubrica;
        insiemePersone = new HashSet<Persona>();
    }
    public String getNomeRubrica() { return this.nomeRubrica; }
    public void setNomeRubrica(String nomeRubrica) { this.nomeRubrica=nomeRubrica; }
    private Set getInsiemePersone() { return this.insiemePersone; }
    private void setInsiemePersone(Set<Persona> insiemePersone) {this.insiemePersone=insiemePersone;}

    @Override
    public int hashCode()
    {
        return java.util.Objects.hash(this.nomeRubrica, this.insiemePersone);
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this==obj) return true;
        if(!(obj instanceof Rubrica)) return false;
        Rubrica other = (Rubrica)obj;
        return this.nomeRubrica.equals(other.getNomeRubrica()) &&
                (this.insiemePersone == other.getInsiemePersone());
    }
    @Override
    public String toString()
    {
        return "Nome Rubrica: "+this.nomeRubrica+"\n";
    }
    public int stampaQuantitaPersoneSalvate() { return this.insiemePersone.size(); }
    /*todo:
    *   1)Aggiungi persona in rubrica!
    *  2)elimina Persona dalla rubrica!
    *  3)stampa tutte le persone della rubrica!*/
}
