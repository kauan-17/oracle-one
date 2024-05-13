package br.com.alura.filmeSpring.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias ("Title") String tituço,
                         @JsonAlias ("totalSeasons") Integer totalTemporada,
                         @JsonAlias("imdbRating") String avaliacao) {
}
