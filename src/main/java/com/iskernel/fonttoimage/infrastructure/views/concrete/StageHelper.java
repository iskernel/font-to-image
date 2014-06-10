package com.iskernel.fonttoimage.infrastructure.views.concrete;

import com.iskernel.fonttoimage.infrastructure.views.interfaces.AbstractStageConfiguration;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class StageHelper
{
    private Rectangle2D screenBounds;
    private Stage primaryStage;
    private AbstractStageConfiguration fxSceneView;

    public StageHelper(Stage primaryStage, AbstractStageConfiguration fxSceneView)
    {
        this.screenBounds = Screen.getPrimary().getVisualBounds();
        this.fxSceneView = fxSceneView;
        this.primaryStage = primaryStage;
    }

    public double getHeight()
    {
        double result = this.screenBounds.getHeight() / this.fxSceneView.getHeightRatio();
        return result;
    }

    public double getWidth()
    {
        double result = this.screenBounds.getWidth() / this.fxSceneView.getWidthRatio();
        return result;
    }

    public Stage getStage() throws IOException
    {
        Parent parent = FXMLLoader.load(getClass().getResource(this.fxSceneView.getPath()));
        primaryStage.titleProperty().bind(this.fxSceneView.getTitle());
        primaryStage.setScene(new Scene(parent, this.getWidth(), this.getHeight()));
        primaryStage.setResizable(this.fxSceneView.getIsResizable());
        primaryStage.setMinHeight(this.fxSceneView.getMinHeight());
        primaryStage.setMinWidth(this.fxSceneView.getMinWidth());
        return primaryStage;
    }
}
