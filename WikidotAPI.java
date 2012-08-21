/**
 * Wikidot API Open Source Project
 * Java API library
 * 
 * Lead developer: Shane Smith (leiger)
 * 
 * Licensed under GNU GPL v3
 **/

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class WikidotAPI
{
	private static String user;
	private static String key;
	private static final String SERVER_URL = "https://www.wikidot.com/xml-rpc-api.php";
	private static XmlRpcClientConfigImpl config;
	private static XmlRpcClient client;
	
	// Get the client
	public XmlRpcClient getClient()
	{
		return client;
	}
	
	// Constructor
	public WikidotAPI(String applicationName, String apiKey) throws MalformedURLException
	{
		// Store variables
		this.user = applicationName;
		this.key = apiKey;
		
		// Set client configuration options
		config = new XmlRpcClientConfigImpl();
		config.setServerURL(new URL(SERVER_URL));
		config.setBasicUserName(user);
		config.setBasicPassword(key);
		config.setEnabledForExtensions(true);
		config.setConnectionTimeout(10 * 1000);
		config.setReplyTimeout(30 * 1000);
		
		// Initialise the client object
		client = new XmlRpcClient();
		client.setConfig(config);
	}
}