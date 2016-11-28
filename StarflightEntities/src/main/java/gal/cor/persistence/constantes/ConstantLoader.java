package gal.cor.persistence.constantes;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConstantLoader
{
	public static String load(String constantName, String propertiesFileName)
	{
		String result = "";
		InputStream iS = Thread.currentThread().getContextClassLoader().getResourceAsStream(propertiesFileName);
		Properties props = new Properties();
		try
		{
			props.load(iS); //pour charger en mémoire et pouvoir y accéder comme une map
			result = props.getProperty(constantName);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return result;
	}
}
