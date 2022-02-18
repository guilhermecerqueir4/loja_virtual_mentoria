package cerqueir4.lojavirtual.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "nota_item_produto")
@SequenceGenerator(name = "seq_nota_item_produto", sequenceName = "seq_nota_item_produto", allocationSize = 1, initialValue = 1)
public class NotaItemProduto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nota_item_produto")
	private Long id;
	
	@Column(nullable = false)
	private Double quantidade;
	
	@ManyToOne(targetEntity = Produto.class)
	@JoinColumn(name = "produto_id", nullable = false, foreignKey = @ForeignKey(value= ConstraintMode.CONSTRAINT, name = "produto_fk"))
	private String produto;
	
	@ManyToOne(targetEntity = Produto.class)
	@JoinColumn(name = "nota_fiscal_compra_id", nullable = false, foreignKey = @ForeignKey(value= ConstraintMode.CONSTRAINT, name = "nota_fiscal_compra_fk"))
	private NotaFiscalCompra notaFiscalCompra;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public NotaFiscalCompra getNotaFiscalCompra() {
		return notaFiscalCompra;
	}

	public void setNotaFiscalCompra(NotaFiscalCompra notaFiscalCompra) {
		this.notaFiscalCompra = notaFiscalCompra;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotaItemProduto other = (NotaItemProduto) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
