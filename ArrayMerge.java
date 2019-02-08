public class ArrayMerge{
  public static int [] mergeArray(int[] first, int[] second){
    int[] combined = new int[first.length + second.length];
    int mani=0;
      for(int i=0;i<first.length;i++){
        combined[i]= first[i];
        mani++;
      }
      for(int j=0; j<second.length;j++){
        combined[mani++] =second[j];

      }
      return combined;
    }

  public static void printArray(int[] array){
    System.out.println(java.util.Arrays.toString(array));
  }
  public static void main(String[] args){
    int[] firstArray = new int []{1,2,3};
    int[] secondArray = new int []{4,5,6,7};

    printArray(firstArray);
    printArray(secondArray);
    printArray(mergeArray(firstArray,secondArray));

    firstArray = new int[]{1};
    secondArray = new int[]{};

    printArray(firstArray);
    printArray(secondArray);
    printArray(mergeArray(firstArray,secondArray));

    firstArray = new int[]{};
    secondArray = new int[]{4};

    printArray(firstArray);
    printArray(secondArray);
    printArray(mergeArray(firstArray,secondArray));
  }
}
