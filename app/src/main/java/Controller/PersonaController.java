/**Nella classe controller:
 * 1)i campi sono le classi model e view! E SCENE
 * 2)Nel costruttore li ricevo come parametri e attivo i listener!
 * 3)Faccio dei metodi a parte per i listener (per fargli fare il loro lavoro).
 * Per tenere più pulito il codice.
 * 4)POI PERO' NEL MAIN MI DEVO RICORDARE DI ATTACCARE IL CONTROLLER AL RESTO DEL PATTERN MVC*/
package Controller;
import Model.Persona.Persona; //La classe Model (Persona)
import View.IntroView;
import View.PersonaView; //La classe view (PersonaView)
import javafx.scene.Scene;

public class PersonaController
{
    private PersonaView view;
    private Persona model;
    private Scene scena;   // SERVE PER FAR TORNARE INDETRO A INTROVIEW

    public PersonaController(PersonaView view, Persona model,Scene scena)
    {
        this.view = view;
        this.model = model;
        this.scena=scena;
        // Aggancio gli eventi
        view.getBtnSalva().setOnAction(e -> salvaPersona());
        view.getBtnReset().setOnAction(e -> pulisciCampi());
        view.getBtnIndietro().setOnAction(e -> tornaIndietro());
    }

    private void salvaPersona()
    {
        String id = view.getTxtId().getText();
        String nome = view.getTxtNome().getText();
        String cognome = view.getTxtCognome().getText();

        model.salvaPersona(id, nome, cognome);
    }

    private void pulisciCampi()
    {
        view.getTxtId().clear();
        view.getTxtNome().clear();
        view.getTxtCognome().clear();
    }
    private void tornaIndietro()
    {
        IntroView introView = new IntroView();
        IntroController controller = new IntroController(introView, scena);
        scena.setRoot(introView.getLayoutManagerIntroView());
    }
}
