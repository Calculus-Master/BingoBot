package calculusmaster.bingobot.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BingoFX extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception
	{
		GridPane pane = new GridPane(15, 15);

		for(int i = 0; i < 5; i ++)
			for(int j = 0; j < 5; j++)
				pane.add(new Label("(" + i + ", " + j + ")"), j, i);

		stage.setScene(new Scene(pane, 800, 800));
		stage.show();
	}
}
