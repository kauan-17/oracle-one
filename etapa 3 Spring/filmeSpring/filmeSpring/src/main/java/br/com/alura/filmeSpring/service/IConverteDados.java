package br.com.alura.filmeSpring.service;

public interface IConverteDados {
   <T> T obterDados(String json, Class<T> classe);
}
