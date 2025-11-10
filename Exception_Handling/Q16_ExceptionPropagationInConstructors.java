import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class Q16_ExceptionPropagationInConstructors {
    static class FileHandler {
        private FileInputStream fis;
        public FileHandler(String path) throws IOException {
            File f = new File(path);
            if(!f.exists()) throw new IOException("File not found: " + path);
            fis = new FileInputStream(f);
        }
        public void close() throws IOException {
            if(fis != null) fis.close();
        }
    }

    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("nonexistent.txt");
            fh.close();
        } catch (IOException e) {
            System.out.println("Failed to create FileHandler: " + e.getMessage());
        }
    }
}
