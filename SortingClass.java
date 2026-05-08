public class SortingClass {
    public static void main(String[] args) {
        int[] ints = {47, 12, 83, 29, 61};
        int[] newInts;

        for (i = 0; i < ints.length - 1; i++;){
            if (ints[i] > ints[i+1]){
                newInts[i] = ints[i+1];
                newInts[i + 1] = ints[i];
            } 
        }

    }

}