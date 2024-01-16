import java.util.Scanner;
import java.util.Random;

public class jokenpo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true){
            System.out.print("Escolha: pedra papel ou tesoura: (Digite sair para sair) ");
            String escolhaJogador = scanner.next().toLowerCase();
            
            if(escolhaJogador.equals("sair")){
                System.out.println("Tchau");
                break;
            }

            if(!escolhaJogador.equals("sair") && !escolhaJogador.equals("pedra") && !escolhaJogador.equals("papel") && !escolhaJogador.equals("tesoura")){
                System.out.println("Opçao invalida");
                continue;
            }
            
            int escolhaPc = random.nextInt(3);
            System.out.println("computador escolheu " +converterPc(escolhaPc) );

            String vencedor = logicaVencedor (escolhaJogador, converterPc(escolhaPc));
            System.out.println(vencedor);

        }
        

    }

    private static String converterPc(int escolhaPc){
        switch (escolhaPc) {

            case 0:
                return "pedra";

            case 1:
                return "papel";

            case 2:
                return "tesoura";

            default:
                return "";
                
        }


    }

    private static String logicaVencedor(String escolhaJogador, String escolhaPc) {
        if (escolhaJogador.equals(escolhaPc)) {
            return "Empate";
        } else if ((escolhaJogador.equals("papel") && escolhaPc.equals("pedra")) ||
                  (escolhaJogador.equals("pedra") && escolhaPc.equals("tesoura")) ||
                  (escolhaJogador.equals("tesoura") && escolhaPc.equals("papel"))){
                return "Voce ganhou ";
                  } else{
                    return "voce perdeu ";

                  }
    }

    
    }
                

    