public class TiposVariaveis {
    public static void main(String[] args){
        
        //EXEMPLOS E TIPOS DE VARIAVEIS
        //TIPOS DE DADOS PRIMITIVOS E NÃO PRIMITIVOS
        
        byte pessoas = 56; //número inteiro que armazena até 8bits.
        
        short numero_de_cadeiras = 118; //número inteiro que armazena até 16bits.
        
        int idade = 25; //Números inteiros, sem casas decimais.
        
        long quantidade = 56556565L; //armazena números maiores que o int. Necessário colocar a letra L no final.   
        
        float valor = 12.50F; //números com casas decimais de precisão simples. Necessário colocar a letra F no final.
        
        double altura = 1.75; //Números com casas decimais de precisão dupla.
        
        char sexo = 'F'; //Caracteres, ou seja, uma letra.
        
        boolean ativo = true; //Verdadeiro ou falso.
        
        String nome = "Freddy"; //Conjunto de caracteres, ou seja, uma palavra.
        
        
        //CONSTANTES
    //variaveis podem mudar de valor, constantes pelo contrário não podem. Portanto para ajudar a definir esse padrão, a palavra **final** é usada no inicio da declaração da constante, e o nome dela deve ser em uppercase para facilitar a identificação. Exemplo:
    
    final double VALOR_DE_PI = 3.14159;

    final String MEU_NOME = "Heloisa";

    final int ANO_NASCIMENTO = 2005;
        
    }

}
