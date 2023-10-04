package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu{
    public void menu(){
        Scanner teclado = new Scanner(System.in);

        int resposta;

        System.out.println("O que deseja fazer?");
        System.out.println("[1]- Cadastrar animal: ");
        System.out.println("[2]- Ver informação das espécies: [Mamifero]-[Ave]-[Réptil] ");
        resposta = teclado.nextInt();

        if (resposta == 1){
            Mamiferos mamiferos = new Mamiferos();
            mamiferos.cadastroAnimais();
        }



    }


}
