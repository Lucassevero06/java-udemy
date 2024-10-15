package TrabalhandoComArquivos.FileWriterEBufferedWriter.application;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
        String path = "/home/lucas/Área de trabalho/java-udemy/src/TrabalhandoComArquivos/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
