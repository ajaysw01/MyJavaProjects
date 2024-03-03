package aj.questions;

import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 8, 10, 34};
        int key = 5;
        int L = 0;
        int H = a.length - 1;
        boolean flag = false;

        while (L <= H) {
            int mid = (L + H) / 2;
            if (a[mid] == key) {
                System.out.println("found");
                flag = true;
                break;
            }
            if (a[mid] < key) {
                L = mid + 1;
            } else {
                H = mid - 1;
            }
        }
        if (!flag) {
            System.out.println("not found");
        }
    }
}
