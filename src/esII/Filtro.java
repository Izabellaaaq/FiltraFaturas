package esII;

import java.util.ArrayList;
import java.util.Date;

public class Filtro {
	
	public Filtro(){
	}
	
	public ArrayList<Fatura> filtrar(ArrayList<Fatura> listaFaturas){
		
		
		
		for( int i = 0; i <listaFaturas.size(); i ++){
			
			Fatura fatura = listaFaturas.get(i);
			Date faturaDate = fatura.getData();
			Date clienteDataInclusao = fatura.getCliente().getDataInclusao();
			
			if(fatura.getValor() <	2000.0){
				listaFaturas.remove(fatura);

			}else if ((fatura.getValor() >= 2000.0 && fatura.getValor() < 2500.0) 
					&& faturaDate.before(new Date(faturaDate.getYear(), faturaDate.getMonth() -1, faturaDate.getDay()))){
				listaFaturas.remove(fatura);	
			}
			else if((fatura.getValor() >= 2500.0 && fatura.getValor() < 3000.0) 
					&& clienteDataInclusao.before(new Date(clienteDataInclusao.getYear(), clienteDataInclusao.getMonth() -2, clienteDataInclusao.getDay()))){
				listaFaturas.remove(fatura);
				
			//Se o valor da fatura for maior que 4000 e pertencer a algum estado da região Sul do Brasil.
			}else if((fatura.getValor() > 4000.0) && fatura.getCliente().getEstado() == "sul"){
				listaFaturas.remove(fatura);
			}
	
		}
		return listaFaturas;
		
	}
}
