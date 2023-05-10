package gui;

import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class NumberSquare extends HBox {
	
	private int number;
	private boolean isDrawn;
	private Text numberText;

	public NumberSquare() {
		BingoUtil.initializeNumberSquare(this);	
		this.setAlignment(Pos.CENTER);
		this.setMaxSize(64, 64);
		this.setBorder(new Border(new BorderStroke(Color.GOLD, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}

	public void setupNumber(int number) {
		// TODO
		this.number = number;
		this.isDrawn = false;
		this.numberText = new Text(Integer.toString(number));
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
		this.numberText.setFont(new Font(20));
		this.getChildren().add(numberText);
		
		
	}	
	
	public void highlight() {
		// TODO 
		this.setBackground(new Background(new BackgroundFill(Color.ORANGE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
		this.isDrawn = true;
	}
	
	public int getNumber() {
		return number;
	}	

	public boolean isDrawn() {
		return isDrawn;
	}

	public void setNumberText(Text numberText) {
		this.numberText = numberText;
	}
}
