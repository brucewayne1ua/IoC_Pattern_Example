package Main;

public class RockMusic implements Music {
	private String song;

	@Override
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}
}
