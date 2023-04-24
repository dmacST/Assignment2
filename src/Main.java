import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;




public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();

    }

public static void readFile() throws FileNotFoundException {
        List<Integer> intFile = new ArrayList<Integer>();

        Scanner scanner = new Scanner(new FileReader("numbers.txt"));
        int numbers;
        while (scanner.hasNextLine())   {
            numbers = Integer.parseInt(scanner.next());
            intFile.add(numbers);
        }
        Integer[] array = intFile.toArray(new Integer[0]);

        for (Integer eachInt : array){
            System.out.println(eachInt);
        }



}
}