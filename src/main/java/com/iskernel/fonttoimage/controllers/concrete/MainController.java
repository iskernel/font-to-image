package com.iskernel.fonttoimage.controllers.concrete;


import com.iskernel.fonttoimage.controllers.base.AbstractAppController;
import com.iskernel.fonttoimage.infrastructure.controls.concrete.StageConfiguration;
import com.iskernel.fonttoimage.infrastructure.controls.concrete.StageHelper;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController extends AbstractAppController
{
    public void handleExtractIconButton(ActionEvent actionEvent) throws IOException
    {
        Stage stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        StageHelper helper = new StageHelper(stage, StageConfiguration.ExtractOneIconView);
        helper.getStage().show();
    }

    public void handleExtractAllIconsButton(ActionEvent actionEvent) throws IOException
    {
        Stage stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        StageHelper helper = new StageHelper(stage, StageConfiguration.ExtractAllIconsView);
        helper.getStage().show();
    }

    public void handleExtractWithCsvButton(ActionEvent actionEvent) throws IOException
    {
        Stage stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        StageHelper helper = new StageHelper(stage, StageConfiguration.ExtractWithCsvView);
        helper.getStage().show();
    }

    public void handleAboutButton(ActionEvent actionEvent) throws IOException
    {
        Stage stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        StageHelper helper = new StageHelper(stage, StageConfiguration.AboutView);
        helper.getStage().show();
    }
}
