package modelo;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
 private double limite;
 private double saldo;
 private List<Compra> compra;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compra = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compra.add(compra);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compra> getCompra() {
        return compra;
    }
}
