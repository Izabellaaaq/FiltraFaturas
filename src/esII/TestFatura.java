package esII;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFatura {
	
	private String  codigo;
	private Double valor;
	private Date data;
	private Cliente cliente;
	private Fatura fatura;
	
	@Before
	public void inicializarConstrutor() throws Exception{
		this.codigo = "abcd";
		this.valor = 2100.0;
		this.data = new Date(2016,11,15);
		this.cliente = new Cliente("Izabella", new Date(2016,8,15), "Paraiba");
		this.fatura = new Fatura(codigo, valor, data, cliente);
		
		
	}

	@Test
	public void testConstrutor() throws Exception {
		Assert.assertTrue(fatura.equals(new Fatura("abcd", 2100.0, new Date(2016,11,15), 
				new Cliente("Izabella", new Date(2016,8,15), "Paraiba"))));
		Assert.assertFalse(fatura.equals(new Fatura("abcd", 2100.0, new Date(2016,11,15), 
				new Cliente("Izabella", new Date(2016,8,15), "Pernambuco"))));
	}
	
	@Test
	public void testExcecoesConstrutor(){
		try{
			this.fatura = new Fatura(" ", valor, data, cliente);
			Assert.fail("Deveria haver falha de valor vazio");
		}catch(Exception e){
			Assert.assertEquals("Código vazio", e.getMessage());
		}
		
		try{
			this.fatura = new Fatura(codigo, null , data, cliente);
			Assert.fail("Deveria haver falha de valor vazio");
		}catch(Exception e){
			Assert.assertEquals("Deve haver algum valor nulo.", e.getMessage());
		}
		
		try{
			this.fatura = new Fatura(codigo, valor , null, cliente);
			Assert.fail("Deveria haver falha de valor vazio");
		}catch(Exception e){
			Assert.assertEquals("Deve haver algum valor nulo.", e.getMessage());
		}
		
		try{
			this.fatura = new Fatura(codigo, valor , data, null);
			Assert.fail("Deveria haver falha de valor vazio");
		}catch(Exception e){
			Assert.assertEquals("Deve haver algum valor nulo.", e.getMessage());
		}
		
		try{
			this.fatura = new Fatura(codigo, -1.0 , data, cliente);
			Assert.fail("Deveria haver falha de valor vazio");
		}catch(Exception e){
			Assert.assertEquals("O valor não pode ser 0 e nem negativo.", e.getMessage());
		}
		
		try{
			this.fatura = new Fatura(codigo, 0.0 , data, cliente);
			Assert.fail("Deveria haver falha de valor vazio");
		}catch(Exception e){
			Assert.assertEquals("O valor não pode ser 0 e nem negativo.", e.getMessage());
		}
	}

}
