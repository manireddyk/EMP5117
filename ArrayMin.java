public class ArrayMin{
  public static int min(int[] array){
    int min = array[0];
    for(int i=1; i<array.length; i++){
      if(array[i] < min){
        min = array[i];
      }
    }
    return min;
}
    public static void main(String[] args){

    int[] firstArray= new int[]{1,2,3,4,5,6,7,8,9,10};
    System.out.println("Min of firstArray: " + min(firstArray));

    int[] secondArray= new int[]{10,9,8,7,6,5,4,3,2,1};
    System.out.println("Min of secondArray: " + min(secondArray));

    int[] thirdArray = new int[]{10};
    System.out.println("Min of thirdArray: " + min(thirdArray));

    int[] fourthArray = new int[]{10,9,10};
    System.out.println("Min of fourthArray: " + min(fourthArray));

    }
  }
