package br.com.alura.rh.model;

import java.math.BigDecimal;
// lembrar do principio de liskov  nao posso promover terceirizado nem ajustar salario
//extrair atributos comuns por isso nao posso utilizar de heran�a
public class Terceirizado {
	//composi�ao
	private DadosPessoais dadosPessoais;
	private String empresa;
	



	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	
	
}
