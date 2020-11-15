package abstraction_example;

public class RunTest {

    public static void main(String[] args){
        TOne tOneStudent = new TOne();
        TTwo tTwoStudent = new TTwo();
        TThree tThreeStudent = new TThree();
        tOneStudent.Read();
        tTwoStudent.Read();
        tThreeStudent.Read();

        Child child= new Child();

    }
}
