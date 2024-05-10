import java.util.ArrayList;
 public class duplicate {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int freq=0;
        ArrayList<Integer> a = new ArrayList<>();
        int duplicate[] = new int[n];
        for(int i=0;i<=arr.length-1;i++){
            if(duplicate[arr[i]]==0){
                duplicate[arr[i]] = 1;
            }
            else{
            freq = duplicate[arr[i]];
            duplicate[arr[i]]= ++freq;
            }
        }
        int flag = 0;
        for(int i=0;i<=duplicate.length-1;i++){
            if(duplicate[i]>1){
                a.add(i);
                flag = 1;
            }
        }
        
        if(flag==0){
            a.add(-1);
            return a;
        }
        return a;
        
        
        
    }
    public static void main(String[] args) {
        
int array[] = {1,2,2,3,4,5};

System.out.println(duplicates(array, array.length));









    }
}
   

