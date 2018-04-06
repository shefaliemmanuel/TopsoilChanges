package org.cirdles.topsoil.app.shefschanges;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class AxisStylingController {

    @FXML
    TextField plotTitleTextField;

    @FXML
    TextField xMinTextField;

    @FXML
    TextField xMaxTextField;

    @FXML
    Button xSetExtentsButton;


    @FXML
    TextField xTitleTextField;

    @FXML
    TextField yMinTextField;

    @FXML
    TextField yMaxTextField;

    @FXML
    Button ySetExtentsButton;

    @FXML
    private void setYSetExtentsButtonAction() {

    }

    @FXML
    TextField yTitleTextField;

    @FXML
    public void initialize() {

    }


    public AxisSytlingLoaderController() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    new ResourceExtractor(PlotPropertiesPanelController.class).extractResourceAsPath("axis-styling.fxml").toUri().toURL()
            );
            loader.setRoot(this);
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //************************************************//
    //                    METHODS                     //
    //************************************************//

    @FXML private void printButtonAction() {
        /*
            Print the each color's name and value.
         */
        System.out.println( topTextField.getText() + ": " + topColorPicker.getValue() );
        System.out.println( bottomTextField.getText() + ": " + bottomColorPicker.getValue() );
    }

    @FXML protected void initialize() {
        /*
            Configure disable state logic for "Print" button.
         */
        printButton.disableProperty().bind(textFieldEmptyProperty() );
    }
}


    public enum VerticalPosition {

        TOP("Top"),
        CENTER("Center"),
        BOTTOM("Bottom");

        String vertical;

        VerticalPosition(String vertical) {
            this.vertical = vertical;
        }

        public String getVertical() {
            return vertical;
        }

        @Override
        public String toString() {
            return vertical;
        }


    }

    public enum HorizontalPosition {

        LEFT("left"),
        CENTER("center"),
        RIGHT("right");

        String horizontal;

        HorizontalPosition(String horizontal) {
            this.horizontal = horizontal;
        }

        public String getHorizontal() {
            return horizontal;
        }

        @Override
        public String toString() {
            return horizontal;
        }
    }
}