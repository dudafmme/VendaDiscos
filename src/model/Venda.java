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
    private boolean desconto;
    private Double valorTotal;
    private Double valorDesconto;
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

    public boolean isDesconto() {
        return desconto;
    }

    public void setDesconto(boolean desconto) {
        this.desconto = desconto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    
}
