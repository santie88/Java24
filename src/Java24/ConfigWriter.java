package Java24;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConfigWriter {

    String newline = System.getProperty("line.separator");

    public ConfigWriter() {
        try {
            File file = new File("config");
            FileOutputStream fileStream = new FileOutputStream(file);
            write(fileStream, "username=santiago");
            write(fileStream, "access=admin");
            write(fileStream, "layoutLevel=5");
            fileStream.close();
        } catch (IOException ioe) {
            System.out.println("Could not write file");
        }
    }

    void write(FileOutputStream stream, String output)
            throws IOException {
        output = output + newline;
        byte[] data = output.getBytes();
        stream.write(data, 0, data.length);
    }

    public static void main(String[] arguments) {
        new ConfigWriter();
    }
}
