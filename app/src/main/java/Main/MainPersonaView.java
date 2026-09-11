/**Questo main è solo per provare Persona(MVC)!*/
package Main;
import Controller.PersonaController;
import Model.Persona.Persona;
import View.PersonaView;
import javafx.application.Application; //è per "extends Application"!
import javafx.stage.Stage; //è la parte principale di javaFx!
import javafx.scene.Scene; //è la scena che sta nel palcoscenico, la scena cambia!
public class MainPersonaView extends Application //se no dà errore override di start!
{
   @Override //senza "extend Application" hai l'errore su override!
    public void start(Stage palcoscenico)
    {
        //Creo un oggetto model con il tipo della variabile Persona.
        Persona model = new Persona();
        //Creo un oggetto view con il tipo della variabile PersonaView.
        PersonaView view = new PersonaView();

        Scene scena = new Scene(view.getLayoutManagerPersonaView(), 400, 270);

        //Creo un oggetto Controller con il tipo della variabile PersonaController
        PersonaController controller = new PersonaController(view, model,scena);


            palcoscenico.setScene(scena);
            palcoscenico.setTitle("Persona");
        palcoscenico.show();
    }
    public static void main(String[] args)
    {
        launch();
    }
}
