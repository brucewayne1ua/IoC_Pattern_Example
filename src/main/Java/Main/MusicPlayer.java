package Main;

public class MusicPlayer {
	private Music rockMusic;
	private Music classicalMusic;
	private String name;
	private int volume;

	public MusicPlayer(Music rockMusic, Music classicalMusic) {
		this.rockMusic = rockMusic;
		this.classicalMusic = classicalMusic;
	}

	public String playMusic() {
		return "Playing: " + rockMusic.getSong() + " and " + classicalMusic.getSong();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
