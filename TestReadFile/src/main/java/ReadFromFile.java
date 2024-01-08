import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFromFile {
    public static final String path = "\"C:/Users/KyThuat88/OneDrive/Máy tính/C++/LTNC/Test Read File/Dict.txt\"";

    public void readFile() {
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;

        try {
            fileInputStream = new FileInputStream(path);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFromFile.class.getName()
                    .log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadFromFile.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            try {
                bufferedReader.close();
                fileInputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadFromFile.class.getName()
                        .log(Level.SEVERE, null, ex);
            }
        }
    }
}
