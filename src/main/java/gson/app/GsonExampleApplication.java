package gson.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static gson.app.useCases.GsonNestedUseCase.serializableUserNested;

@SpringBootApplication
public class GsonExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsonExampleApplication.class, args);

		serializableUserNested();
	}

}
