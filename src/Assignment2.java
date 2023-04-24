import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2 {
    public Assignment2() throws FileNotFoundException, InvalidNumberException {
    }


    public Integer[] readFile() throws FileNotFoundException, InvalidNumberException {
        Integer[] array;
        try {
            List<Integer> intFile = new ArrayList<Integer>();

            Scanner scanner = new Scanner(new FileReader("numbers.txt"));
            int numbers;
            while (intFile.size() < 10) {
                numbers = Integer.parseInt(scanner.next());
                intFile.add(numbers);
            }

            array = intFile.toArray(new Integer[0]);

        } catch (Exception e) {
            throw new InvalidNumberException("Error");

        }
        return array;
    }

    Integer[] sumArray = Assignment2.this.readFile();


    public int sum(){
        int sum = 0;
        int i;

        for (i = 0; i < sumArray.length; i++)
            sum += sumArray[i];
        return sum;
    }



}
