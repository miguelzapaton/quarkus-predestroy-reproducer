import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Named("sessionInvalidator")
@RequestScoped
public class SessionInvalidator {
	
	@Inject
	private HttpServletRequest httpServletRequest;
	
	public void invalidateSession() {
		
		System.out.println("1 INVALIDATE SESSION START");
		
		final HttpSession httpSession = httpServletRequest.getSession();
		
		httpSession.invalidate();
		
		System.out.println("1 INVALIDATE SESSION END");
		
	}
	
}
