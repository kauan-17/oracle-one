package br.com.alura.filmeSpring;

import br.com.alura.filmeSpring.model.DadosSerie;
import br.com.alura.filmeSpring.service.ConsumoApi;
import br.com.alura.filmeSpring.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilmeSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FilmeSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoApi consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=96acb81");
		System.out.println(json);
		ConverteDados converte = new ConverteDados();
		DadosSerie dato = converte.obterDados(json,DadosSerie.class);
		System.out.println(dato);
	}
}
