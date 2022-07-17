public class FindOdd<T extends Number> {
    T[] arr;
    FindOdd(T a[]){
        arr = a;
    }

    void findOdd(){
        System.out.println("=======================");
        System.out.println("Odd Numbers are");
        System.out.println("=======================");

        for(int i=0;i<arr.length;i++){
            if((arr[i].intValue())%2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
