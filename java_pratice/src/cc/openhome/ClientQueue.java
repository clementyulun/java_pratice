package cc.openhome;

import java.util.ArrayList;

public class ClientQueue {
	private ArrayList<Client> clients = new ArrayList<Client>();
	private ArrayList<ClientListener> listeners = new ArrayList<ClientListener>();
	
	// 註冊 listener 
	public void addClientListener(ClientListener listener) {
		listeners.add(listener);
	}
	public void addClient(Client client) {
		clients.add(client);
		// 當新的 client 加入時，通知在 listeners 裡的所有 listener
		var event = new ClientEvent(client);
		for(var i = 0; i < listeners.size(); i++) {
			var listener = (ClientListener) listeners.get(i);
			listener.clientAdded(event);
		}
	}
	public void removeClient(Client client) {
		clients.remove(client);
		var event = new ClientEvent(client);
		for(var i = 0; i < listeners.size(); i++) {
			var listener = (ClientListener)listeners.get(i);
			listener.clientRemoved(event);
		}
	}
	
}
