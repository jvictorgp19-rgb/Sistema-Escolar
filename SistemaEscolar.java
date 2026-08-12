import java.util.Scanner;

public class SistemaEscolar {

public static Double calcularMedia(Double[] notas) {

    Double soma = 0.0;

    for(int i = 0; i < notas.length; i++){
        soma += notas[i];
    }

    return soma/notas.length;
}

public static Double buscarMaiorNota(Double[] notas){

    Double maior = notas[0];

    for(int i = 0; i < notas.length; i++){
        if(maior < notas[i]){
            maior = notas[i];
        }
    }
    return maior;
}

public static double buscarMenorNota(Double[] notas){

    Double menor = notas[0];

    for(int i = 0; i < notas.length; i++){
        if(menor > notas[i]){
            menor = notas[i];
        }
    }
    return menor;
}

public static String determinarStatus(Double media){

    if (media >= 7.0) {
        return "Aprovado";
    } else if(media >= 5.0){
        return "Recuperação";
    } else{
        return "Reprovado";
    }

}

    public static void main (String[] args) {    

    Scanner scanner = new Scanner (System.in);
    int nCursos;

        System.out.println("=== CADASTRO DE NOTAS ===");
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        do{
            System.out.print("Quantidade de disciplinas q esse aluno cursa: ");
            nCursos = scanner.nextInt();  
            
            if(nCursos <= 0) {
                System.out.println("[ERRO] Número inválido! Digite a quantidade correta de cursos.");
            }

        } while (nCursos <= 0 ); 

        Double[] notas = new Double[nCursos];

        for(int i = 0; i < nCursos; i++) {
            System.out.print(String.format("digite a nota %d: ", i + 1));
            notas[i] = scanner.nextDouble();
            while(notas[i] < 0 || notas[i] > 10){
                System.out.println("[ERRO] Nota inválida! Digite um valor entre 0 e 10.");
                notas[i] = scanner.nextDouble();
            }
        }

    System.out.println("\n--- MENU DE OPÇÕES ---");
    System.out.println("1 - Ver Média e Status do Aluno");
    System.out.println("2 - Ver Maior e Menor Nota");
    System.out.println("3 - Listar Todas as Notas");
    System.out.println("4 - Sair \n");
    System.out.print("Qual opção você deseja: ");
    int opcao = scanner.nextInt();

switch (opcao) {
    case 1:
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Média: " + calcularMedia(notas));
        System.out.println("Status: "+ determinarStatus(calcularMedia(notas)));
        break;
    case 2:
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Maior nota: " + buscarMaiorNota(notas));
        System.out.println("Menor nota: " + buscarMenorNota(notas));
        break;
    case 3:
        for(int i = 0; i < notas.length; i++) {
            System.out.println(String.format("%d° Nota: %.2f", i + 1,notas[i]));
        }
        break;
    default:
        break;
}

scanner.close();
    }
}