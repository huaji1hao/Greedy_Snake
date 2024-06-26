package com.megasnake.view.component;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.text.Font;

/**
 * A custom label for the game info board.
 *
 * @author Junfeng ZHU
 */
public class InfoLabelBoard extends Label {
    private static final String BACKGROUND_IMAGE = "/yellow_small_panel.png";

    /**
     * Creates a new instance of the InfoLabelBoard class.
     *
     * @param text The text to display on the label.
     */
    public InfoLabelBoard(String text) {
        setPrefWidth(380);
        setPrefHeight(49);
        setText(text);
        setWrapText(true);
        setLabelFont();
        setAlignment(Pos.CENTER);

        BackgroundImage backgroundImage = new BackgroundImage(new Image(BACKGROUND_IMAGE, 380, 49, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);

        setBackground(new Background(backgroundImage));
    }

    /**
     * Sets the font of the label.
     */
    private void setLabelFont() {
        try{
            setFont(Font.loadFont(getClass().getResourceAsStream("/font/kenvector_future.ttf"), 23));
        }catch (Exception e) {
            setFont(Font.font("Verdana", 23));
        }
    }
}
