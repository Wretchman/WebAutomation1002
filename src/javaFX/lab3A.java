package javaFX;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class lab3A extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		//Create a GridPane
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(15, 15, 15, 15));
		pane.setHgap(5);
		pane.setVgap(5);

		//Nodes
		Button[] bts ={ new Button("Button 1"), new Button("Button 2"),new Button("Button 3"), new Button("Button 4"), new Button("Button 5"),
				new Button("Button 6")};
		//Handler Classes
		Handler0 handler0 = new Handler0();
		bts[0].setOnAction(handler0);

		Handler1 handler1 = new Handler1();
		bts[1].setOnAction(handler1);

		Handler2 handler2 = new Handler2();
		bts[2].setOnAction(handler2);

		Handler3 handler3 = new Handler3();
		bts[3].setOnAction(handler3);

		Handler4 handler4 = new Handler4();
		bts[4].setOnAction(handler4);

		Handler5 handler5 = new Handler5();
		bts[5].setOnAction(handler5);

		//I wanted it to be cool. Hence the colors
		for(int i = 0; i<bts.length; i++)
		{
			//Sets color of borders
			int rand = (int)(Math.random()*6);//For making each button a different color

			if(rand ==0)
			{
				bts[i].setStyle("-fx-border-color: blue");
			}
			else
				if(rand ==1)
					bts[i].setStyle("-fx-border-color: red");
				else
					if(rand == 2)
						bts[i].setStyle("-fx-border-color: gold");
					else
						if (rand == 3)
							bts[i].setStyle("-fx-border-color: black");
						else
							if(rand == 4)
								bts[i].setStyle("-fx-border-color: white");
							else
								if(rand == 5)
									bts[i].setStyle("-fx-border-color: green");
		}  



		pane.getChildren().addAll(bts);
		//}
		//Scene and Stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Lab 3A");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[]args)
	{
		Application.launch(args);
	}
}
//Handler Classes
//I put them all in the same page becuase it seemed easier for both of us than having 6 extra classes
class Handler0 implements EventHandler<ActionEvent>
{
	@Override
	public void handle(ActionEvent e)
	{
		System.out.println("Button 1 clicked");
	}
}
class Handler1 implements EventHandler<ActionEvent>
{
	@Override
	public void handle(ActionEvent e)
	{
		System.out.println("Button 2 clicked");
	}
}
class Handler2 implements EventHandler<ActionEvent>
{
	@Override
	public void handle(ActionEvent e)
	{
		System.out.println("Button 3 clicked");
	}
}
class Handler3 implements EventHandler<ActionEvent>
{
	@Override
	public void handle(ActionEvent e)
	{
		System.out.println("Button 4 clicked");
	}
}
class Handler4 implements EventHandler<ActionEvent>
{
	@Override
	public void handle(ActionEvent e)
	{
		System.out.println("Button 5 clicked");
	}
}
class Handler5 implements EventHandler<ActionEvent>
{
	@Override
	public void handle(ActionEvent e)
	{
		System.out.println("Button 6 clicked");
	}
}