package View;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
public class IntroView
{
    private VBox ManagerLayoutVBox;
    private Label lblTitolo = new Label("BENVENUTO NEL PROGRAMMA RUBRICA!");
    private Button btnAggiungiPersona = new Button("AGGIUNGI PERSONA");
    private Button btnVisualizzaRubrica = new Button("VISUALIZZA RUBRICA");
    public IntroView()
    {     /*VBox (verticale)
          ├── Label (centrata)
          └── HBox (orizzontale)
                ├── Button sinistra
                └── Button destra*/
        lblTitolo.setStyle("-fx-font-size: 18; -fx-font-weight: bold;");

        HBox ManagerLayouthboxBottoni = new HBox(20); // spazio tra i bottoni
        ManagerLayouthboxBottoni.setAlignment(Pos.CENTER); // li centra orizzontalmente
        ManagerLayouthboxBottoni.getChildren().addAll(btnAggiungiPersona, btnVisualizzaRubrica);

        ManagerLayoutVBox = new VBox(20);
        ManagerLayoutVBox.setPadding(new Insets(20)); //devi importare javafx.geometry.Insets;
        ManagerLayoutVBox.setAlignment(Pos.CENTER); // centra tutto
        ManagerLayoutVBox.getChildren().addAll(lblTitolo, ManagerLayouthboxBottoni);
    }
    //Metodi set e get dei componenti di questa finestra!
    public Button getBtnAggiungiPersona(){return this.btnAggiungiPersona;}
    public Button getBtnVisualizzaRubrica() {return this.btnVisualizzaRubrica;}
    /**Questo metodo serve alle classi che
     **devono visualizzare questa View**
     * a ottenere il suo layout manager.*/
    public Parent getLayoutManagerIntroView()
    {
        return this.ManagerLayoutVBox;
    }
}
