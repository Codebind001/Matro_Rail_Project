package AutoGenerators;

import java.util.UUID;

public class AutoCreateID {
	
	public static String createID(){
		   return UUID.randomUUID().toString();
		}

}
