package ru.java2e;

import java.io.FileInputStream;
import javazoom.jl.player.Player;
import javazoom.jl.decoder.JavaLayerException;
import java.io.FileNotFoundException;

public class AudioThread implements Runnable {

	@Override
	public void run() {
		Player p;
		try {
			p = new Player(new FileInputStream("C:\\Users/User/workspace/F1/res/jk.mp3"));
			p.play();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
