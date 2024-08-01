package Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringConfig.class
		);

		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		System.out.println(musicPlayer.getVolume());
		System.out.println(musicPlayer.getName());

		ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
		ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

		context.close();
	}
}
