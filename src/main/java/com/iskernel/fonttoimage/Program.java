package com.iskernel.fonttoimage;

import com.iskernel.fonttoimage.infrastructure.views.concrete.StageConfiguration;
import com.iskernel.fonttoimage.infrastructure.views.concrete.StageHelper;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Program extends Application
{
    @Override
    public void start(Stage stage) throws Exception{
        StageHelper helper = new StageHelper(stage, StageConfiguration.MainView);
        helper.getStage().show();
    }


    public static void main(String[] args) throws IOException
    {
        launch(args);
    }
}
