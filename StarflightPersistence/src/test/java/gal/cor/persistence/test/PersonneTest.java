package gal.cor.persistence.test;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.NamingException;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonneTest {

	private static Logger log = Logger.getLogger(PersonneTest.class);
	private static Context context = null;
	
	@BeforeClass
	public static void initTests() {
		//Connexion JDBC
		///////////////////
		log.info("====================================");
		log.info("Initialisation acc�s base de données");
		log.info("====================================");
		final Properties p = new Properties();
		p.put("movieDatabase", "new://Resource?type=DataSource");
		p.put("movieDatabase.JdbcDriver", "com.mysql.jdbc.Driver");
		p.put("movieDatabase.JdbcUrl", "jdbc:mysql://192.168.:3306/yanDB");
		p.put("movieDatabase.UserName", "root");
		p.put("movieDatabase.Password", "");

		log.info("=========================");
		log.info("Creation du conteneur EJB");
		log.info("=========================");

		//context = EJBContainer.createEJBContainer(p).getContext();
	}

	@AfterClass
	public static void closeTests() throws NamingException {

		log.info("===========================");
		log.info("Fermeture du conteneur EJB");
		log.info("===========================");

		//context.close();
	}
	
	@Test
	public void testPersonne() {
		log.info("Execution du test");
		//fail("Not yet implemented");
		/*
		try {
			EJBContainer ec = EJBContainer.createEJBContainer(); 
			context = ec.getContext();
			// JNDI
			// java:global[/application name]/module name/enterprise bean name[/interface name]
			// crud : create,read,update,delete
			IDaoPersonne crudServiceBean = (IDaoPersonne) context.lookup("java:global/StarflightPersistence/" + IDaoPersonne.class.getSimpleName()); 
			assertNull(crudServiceBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
	}
}
