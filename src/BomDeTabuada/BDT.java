package BomDeTabuada;
import java.util.Scanner;
public class BDT
{
	public static void main(String[] args) 
	{
		int tabuada, erros, pontos, resposta;
        int acerto = 0;
        String inicio;

        System.out.println("#####################################");
        System.out.println("#######    Bom De Tabuada    ########");
        System.out.println("#####################################");
        //Definição de Delay
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Fim do Delay
        System.out.println("");
        //System.out.println("Olá sejá bem vindo ao Bom de Tabuada!");

        System.out.println("\nEspero que você se saia bem nesta rodada!");
        //Definição de Delay
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Fim do Delay

        //tribuição de variavel Scanner
        Scanner entrada = new Scanner(System.in);
        int continua = 1;
        while (continua != 10) 
        {
            //Menu do jogo
            System.out.println("\nEscolha uma das opções do menu \n");
            System.out.println("-------------------------------------------------");
            System.out.println("|1-Jogar|2-Regras|3-Desenvolvedor|4-sair|");
            System.out.println("-------------------------------------------------");
            System.out.print("\nOpção:  ");
            //Ler seleção
            int opcaoMenu = entrada.nextInt();

            //case
            switch (opcaoMenu) 
            {
                case 1:
                    int resp = 0;
                    System.out.println("\nOK vamos lá");

                    //Definição de Delay
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //Fim do Delay

                    //seleção de jogadores
                    System.out.println("Escolha a quantidade de jogadores\n");
                    System.out.println("|1-Jogador |2-Jogadores |3-Voltar ou sair\n");
                    System.out.print("Opção:  ");
                    //Fim da seleção
                 

                    int opcJogador = entrada.nextInt();
                    switch (opcJogador) 
                    {
                        case 1:
                            int pt = 0;
                            System.out.println("Me diga o seu nome.");
                            String nome = entrada.next();
                            //Definição de Delay
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            //inicio da tabuada de (2)
                            System.out.println("");
                           // System.out.println("Vamos iniciar pela tabuada de ( 2 )");
                            System.out.println(nome + " (2 x 1)");
                            resp = entrada.nextInt();
                            if (resp == 2) {
                                System.out.println(" Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome + " 2 x 2 ");
                            resp = entrada.nextInt();
                            if (resp == 4) {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome + "2 x 3 ");
                            resp = entrada.nextInt();
                            if (resp == 6) {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println("2 x 4 ");
                            resp = entrada.nextInt();
                            if (resp == 8) {
                                System.out.println(" Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(" Essa não é a resposta!");
                               // System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(" (2 x 5)");
                            resp = entrada.nextInt();
                            if (resp == 10) {
                                System.out.println("acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(" 2 x 6");
                            resp = entrada.nextInt();
                            if (resp == 12) {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome + " Me diga quanto é (2 x 7)");
                            resp = entrada.nextInt();
                            if (resp == 14) {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome + " Me diga quanto é (2 x 8)");
                            resp = entrada.nextInt();
                            if (resp == 16) {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome + " Me diga quanto é (2 x 9)");
                            resp = entrada.nextInt();
                            if (resp == 18) {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome + " Me diga quanto é (2 x 10)");
                            resp = entrada.nextInt();
                            if (resp == 20) {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //FIM DA TABUADA DE (2)
                            //Definição de Delay
                            try 
                            {
                                Thread.sleep(4000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            
                            //inicio da tabuada de (3)
                          /*  System.out.println("");
                            System.out.println("Vamos para a tabuada de ( 3 )");
                            System.out.println(nome + " Me diga quanto é (3 x 1)");
                            resp = entrada.nextInt();
                            if (resp == 3) 
                            {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } 
                            else 
                            {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                          //Definição de Delay
                            try 
                            {
                                Thread.sleep(4000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println(" ");
                            System.out.println(nome + " Me diga quanto é (3 x 2)");
                            resp = entrada.nextInt();
                            if (resp == 6) 
                            {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } 
                            else 
                            {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            try 
                            {
                                Thread.sleep(4000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println(" ");
                            System.out.println(nome + " Me diga quanto é (3 x 3)");
                            resp = entrada.nextInt();
                            if (resp == 9) 
                            {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } 
                            else 
                            {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            try 
                            {
                                Thread.sleep(4000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println(" ");
                            System.out.println(nome + " Me diga quanto é (3 x 4)");
                            resp = entrada.nextInt();
                            if (resp == 12) 
                            {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } 
                            else 
                            {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            try 
                            {
                                Thread.sleep(4000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println(" ");
                            System.out.println(nome + " Me diga quanto é (3 x 5)");
                            resp = entrada.nextInt();
                            if (resp == 15) 
                            {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } 
                            else 
                            {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            try 
                            {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println(" ");
                            System.out.println(nome + " Me diga quanto é (3 x 6)");
                            resp = entrada.nextInt();
                            if (resp == 18) 
                            {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } 
                            else 
                            {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            try 
                            {
                                Thread.sleep(4000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println(" ");
                            System.out.println(nome + " Me diga quanto é (3 x 7)");
                            resp = entrada.nextInt();
                            if (resp == 21) 
                            {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } 
                            else 
                            {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            try 
                            {
                                Thread.sleep(4000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println(" ");
                            System.out.println(nome + " Me diga quanto é (3 x 8)");
                            resp = entrada.nextInt();
                            if (resp == 24) 
                            {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } 
                            else 
                            {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            try 
                            {
                                Thread.sleep(4000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println(" ");
                            System.out.println(nome + " Me diga quanto é (3 x 9)");
                            resp = entrada.nextInt();
                            if (resp == 27) 
                            {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } 
                            else 
                            {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }  
                            try 
                            {
                                Thread.sleep(4000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println(" ");
                            System.out.println(nome + " Me diga quanto é (3 x 10)");
                            resp = entrada.nextInt();
                            if (resp == 30) 
                            {
                                System.out.println(nome + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } 
                            else 
                            {
                                System.out.println(nome + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }*/
                            //FIM DA TABUADA DE (3)
                            
                        System.out.println("Muito bem " + nome + " você teve " + "( " + pt + " )" + " acertos");
                        break;
                        //Fim do jogo para 1 jogador
                      /*  case 2:
                            //pontos
                            pt = 0;
                            int pt2 = 0;
                            //Disputa de 2 jogadores
                            System.out.println("Digite o nome do jogador 1");
                            String nome1 = entrada.next();
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("Digite o nome do jogador 2");
                            String nome2 = entrada.next();
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("###############################");
                            System.out.println("#########  BOM JOGO!  #########");
                            System.out.println("###############################");
                            System.out.println(" ");
                            System.out.println("");
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("Vamos iniciar pela tabuada de ( 2 )");
                            System.out.println(nome1 + " Me diga quanto é (2 x 1)");
                            resp = entrada.nextInt();
                            if (resp == 2) {
                                System.out.println(nome1 + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome1 + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome2 + " Me diga quanto é (2 x 2)");
                            resp = entrada.nextInt();
                            if (resp == 4) {
                                System.out.println(nome2 + " Você acertou");
                                pt2 = pt2 + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome2 + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt2 = pt2 + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome1 + " Me diga quanto é (2 x 3)");
                            resp = entrada.nextInt();
                            if (resp == 6) {
                                System.out.println(nome1 + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome1 + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome2 + " Me diga quanto é (2 x 4)");
                            resp = entrada.nextInt();
                            if (resp == 8) {
                                System.out.println(nome2 + " Você acertou");
                                pt2 = pt2 + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome2 + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt2 = pt2 + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome1 + " Me diga quanto é (2 x 5)");
                            resp = entrada.nextInt();
                            if (resp == 10) {
                                System.out.println(nome1 + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome1 + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome2 + " Me diga quanto é (2 x 6)");
                            resp = entrada.nextInt();
                            if (resp == 12) {
                                System.out.println(nome2 + " Você acertou");
                                pt2 = pt2 + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome2 + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt2 = pt2 + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome1 + " Me diga quanto é (2 x 7)");
                            resp = entrada.nextInt();
                            if (resp == 14) {
                                System.out.println(nome1 + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome1 + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome2 + " Me diga quanto é (2 x 8)");
                            resp = entrada.nextInt();
                            if (resp == 16) {
                                System.out.println(nome2 + " Você acertou");
                                pt2 = pt2 + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome2 + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt2 = pt2 + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome1 + " Me diga quanto é (2 x 9)");
                            resp = entrada.nextInt();
                            if (resp == 18) {
                                System.out.println(nome1 + " Você acertou");
                                pt = pt + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome1 + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt = pt + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println("");
                            System.out.println(nome2 + " Me diga quanto é (2 x 10)");
                            resp = entrada.nextInt();
                            if (resp == 20) {
                                System.out.println(nome2 + " Você acertou");
                                pt2 = pt2 + 1;
                                System.out.println("--------------------------------------------");
                            } else {
                                System.out.println(nome2 + " Essa não é a resposta!");
                                System.out.println("Não ganhou ponto");
                                pt2 = pt2 + 0;
                                System.out.println("--------------------------------------------");
                            }
                            //Definição de Delay
                            try {
                                Thread.sleep(4000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Fim do Delay
                            System.out.println(nome1 + " Muito bem você teve " + "( " + pt + " )" + " acertos");
                            System.out.println(nome2 + " Muito bem você teve " + "( " + pt2 + " )" + " acertos");
                            if (pt > pt2) {
                                System.out.println(nome1 + " Você é o vencedor desta rodada!!!");
                            }
                            if (pt2 > pt) {
                                System.out.println(nome2 + " Você é o vencedor desta rodada!!!");
                            }
                            if (pt == pt2) {
                                System.out.println("Jogadores emparam!!!");
                            }
                            System.out.println(" ");
                        break;*/
                    }
                break;
                case 2:
                    //Inicio do Manual
                    System.out.println("\n--------------------------------------------------------");
                    System.out.println("----ESTE É O NOSSO MANUAL DE REGRAS----");
                    System.out.println("\nA REGRA É QUEM FAZ MAIS PONTOS GANHA");
                    System.out.println("\nME MOSTRE QUE VOCÊ É BOM DE TABUADA");
                break;
                case 3:
                    //desenvolvedor
                    System.out.println("-------Sobre o jogo-------");
                    System.out.println("\nCriado para estimular as crianças a aprenderem a tabuada");
                break;                   
            }
            //retornar ao menu
            System.out.println("\nDeseja continuar?");
            System.out.println("1- Menu 2- Sair ");
            System.out.print("OPÇÃO: ");
            continua = entrada.nextInt();
            if(continua == 2)
            {
                System.exit(0);
            }
        }
    }

}
