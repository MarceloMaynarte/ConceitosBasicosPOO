package Classe;

public class produtoTeste {

    public static void main(String[] args){
        //Criação de objeto
        //NEW é o nome da palavra reservada para chamar o construtor.
        Produto p1 = new Produto();
        p1.nome = "notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        //Saída do construtor p1
        //Saida do construtor mostrando o desconto final.

        double precoFinal1 = p1.preco *(1 - p1.desconto);
        double precoFinal2 = p2.preco *(1 - p2.desconto);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho   R$  %.2f. ", mediaCarrinho);









    }
}
