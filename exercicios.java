import java.util.Scanner;
public class exercicios {
    
    public static void main(String[] args){
        exercicio01();
    }
    /*01. Solicite um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres. */
    public static void exercicio01(){
        int sexo, qtMulheres=0, qtHomens=0;
        double altura, mediaHomens=0, maior=0, menor=Double.MAX_VALUE, somaH=0;
        Scanner entrada = new Scanner (System.in);

        for(int i = 0; i<10; i++){
            System.out.println("Digite:\n1 para mulheres\n2 para homens");
            sexo = entrada.nextInt();
            System.out.println("Digite a altura");
            altura = entrada.nextDouble();
            if(sexo==1){
                qtMulheres++;
            }else if (sexo==2){
                qtHomens++;
                somaH=somaH+altura;
            } else{
                continue;
            }
            if (altura>maior){
                maior=altura;
            } else if (altura<menor){
                menor=altura;
            }
        }
        mediaHomens = (somaH/qtHomens);
        System.out.println("A maior altura do grupo é "+maior);
        System.out.println("A menor altura do grupo é "+menor);
        System.out.println("A média de altura dos homens é "+mediaHomens);
        System.out.println("A quantidade de mulheres no conjunto de dados é "+qtMulheres);
        entrada.close();
    }
}