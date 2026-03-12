package designerPatternsComportamentais.templateMethod;

import java.math.BigDecimal;

import desconto.CalculadoraDeDesconto;
import orcamento.Orcamento;

public class PrincipalPadraoTemplateMethod {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Design Patterns - Comportamentais - Template Method ---");
        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();

        System.out.println(calculadora.calcular(primeiroOrcamento));
        System.out.println(calculadora.calcular(segundoOrcamento));

    }
}






