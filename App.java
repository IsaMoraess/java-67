import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). */
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite as cordenadas X,Y:");
    double X = sc.nextDouble();
    double Y = sc.nextDouble();

    while(X != 0 && Y != 0){
        if(X > 0 && Y > 0){
            System.out.println("Quadrante 1");
        }else if(X < 0 && Y > 0){
            System.out.println("Quadrante 2");
        }else if(X < 0 && Y < 0){
            System.out.println("Quadrante 3");
        }else{
            System.out.println("Quadrante 4");
        }
        X = sc.nextDouble();
        Y = sc.nextDouble();
    }
    }
}
