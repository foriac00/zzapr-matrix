package matrix.oop.files;

import java.io.BufferedReader;
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
    static final String SEPARATOR = ";";
    static final String NEW_LINE = "\n";
    
    public static void saveMatrix(Matrix m, String fileName) {

        try {
            Path dataDir = Paths.get("data");
            Path file = dataDir.resolve(fileName);
            BufferedWriter bw = Files.newBufferedWriter(file);
            
            bw.write(m.getNumberOfRows() + SEPARATOR);
            bw.write(m.getNumberOfColums() + NEW_LINE);
            
            for (int i = 0; i < m.getNumberOfRows(); i++) {
                for (int j = 0; j < m.getNumberOfColums(); j++) {
                    bw.write(m.getElements(i, j) + SEPARATOR);
                }
                bw.write(NEW_LINE);
            }            
            bw.close();
        } catch (IOException ex) {
            System.err.println("IO exception");;
        }
    }

    public static Matrix readMatrix(String fileName) {
        Matrix m = null;
        try {
            Path dataDir = Paths.get("data");
            Path file = dataDir.resolve(fileName);
            BufferedReader br = Files.newBufferedReader(file);

            //String matrixName = br.readLine();
            
            String line = br.readLine(); // how many rows and columns
            String[] separatedLine = line.split(";");
            int rows = Integer.parseInt(separatedLine[0]);
            int columns = Integer.parseInt(separatedLine[1]);
            
            Matrix matrix = new Matrix(rows, columns);
            
            
            for (int i = 0; i < rows; i++) {
                line = br.readLine();
                m = matrix;
                separatedLine = line.split(";");
            }
            
            br.close();
        } catch (IOException ex) {
            System.err.println("IO exception");;
        }
        
        return m;
    }
}
