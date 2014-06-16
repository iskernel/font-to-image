package com.iskernel.fonttoimage.controllers.concrete;

import com.iskernel.fonttoimage.controllers.base.ExtractFromFontController;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ExtractOneIconController extends ExtractFromFontController
{
    public void selectFontFile(ActionEvent actionEvent)
    {
        Button source = (Button)actionEvent.getSource();
        Stage stage = (Stage)(source).getScene().getWindow();
        FileChooser fileChooser = this.createFileChooserForFont();
        fileChooser.showOpenDialog(stage);
    }
}
