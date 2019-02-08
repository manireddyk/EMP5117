public class SelectionSort{
  public static void sort(int[] xs){
    for (int i=0; i<xs.length -1; i++){
      int min = i;
      for(int j=i+1; j<xs.length; j++){
        if (xs[j] < xs[min]){
          min = j;
        }
      }
      int temp= xs[min];
      xs[min]= xs[i];
      xs[i]=temp;
    }
  }
  public static void printArray(int[] array){
    System.out.println(java.util.Arrays.toString(array));
  }
  public static void main(String[] args){
    int array[];
    array = new int[]{100,34,72,56,82,67,94};
    printArray(array);
    sort(array);
    printArray(array);

    array = new int[]{1,2,2,1,2,2,1,0};
    printArray(array);
    sort(array);
    printArray(array);

    array= new int[]{1};
    printArray(array);
    sort(array);
    printArray(array);

    array= new int[]{};
    printArray(array);
    sort(array);
    printArray(array);
  }
}
