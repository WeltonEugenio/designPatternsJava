package designerPatternsComportamentais.state;

import java.math.BigDecimal;
import orcamento.Orcamento;

public class PrincipalPadraoState {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Design Patterns - Comportamentais - State --- \n");
        
         String texto = """
            O padrão de projeto State (Estado) é um padrão comportamental que permite a um objeto alterar seu comportamento 
            quando seu estado interno muda. Para quem o utiliza, parece que o objeto mudou sua classe. 
    
            Principais características e objetivos:
                * Encapsulamento de Comportamentos: Em vez de ter métodos gigantescos com muitos ifs ou switches baseados no estado, o padrão State move esses comportamentos para classes separadas (uma classe para cada estado).
                * Contexto e Estados: O objeto principal ("Contexto") mantém uma referência a um objeto de estado concreto, que é responsável por executar comportamentos específicos e transições para outros estados.
                * Limpeza de Código: Evita condicionais complexas, tornando o código mais organizado, fácil de manter e de adicionar novos estados (princípio Aberto/Fechado).
                * Dinamismo: Permite que o objeto mude de comportamento em tempo de execução, dependendo do estado em que se encontra.""";   
        System.out.println(texto);

        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 6);
        primeiroOrcamento.aplicarDescontoExtra();
        
        System.out.println(primeiroOrcamento.getValor());
        System.out.println( primeiroOrcamento.getSituacao().getClass().getSimpleName());

        // Aprova o orçamento e aplica o desconto extra novamente agora com o orçamento aprovado
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("200"), 6);
        segundoOrcamento.aprovar();
        segundoOrcamento.aplicarDescontoExtra();
        
        System.out.println(segundoOrcamento.getValor());
        System.out.println( segundoOrcamento.getSituacao().getClass().getSimpleName());
    }
}






