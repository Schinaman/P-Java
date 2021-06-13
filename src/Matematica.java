
//1-Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem pares. Termine a leitura se o usuário digitar zero (0).
//2-Escreva um algoritmo que gere o números de 1000 a 1999 e escreva aqueles que dividido por 11 dão resto igual a 5.
//3-Escreva um algoritmo que gera aleatoriamente 50 valores inteiros e positivos e encontre o maior valor, o menor valor e a média dos números.
//4-Faça um algoritmo que leia 2 valores inteiros e positivos: X e Y. O algoritmo deve calcular e escrever a função potência X Y

//LaçoII - 1 Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.
//LaçoII - 2 Um número se diz perfeito se é igual à soma de seus divisores próprios. ... Por exemplo, o número 6, seus divisores próprios são 1, 2 e 3, cuja soma é igual à 6. 1 + 2 + 3 = 6. Outro exemplo é o número 28, cujos divisores próprios são 1, 2, 4, 7 e 14, e a soma dos seus divisores próprios é 28... Construa um programa que leia um número através do usuário e verifica se o número lido é perfeito ou não.
//LaçoII - 3 Dado que o fatorial de um número é ele multiplicado por todos os seus antecessores (5! = 5 X 4 X 3 X 2 X 1 = 120). Faça um algoritmo que recebe um número digitado pelo usuário e imprime o fatorial desse número.
//LaçoII - 4 DESAFIO! Faça um algoritmo que recebe dois números positivos através do usuário e imprime todos os números primos que se encontram no intervalo entre os números digitados pelo usuário. Lembrando que números primos são aqueles que são divisíveis apenas por 1 ou por ele mesmo.



import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

//Faz sentido que estivesse na parte de aplica��o/main
public class Matematica{

  //LaçoII - 1 [0-25], [26-50], [51-75] e [76-100]
    public static boolean isBetween(int i, int minValueInclusive, int maxValueInclusive) {
      return (i >= minValueInclusive && i <= maxValueInclusive);
    }

    public void imprimeIntervalos(){
      Scanner myObj = new Scanner(System.in);
      int interv1 = 0, interv2 = 0, interv3 = 0, interv4 = 0;
      int num;

      System.out.println("imprimeIntervalos: ");

      do{
        num = myObj.nextInt();
        if      (isBetween(num, 0, 25))   {interv1++;continue;}
        else if (isBetween(num, 25, 50))  {interv2++;continue;}
        else if (isBetween(num, 51, 75))  {interv3++;continue;}
        else if (isBetween(num, 76, 100)) {interv4++;continue;}
      }while (num > 0);

      System.out.println("[00-25]: " + interv1);
      System.out.println("[26-50]: " + interv2);
      System.out.println("[51-75]: " + interv3);
      System.out.println("[76-100]: "+ interv4);
    }

//LaçoII - 2
  public boolean isNumPerfeito(){
    Scanner myObj = new Scanner(System.in);
    System.out.println("isNumPerfeito(): ");

    int num = myObj.nextInt();
    int aux = 0;

    for (int i = 1; i<num; i++ ){
      if (num%i==0) aux +=i;
      if (aux > num) return false;
    }

    if (aux == num) return true;
    return false;
  }

  public void imprimeIsNumPerfeito(){
    System.out.println(isNumPerfeito());
  }

//LaçoII - 3
  public float fatorial(){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Calcula fatorial de: ");

    int int1 = myObj.nextInt();
    float aux = 1;

    if (int1<0) return 0;
    for (int i = 1; i<=int1; i++) aux = aux * i;
    return aux;
  }

  public void imprimeFatorial(){
    System.out.println(fatorial());
  }

//LaçoII - 4 DESAFIO!
  public boolean isPrimo(int num){
    int cont = 0;
    // System.out.println("num = " + num);
    for (int i = 2; i <= num; i++){
      if (num%i==0) cont++;
      if (cont>1) return false;
    }
    return true;
  }

  public void imprimePrimosEntre2Ints(){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Digite 2 inteiros: imprime intervalo de numeros primos");

    int aux = 0;
    int int1 = myObj.nextInt();
    int int2 = myObj.nextInt();

    if (int2 < int1){
      aux  = int1;
      int1 = int2;
      int2 = aux;
    }

    for (int i = int1; i<=int2; i++){
      // Matematica matematica = new Matematica(); //é uma boa pratica instanciar o metodo?
      if (isPrimo(i))  System.out.println(i);
    }

  }


// Exercicio 4
  public void XexpY(){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Digite 2 inteiros para efetuar a operacao x^y");
    int x = myObj.nextInt();
    int y = myObj.nextInt();
    double resultado = 1;

    for (int i=1; i<=y; i++){
      resultado = resultado*x;
    }

    if (y==0) resultado = 1;

    System.out.println(x + "^" + y + "=" + resultado);
  }

// Exercicio 3
  public int[] arrayIntAleatoriosPositivos(int qtdeAmostras){
    Random random = new Random();
    int[] array = new int[qtdeAmostras];
    for (int i=0; i <= qtdeAmostras-1; i++){
      array[i] = random.nextInt(2147483647);
      System.out.println(array[i]);
    }
    return array;
  }

  public void printaMaxValorArr(double[] intArray){
    double max = intArray[0];
    for (int i=0; i < intArray.length; i++){
      if (intArray[i] > max) max = intArray[i];
    }
    System.out.println("Maximo:" + max);
  }

  public void printaMinValorArr(int[] intArray){
    int min = intArray[0];
    for (int i=0; i < intArray.length; i++){
      if (intArray[i] < min) min = intArray[i];
    }
    System.out.println("Minimo:" + min);
  }

  public double MedValorArr(int[] intArray){
    double soma = 0;
    for (int i=0; i < intArray.length; i++) {
      soma = soma + intArray[i];
    }
    return (soma/intArray.length);
  }


  public void printaMedValorArr(int[] intArray)
  {
    double media = MedValorArr(intArray);
    System.out.println("Media:" + media);
  }

// Exercicio 2
  public void printaRangeMod11(int rangeI, int rangeF){
    for (int i = rangeI ; i<=rangeF; i++){
      if (i%11 == 5)System.out.println(i);
    }
  }

// Exercicio 1
  public void printaMediaInteriosPares(){
    int resultado = 0;
    int contador = -1;
    int inputNum = 1;

    System.out.println("Digite numeros inteiros:");

    do{
      Scanner myObj = new Scanner(System.in);
      inputNum = myObj.nextInt();
      if ((inputNum%2) == 0) {
        resultado = resultado + inputNum;
        contador =contador +1;
      }
    }while (inputNum != 0);
    System.out.println("Media da soma dos numeros pares:" + MatematicaBasica.mediaSimples(resultado, contador) );
  }


}
