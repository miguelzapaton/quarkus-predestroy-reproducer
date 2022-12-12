import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("sessionManager")
@SessionScoped
public class SessionManager {
	
	@Inject
	private MySessionBean mySessionBean;
	
	public String hello() {
		
		return "hello world";
		
	}
	
	
	@PreDestroy
	public void preDestroyTest() {
		
		System.out.println("SessionManager PREDESTROY START");
		
		mySessionBean.helloMy();
		
		System.out.println("SessionManager PREDESTROY END");
		
	}
	

}
