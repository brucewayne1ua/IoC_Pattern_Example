package Main;

public class ClassicalMusic implements Music {

	private ClassicalMusic(){}

	public static ClassicalMusic getClassicalMusic(){
		return new ClassicalMusic();
	}

	public void doMyInit(){
		System.out.println("doMyInitialization");
	}

	public void doMyDestroy(){
		System.out.println("doMyDestroy");
	}

	private String song;

	@Override
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}
}
