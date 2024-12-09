import java.util.*;
class SelectionSort{
    public static void main(String args[]){
        int i,j,temp,min;
        int[] a={9,8,7,6,5,4,3,2,1};

        
        for(i=0;i<a.length;i++){
            min=i;
            for(j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(i=0;i<a.length;i++){
        System.out.println("sorted array is"+ a[i]);
        }
    }
}
