/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author nicke
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author rafae
 */
package com.mycompany.projeto;
    /**
     * @param args the command line arguments
     */
 /*Nesta versão atualizada, adicionamos também "Procurar Produto"
e "Excluir Produto" a partir da sua nomenclatura, e corrigimos alguns
erros que estava ocorrendo na execução da versão anterior do programa. 
Ao "Procurar Produto", é buscado através de uma instância a classe mercado,
Pois lá está todos os produtos salvos nos arreysLists, então é mostrado,
nome, e quantidade atual do produto.

Ao "Excluir Produto" , é  mostrado através de um Switch case, duas escolhas...
1° permite excluir todo um estoque de um produto específico.
2° permite que o usuário decida a quantidade quer quer excluir 
do produto escolhido.

Correção de erros.
Adicionamos cláusula try-catch ao redor do bloco de código que lê
a entrada do usuário para capturar exceções de InputMismatchException,
que ocorrem quando o usuário insere um tipo de entrada inválida. Também 
adicionamos scan.next() no bloco catch para limpar o buffer do scanner e 
evitar loops infinitos quando ocorrer uma exceção, já que a versão anterior
estava ocorrendo muitos erros por essas causas.*/
 
import java.util.ArrayList; 
import java.util.InputMismatchException;
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mercado mercado = new Mercado();

        boolean continuar = true;
        while (continuar) {
            System.out.println("1 - Escolha o Setor");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Procurar produto");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opcao: ");
            try {
                int opcao = scan.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println();
                        System.out.println("======== Setores ========");
                        System.out.println("= 1 - Higiene em geral  =");
                        System.out.println("= 2 - Hortifruti        =");
                        System.out.println("= 3 - Adega e Bebidas   =");
                        System.out.println("= 4 - Frios e Laticinios=");
                        System.out.println("= 5 - Padaria           =");
                        System.out.println("= 6 - Mercearia         =");
                        System.out.println("= 7 - Bomboniere        =");
                        System.out.println("= 8 - Massa e Molhos    =");
                        System.out.println("=========================");
                        System.out.print("Escolha uma opcao: ");

                        int setor = scan.nextInt();
                        System.out.println("Agora adicione um produto");
                        System.out.print("Nome do produto: ");
                        String nome = scan.next();
                        System.out.print("Preco do produto: ");
                        double preco = scan.nextDouble();
                        System.out.print("Quantidade do produto: ");
                        int quantidade = scan.nextInt();
                        mercado.adicionarProduto(new Produto(nome, preco, quantidade));

                        System.out.println("Concluido");

                        break;

                    case 2:
                        mercado.listarProdutos();
                        break;

                    case 3:
                        System.out.print("Digite o nome do produto a ser procurado: ");
                        String nomeProduto = scan.next();
                        mercado.procurarProduto(nomeProduto);
                        break;

                    case 4:
                        System.out.println("1 - Remover quantidade especifica");
                        System.out.println("2 - Remover todo o estoque");
                        System.out.print("Escolha uma opção: ");
                        int opcaoRemover = scan.nextInt();
                        switch (opcaoRemover) {
                            case 1:
                                System.out.print("Digite o nome do produto a ser removido: ");
                                String nomeProdutoRemover = scan.next();
                                System.out.print("Digite a quantidade a ser removida: ");
                                int quantidadeRemover = scan.nextInt();
                                mercado.removerProduto(nomeProdutoRemover, quantidadeRemover);
                                break;
                            case 2:
                                System.out.print("Digite o nome do produto a ser removido completamente: ");
                                String nomeProdutoRemoverCompleto = scan.next();
                                mercado.removerProduto(nomeProdutoRemoverCompleto, Integer.MAX_VALUE);
                                break;
                            default:
                                System.out.println("Opcao invalida.");
                        }
                        break;

                    case 5:
                        System.out.println("Saindo...");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opcao invalida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Por favor, insira um numero.");
                scan.next(); // Limpa o buffer do scanner
            }
        }
        scan.close();
    }
}