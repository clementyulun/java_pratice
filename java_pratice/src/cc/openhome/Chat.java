package cc.openhome;

public class Chat {

	public static void main(String[] args) {
		var c1 = new Client("127.0.0.1", "Clement");
		var c2 = new Client("192.168.3.5", "Bonnie");
		
		var queue = new ClientQueue();
		queue.addClientListener(new ClientListener() {
			@Override
			public void clientAdded(ClientEvent event) {
				System.out.printf("%-12s 從 %s 連線%n", event.getName(), event.getIp());
			}
			@Override
			public void clientRemoved(ClientEvent event) {
				System.out.printf("%-12s %s 離線%n", event.getIp(), event.getName());
			}
			
		});
		
		queue.addClient(c1);
		queue.addClient(c2);
		
		queue.removeClient(c1);
		queue.removeClient(c2);

	}

}
