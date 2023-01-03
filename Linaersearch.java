public class Linaersearch {
    public static int search(int arr[],int n) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==n) {
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {21,34,56,87,43};
        int n=56;
       int result= search(arr,n);
        if(result==-1){
            System.out.println("Element is not found");
        }
        else {
            System.out.println("Element is found" 
             + result);
        }


    }
}
