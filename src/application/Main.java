package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {

	Button btnDivision;
	Button btnMultiply;
	Button btnAddition;
	Button btnSubtraction;

	TextField NumberOneInput;
	TextField NumberTwoInput;

	Label resultsLabel;



	@Override
	public void start(Stage stage) {
		btnDivision = new Button("/");
		btnMultiply = new Button("*");
		btnAddition = new Button("+");
		btnSubtraction = new Button("-");
		NumberOneInput = new TextField;
		NumberTwoInput = new TextField;
		resultsLabel = new Label("?"); 

		Gridpane root = new Gridpane();

		root.add(btnDivision, 0, 0);
		root.add(btnMultiply, 1, 0);
		root.add(btnAddition, 0, 1);
		root.add(btnSubtraction, 1, 1);
		root.add(btnClear, 0, 4, 2, 1) // <Node> <Column Index> <Row Index> <Column Span> <Row Span>

		attachCode();

		Scene scene = new Scene(root, 300, 250); 

		stage.setScene(scene);
		stage.show();

	}

	public void clearFields(){
		int num1, num2, answer;
		char symbol; 
		if(e.getSource() == btnClear){
			NumberOneInput.setText("");
			NumberTwoInput.setText("");
			resultsLabel.setText("?");
			NumberOneInput.requestFocus();
			return;
		}

		num1 = Interger.parseInt(NumberOneInput.getText())
		num2 = Interger.parseInt(NumberTwoInput.getText())
		if (e.getSource == btnAddition){
			symbol = '+';
			answer = num1 + num2; 
		}else if (e.getSource == btnSubtraction){
			symbol = '-';
			answer = num1 + num2;
		}else if (e.getSource == btnMultiply){
			symbol = '*';
			answer = num1 * num2;
		}else (e.getSource == btnDivision){
			symbol = '/';
			answer = num1 / num2;
		}
		
		resultsLabel.setText("" + num1 + symbol + " = " + answer)
	}
	

	public void attachCode(){
		btnDivision.setOnAction(e -> btncode(e));
		btnMultiply.setOnAction(e -> btncode(e));
		btnAddition.setOnAction(e -> btncode(e));
		btnSubtraction.setOnAction(e -> btncode(e));
		btnClear.setOnAction(e -> btncode(e));
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
