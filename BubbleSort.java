import java.util.*;
class BubbleSort{
    public static void main(String args[]){
        int i,j,temp;
        int[] a={5,4,3,2,1,8};

        for(i=0;i<a.length;i++){
            for(j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    
}

Time Complexity 

Best case= 0(n)
worst case=0(n^2)


