package com.iskernel.fonttoimage.infrastructure.views.interfaces;

import javafx.beans.property.StringProperty;

public interface AbstractStageConfiguration
{
    String getPath();
    void setPath(String path);

    double getHeightRatio();
    void setHeightRatio(double value);

    double getWidthRatio();
    void setWidthRatio(double value);

    StringProperty getTitle();
    void setTitle(StringProperty title);

    Boolean getIsResizable();
    void setIsResizable(Boolean value);

    double getMinHeight();
    void setMinHeight(double value);

    double getMinWidth();
    void setMinWidth(double value);
}
