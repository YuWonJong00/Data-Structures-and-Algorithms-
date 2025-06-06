package DataStructures_Algorithms.sort;

public class BubbleSort {
    public static void main(String[] args) {
            BubbleSort m=new BubbleSort();
            int [] array={5,3,8,1,2,7};
            m.bubbleSortinf(array);
            
    }

    public void bubbleSortinf(int [] arr){
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-1-i; j++){

               if(arr[j]>arr[j+1]){
                int change=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=change;
               } 
            }
        }
        for(int value:arr){
            System.out.println(value);
        }
    }
}
