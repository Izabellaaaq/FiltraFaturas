package esII;

import java.io.IOException;
import java.sql.Date;

public class Fatura {
	
	private String  codigo;
	private Double valor;
	private Date data;
	private Cliente cliente;
	
	
	public Fatura(String codigo, Double valor, Date data, Cliente cliente) throws Exception{
		if (codigo == null || valor == null || data == null || cliente  == null){
			throw new Exception("Deve haver algum valor nulo.");
		}
		if(valor <= 0.0){
			throw new Exception("O valor não pode ser 0 e nem negativo.");
			
		}
		if (codigo.trim().equals("")){
			throw new Exception("Código vazio");
		}
		
		this.codigo = codigo;
		this.valor = valor;
		this.data = data;
		this.cliente = cliente;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fatura other = (Fatura) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	

}
