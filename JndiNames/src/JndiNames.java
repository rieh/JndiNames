import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;


public class JndiNames {
public String listToLogJndiName() throws NamingException {
	String jndiName = "";
	InitialContext ctx = new InitialContext();
	NamingEnumeration<NameClassPair> list = ctx.list("jdbc");
	while (list.hasMore()) {
		NameClassPair next = list.next();
		System.out.println("*************************");
		System.out.println(next.getClassName());
		System.out.println(next.getName());
		
		System.out.println("*************************");
	}
	
	
	return jndiName;
}


}
