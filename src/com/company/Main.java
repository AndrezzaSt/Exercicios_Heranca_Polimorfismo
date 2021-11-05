package com.company;
import CLasses_Ex3.Camarote_Inferiror;
import CLasses_Ex3.Camarote_Superior;
import CLasses_Ex3.Ingresso;
import CLasses_Ex3.Normal;
import Classes.Administrativo;
import Classes.Assistente;
import Classes.Funcionario;
import Classes.Tecnico;
import Classes_Ex2.*;
import Classes_Ex4.Imovel;
import Classes_Ex4.Novo;
import Classes_Ex4.Velho;

import java.util.Scanner;

public class Main {
/*
a. crie um assistente administrativo e um técnico. Imprima o número de matrícula e o
nome de cada um deles.
 */
    public static void teste_exer_1() {
        Administrativo assistente_adm = new Administrativo("Anderson", "adm", 10000.00,035,1,"noite");
        Tecnico assistente_tec = new Tecnico("Andrezza", "tec",5000.00,034,2,50);

        System.out.println(assistente_adm.getName() + " " + assistente_adm.getNumero_matricula());
        System.out.println(assistente_tec.getName() + " " +assistente_tec.getNumero_matricula());
    }
    /*
        b. crie um animal do tipo cachorro e faça-o latir. Crie um gato e faça-o miar. Faça os
        dois animais caminharem.
     */
    public static void teste_exer_2(){
        Cachorro cachorro = new Cachorro("Rogerinho", "Salsicha");
        Gato gato = new Gato("Mingau", "vira-lata");
        System.out.println(cachorro.getNome() + " " + cachorro.late() + " " + cachorro.getNome() + " " + cachorro.caminha());
        System.out.println(gato.getNome() + " " + gato.miou()+ " " + gato.getNome() + " " +  gato.caminha());
    }
    /*
     teste (como quiser) as classes Rica, Pobre e Miseravel.
     */
    public static void teste_exer_3(){
        Pobre pobre = new Pobre();
        Rica rica = new Rica();
        Miserable miseravel = new Miserable();

    }

    /*
        d. crie um ingresso. Peça para o usuário digitar 1 para normal e 2 para VIP.
    Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou VIP. Se for
    VIP, peça para ele digitar 1 para camarote superior e 2 para camarote inferior.
    Conforme a escolha do usuário, diga se que o VIP é camarote superior ou inferior.
    Imprima o valor do ingresso.
     */
    public static void teste_exer_4(){
        Scanner scan = new Scanner(System.in);
        Ingresso ingresso = new Ingresso();
        System.out.println("1 - Ingresso Normal, 2 - Ingresso VIP");
        int op = scan.nextInt();

        if(op == 1) {
            System.out.println("Você escolheu o ingresso Normal!");
            ingresso = new Normal();
            System.out.println(ingresso.toString() + " seu valor será de: " + ingresso.imprime_valor());
        }else if(op == 2) {
            System.out.println("1 - Camarote Superior, 2 - Camarote Inferior");
            op = scan.nextInt();
            if(op == 1){
                ingresso = new Camarote_Superior();
                System.out.println("Voce escolheu o Camarote Superior!" + " seu valor será de: " + ingresso.imprime_valor());
            }else if(op == 2) {
                ingresso = new Camarote_Inferiror();
                System.out.println("Voce escolheu o Camarote Inferior!" + " seu valor será de: " + ingresso.imprime_valor());
            }
        }
    }

    /*
        e. crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho. Conforme a
    definição do usuário, imprima o valor final do imóvel
     */
    public static void teste_exer_5(){
        Imovel imovel = new Imovel();
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Imovel Novo, 2 - Imovel Velho");
        int op = scan.nextInt();

        if(op == 1){
            imovel = new Novo("Rua fernando osorio", 200000.00, 30);
            System.out.println("Voce escolheu um imovel novo! " + imovel.toString());
            System.out.println("Preço total: " + imovel.imprimir_preco());
        }else if(op ==2){
            imovel = new Velho("Rua fernando osorio", 100000.00, 20);
            System.out.println("Voce escolheu um imovel velho! " + imovel.toString());
            System.out.println("Preço total: " + imovel.imprimir_preco());
        }
    }
    public static void main(String[] args) {
	    teste_exer_1();
        teste_exer_2();
        teste_exer_3();
        teste_exer_4();
        teste_exer_5();
    }
}
