
public class solution{

    public static void main(String[] args){
        int[] a = new int[]{5,3,2,6,4,7,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a){

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                   each(a,j,j+1);
                }
            }
        }
    }

    public static void each(int[] a,int i,int j){
        int c = a[i];
        a[i] = a[j];
        a[j] = c;
    }

}