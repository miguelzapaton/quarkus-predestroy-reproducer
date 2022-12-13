import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Named("sessionApplicationInvalidator")
@ApplicationScoped
public class SessionApplicationInvalidator {
	
	@Inject
	private HttpServletRequest httpServletRequest;
	
	public void invalidateSession() {
		
		System.out.println("4 INVALIDATE SESSION START");
		
		final HttpSession httpSession = httpServletRequest.getSession();
		
		httpSession.invalidate();
		
		System.out.println("4 INVALIDATE SESSION END");
		
	}
	
}
