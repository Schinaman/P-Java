


import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;


public class MatematicaBasica
{

  public static boolean between(int i, int minValueInclusive, int maxValueInclusive)
  {
    return (i >= minValueInclusive && i <= maxValueInclusive);
  }

  //LaçoII - 3
  public float fatorial()
  {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Calcula fatorial de: ");

    int int1 = myObj.nextInt();
    float aux = 1;

    if (int1<0) return 0;
    for (int i = 1; i<=int1; i++) aux = aux * i;
    return aux;
  }

  public boolean isPrimo(int num)
  {
    int cont = 0;
    // System.out.println("num = " + num);
    for (int i = 2; i <= num; i++)
    {
      if (num%i==0) cont++;
      if (cont>1) return false;
    }
    return true;
  }


    public static float mediaSimples(int soma, int espacoAmostral)
    {
      return  soma/espacoAmostral;
    }


}
