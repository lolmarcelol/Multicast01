import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Remetente {

	public static void main(String [] args) throws IOException{
		MulticastSocket remSocket = new MulticastSocket();
		byte[] send;
		String message = "hello group";
		send = message.getBytes();
		String group = "224.0.0.1";
		DatagramPacket pacote = new DatagramPacket(send, send.length,InetAddress.getByName(group) , 3333);
		remSocket.send(pacote);
				
	}
	
	
}
