// File Name GreetingClient.java
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class socksClientMain extends Thread{
	/*
	 *  APCS thigny for something or the other yep >.<
	 * 
	 */
	//Socket Vars
	static Socket server;
	//IO
	static OutputStream outToServer;
	static PrintWriter out;
	static InputStream inFromServer;
	static BufferedReader in;
	//Other
	static boolean running = false;
	static Scanner reader = new Scanner(System.in);
	static String userTag = "";
	public static void main(String [] args) 
	{
		try 
		{
			//Startup
			startUpClient();
	        receive(in);
	        startUpChat();
	        close();
	    } 
		catch (IOException e) 
		{
	         e.printStackTrace();
	    } 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void startUpChat() throws InterruptedException, IOException
	{
	    //Chat system  
	    BufferedReader messagereader = new BufferedReader (new InputStreamReader(System.in));
	    String message = "";
	    while(running)
	    {
	    	//Sending messages
	      	message = messagereader.readLine();
		    //Exit
		    if(message.toLowerCase().equals("!"))
		    {
		        out.println("!");
			    break;
		    }
		    //Checks if empty, so you can't heccin spam the place with empty lines
	        if(!message.trim().equals(""))
	        {
	        	out.println(message);
	        }
	     		
	    }
	}
	private static void startUpClient() throws UnknownHostException, IOException
	{
		InetAddress serverIp;
		int port;
		//Takes server info
		System.out.println("Welcome to -_-'s garbo console chat thing for mostly allowed APCS stuff, probably! Beware of shitty text formatting! Enter server ip and port uwu: ");
		serverIp = InetAddress.getByName(reader.next());
		port = reader.nextInt();
		System.out.println("Input your user tag(ign!), no spaces tho so use _ if u wanna be cool");
		userTag = reader.next().trim();
		//creating socket
		server = new Socket();
	    //server.bind(new InetSocketAddress(port));
	    System.out.println("Connecting to " + serverIp + " on port " + port);
		//Connecting to server socket
	    server.connect(new InetSocketAddress(serverIp,port));
	    System.out.println("Just connected to " + server.getRemoteSocketAddress() + ". Type ! to close program");
	    //Sets up I/O streams
	    //Output(Writing to server)
	    outToServer = server.getOutputStream();
	    out = new PrintWriter(outToServer,true);
	    //Input(Reading from server)
	    inFromServer = server.getInputStream();
	    in = new BufferedReader(new InputStreamReader(inFromServer));  
	    //Sends client info
	    out.println(userTag);
	    //Startup var
	    running = true;
   }
   private static void close()
   {
	   running = false;
	   reader.close();
	   try 
	   {
		   server.close();
	   }
	   catch (IOException e) 
	   {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
	   }
	   System.out.println("You have disconnected!");
	   System.exit(1);
   }
   private static void receive(BufferedReader in)
   {
	   Runnable rRunnable =
	   new Runnable()
	   {
			public void run()
			{
				
			     while(running)
			     {
			        	//Receiving\
			         	try {
			         		if(in.ready() && running)
			         		{
				         		String rec = in.readLine();
				         		//Checks if server closed
				         		if(rec.equals("!"))
				         		{
				         			System.out.println("Server closed!");
				         			running = false;
				         			//Prevents connection resets(please make a better disconnect method jackass
				         			Thread.sleep(100);
				         			
				         			System.exit(1);
				         			return;
				         		}
				         		//So you dont message yourself, you loner
				         		if(!rec.startsWith(userTag))
				         			System.out.println(rec);
							}
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			         	try {
							Thread.sleep(75);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			     }
			}
	   };
	   Thread thread = new Thread(rRunnable);
	   thread.start();
		return;	    
   }
}