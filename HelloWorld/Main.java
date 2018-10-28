package HelloWorld;

import java.io.*;
public class Main
{
    public static void main(String[] args)
    {
        String s = null;
		
		try {
			
			Process p = Runtime.getRuntime().exec("mkdir -p /home/vagrant/Hello_World_From_Nomad");
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			
			while((s = stdInput.readLine())!=null) {
				System.out.println("Standard output" + s);
			}
			
			while((s = stdError.readLine())!=null) {
				System.out.println("Standard error" + s);
			}
		
		
		} catch (IOException e) {
			System.out.println("Error from try block" + e);
			
		}
    }
}
