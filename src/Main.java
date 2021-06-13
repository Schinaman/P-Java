
import java.util.Arrays;

public class Main{

  public static void main (String[] args){
    // Matematica matematica = new Matematica();
    // matematica.imprimeIntervalos();
    // Integer[] marquinhos = new Integer[50];
    // for (int i = 0; i < 50; i++){
    //   marquinhos[i] = (int)(Math.random()*100);
    //   if (marquinhos[i]%2 == 0 && marquinhos[i]%3 == 0) System.out.println(marquinhos[i]);
    // }

    // ArraysPrimitivos arraysPrimitivos = new ArraysPrimitivos();
    // int [] array = {1,2,3,4,5};
    // arraysPrimitivos.trocaParPor3(array);
    aulaArraysPrimitivosI();



    // matematica.printaMediaInteriosPares();  //Ex1
    // matematica.printaRangeMod11(1000,1999); //Ex2
    // int [] aleat50 = matematica.arrayIntAleatoriosPositivos(50); //Ex3
    // matematica.printaMaxValorArr(aleat50); //Ex3
    // matematica.printaMinValorArr(aleat50); //Ex3
    // matematica.printaMedValorArr(aleat50); //Ex3
    // matematica.XexpY(); //Ex4
  }

  public static void aulaArraysPrimitivosI(){
// Ex1
    System.out.println("Ex1  ###");
    ArraysPrimitivos arraysPrimitivos = new ArraysPrimitivos();
    int [] array = {1,2,3,4,5};
    arraysPrimitivos.trocaParPor3(array); // Eu não consigo declarar o array diretamente no parametro?!
//Ex2
    System.out.println("Ex2  ###");
    arraysPrimitivos.resto7ouParDeArray();
//Ex3
    System.out.println("Ex3  ###");
    double[] aleat10de0a100 = arraysPrimitivos.numArrayDoubleAleatorios(10,0,100);
    System.out.println("Imprime maior indice do array: " + arraysPrimitivos.maxValorIndiceArray(aleat10de0a100));
    System.out.println("Imprime maior valor do array: " + arraysPrimitivos.maxValorArr(aleat10de0a100));
//Ex4
    System.out.println("Ex4  ###");
    double[] aleat20 = arraysPrimitivos.numArrayDoubleAleatorios(20,0,2147483646);
    int [] aleat20Int = arraysPrimitivos.converteArrDouble_Int(aleat20);
    arraysPrimitivos.exMostraPrimoEPosicoes(aleat20Int);
//Ex5
    System.out.println("Ex5  ###");
    int [] array4a = {1,3,5,7,9,11,13,15,17,19} ;
    int [] array4b = {2,4,6,8,10,12,14,16,18,20};
    arraysPrimitivos.intercalaArray(array4a, array4b);


  }

}
