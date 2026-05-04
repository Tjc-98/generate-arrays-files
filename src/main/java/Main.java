/**
 * Generate random arrays and save them to a file.
 */

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        // Generate random Array and save it to a file.
        int arraySize = 1000000;
        int[] array = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            array[i] = i;
        }
        writeArrayToFile(array, "input1000000BestCase.txt");
        System.out.println("Done!");

        // Read the data and put it in an array.
        int[] array = new int[1000000];
        readArray(array,"input1000000BestCase.txt");
        System.out.println("");
        */
    }

    /**
     * Save the array to a txt file.
     * @param array the array that wanted to be saved.
     * @param file the file name.
     */
    static void writeArrayToFile(int[] array, String file) {
        try{
            OutputStream writer = new FileOutputStream(new File(file));
            String arrString = "";
            for(int i = 0; i < array.length; i++) {
                arrString += array[i];
                if(i != array.length -1) {
                    arrString += ",";
                }
                if(i % 10 == 0 && i != 0) {
                    arrString += "\n";
                    writer.write(arrString.getBytes(), 0, arrString.length());
                    arrString = "";
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Generate a random array.
     * @param maxIntegerSize the max size of the integers that will be generated.
     * @param arraySize the max size of the array.
     * @return the random generated array.
     */
    static int[] generateArray(int maxIntegerSize, int arraySize) {
        int[] generateArray = new int[arraySize];
        Random random = new Random();
        for(int i = 0; i < arraySize; i++) {
            generateArray[i] = random.nextInt(maxIntegerSize + 1);
        }
        return generateArray;
    }

    /**
     * Be able to read array information from a txt file.
     * @param array the array in which the information will be saved to.
     * @param file the file which holds the information.
     */
    static void readArray(int[] array, String file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                for(String num : line.split(",")) {
                    array[i] = Integer.parseInt(num);
                    i++;
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
