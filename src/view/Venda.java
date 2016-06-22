/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Duda
 */
@Entity
@Table(name = "venda", catalog = "loja", schema = "")
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v"),
    @NamedQuery(name = "Venda.findById", query = "SELECT v FROM Venda v WHERE v.id = :id"),
    @NamedQuery(name = "Venda.findByQtdeVendida", query = "SELECT v FROM Venda v WHERE v.qtdeVendida = :qtdeVendida"),
    @NamedQuery(name = "Venda.findByDesconto", query = "SELECT v FROM Venda v WHERE v.desconto = :desconto"),
    @NamedQuery(name = "Venda.findByValorTotal", query = "SELECT v FROM Venda v WHERE v.valorTotal = :valorTotal"),
    @NamedQuery(name = "Venda.findByValorDesconto", query = "SELECT v FROM Venda v WHERE v.valorDesconto = :valorDesconto"),
    @NamedQuery(name = "Venda.findByDataVenda", query = "SELECT v FROM Venda v WHERE v.dataVenda = :dataVenda"),
    @NamedQuery(name = "Venda.findByClienteId", query = "SELECT v FROM Venda v WHERE v.clienteId = :clienteId"),
    @NamedQuery(name = "Venda.findByDiscoId", query = "SELECT v FROM Venda v WHERE v.discoId = :discoId")})
public class Venda implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "qtdeVendida")
    private int qtdeVendida;
    @Basic(optional = false)
    @Column(name = "desconto")
    private short desconto;
    @Basic(optional = false)
    @Column(name = "valorTotal")
    private float valorTotal;
    @Basic(optional = false)
    @Column(name = "valorDesconto")
    private float valorDesconto;
    @Basic(optional = false)
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Basic(optional = false)
    @Column(name = "cliente_id")
    private long clienteId;
    @Basic(optional = false)
    @Column(name = "disco_id")
    private long discoId;

    public Venda() {
    }

    public Venda(Long id) {
        this.id = id;
    }

    public Venda(Long id, int qtdeVendida, short desconto, float valorTotal, float valorDesconto, Date dataVenda, long clienteId, long discoId) {
        this.id = id;
        this.qtdeVendida = qtdeVendida;
        this.desconto = desconto;
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
        this.dataVenda = dataVenda;
        this.clienteId = clienteId;
        this.discoId = discoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public int getQtdeVendida() {
        return qtdeVendida;
    }

    public void setQtdeVendida(int qtdeVendida) {
        int oldQtdeVendida = this.qtdeVendida;
        this.qtdeVendida = qtdeVendida;
        changeSupport.firePropertyChange("qtdeVendida", oldQtdeVendida, qtdeVendida);
    }

    public short getDesconto() {
        return desconto;
    }

    public void setDesconto(short desconto) {
        short oldDesconto = this.desconto;
        this.desconto = desconto;
        changeSupport.firePropertyChange("desconto", oldDesconto, desconto);
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        float oldValorTotal = this.valorTotal;
        this.valorTotal = valorTotal;
        changeSupport.firePropertyChange("valorTotal", oldValorTotal, valorTotal);
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        float oldValorDesconto = this.valorDesconto;
        this.valorDesconto = valorDesconto;
        changeSupport.firePropertyChange("valorDesconto", oldValorDesconto, valorDesconto);
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        Date oldDataVenda = this.dataVenda;
        this.dataVenda = dataVenda;
        changeSupport.firePropertyChange("dataVenda", oldDataVenda, dataVenda);
    }

    public long getClienteId() {
        return clienteId;
    }

    public void setClienteId(long clienteId) {
        long oldClienteId = this.clienteId;
        this.clienteId = clienteId;
        changeSupport.firePropertyChange("clienteId", oldClienteId, clienteId);
    }

    public long getDiscoId() {
        return discoId;
    }

    public void setDiscoId(long discoId) {
        long oldDiscoId = this.discoId;
        this.discoId = discoId;
        changeSupport.firePropertyChange("discoId", oldDiscoId, discoId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venda)) {
            return false;
        }
        Venda other = (Venda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Venda[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
