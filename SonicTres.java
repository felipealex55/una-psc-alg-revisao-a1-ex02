import java.util.Scanner;

public class SonicTres {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int esperanca = 0, medo = 0,  confianca = 0, desanimo = 0, determinacao = 0, incerteza = 0, emocaoPositiva = 0, emocaoNegativa = 0;
        int aliados, desafio1, desafio2, desafio3, somaDesafios, media, pontuacao, estrategia;

        System.out.println("Batalha de Sonic, Knuckles e Tails x Shadow, junte o maximo de aliados para enfrentalo!");

        System.out.println("Quantos aliados a equipe conseguiu ?");
        aliados = sc.nextInt();

        if (aliados > 0) {
            esperanca = aliados * 15;
            System.out.println("Esperança recebeu: " + esperanca + " pontos.");
        }
        else {
            medo = medo + 40;
            System.out.println("Medo recebeu: " + medo);
        }

        System.out.println("Agora temos 3 desafios, avalie cada confronto a seguir em uma pontuação de 0 a 10.");

        do {

            System.out.println("Quantos pontos a equipe conseguiu no Desafio 1 ?");
            pontuacao = sc.nextInt();

            if (pontuacao < 0 || pontuacao > 10) {
                System.out.println("Pontuação invalida, digite um pontuação de 0 a 10.");
            }

        } while (pontuacao < 0 || pontuacao > 10);

        desafio1 = pontuacao;

        do {

            System.out.println("Quantos pontos a equipe conseguiu no Desafio 2 ?");
            pontuacao = sc.nextInt();

            if (pontuacao < 0 || pontuacao > 10) {
                System.out.println("Pontuação invalida, digite um pontuação de 0 a 10.");
            }

            
        } while (pontuacao < 0 || pontuacao > 10);

        desafio2 = pontuacao;

        do {

            System.out.println("Quantos pontos a equipe conseguiu no Desafio 3 ?");
            pontuacao = sc.nextInt();

            if (pontuacao < 0 || pontuacao > 10) {
                System.out.println("Pontuação invalida, digite um pontuação de 0 a 10.");
            }

        } while (pontuacao < 0 || pontuacao > 10);

        desafio3 = pontuacao;

        somaDesafios = desafio1 + desafio2 + desafio3;
        media = (desafio1 + desafio2 + desafio3) / 3;

        System.out.println("A pontuação total dos desafios foram " + somaDesafios + " pontos.");
        System.out.println("Pontuação media " + media + " pontos.");

        if (media >= 7) {
            confianca = confianca + 60;
            System.out.println("A confiaça aumentou " + confianca + " pontos.");
        } 
        else {
            desanimo = desanimo + 60;
            System.out.println("Desanimo aumentou " + desanimo + " pontos.");
        }

        System.out.println("A equipe precisa analisar 12 estratégias diferentes para tentar superar os poderes de Shadow.");

        do {
            
            System.out.println("Quantas estrategias foram analisadas ?");
            estrategia = sc.nextInt();

            if (estrategia < 0 || estrategia > 12) {       
                System.out.println("Digite um numero de estrategia entre 0 e 12.");
            }

        } while (estrategia < 0 || estrategia > 12);

        determinacao = estrategia * 10;
        incerteza = (12 - estrategia) * 10;

        System.out.println("Foram analisadas " + estrategia + " estrategias.");
        System.out.println("Determinação recebeu " + determinacao + " pontos.");
        System.out.println("Incerteza recebeu " + incerteza + " pontos.");

        emocaoPositiva = esperanca + confianca + determinacao;
        emocaoNegativa = medo + desanimo + incerteza;

        System.out.println("A junção das emoções positivas somaram " + emocaoPositiva + " pontos.");
        System.out.println("A junção das emoções negativas somaram " + emocaoNegativa + " pontos.");

        if (emocaoPositiva > emocaoNegativa) {
            System.out.println("O Shadow foi derrotado.");
        }
        else {
            System.out.println("O Shadow venceu o time do Sonic.");
        } 

        sc.close();
    }
}