
public class Solution{

    public static void main(String[] args){
        int[] a = new int[]{5,3,2,6,4,7,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a){

      for(int i = 0;i<a.length;i++){
        int tmp = i;
        for(int j=i+1;j<a.length;j++){
            if(a[i]>a[j]){
                tmp = j;
            }
        }
        exch(a,i,tmp);
      }
    }

    public static void exch(int[] a,int i,int j){
        int c = a[i];
        a[i] = a[j];
        a[j] = c;
    }

}