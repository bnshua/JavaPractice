public class Arrays1 {
    public static void main(String args[]) {


        int[] data = {1, 2, 4, 6, 7, 9, 10};
        double midpoint = (array.length)/2;
        double median = 0;
        if (data.length % 2 == 1){
            median = data[(int) midpoint];
        } else {
            midnum1 = data[(midpoint - 1)];
            midnum2 = data[midpoint];
            median = (midnum1 + midnum2)/2;
        }
        System.out.println("Median: "  + median);
    }
}


