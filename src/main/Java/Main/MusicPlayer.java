package Main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	private Music music;

	@Autowired
	public MusicPlayer(@Qualifier("classicalMusic") Music music) { // Конструктор для ClassicalMusic
		this.music = music;
	}

	public void setMusic(@Qualifier("rockMusic") Music music) { // Метод для установки RockMusic
		this.music = music;
	}

	public void playMusicList() {
		System.out.println("Playing: " + music.getSong());
	}
}
