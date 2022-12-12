import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("mySessionBean")
@SessionScoped
public class MySessionBean {
	
	public String helloMy() {
		
		return "hello my";
		
	}

}
