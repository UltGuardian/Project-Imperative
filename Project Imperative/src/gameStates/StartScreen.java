package gameStates;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class StartScreen extends BasicGameState{
	private Image background;
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
			background = new Image("slick/testdata/Feild Background.png"); 
	}

	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g)
			throws SlickException {
		g.setColor(Color.blue);
		g.drawString("herro world!", 300, 300);
		background.draw();
	}

	public void update(GameContainer arg0, StateBasedGame arg1, int arg2)
			throws SlickException {
		
	}

	public int getID() {
		return 0;
	}

}