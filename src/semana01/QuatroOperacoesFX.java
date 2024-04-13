package semana01;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class QuatroOperacoesFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create labels and text fields for input
		Label labelN1 = new Label("n1:");
		TextField textFieldN1 = new TextField();
		Label labelN2 = new Label("n2:");
		TextField textFieldN2 = new TextField();

		// Create a button to perform calculations
		Button calculateButton = new Button("Calculate");

		// Define action for button click
		calculateButton.setOnAction(event -> {
			try {
				double n1 = Double.parseDouble(textFieldN1.getText());
				double n2 = Double.parseDouble(textFieldN2.getText());

				// Perform calculations
				double soma = n1 + n2;
				double subtracao = n1 - n2;
				double multiplicacao = n1 * n2;
				double divisao = n1 / n2;

				// Display results using an Alert
				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("Calculation Results");
				alert.setHeaderText("Soma: " + soma);
				alert.setContentText(
						"Subtração: " + subtracao + "\nMultiplicação: " + multiplicacao + "\nDivisão: " + divisao);
				alert.showAndWait();
			} catch (NumberFormatException e) {
				// Handle invalid input
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setTitle("Invalid Input");
				alert.setHeaderText("Please enter valid numbers for both n1 and n2.");
				alert.showAndWait();
			}
		});

		// Create a layout and add elements
		GridPane gridPane = new GridPane();
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.setPadding(new Insets(20));
		gridPane.add(labelN1, 0, 0);
		gridPane.add(textFieldN1, 1, 0);
		gridPane.add(labelN2, 0, 1);
		gridPane.add(textFieldN2, 1, 1);
		gridPane.add(calculateButton, 0, 2, 2, 1);

		// Create a scene and set the stage
		Scene scene = new Scene(gridPane, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Quatro Operações FX");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
