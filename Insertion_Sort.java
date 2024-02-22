public class Insertion_Sort {
   
        public static void main(String args[]){
    
    
            int temp,j;
            int arr[] = {5,123,45,6};
    
            for(int i = 0;i<arr.length;i++){
    
                temp = arr[i];
                j = i;
    
                while(j>0 && arr[j-1] > temp){
                    arr[j] = arr[j-1];
                    j=j-1;
                }
                arr[j] = temp;
            }
            for(int i = 0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    

