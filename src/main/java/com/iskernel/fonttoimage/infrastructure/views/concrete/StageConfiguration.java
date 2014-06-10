package com.iskernel.fonttoimage.infrastructure.views.concrete;

import com.iskernel.fonttoimage.infrastructure.views.interfaces.AbstractStageConfiguration;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import lombok.Getter;
import lombok.Setter;

public enum StageConfiguration implements AbstractStageConfiguration
{
    MainView("/views/main-view.fxml", "FontToImage" , 4.5, 5.0, 234, 371, false),
    ExtractOneIconView("/views/extract-one-icon-view.fxml", "FontToImage" , 4.5, 5.0, 234, 371, false),
    ExtractAllIconsView("/views/extractalliconsview.fxml", "FontToImage" , 4.5, 5.0, 234, 371, false),
    ExtractWithCsvView("/views/extractwithcsvview.fxml", "FontToImage" , 4.5, 5.0, 234, 371, false),
    AboutView("/views/extract-one-icon-view.fxml", "FontToImage" , 4.5, 5.0, 234, 371, false);

    @Getter @Setter
    private String path;

    @Getter @Setter
    private StringProperty title;

    @Getter @Setter
    private double heightRatio;

    @Getter @Setter
    private double widthRatio;

    //Boolean instead of boolean because of lombok Intelij plugin bug.
    @Getter @Setter
    private Boolean isResizable;

    @Getter @Setter
    private double minHeight;

    @Getter @Setter
    private double minWidth;

    private StageConfiguration(String path,
                               String title,
                               double heightRatio,
                               double widthRatio,
                               double minHeight,
                               double minWidth,
                               boolean isResizable)
    {
        this.path = path;
        this.title = new SimpleStringProperty(title);
        this.heightRatio = heightRatio;
        this.widthRatio = widthRatio;
        this.isResizable = isResizable;
        this.minHeight = minHeight;
        this.minWidth = minWidth;
    }
}
