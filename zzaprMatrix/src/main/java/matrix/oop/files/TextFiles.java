package matrix.oop.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import matrix.oop.Matrix;

public class TextFiles {
    
    public static void saveMatrix(Matrix m, String fileName) {
        Path path = Paths.get(fileName);
        
        try (BufferedWriter bw = Files.newBufferedWriter(path)) {
            
        } catch (IOException ex) {
            System.err.println("IO exception");
        }
    }
}
