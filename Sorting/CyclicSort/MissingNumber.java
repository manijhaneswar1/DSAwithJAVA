public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println("Missing Number in Given Array : "+missingNumInArr(arr));
    }
    static int missingNumInArr(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
