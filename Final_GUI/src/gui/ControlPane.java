package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import logic.GameLogic;

public class ControlPane extends VBox {
	
	private Text gameText;
	private Button newGameButton;
	private TicTacToePane ticTacToePane;
	
	public ControlPane(TicTacToePane ticTacToePane) {
		super();
		this.ticTacToePane = ticTacToePane;
		//To be implemented
		setAlignment(Pos.CENTER);
		setTranslateX(80);
		setPrefWidth(300);
		setSpacing(20);
		initializeGameText();
		initializeNewGameButton();
		
		getChildren().addAll(gameText, newGameButton);
		
	}
	
	private void initializeGameText() {
		//To be implemented
		gameText = new Text("O Turn");
		gameText.setFont(new Font(35));
		
	}
	
	public void updateGameText(String text) {
		//To be implemented
		gameText.setText(text);
	}
	
	private void initializeNewGameButton() {
		//To be implemented
		newGameButton = new Button("New Game");
		setPrefWidth(100);
		newGameButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				newGameButtonHandler();
			}
		});
		
	}
	
	private void newGameButtonHandler() {
		//To be implemented
		GameLogic.getInstance().newGame();
		gameText.setText("O Turn");
		
		for (int i = 0; i < ticTacToePane.getAllCells().size(); i++) {
			ticTacToePane.getAllCells().get(i).initializeCellColor();
		}
		
	}
}
