package fi.ohkete.hobbyjournal;

import fi.ohkete.hobbyjournal.domain.Hobby;
import fi.ohkete.hobbyjournal.domain.HobbyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HobbyjournalApplication extends SpringBootServletInitializer {
	protected SpringApplicationBuilder configure(SpringApplicationBuilder
														 application) {
		return application.sources(HobbyjournalApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(HobbyjournalApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(HobbyRepository repository) {
		return (args) -> {
			repository.save(new Hobby("Playing bass", "09/11/2017", "2h15min", "Played some Iron Maiden and Metallica"));
			repository.save(new Hobby("Running", "08/21/2017", "1h", "Went for a quick run in a nice weather"));
			repository.save(new Hobby("Playing games", "10/12/2017", "4h30min", "Did a few raids in WoW and then played NHL"));
			repository.save(new Hobby("Ice Hockey", "12/21/2016", "1h20min", "Went to play some hockey with few friends"));
			repository.save(new Hobby("Coding", "08/12/2017", "2h20min", "Game making course from Udemy.com"));
			repository.save(new Hobby("Walk", "09/11/2017", "1h10min", "We had our friends dog in our place so went walking with it"));
			repository.save(new Hobby("Playing bass", "07/03/2017", "2h05min", "Just some practicing"));
		};
	}
}
