package esII;

import java.sql.Date;

public class Cliente {
	
	private String nome;
	private Date dataInclusao;
	private String regiaoEstado;
	
	public Cliente(String nome, Date dataInclusao, String regiaoEstado) throws Exception{
		if(nome == null || dataInclusao == null || regiaoEstado == null){
			throw new Exception("Deve haver alguma entrada nula");
		}
		if (nome.trim().isEmpty() || regiaoEstado.trim().isEmpty()){
			throw new Exception("Nome ou estado vazio");
		}
		
		this.nome = nome;
		this.dataInclusao = dataInclusao;
		this.regiaoEstado = regiaoEstado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public String getEstado() {
		return regiaoEstado;
	}

	public void setEstado(String estado) {
		this.regiaoEstado = regiaoEstado;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (dataInclusao == null) {
			if (other.dataInclusao != null)
				return false;
		} else if (!dataInclusao.equals(other.dataInclusao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (regiaoEstado == null) {
			if (other.regiaoEstado != null)
				return false;
		} else if (!regiaoEstado.equals(other.regiaoEstado))
			return false;
		return true;
	}
	

}
