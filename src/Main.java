import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, InvalidNumberException {
       Assignment2 obj = new Assignment2();
       Integer[] result = obj.readFile();
       int sum = obj.sum();
       System.out.println(Arrays.toString(result));
       System.out.println(sum);




    }




}


