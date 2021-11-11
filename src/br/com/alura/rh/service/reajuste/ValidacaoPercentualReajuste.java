package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.service.reajuste.Impl.ValidacaoReajuste;

public class ValidacaoPercentualReajuste implements  ValidacaoReajuste{
	public void validar(Funcionario funcionario, BigDecimal aumento) {

		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		BigDecimal salarioReajustado = salarioAtual.add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
}
