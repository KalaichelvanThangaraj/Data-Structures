import java.util.*;
public class  dupilcate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers:");
        int a=sc.nextInt();
        int arr []=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                    return;
                }
            }
        }

    }
    
}


 /*output

Enter the numbers:1 2 3 2 5 4 2
2*/