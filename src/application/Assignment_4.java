package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Assignment_4 extends Application {

	Button btnDivision;
	Button btnMultiply;
	Button btnAddition;
	Button btnSubtraction;

	TextField NumberOneInput;
	TextField NumberTwoInput;

	Label resultsLabel;
	
	Button btnClear;



	@Override
	public void start(Stage stage) {
		btnDivision = new Button("/");
		btnMultiply = new Button("*");
		btnAddition = new Button("+");
		btnSubtraction = new Button("-");
		NumberOneInput = new TextField();
		NumberTwoInput = new TextField();
		resultsLabel = new Label("?"); 
		btnClear = new Button("Clear");

		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);

		 
        root.setHgap(10);
        root.setVgap(10);
        
		root.add(btnDivision, 0, 0);
		root.add(btnMultiply, 1, 0);
		root.add(btnAddition, 0, 1);
		root.add(btnSubtraction, 1, 1);
		root.add(btnClear, 0, 4, 2, 1); // <Node> <Column Index> <Row Index> <Column Span> <Row Span>

		attachCode();

		Scene scene = new Scene(root, 300, 250); 
		stage.setTitle("Assignment 3");
		stage.setScene(scene);
		stage.show();

	}
	public void attachCode(){
		btnDivision.setOnAction(e -> btncode(e));
		btnMultiply.setOnAction(e -> btncode(e));
		btnAddition.setOnAction(e -> btncode(e));
		btnSubtraction.setOnAction(e -> btncode(e));
		btnClear.setOnAction(e -> btncode(e));
	}
	
	public void btncode(ActionEvent e) {
		int num1, num2, answer;
		char symbol; 
		
		if(e.getSource() == btnClear){
			NumberOneInput.setText("");
			NumberTwoInput.setText("");
			resultsLabel.setText("?");
			NumberOneInput.requestFocus();
			return;
		}
	
		num1 = Integer.parseInt(NumberOneInput.getText());
		num2 = Integer.parseInt(NumberTwoInput.getText());
		
		if (e.getSource() == btnAddition){
			symbol = '+';
			answer = num1 + num2; 
		}else if (e.getSource() == btnSubtraction){
			symbol = '-';
			answer = num1 + num2;
		}else if (e.getSource() == btnMultiply){
			symbol = '*';
			answer = num1 * num2;
		}else {
			symbol = '/';
			answer = num1 / num2;
		}
		
		resultsLabel.setText("" + num1 + symbol + " = " + answer);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
