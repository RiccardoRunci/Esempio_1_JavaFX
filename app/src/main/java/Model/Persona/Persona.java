package Model.Persona;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class Persona
{
    private int  idPersona;
    private String nomePersona;
    private String cognomePersona;

    public Persona(){}
    public Persona(String nomePersona, String cognomePersona,int idPersona)
    {
        this.nomePersona = nomePersona;
        this.cognomePersona = cognomePersona;
        this.idPersona = idPersona;
    }
    public int getIdPersona() { return this.idPersona; }
    public void setIdPersona(int idPersona) { this.idPersona = idPersona; }
    public String getNomePersona() { return this.nomePersona; }
    public void setNomePersona(String nomePersona) { this.nomePersona = nomePersona; }
    public String getCognomePersona() { return this.cognomePersona; }
    public void setCognomePersona(String cognomePersona) { this.cognomePersona = cognomePersona; }
    @Override
    public String toString()
    { return "Persona: " +this.idPersona +"\n"+
            "Cognome: "+this.cognomePersona +"\n"+
            "Nome: "+this.nomePersona+"\n";
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this==obj) return true;
        if(!(obj instanceof Persona)) return false;
        Persona other = (Persona)obj;
        return this.nomePersona.equals(other.getNomePersona()) &&
                this.cognomePersona.equals(other.getCognomePersona()) &&
                (this.idPersona == other.getIdPersona()) ;
    }
    @Override
    public int hashCode()
    {
        return java.util.Objects.hash(this.nomePersona, this.cognomePersona, this.idPersona);
    }

    public boolean salvaPersona(String id,String Nome, String Cognome)
    {
        System.out.println("Persona da salvare:"+id+" "+Nome+" "+Cognome);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("NON ANCORA IMPLEMENTATO!");
        alert.setHeaderText("Sei sicuro?");
        alert.setContentText("Vuoi procedere?");

        alert.showAndWait().ifPresent(response ->
        {
            if (response == ButtonType.OK)
            {
                System.out.println("Hai premuto OK");
            }
        });

        return true;
    }
}
