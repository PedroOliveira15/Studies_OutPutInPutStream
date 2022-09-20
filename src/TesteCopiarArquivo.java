import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        FileOutputStream fos = new FileOutputStream("lorem3.txt");
        Writer osr = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osr);

        while (linha != null){
            //System.out.println(linha);
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }
        br.close();
        bw.close();

    }
}
