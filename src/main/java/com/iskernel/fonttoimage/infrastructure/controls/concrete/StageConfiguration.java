package com.iskernel.fonttoimage.infrastructure.controls.concrete;

import com.iskernel.fonttoimage.infrastructure.controls.base.StageConfigurationInterface;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public enum StageConfiguration implements StageConfigurationInterface
{
    MainView("/views/main-view.fxml", "Font To Image" , 4.5, 5.0, 234, 371, false),
    ExtractOneIconView("/views/extract-one-icon-view.fxml", "Font To Image", 4.5, 5.0, 500, 500, false),
    ExtractAllIconsView("/views/extractalliconsview.fxml", "Font To Image" , 4.5, 5.0, 234, 371, false),
    ExtractWithCsvView("/views/extractwithcsvview.fxml", "Font To Image" , 4.5, 5.0, 234, 371, false),
    AboutView("/views/extract-one-icon-view.fxml", "Font To Image" , 4.5, 5.0, 234, 371, false);

    private String path;
    private StringProperty title;
    private double heightRatio;
    private double widthRatio;
    private Boolean isResizable;
    private double minHeight;
    private double minWidth;

    private StageConfiguration(String path,
                               String title,
                               double heightRatio,
                               double widthRatio,
                               double minHeight,
                               double minWidth,
                               boolean isResizable)
    {
        this.setPath(path);
        this.setTitle(new SimpleStringProperty(title));
        this.setHeightRatio(heightRatio);
        this.setWidthRatio(widthRatio);
        this.setIsResizable(isResizable);
        this.setMinHeight(minHeight);
        this.setMinWidth(minWidth);
    }

    @Override
    public String getPath()
    {
        return path;
    }

    @Override
    public void setPath(String path)
    {
        this.path = path;
    }

    @Override
    public StringProperty getTitle()
    {
        return title;
    }

    @Override
    public void setTitle(StringProperty title)
    {
        this.title = title;
    }

    @Override
    public double getHeightRatio()
    {
        return heightRatio;
    }

    @Override
    public void setHeightRatio(double heightRatio)
    {
        this.heightRatio = heightRatio;
    }

    @Override
    public double getWidthRatio()
    {
        return widthRatio;
    }

    @Override
    public void setWidthRatio(double widthRatio)
    {
        this.widthRatio = widthRatio;
    }

    @Override
    public Boolean getIsResizable()
    {
        return isResizable;
    }

    @Override
    public void setIsResizable(Boolean isResizable)
    {
        this.isResizable = isResizable;
    }

    @Override
    public double getMinHeight()
    {
        return minHeight;
    }

    @Override
    public void setMinHeight(double minHeight)
    {
        this.minHeight = minHeight;
    }

    @Override
    public double getMinWidth()
    {
        return minWidth;
    }

    @Override
    public void setMinWidth(double minWidth)
    {
        this.minWidth = minWidth;
    }
}
