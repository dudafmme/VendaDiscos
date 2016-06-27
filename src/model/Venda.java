package model;

/**
 *
 * @author Duda
 */

public class Venda {
    private Long numeroVenda;
    private Cliente cliente;
    private Disco disco;
    private int qtdeVenda;
    private Float valorTotal;
    private String dataVenda;

    public Venda() {
    }

    public Long getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda(Long numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    public int getQtdeVenda() {
        return qtdeVenda;
    }

    public void setQtdeVenda(int qtdeVenda) {
        this.qtdeVenda = qtdeVenda;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
}
