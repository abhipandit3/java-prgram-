public class maxvalue {
    public static void main(String[] args) {
        int[] arr = {11,32,45,32,77};
        System.out.println(max(arr));
    }
    public static int max(int[] arr) {
        int maxvalue=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>maxvalue) {
                maxvalue=arr[i];
            }
        }
        return maxvalue;
    }    
}
