//package com.codewithmosh;
public class Merge {
  public static void main(String[] args) 
  {
    int[] array={99,55,1,2,10,22,100};
    sort(array);

    for(int a:array){
      System.out.print(a+" ");
    }
}
  
  
  public static void sort(int[] array) {
    if (array.length < 2)
      return;

    var middle = array.length / 2;

    int[] left = new int[middle];
    for (var i = 0; i < middle; i++)
      left[i] = array[i];

    int[] right = new int[array.length - middle];
    for (var i = middle; i < array.length; i++)
      right[i - middle] = array[i];

    sort(left);
    sort(right);

    merge(left, right, array);
    
  }

  private static void merge(int[] left, int[] right, int[] result) {
    int i = 0, j = 0, k = 0;

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j])
        result[k++] = left[i++];
      else
        result[k++] = right[j++];
    }

    while (i < left.length)
      result[k++] = left[i++];

    while (j < right.length)
      result[k++] = right[j++];
  }
}
