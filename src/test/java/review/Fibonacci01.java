package review;

public class Fibonacci01 {

    public static void main(String[] args){

        int first=0;
        int second=1;

        for(int counter=1; counter<=10;counter++){
            //print(first);
            System.out.print(first+" ");
            int third =first+second;
            first=second;
            second=third;
        }

    }
}
