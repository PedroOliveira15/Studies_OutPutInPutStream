import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setNome("Pedro");
        cliente.setProfissao("Dev");
        cliente.setCpf("123456789");


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();

//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//        Cliente nome = (String) ois.readObject();
//        ois.close();
//        System.out.println(cliente.getNome());
    }
}
