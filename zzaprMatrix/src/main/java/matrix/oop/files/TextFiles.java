package matrix.oop.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import matrix.oop.Matrix;
import matrix.oop.MatrixMain;

public class TextFiles {
    
public static void saveMatrix(Matrix m, String fileName) {
        try {
            Path dataDir = Files.createDirectory(Paths.get("data"));
            Path file = dataDir.resolve(fileName);
            BufferedWriter bw = Files.newBufferedWriter(file);
            bw.write("" + m);
            bw.close();
        } catch (IOException ex) {
            System.err.println("IO exception");;
        }
    }
}
