package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private String nome;
	private String cpf;
	private Cargo cargo;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}
// melhorando a coes?o transformar isso numa clasee
	/*
	 * public void reajustarSalario(BigDecimal aumento) { BigDecimal
	 * percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP); if
	 * (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) { throw new
	 * ValidacaoException("Reajuste nao pode ser superior a 40% do salario!"); }
	 * this.salario = this.salario.add(aumento); this.dataUltimoReajuste =
	 * LocalDate.now(); }
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.salario = novoSalario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
		this.dataUltimoReajuste = LocalDate.now();
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo novoCargo) {
		this.cargo = novoCargo;
		
		
	}

}
