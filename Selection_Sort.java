// Java program to implement Selection Sort to sort the given Arrray


public class Selection_Sort {
    public static void main(String args[]){
        int arr[] = {10,34,56,87,43};
        int temp,min;
        for(int i=0;i<arr.length;i++){

             min =i;
            for(int j=i+1;j<arr.length;j++){
                    if(arr[j] < arr[i]){
                        min = j;
                    
                
                        temp =  arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }      
            
            
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
