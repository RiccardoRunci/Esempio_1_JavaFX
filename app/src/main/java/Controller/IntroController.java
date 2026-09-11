package Controller;
import Model.Persona.Persona;
import View.IntroView;
import View.PersonaView;
import javafx.scene.Scene;

public class IntroController
{
    private IntroView introView;
    private Scene scena;

    public IntroController(IntroView introView, Scene scena)
    {
        this.introView = introView;
        this.scena = scena;

        introView.getBtnAggiungiPersona().setOnAction(e -> apriPersonaView());
        introView.getBtnVisualizzaRubrica().setOnAction(e -> apriRubrica());
    }

    private void apriPersonaView()
    {
        /*Come nel vecchio MainPersonaView devi associare sia la parte model
        * sia view sia controller. Se no ti si apre la finestra di persona view, ma
        * non ti funzionano i pulsanti!*/
        PersonaView personaView = new PersonaView();
        Persona model = new Persona();
        PersonaController controller = new PersonaController(personaView, model, this.scena);
        this.scena.setRoot(personaView.getLayoutManagerPersonaView());   // ⭐ CAMBIO schermata
    }

    private void apriRubrica() {
        // todo qui metterai la RubricaView
    }
}
