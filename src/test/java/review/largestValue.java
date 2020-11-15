package review;

public class largestValue {

    public static void main(String[] args) {

        int [] numbers ={28,33,44,12,20,11,4,5,80};
        int largets = numbers[0];
        int condition=numbers.length-1;

        for (int i=1; i<=condition;i++){
            if(largets<numbers[i]){
                largets=numbers[i];
            }
            System.out.println("The largest value at this time is: "+ largets);
        }

        System.out.println("The largest value in our array is: "+ largets);

    }
}
