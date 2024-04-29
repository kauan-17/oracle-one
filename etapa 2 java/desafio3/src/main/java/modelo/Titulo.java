package modelo;

import org.jetbrains.annotations.NotNull;

public class Titulo implements Comparable<Titulo> {
    public String nome;

    @Override
    public int compareTo(@NotNull Titulo outrotitulo) {
        return this.nome.compareTo(outrotitulo.nome);

    }

    public Titulo(String nome) {
        this.nome = nome;
    }
}
