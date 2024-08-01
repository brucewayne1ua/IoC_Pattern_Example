package Main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(
            @Qualifier("rockMusic") RockMusic rockMusic,
            @Qualifier("classicalMusic") ClassicalMusic classicalMusic
    ) {
        return new MusicPlayer(rockMusic, classicalMusic);
    }
}
