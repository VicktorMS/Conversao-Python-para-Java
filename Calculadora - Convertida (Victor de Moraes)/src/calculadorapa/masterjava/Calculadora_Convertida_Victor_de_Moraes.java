
package calculadorapa.masterjava;

import java.util.Scanner;

public class Calculadora_Convertida_Victor_de_Moraes {
    
    //Aluno:Victor de Moraes, 3101 TI;
    //Github:https://github.com/VicktorMS;
    //Professor:Felipe Nascimento;

      public static void main(String[] args) {
                
        double an;
        int m;
        int n;
        double r;
        double am;
        double soma;
        int boot;
        int select2;
              
         Scanner a = new Scanner (System.in);
        System.out.print("Digite 0 para iniciar o sistema: ");
        boot = a.nextInt();
        
        while (boot == 0){
            
            Scanner ler = new Scanner (System.in);
               System.out.print("SEJA BEM VINDO AO CALCULADOR DE PROGRESSÕES ARITMÉTICAS" + "\n" +
                    " " + "\n" +
                    "Digite 1 para calcular o termo geral(AN) " + "\n" +
                    "Digite 2 para calcular o primeiro termo(AM):" + "\n" +
                    "Digite 3 para calcular o número de termos(N):" + "\n" +
                    "Digite 4 para calcular o valor de posição de AM(M):" + "\n" +
                    "Digite 5 para calcular a razão(R):" + "\n" +
                    "Digite 6 para calcular a SOMA: " + "\n" +
                    "-> ");
               select2 = a.nextInt();
               
            switch (select2) {
                case 1:
                    {
                        Scanner ler1 = new Scanner (System.in);
                        System.out.println("Digite o valor do primeiro termo (AM).");
                        am = ler.nextDouble();
                        System.out.println("Digite a posição que o primeiro termo (AM) ocupa.");
                        m = ler.nextInt();
                        System.out.println("Digite a posição que o termo geral (AN) ocupa.");
                        n = ler.nextInt();
                        System.out.println("Digite a razão da PA.");
                        r = ler.nextDouble();
                        an = am + (n-m) * r;
                        System.out.println("O resultado é: " + an );
                        break;
                    }
                case 2:
                    {
                        Scanner ler1 = new Scanner (System.in);
                        System.out.println("Digite o valor do termo geral (AN).");
                        an = ler.nextDouble();
                        System.out.println("Digite a posição que o termo geral(AN) ocupa.");
                        n = ler.nextInt();
                        System.out.println("Digite a posição que o primeiro termo(AM) ocupa.");
                        m = ler.nextInt();
                        System.out.println("Digite a razão da PA.");
                        r = ler.nextDouble();
                        am = an - (m-n) * r;
                        System.out.println("O resultado é: " + am );
                        break;
                    }
                case 3:
                    {
                        Scanner ler1 = new Scanner (System.in);
                        System.out.println("Digite o valor do primeiro termo (AM).");
                        am = ler.nextDouble();
                        System.out.println("Digite a posição que o primeiro termo (AM) ocupa.");
                        m = ler.nextInt();
                        System.out.println("Digite o valor do termo geral (AN).");
                        an = ler.nextDouble();
                        System.out.println("Digite a razão da PA.");
                        r = ler.nextDouble();
                        n = (int) ((an - am + m*r)/ (m*r));
                        System.out.println("O resultado é: " + n );
                        break;
                    }
                case 4:
                    {
                        Scanner ler1 = new Scanner (System.in);
                        System.out.println("Digite o valor do primeiro termo (AM).");
                        am = ler.nextDouble();
                        System.out.println("Digite o  valor do termo geral (AM).");
                        an = ler.nextDouble();
                        System.out.println("Digite a posição que o termo geral (AN) ocupa.");
                        n = ler.nextInt();
                        System.out.println("Digite a razão da PA.");
                        r = ler.nextDouble();
                        m = (int) ((am - an + n * r) / r);
                        System.out.println("O resultado é: " + m );
                        break;
                    }
                case 5:
                    {
                        Scanner ler1 = new Scanner (System.in);
                        System.out.println("Digite o valor do primeiro termo (AM).");
                        am = ler.nextDouble();
                        System.out.println("Digite a posição que o primeiro termo (AM) ocupa.");
                        m = ler.nextInt();
                        System.out.println("Digite o valor do termo geral (AN).");
                        an = ler.nextDouble();
                        System.out.println("Digite a posição que o termo geral (AN) ocupa.");
                        n = ler.nextInt();
                        r = (an - am)/ (n-m);
                        System.out.println("O resultado é: " + r );
                        break;
                    }
                case 6:
                    {
                        Scanner ler1 = new Scanner (System.in);
                        System.out.println("Digite o valor do primeiro termo (AM).");
                        am = ler.nextDouble();
                        System.out.println("Digite o ultimo termo da PA.");
                        an = ler.nextInt();
                        System.out.println("Digite a quantidade de termos na PA.");
                        n = ler.nextInt();
                        soma = (am + an) * (n / 2);
                        System.out.println("O resultado é: " + soma );
                        break;
                    }
                default:
                    break;
                    
            }  
           }
        
        if (boot !=0) {  
            System.out.println("Parece que você digitou uma opção inválida.");
            System.out.println ("Caso deseje acessar a calculadora reinicie o programa e digite a tecla correta.");                        
      }   
    }
  }
