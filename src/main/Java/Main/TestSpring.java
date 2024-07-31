package Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml"
		);

		MusicPlayer classicalMusicPlayer = (MusicPlayer) context.getBean("musicPlayer");
		classicalMusicPlayer.playMusicList();

		Music rockMusic = (Music) context.getBean("rockMusic");
		MusicPlayer rockMusicPlayer = (MusicPlayer) context.getBean("musicPlayer");
		rockMusicPlayer.setMusic(rockMusic);
		rockMusicPlayer.playMusicList();

		context.close();
	}
}
