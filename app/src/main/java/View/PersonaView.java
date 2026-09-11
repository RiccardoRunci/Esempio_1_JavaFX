package View;
/**1)In questa classe ho creato il layout manager che mi contiene tutti i componenti node (bottoni,
 * label, textbox, ecc...) Javafx.
 * 2)Come una classe "solita", i vari componenti sono private (incluso il layout manager, sono private
 * le label, i bottoni, ecc...).
 * 3)Poi con il costruttore inizializzo il layout manager e ci metto dentro tutti i componenti.
 * 4)IMPORTANTE: DEVO FARE UN METODO CHE MI RITORNA IL LAYOUT MANAGER DELLA CLASSE VIEW!
 * Questo metodo permette a chi lo richiama di costruire la finestra!
 * 5)Devo fare tutti i metodi SET E GET di tutti i componenti grafici (perchè poi verranno usati dalla
 * classe controller!).*/
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox; //il layout manager
import javafx.scene.Parent; //la superclasse di tutti i layout manager!

public class PersonaView
{
    private VBox ManagerLayoutVBox;
    private Label lblId = new Label("ID PERSONA");
    private Label lblNome = new Label("NOME PERSONA:");
    private Label lblCognome = new Label("COGNOME PERSONA:");

    private TextField txtId = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtCognome = new TextField();

    private Button btnSalva = new Button("SALVA");
    private Button btnReset = new Button("RESET");
    private Button btnIndietro = new Button("<-INDIETRO");
    //Costruttore!
    public PersonaView()
    {
        ManagerLayoutVBox = new VBox(10); // 10px di spazio verticale
        ManagerLayoutVBox.getChildren().addAll(
                lblId, txtId,
                lblNome, txtNome,
                lblCognome, txtCognome,
                btnSalva, btnReset,
                btnIndietro
        );
    }
    /**Metodi set e get di tutti i componenti grafici!*/
    public Label getLblId() { return this.lblId; }
    public Label getLblNome() { return this.lblNome; }
    public Label getLblCognome() { return this.lblCognome; }
    public void setLblId(Label lblId){ this.lblId=lblId; }
    public void setLblNome(Label lblNome){ this.lblNome=lblNome; }
    public void setLblCognome(Label lblCognome){ this.lblCognome=lblCognome; }
    public TextField getTxtId() {return this.txtId;}
    public TextField getTxtNome(){return this.txtNome;}
    public TextField getTxtCognome(){return this.txtCognome;}
    public void setTxtId(TextField txtId){ this.txtId=txtId; }
    public void setTxtNome(TextField txtNome){ this.txtNome=txtNome; }
    public void setTxtCognome(TextField txtCognome){ this.txtCognome=txtCognome; }
    public Button getBtnSalva(){ return this.btnSalva; }
    public Button getBtnReset(){ return this.btnReset; }
    public void setBtnSalva(Button btnSalva) { this.btnSalva=btnSalva; }
    public void setBtnReset(Button btnReset) { this.btnReset=btnReset; }
    public Button getBtnIndietro(){ return this.btnIndietro; }
    public void setBtnIndietro(Button btnIndietro) { this.btnIndietro=btnIndietro; }

    /**Questo metodo serve alle classi che
     **devono visualizzare questa View**
     * a ottenere il suo layout manager.*/
    public Parent getLayoutManagerPersonaView()
    {
        return this.ManagerLayoutVBox;
    }

}
