public class FindMaximal<T extends Number> {
    T[] arr;

    FindMaximal(T a[]) {
        arr = a;
    }

    void findMaximal(int ind1, int ind2) {
        int ans = 0;
        for (int i = ind1; i <= ind2; i++) {
            if ( (int)arr[i] > ans) {
                ans = (int)arr[i];
            }
        }

        System.out.println("======================================================================");
        System.out.println("Maximal Element in the range " + ind1 + " to " + ind2 + " is " + ans);
        System.out.println("======================================================================");

    }
}
