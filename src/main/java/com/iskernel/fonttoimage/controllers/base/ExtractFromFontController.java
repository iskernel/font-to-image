package com.iskernel.fonttoimage.controllers.base;

import javafx.stage.FileChooser;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class ExtractFromFontController extends AbstractAppController
{
    protected FileChooser createFileChooserForFont()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose a font file");
        fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
        );
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("TTF", "*.ttf"),
                new FileChooser.ExtensionFilter("OTF", "*.otf"),
                new FileChooser.ExtensionFilter("TTE", "*.tte"),
                new FileChooser.ExtensionFilter("D", "*.d"),
                new FileChooser.ExtensionFilter("All",
                        new ArrayList<String>(Arrays.asList("*.ttf", "*.otf", "*.tte", "*.d")))
        );
        return fileChooser;
    }
}
