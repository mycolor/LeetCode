
public class Solution{

    public static void main(String[] args){
        int[] a = new int[]{7,4,3,2,1,5,6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a){

        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    exch(a,j,j-1);
                }
            }
        }
    }

    public static void exch(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}