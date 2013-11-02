
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Logger;


import org.apache.xmlrpc.client.XmlRpcClientConfig;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.lustin.trac.xmlprc.Search;

import org.lustin.trac.xmlprc.Ticket;
import org.lustin.trac.xmlprc.Ticket.Milestone;
import org.lustin.trac.xmlprc.TrackerDynamicProxy;
import org.lustin.trac.xmlprc.Wiki;
import org.python.core.PyInteger;
import org.python.util.PythonInterpreter;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;



public class prova5 {
	
	
	public static void main(String[] args) {
		
		
		XmlRpcClientConfigImpl conf = new XmlRpcClientConfigImpl();
		XmlRpcClient client = new XmlRpcClient();
		conf.setBasicUserName("luca92");
		conf.setBasicPassword("16071950");
		
		try {
			conf.setServerURL(new URL("http://127.0.0.1:8010/myproject/login/xmlrpc"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		client.setConfig(conf);
		
		TrackerDynamicProxy tdp = new TrackerDynamicProxy (client);
		Wiki wiki = (Wiki) tdp.newInstance(Wiki.class);
		Ticket ti = (Ticket) tdp.newInstance(Ticket.class);
	
		System.out.println(ti.get(1));
		
		//Hashtable h = new Hashtable(ti.get(54));
		
		// Vector theVector = ti.get(5);
		// System.out.println(theVector.get(1));
		
		
		//wiki.putPage("WikiStart", "SCRITTO DA ECLIPSE CIAO COME VA", h);
		//System.out.println(wiki.getPage("WikiStart"));
				//p.get(0).
			
		
		//System.out.println(theVector.get(0).toString())	;	
		 PythonInterpreter interp = new PythonInterpreter();
		// interp.exec("import xmlrpclib");
		 //interp.exec("server = xmlrpclib.ServerProxy(\"http://luca92:16071950@127.0.0.1:8081/myproject/login/xmlrpc\")");
		 //interp.exec("print server.wiki.getPage(\"WikiStart\")");
		 //interp.exec("for ticket in server.ticket.query(\"owner=luca92\"): multicall.ticket.get(ticket)");
		// interp.exec("print map(str, multicall())");
			
		 
		 
		 
//		 interp.exec("print server.wiki.getPage('TracAdmin')");
		  }

		
	}


