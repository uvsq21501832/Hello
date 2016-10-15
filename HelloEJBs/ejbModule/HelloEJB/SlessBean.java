package HelloEJB;
import javax.ejb.Stateless;

@Stateless(mappedName="SlessBean")
public class SlessBean implements Sless {

    public String hello() {
        return "hello, world!\n";
    }

}
