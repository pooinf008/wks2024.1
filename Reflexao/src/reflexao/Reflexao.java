package reflexao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflexao {
	
	public void run() throws 
		InstantiationException, 
		IllegalAccessException, 
		IllegalArgumentException, 
		InvocationTargetException, 
		NoSuchMethodException, 
		SecurityException, ClassNotFoundException  {
		
		FTPProtocolo ftpProtocolo =  (FTPProtocolo) Class.forName("reflexao.FTPProtocolo").getDeclaredConstructor().newInstance();
		
		System.out.println(ftpProtocolo);
		
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		(new Reflexao()).run();
	}
	
}
