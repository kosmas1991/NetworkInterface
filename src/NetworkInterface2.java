import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class NetworkInterface2 {

	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("192.168.1.1");
			System.out.println(address.getHostName());
			Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
			while (networkInterfaces.hasMoreElements()) {
				NetworkInterface networkinterface = networkInterfaces.nextElement();
				System.out.println("Name " + networkinterface.getDisplayName() + " is up-> "  + networkinterface.toString());
				System.out.println("Name " + networkinterface.getName());
				System.out.println();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		
	}

}
