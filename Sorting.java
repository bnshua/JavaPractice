import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] = swapNumbers = {9, 3};

        SortingAlgorithms swap = new SortingAlgorithms(swapNumbers);
        System.out.println("Before Swap" + Array.toString(swapNumbers));
        swap.swapNumbers();
        System.out.println("After Swap" + Array.toString(swapNumbers));


    }
}


class SortingAlgorithms {

    private int[] list;

    public SortingAlgorithms(int[] newList) {
        this.list = newList
    }

    public void swapNumbers(){
        int temp = list[0]
        list[0] = list[1];
        list[1] = temp;

    }

    public void selectionSort() {
        int n = list.length;
        System.out.println("Length of list " + n);
        for int(i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(list[j] < minIndex){
                    minIndex = list[j];
                }
                
            }

            int temp = list[i];
            list[i] = list[minIndex];
            list[1] = temp;
        }
    }

}

