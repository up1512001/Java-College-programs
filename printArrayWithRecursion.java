import java.util.Scanner;

class abs{
    int[] arr;
    abs(int n){
        arr = new int[n];
    }
    void printArray(int n){
        if(n==0) {
            return;
        } else{
            printArray(n-1);
        }
        System.out.println("Array element:"+arr[n-1]);
    }
}

class printArrayWithRecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        abs a = new abs(size);
        for(int i=1;i<=size;i++){
            a.arr[i-1]=i;
        }
        a.printArray(size);
    }
}