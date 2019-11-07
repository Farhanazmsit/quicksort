

import java.util.Arrays;

class charQuick{
    public static int partion(char a[], int lb, int up) {
        char pivote=a[lb];
        int start=lb;
        int end=up;
        char temp;
        while(start<end){
            while(start < up && a[start]<=pivote){
                start++;
            }
            while(end > lb && a[end]>pivote){
                end--;
            }
            if(start<end){
                
                temp=a[start];
                a[start]=a[end];
                a[end]=temp;
            }
        }
        temp=a[lb];
        a[lb]=a[end];
        a[end] = temp;
        return end;

        
        

    }
    public static void quicksort(char a[],int lb,int up){
        if(lb<up){
            int loc=partion(a, lb, up);
            quicksort(a, lb,loc-1);
            quicksort(a, loc+1, up);

        }
    }
    public static void main(String[] args) {
        char a[]=new char[]{'E','A','S','Y','Q','U','E','S','T','I','O','N'};
        quicksort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));

    }
    
}

