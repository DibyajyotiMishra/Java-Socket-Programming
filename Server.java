import java.io.*;
import java.net.*;

class Server {
	public static void main(String[] args)
	{
		try {
			
			ServerSocket serversocket = new ServerSocket(3000);

			System.out.println("Awaiting request");

			Socket s = serversocket.accept();

			System.out.println("Client Accepted the request!!");
			PrintStream p = new PrintStream(s.getOutputStream());

			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Your Message: ");
			p.print(b.readLine());
			s.close();
			serversocket.close();
		}
		catch (IOException e) {
			System.out.println("[ERROR] : "+ e);
		}
	}
}
