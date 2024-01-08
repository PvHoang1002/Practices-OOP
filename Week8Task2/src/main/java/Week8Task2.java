import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Week8Task2 {
    /**
     * Null Pointer Exception example.
     */
    public void nullPointerEx() throws NullPointerException {
        String str = null;
        System.out.println(str.length());
    }

    /**
     * Null Pointer Exception test.
     */
    public String nullPointerExTest() {
        String error = "Không có lỗi";
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            error = "Lỗi Null Pointer";
        }
        return error;
    }

    /**
     * Array Index Out of Bounds Exception example.
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[3];
        arr[3] = 19;
        System.out.println(arr[3]);
    }

    /**
     * Array Index Out of Bounds Exception test.
     */
    public String arrayIndexOutOfBoundsExTest() {
        String error = "Không có lỗi";
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            error = "Lỗi Array Index Out of Bounds";
        }
        return error;
    }

    /**
     * Arithmetic Exception example.
     */
    public void arithmeticEx() throws ArithmeticException {
        int a = 19;
        int b = 0;
        System.out.println(a / b);
    }

    /**
     * Arithmetic Exception test.
     */
    public String arithmeticExTest() {
        String error = "Không có lỗi";
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            error = "Lỗi Arithmetic";
        }
        return error;
    }

    /**
     * File Not Found Exception example.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        String filePath = "filePath.txt";
        FileInputStream file = new FileInputStream(filePath);
        Scanner scanner = new Scanner(file);
    }

    /**
     * File Not Found Exception test.
     */
    public String fileNotFoundExTest() {
        String error = "Không có lỗi";
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            error = "Lỗi File Not Found";
        }
        return error;
    }

    /**
     * IO Exception example.
     */
    public void ioEx() throws IOException {
        fileNotFoundEx();
    }

    /**
     * IO Exception test.
     */
    public String ioExTest() {
        String error = "Không có lỗi";
        try {
            ioEx();
        } catch (IOException e) {
            error = "Lỗi IO";
        }
        return error;
    }
}
