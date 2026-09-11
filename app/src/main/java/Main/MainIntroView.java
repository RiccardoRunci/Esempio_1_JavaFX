/**Questo main è solo per provare come viene fuori la view di IntroView!*/
package Main;
import View.IntroView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class MainIntroView extends Application
{
    @Override
    public void start(Stage palcoscenico) throws Exception
    {
        //Creo un oggetto view con il tipo della variabile PersonaView.
        IntroView view = new IntroView();
        Scene scena = new Scene(view.getLayoutManagerIntroView(), 400, 400);
        palcoscenico.setScene(scena);
        palcoscenico.setTitle("Ciao");
        palcoscenico.show();
    }
    public static void main(String[] args)
    {
        launch();
    }
}
