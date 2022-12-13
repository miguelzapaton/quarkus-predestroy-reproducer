import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Named("sessionManager")
@SessionScoped
public class SessionManager {
	
	@Inject
	private HttpServletRequest httpServletRequest;
	
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
	
	
	public void invalidateSession() {
		
		System.out.println("2 INVALIDATE SESSION START");
		
		final HttpSession httpSession = httpServletRequest.getSession();
		
		httpSession.invalidate();
		
		System.out.println("2 INVALIDATE SESSION END");
		
	}
	

}
