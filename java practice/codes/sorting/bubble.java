package codes.sorting;
public class bubble {

    public static void bubblesort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }

            }

            if (swap == false)
                break;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        bubblesort(arr);

        System.out.println("bubble sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }

    }
}
