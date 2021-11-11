package br.com.alura.rh.service.reajuste.Impl;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

public interface ValidacaoReajuste {
	void validar(Funcionario funcionario, BigDecimal aumento);
}
