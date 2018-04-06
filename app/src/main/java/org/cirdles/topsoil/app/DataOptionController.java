package org.cirdles.topsoil.app.shefschanges;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class DataOptionController extends TitledPane {

    @FXML
    CheckBox dataPointsCheckBox;

    @FXML
    ColorPicker fillColorPicker;

    @FXML
    RadioButton uncertaintyEllipsesRadioButton;

    @FXML
    ColorPicker ellipsesFillColorPicker;

    @FXML
    RadioButton uncertaintyBarsRadioButton;

    @FXML
    ColorPicker barColorPicker;

    @FXML
    public void initialize() {

    }

/*    public enum TickShape {

        CIRCLE("Circle"),
        SQUARE("Square"),
        DIAMOND("Diamonds");

        String shape;

        TickShape(String shape) {
            this.shape = shape;
        }

        public String getShape() {
            return shape;
        }

        @Override
        public String toString() {
            return shape;
        }
    }*/

    public DataOptionLoaderController() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    new ResourceExtractor(DataOptionController.class).extractResourceAsPath("data-option.fxml").toUri().toURL()
            );
            loader.setRoot(this);
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}