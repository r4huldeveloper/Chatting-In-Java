import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try
        {
            Socket s = new Socket("127.0.0.1",8080);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello server");
            dout.flush();
            dout.close();
            s.close();

        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
