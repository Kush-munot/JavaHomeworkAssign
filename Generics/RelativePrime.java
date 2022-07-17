public class RelativePrime<T extends Number> {
    T arr[];

    RelativePrime(T a[]) {
        arr = a;
    }

    public int gcd(T n1, T n2) {
        int gcd = 0;
        for (int i = 1; i <= (int) n1 && i <= (int) n2; ++i) {
            if ((int) n1 % i == 0 && (int) n2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

    void findFirst(T list[], int begin, int end) {
        int i = 0, j = 0, flag = 0;
        for (i = begin; i <= end; i++) {
            int c = 0;
            for (j = 0; j < list.length; j++) {
                if (gcd(arr[i], list[j]) == 1) {
                    c++;
                }
                if (c == list.length) {
                    System.out.println("The Relative Prime Number is - " + arr[j+1]);
                    flag = -1;
                    break;
                }
            }
            if(flag == -1){
                break;
            }
        }
    }
}
