
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.lustin.trac.xmlprc.Ticket;
import org.lustin.trac.xmlprc.TrackerDynamicProxy;



public class prova1 {
XmlRpcClient rpcClient = new XmlRpcClient();
TrackerDynamicProxy rpcProxy;

public prova1(String serverURL, String username,
String
password) throws MalformedURLException {
XmlRpcClientConfigImpl rpcConf = new
XmlRpcClientConfigImpl();
rpcConf.setBasicUserName(username);
rpcConf.setBasicPassword(password);
rpcConf.setServerURL(new URL(serverURL));

rpcClient.setConfig(rpcConf);
rpcProxy = new TrackerDynamicProxy(rpcClient);
}

public void getTicket(int ticketID) {
Ticket ticket =
(Ticket)rpcProxy.newInstance(Ticket.class);
System.out.println(ticket.getTicketFields());
}



static public void main(String[] args) {
try {
prova1 tracInitializer = new
prova1("http://127.0.0.1:8081/myproject/login/xmlrpc", "luca92", "16071950");
tracInitializer.getTicket(5);
} catch (MalformedURLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}