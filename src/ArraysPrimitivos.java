
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;



public class ArraysPrimitivos
{

// Crie um array de inteiros com 5 posições
// e preencha-os com dados através do usuário e imprima o array na tela.
// Ao final altere todos os valores pares do array por 3 (sem intervenção do usuário)
// e imprima novamente o array.
  // Ex1:
  public void trocaParPor3(int[] array){ //Eu não consigo colocar um valor fixo no parametro para delimitar um array de tamanho fixo?!
    if (array.length != 5){ //precisei gerar esse bloco para tratar esses casos
      System.out.println("Array precisa ter 5 elementos");
      return;
    }
    System.out.println("imprimeArray: " + (array) ); //"[I@6c629d6e" é a referencia do objeto na memoria?
    for (int i=0; i<5; i++){
      if (array[i]%2 == 0) array[i]  = 3;
    }
    System.out.println("imprimeArray: " + Arrays.toString(array) );
  }

// Construa um algoritmo que forneça um array com 10 valores inteiros fornecidos pelo usuário.
// Ao final exiba todos os valores desse array e
// a quantidade de numero que são pares ou divisíveis por 7.
  public void resto7ouParDeArray(){
    System.out.println("Yo! Please type 10 inteiros:");
    int aux=0;
    int[] array = new int[10];
    Scanner myObj = new Scanner(System.in);

    for (int i = 0; i<10; i++) {
      System.out.println("I: " + i);
      array[i]=  myObj.nextInt();
      if ((array[i]%2 == 0) || (array[i]%7 == 0)) aux++;
    }
      System.out.println("Array: " + Arrays.toString(array) );
      System.out.println("Qtde de  resto7 ou Par: " + aux );


  }

// Faça um algoritmo que preencha um array com 10
// valores reais (entre 0 e 100) gerados de maneira aleatória.
// Ao final exiba o maior valor que foi gerado e o índice em que ele se encontra no array.
    public double[] numArrayDoubleAleatorios(int qtdeAmostras, int min, int max){
      double[] array = new double[qtdeAmostras];
      for (int i=0; i <= qtdeAmostras-1; i++){
        array[i] = (Math.random()*((max-min)+1))+min;
      }
      return array;
    }

    public double maxValorArr(double[] intArray){
      double max = intArray[0];
      for (int i=0; i < intArray.length; i++){
        if (intArray[i] > max) max = intArray[i];
      }
      return Math.round(max*100.0)/100.0;
    }

    public int maxValorIndiceArray(double[] array){
      double max = array[0];
      int aux = 0;
      for (int i=0; i < array.length; i++){
        if (array[i] > max)
        {
        max = array[i];
        aux = i;
        }
      }
      return aux;
    }


// Faça um programa que preencha um array com 20 números inteiros gerados de maneira aleatória,
//calcule e mostre os números primos e suas respectivas posições.
// Ao final construa um novo array resultante somente de números primos e exiba seus valores.
//  Obs.: O tamanho do array resultante deve ser de acordo com a quantidade de números primos.
  public boolean isPrimo(int num){
    int cont = 0;
    // System.out.println("num = " + num);
    for (int i = 2; i <= num; i++){
      if (num%i==0) cont++;
      if (cont>1) return false;
    }
    return true;
  }

  public int[] converteArrDouble_Int(double[] array){
    int[] arrInt = new int[array.length];
    for (int i=0; i<array.length;i++) {
      arrInt[i] = (int)(array[i]);
    }
    return arrInt;
  }

  public void exMostraPrimoEPosicoes(int[] array){
    // Matematica matematica = new Matematica();
    ArrayList<Integer> auxArr = new ArrayList<Integer>();
    int aux =0;

    for (int i=0; i<array.length;i++) {
      if (isPrimo(array[i])){
        System.out.println("Numero Primo: " + array[i] + " Posicao: " + i);
        auxArr.add(array[i]);
        aux++;
      }
    }
    if (aux == 0)System.out.println("Não há numeros primos no array");
  }


// Faça um programa que preencha dois arrays de dez elementos numéricos cada um
// (os valores devem ser atribuídos na inicialização) e
// mostre o array resultante da intercalação deles, conforme exemplo abaixo:

  public void intercalaArray(int[] arr1, int [] arr2){
    int[] arrAux = new int[(arr1.length*2)];
    for (int i=0; i<arr1.length; i++){
      arrAux[i*2] = arr1[i];
      arrAux[i*2+1] = arr2[i];
    }
    System.out.println( Arrays.toString(arrAux));
  }

}
