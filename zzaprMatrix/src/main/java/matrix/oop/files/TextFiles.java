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

public class TextFiles {
    
    public static void saveMatrix(Matrix m, String fileName) throws URISyntaxException {
               
        Path dataDir = Paths.get("data");
        
        if (!Files.exists(dataDir)) {
            try {
                Files.createDirectories(dataDir);
            } catch (IOException ex) {
                Logger.getLogger(TextFiles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Path file = dataDir.resolve(fileName);
        
                
        try (BufferedWriter bw = Files.newBufferedWriter(file)) {
            bw.write("aaa, bbb, ccc");
        } catch (IOException ex) {
            System.err.println("IO exception");
        }
    }
}
