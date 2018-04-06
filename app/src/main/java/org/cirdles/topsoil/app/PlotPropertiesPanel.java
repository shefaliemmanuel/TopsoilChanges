package org.cirdles.topsoil.app.shefschanges;

public class PlotPropertiesPanel {

    private AxisStyling axisS = new AxisStyling();
    private DataOption dataO = new DataOption();
    private PlotFeatures plotF = new PlotFeatures();

    //AXIS STYLING

    //done
    private StringProperty plotTitle;
    public StringProperty plotTitleProperty() {
        if (plotTitle == null) {
            plotTitle = new SimpleStringProperty();
            plotTitle.bindBidirectional(axisS.plotTitleTextField.textProperty());
        }
        return plotTitle;
    }
    public String getPlotTitle() {
        return plotTitle.get();
    }
    public void setPlotTitle(String current) {
        plotTitle.set(current);
    }


    //E NUM COME BACK TO
    private StringProperty plotTitlePosition;
    public StringProperty plotTitlePositionProperty() {
        if (plotTitlePosition == null) {
            plotTitlePosition = new SimpleStringProperty();
            plotTitlePosition.bindBidirectional(axisS.plotTitlePositionChoiceBox.valueProperty());
        }
        return plotTitlePosition;
    }
    public String getPlotTitlePosition() {
        return plotTitlePosition.get();
    }
    public void setPlotTitlePosition(String current) {
        plotTitlePosition.set(current);
    }

    //done
    private ObjectProperty<Color> plotTitleColor;
    public ObjectProperty<Color> plotTitleColorProperty() {
        if (plotTitleColor == null) {
            plotTitleColor = new SimpleObjectProperty();
            plotTitleColor.bindBidirectional(axisS.plotTitleColorPicker.valueProperty());
        }
        return plotTitleColor;
    }
    public String getPlotTitleColor() {
        return plotTitleColor.get();
    }
    public void setPlotTitleColor(String current) {
        plotTitleColor.set(current);
    }

    //E NUM COME BACK TO
    private StringProperty plotTitleFont;
    public StringProperty plotTitleFontProperty() {
        if (plotTitleFont == null) {
            plotTitleFont = new SimpleStringProperty();
            plotTitleFont.bindBidirectional(axisS.plotTitleFontChoiceBox.valueProperty());
        }
        return plotTitleFont;
    }
    public String getPlotTitleFont() {
        return plotTitleFont.get();
    }
    public void setPlotTitleFont(String current) {
        plotTitleFont.set(current);
    }

    private StringProperty xMinText;
    public StringProperty xMinTextProperty() {
        if (xMinText == null) {
            xMinText = new SimpleStringProperty();
            xMinText.bindBidirectional(axisS.xMinTextField.textProperty());
        }
        return xMinText;
    }
    public String getXMinText() {
        return xMinText.get();
    }
    public void setXMinText(String current) {
        xMinText.set(current);
    }

    private StringProperty xMaxText;
    public StringProperty xMaxTextProperty() {
        if (xMaxText == null) {
            xMaxText = new SimpleStringProperty();
            xMaxText.bindBidirectional(axisS.xMaxTextField.textProperty());
        }
        return xMaxText;
    }
    public String getXMaxText() { return xMaxText.get(); }
    public void setXMaxText(String current) { xMaxText.set(current); }

    //button
    private StringProperty xSetExtents;
    public StringProperty xSetExtentsProperty() {
        if (xSetExtents == null) {
            xSetExtents = new SimpleStringProperty();
            xSetExtents.bindBidirectional(axisS.xSetExtentsButton.valueProperty());
        }
        return xSetExtents;
    }
    public String getXSetExtents() {
        return xSetExtents.get();
    }
    public void setXSetExtents(String current) {
        xSetExtents.set(current);
    }

    private StringProperty xTitleText;
    public StringProperty xTitleTextProperty() {
        if (xTitleText == null) {
            xTitleText = new SimpleStringProperty();
            xTitleText.bindBidirectional(axisS.xTitleTextField.textProperty());
        }
        return xTitleText;
    }
    public String getXTitleText() {
        return xTitleText.get();
    }
    public void setXTitleText(String current) {
        xTitleText.set(current);
    }

    //E NUM COME BACK TO
    private StringProperty xTitlePosition;
    public StringProperty xTitlePositionProperty() {
        if (xTitlePosition == null) {
            xTitlePosition = new SimpleStringProperty();
            xTitlePosition.bindBidirectional(axisS.xTitlePositionChoiceBox.textProperty());
        }
        return xTitlePosition;
    }
    public String getXTitlePosition() {
        return xTitlePosition.get();
    }
    public void setXTitlePosition(String current) {
        xTitlePosition.set(current);
    }

    //done
    private ObjectProperty<Color> xTitleColor;
    public ObjectProperty<Color>  xTitleColorProperty() {
        if (xTitleColor == null) {
            xTitleColor = new SimpleObjectProperty();
            xTitleColor.bindBidirectional(axisS.xTitleColorPicker.valueProperty());
        }
        return xTitleColor;
    }
    public String getXTitleColor() {
        return xTitleColor.get();
    }
    public void setXTitleColor(String current) {
        xTitleColor.set(current);
    }

    private DoubleProperty xTitleFontSize;
    public DoubleProperty xTitleFontSizeProperty() {
        if (xTitleFontSize == null) {
            xTitleFontSize = new SimpleDoubleProperty();
            xTitleFontSize.bindBidirectional(axisS.xTitleFontSize.valueProperty());
        }
        return xTitleFontSize;
    }
    public String getXTitleFontSize() {
        return xTitleFontSize.get();
    }
    public void setXTitleFontSize(String current) {
        xTitleFontSize.set(current);
    }

    //done
    private ObjectProperty<Color> xAxisColor;
    public ObjectProperty<Color> xAxisColorProperty() {
        if (xAxisColor == null) {
            xAxisColor = new SimpleObjectProperty();
            xAxisColor.bindBidirectional(axisS.xAxisColorPicker.valueProperty());
        }
        return xAxisColor;
    }
    public String getXAxisColor() {
        return xAxisColor.get();
    }
    public void setXAxisColor(String current) {
        xAxisColor.set(current);
    }

    private StringProperty xAxisFont;
    public StringProperty xAxisFontProperty() {
        if (xAxisFont == null) {
            xAxisFont = new SimpleStringProperty();
            xAxisFont.bindBidirectional(axisS.xAxisFontSlider.textProperty());
        }
        return xAxisFont;
    }
    public String getXAxisFont() {
        return xAxisFont.get();
    }
    public void setXAxisFont(String current) {
        xAxisFont.set(current);
    }

    private StringProperty yMinText;
    public StringProperty yMinTextProperty() {
        if (yMinText == null) {
            yMinText = new SimpleStringProperty();
            yMinText.bindBidirectional(axisS.yMinTextField.textProperty());
        }
        return yMinText;
    }
    public String getYMinText() {
        return yMinText.get();
    }
    public void setYMinText(String current) {
        yMinText.set(current);
    }

    private StringProperty yMaxText;
    public StringProperty yMaxTextProperty() {
        if (yMaxText == null) {
            yMaxText = new SimpleStringProperty();
            yMaxText.bindBidirectional(axisS.yMaxTextField.textProperty());
        }
        return yMaxText;
    }
    public String getYMaxText() { return yMaxText.get(); }
    public void setYMaxText(String current) { yMaxText.set(current); }

    private StringProperty ySetExtents;
    public StringProperty ySetExtentsProperty() {
        if (ySetExtents == null) {
            ySetExtents = new SimpleStringProperty();
            ySetExtents.bindBidirectional(axisS.ySetExtentsButton.valueProperty());
        }
        return ySetExtents;
    }
    public String getYSetExtents() {
        return ySetExtents.get();
    }
    public void setYSetExtents(String current) {
        ySetExtents.set(current);
    }

    private StringProperty yTitleText;
    public StringProperty yTitleTextProperty() {
        if (yTitleText == null) {
            yTitleText = new SimpleStringProperty();
            yTitleText.bindBidirectional(axisS.yTitleTextField.textProperty());
        }
        return yTitleText;
    }
    public String getYTitleText() {
        return yTitleText.get();
    }
    public void setYTitleText(String current) {
        yTitleText.set(current);
    }


    private StringProperty yTitlePosition;
    public StringProperty yTitlePositionProperty() {
        if (yTitlePosition == null) {
            yTitlePosition = new SimpleStringProperty();
            yTitlePosition.bindBidirectional(axisS.yTitlePositionChoiceBox.textProperty());
        }
        return yTitlePosition;
    }
    public String getYTitlePosition() {
        return yTitlePosition.get();
    }
    public void setYTitlePosition(String current) {
        yTitlePosition.set(current);
    }

    //done
    private ObjectProperty<Color> yTitleColor;
    public ObjectProperty<Color> YTitleColorProperty() {
        if (yTitleColor == null) {
            yTitleColor = new SimpleObjectProperty();
            yTitleColor.bindBidirectional(axisS.yTitleColorPicker.valueProperty());
        }
        return yTitleColor;
    }
    public String getYTitleColor() {
        return yTitleColor.get();
    }
    public void setYTitleColor(String current) {
        yTitleColor.set(current);
    }

    private StringProperty yTitleFont;
    public StringProperty yTitleFontProperty() {
        if (yTitleFont == null) {
            yTitleFont = new SimpleStringProperty();
            yTitleFont.bindBidirectional(axisS.yTitleFontSlider.textProperty());
        }
        return yTitleFont;
    }
    public String getYTitleFont() {
        return yTitleFont.get();
    }
    public void setYTitleFont(String current) {
        yTitleFont.set(current);
    }

    //done
    private ObjectProperty<Color> yAxisColor;
    public ObjectProperty<Color> yAxisColorProperty() {
        if (yAxisColor == null) {
            yAxisColor = new SimpleObjectProperty();
            yAxisColor.bindBidirectional(axisS.yAxisColorPicker.valueProperty());
        }
        return yAxisColor;
    }
    public String getYAxisColor() {
        return yAxisColor.get();
    }
    public void setYAxisColor(String current) {
        yAxisColor.set(current);
    }

    private StringProperty yAxisFont;
    public StringProperty yAxisFontProperty() {
        if (yAxisFont == null) {
            yAxisFont = new SimpleStringProperty();
            yAxisFont.bindBidirectional(axisS.yAxisFontSlider.textProperty());
        }
        return yAxisFont;
    }
    public String getYAxisFont() {
        return yAxisFont.get();
    }
    public void setYAxisFont(String current) {
        yAxisFont.set(current);
    }

    //DATA OPTIONS

    private StringProperty dataPoints;
    public StringProperty dataPointsProperty() {
        if (dataPoints == null) {
            dataPoints = new SimpleStringProperty();
            dataPoints.bindBidirectional(dataO.dataPointsCheckBox.textProperty());
        }
        return dataPoints;
    }
    public String getDataPoints() {
        return dataPoints.get();
    }
    public void setDataPoints(String current) {
        dataPoints.set(current);
    }

    //done
    private ObjectProperty<Color> fillColor;
    public ObjectProperty<Color> fillColorProperty() {
        if (fillColor == null) {
            fillColor = new SimpleObjectProperty();
            fillColor.bindBidirectional(dataO.fillColorPicker.valueProperty());
        }
        return fillColor;
    }
    public String getFillColor() {
        return fillColor.get();
    }
    public void setFillColor(String current) {
        fillColor.set(current);
    }

    private StringProperty shapeChoice;
    public StringProperty shapeChoiceProperty() {
        if (shapeChoice == null) {
            shapeChoice = new SimpleStringProperty();
            shapeChoice.bindBidirectional(dataO.shapeChoiceBox.textProperty());
        }
        return shapeChoice;
    }
    public String getShapeChoice() {
        return shapeChoice.get();
    }
    public void setShapeChoice(String current) {
        shapeChoice.set(current);
    }

    private StringProperty uncertaintyEllipses;
    public StringProperty uncertaintyEllipsesProperty() {
        if (uncertaintyEllipses == null) {
            uncertaintyEllipses = new SimpleStringProperty();
            uncertaintyEllipses.bindBidirectional(dataO.uncertaintyEllipsesRadioButton.selectedProperty());
        }
        return uncertaintyEllipses;
    }
    public String getUncertaintyEllipses() {
        return uncertaintyEllipses.get();
    }
    public void setUncertaintyEllipses(String current) {
        uncertaintyEllipses.set(current);
    }

    private StringProperty ellipsesFill;
    public StringProperty ellipsesFillProperty() {
        if (ellipsesFill == null) {
            ellipsesFill = new SimpleStringProperty();
            ellipsesFill.bindBidirectional(dataO.ellipsesFillColorPicker.valueProperty());
        }
        return ellipsesFill;
    }
    public String getEllipsesFill() {
        return ellipsesFill.get();
    }
    public void setEllipsesFill(String current) {
        ellipsesFill.set(current);
    }

    private StringProperty borderFill;
    public StringProperty borderFillProperty() {
        if (borderFill == null) {
            borderFill = new SimpleStringProperty();
            borderFill.bindBidirectional(dataO.borderFillColorPicker.valueProperty());
        }
        return borderFill;
    }
    public String getBorderFill() {
        return borderFill.get();
    }
    public void setBorderFill(String current) {
        borderFill.set(current);
    }

    private StringProperty borderThickness;
    public StringProperty borderThicknessProperty() {
        if (borderThickness == null) {
            borderThickness = new SimpleStringProperty();
            borderThickness.bindBidirectional(dataO.borderThicknessSlider.textProperty());
        }
        return borderThickness;
    }
    public String getBorderThickness() {
        return borderThickness.get();
    }
    public void setBorderThickness(String current) {
        borderThickness.set(current);
    }

    private StringProperty uncertaintyBars;
    public StringProperty uncertaintyBarsProperty() {
        if (uncertaintyBars == null) {
            uncertaintyBars = new SimpleStringProperty();
            uncertaintyBars.bindBidirectional(dataO.uncertaintyBarsRadioButton.textProperty());
        }
        return uncertaintyBars;
    }
    public String getUncertaintyBars() {
        return uncertaintyBars.get();
    }
    public void setUncertaintyBars(String current) {
        uncertaintyBars.set(current);
    }

    //done
    private ObjectProperty<Color> barColor;
    public ObjectProperty<Color> barColorProperty() {
        if (barColor == null) {
            barColor = new SimpleObjectProperty();
            barColor.bindBidirectional(dataO.barColorPicker.valueProperty());
        }
        return barColor;
    }
    public String getBarColor() {
        return barColor.get();
    }
    public void setBarColor(String current) {
        barColor.set(current);
    }

    private StringProperty barThickness;
    public StringProperty barThicknessProperty() {
        if (barThickness == null) {
            barThickness = new SimpleStringProperty();
            barThickness.bindBidirectional(dataO.barThicknessSlider.textProperty());
        }
        return barThickness;
    }
    public String getBarThickness() {
        return barThickness.get();
    }
    public void setBarThickness(String current) {
        barThickness.set(current);
    }

    //PLOT FEATURES

    private StringProperty noneRadio;
    public StringProperty noneRadioProperty() {
        if (noneRadio == null) {
            noneRadio = new SimpleStringProperty();
            noneRadio.bindBidirectional(plotF.noneRadioButton.selectedProperty());
        }
        return noneRadio;
    }
    public String getNoneRadio() { return noneRadio.get(); }
    public void setNoneRadio(String current) { noneRadio.set(current); }

    private StringProperty wetherillConcordiaLineRadio;
    public StringProperty wetherillConcordiaLineRadioProperty() {
        if (wetherillConcordiaLineRadio == null) {
            wetherillConcordiaLineRadio = new SimpleStringProperty();
            wetherillConcordiaLineRadio.bindBidirectional(plotF.wetherillConcordiaLineRadioButton.selectedProperty());
        }
        return wetherillConcordiaLineRadio;
    }
    public String getWetherillConcordiaLineRadio() { return wetherillConcordiaLineRadio.get(); }
    public void setWetherillConcordiaLineRadio(String current) {
        wetherillConcordiaLineRadio.set(current);
    }

    //done
    private ObjectProperty<Color> wLineColor;
    public ObjectProperty<Color> wLineColorProperty() {
        if (wLineColor == null) {
            wLineColor = new SimpleObjectProperty();
            wLineColor.bindBidirectional(plotF.wLineColorPicker.valueProperty());
        }
        return wLineColor;
    }
    public String getWLineColor() { return wLineColor.get(); }
    public void setWLineColor(String current) { wLineColor.set(current); }

    private StringProperty wLineThickness;
    public StringProperty wLineThicknessProperty() {
        if (wLineThickness == null) {
            wLineThickness = new SimpleStringProperty();
            wLineThickness.bindBidirectional(plotF.wLineThicknessSlider.textProperty());
        }
        return wLineThickness;
    }
    public String getWLineThickness() { return wLineThickness.get(); }
    public void setWLineThickness(String current) { wLineThickness.set(current); }

    //done
    private ObjectProperty<Color> wEnvelopeColor;
    public ObjectProperty<Color> wEnvelopeColorProperty() {
        if (wEnvelopeColor == null) {
            wEnvelopeColor = new SimpleObjectProperty();
            wEnvelopeColor.bindBidirectional(plotF.wEnvelopeColorPicker.valueProperty());
        }
        return wEnvelopeColor;
    }
    public String getWEnvelopeColor() { return wEnvelopeColor.get(); }
    public void setWEnvelopeColor(String current) { wEnvelopeColor.set(current); }

    private StringProperty wEnvelopeThickness;
    public StringProperty wEnvelopeThicknessProperty() {
        if (wEnvelopeThickness == null) {
            wEnvelopeThickness = new SimpleStringProperty();
            wEnvelopeThickness.bindBidirectional(plotF.wEnvelopeThicknessSlider.textProperty());
        }
        return wEnvelopeThickness;
    }
    public String getWEnvelopeThickness() { return wEnvelopeThickness.get(); }
    public void setWEnvelopeThickness(String current) { wEnvelopeThickness.set(current); }

    private StringProperty teraWasserburgConcordiaLineRadio;
    public StringProperty teraWasserburgConcordiaLineRadioProperty() {
        if (teraWasserburgConcordiaLineRadio == null) {
            teraWasserburgConcordiaLineRadio = new SimpleStringProperty();
            teraWasserburgConcordiaLineRadio.bindBidirectional(plotF.teraWasserburgConcordiaLineRadioButton.selectedProperty());
        }
        return teraWasserburgConcordiaLineRadio;
    }
    public String getTeraWasserburgConcordiaLineRadio() { return teraWasserburgConcordiaLineRadio.get(); }
    public void setTeraWasserburgConcordiaLineRadio(String current) { teraWasserburgConcordiaLineRadio.set(current); }

    //done
    private ObjectProperty<Color> tLineColor;
    public ObjectProperty<Color> tLineColorProperty() {
        if (tLineColor == null) {
            tLineColor = new SimpleObjectProperty();
            tLineColor.bindBidirectional(plotF.tLineColorPicker.valueProperty());
        }
        return tLineColor;
    }
    public String getTLineColor() { return tLineColor.get(); }
    public void setTLineColor(String current) { tLineColor.set(current); }

    private StringProperty tLineThickness;
    public StringProperty tLineThicknessProperty() {
        if (tLineThickness == null) {
            tLineThickness = new SimpleStringProperty();
            tLineThickness.bindBidirectional(plotF.tLineThicknessSlider.textProperty());
        }
        return tLineThickness;
    }
    public String getTLineThickness() { return tLineThickness.get(); }
    public void setTLineThickness(String current) { tLineThickness.set(current); }

    //done
    private ObjectProperty<Color> tEnvelopeColor;
    public ObjectProperty<Color> tEnvelopeColorProperty() {
        if (tEnvelopeColor == null) {
            tEnvelopeColor = new SimpleObjectProperty();
            tEnvelopeColor.bindBidirectional(plotF.tEnvelopeColorPicker.valueProperty());
        }
        return tEnvelopeColor;
    }
    public String getTEnvelopeColor() { return tEnvelopeColor.get(); }
    public void setTEnvelopeColor(String current) { tEnvelopeColor.set(current); }

    private StringProperty tEnvelopeThickness;
    public StringProperty tEnvelopeThicknessProperty() {
        if (tEnvelopeThickness == null) {
            tEnvelopeThickness = new SimpleStringProperty();
            tEnvelopeThickness.bindBidirectional(plotF.tEnvelopeThicknessSlider.textProperty());
        }
        return tEnvelopeThickness;
    }
    public String getTEnvelopeThickness() { return tEnvelopeThickness.get(); }
    public void setTEnvelopeThickness(String current) { tEnvelopeThickness.set(current); }

    public PlotPropertiesPanel() {
        // Load FXML for full panel
            // -> Load FXML for smaller panels
        // Before controls loaded
    }

    @FXML
    public void initialize() {
        // After controls loaded
    }
}