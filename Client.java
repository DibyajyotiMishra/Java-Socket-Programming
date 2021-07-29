import java.io.*;
import java.net.*;

class Client {
	public static void main(String[] args)
	{
		try {
			Socket socket = new Socket("localhost", 3000);
			System.out.println("Connection Established");

			BufferedReader b = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("Server connected.");
			System.out.println("Server : ");
			System.out.println("Client  : " + b.readLine());
			socket.close();
		}
		catch (UnknownHostException e) {
			System.out.println("[ERROR] : " + e);
		}
		catch (IOException e) {
			System.out.println("[ERROR] : " + e);
		}
	}
}
