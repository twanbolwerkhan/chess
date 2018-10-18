package TPN.states;

import TPN.Game;
import TPN.ui.Button;

public class MenuState extends State {


    public MenuState(Game game) {
        super(game);
//        setup();
    }


    public void setup() {
        button = new Button(game, (int) Game.getGAMEWIDTH() / 2 - ((int) (Game.getGAMEWIDTH() / 3) / 2), (int) Game.getGAMEHEIGHT() / 2, (int) Game.getGAMEHEIGHT() / 3, 30);
        ;

        button.setColor(100);
        button.setTextColor(120);
        button.setSelectColor(123);
        button.setText("Start Game");
    }

    public Button getButton() {
        return button;
    }

    public void draw() {
        button.drawRectangle();
    }

    @Override
    public String toString() {
        return "MenuState";
    }
}