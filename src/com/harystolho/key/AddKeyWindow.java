package com.harystolho.key;

import com.harystolho.AutoPresserGUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AddKeyWindow {

	private final static int WIDTH = 300;
	private final static int HEIGHT = 300;

	public static void display(AutoPresserGUI gui) {
		Stage window = new Stage();

		window.setTitle("New Key");
		window.setWidth(WIDTH);
		window.setHeight(HEIGHT);

		VBox contents = new VBox();
		contents.setAlignment(Pos.TOP_CENTER);
		contents.setPadding(new Insets(5));

		//
		CheckBox hasDelay = new CheckBox("Record Delay?");
		hasDelay.setSelected(true);
		//

		//
		HBox delayBox = new HBox();
		delayBox.setTranslateY(10);
		delayBox.setAlignment(Pos.CENTER);

		Label delayLabel = new Label("Delay (ms)");
		TextField delayValue = new TextField();
		delayValue.setTranslateX(5);
		delayValue.setDisable(true);

		delayBox.getChildren().addAll(delayLabel, delayValue);
		//
		
		//
		
		//
		
		//
		Button recordButton = new Button("Record");
		recordButton.setTranslateY(HEIGHT * 0.43);
		//

		//
		Button saveButton = new Button("Save");
		saveButton.setTranslateY(HEIGHT * 0.48);
		//

		contents.getChildren().addAll(hasDelay, delayBox, recordButton, saveButton);

		Scene scene = new Scene(contents);

		window.setScene(scene);
		window.showAndWait();
	}

}