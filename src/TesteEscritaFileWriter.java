import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

//        FileOutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osr = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osr);
        FileWriter fw = new FileWriter("lorem2.txt");

        // BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        fw.write("\r\n");
        fw.write(System.lineSeparator());
        fw.write("Escreveu tudim mesmo em");

        fw.close();

    }
}
