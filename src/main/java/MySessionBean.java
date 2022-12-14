import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Named("mySessionBean")
@SessionScoped
public class MySessionBean {
	
	@Inject
	private HttpServletRequest httpServletRequest;
	
	public String helloMy() {
		
		return "hello my";
		
	}
	
	
	public void invalidateSession() {
		
		System.out.println("3 INVALIDATE SESSION START");
		
		final HttpSession httpSession = httpServletRequest.getSession();
		
		httpSession.invalidate();
		
		System.out.println("3 INVALIDATE SESSION END");
		
	}

}
