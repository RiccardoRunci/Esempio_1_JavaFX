package Main;
import Controller.IntroController;
import View.IntroView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main1 extends Application
{
    @Override
    public void start(Stage palcoscenico)
    {
        IntroView introView = new IntroView();
        Scene scena = new Scene(introView.getLayoutManagerIntroView(), 400, 300);
        IntroController introController = new IntroController(introView, scena);

        palcoscenico.setScene(scena);
        palcoscenico.setTitle("Rubrica");
        palcoscenico.show();
    }
    public static void main(String[] args)
    {
        launch();
    }
}
