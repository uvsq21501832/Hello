import javax.naming.InitialContext;

import HelloEJB.Sless;

public class SlessJavaClient {

    public static void main(String args[]) {

        try {

            InitialContext ic = new InitialContext();
            Sless sless = (Sless) ic.lookup("SlessBean");
            System.out.println("Sless bean says : " + sless.hello());

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
