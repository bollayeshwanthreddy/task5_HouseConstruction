package log4j;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class InterestImpl {
	public static void main(String [] args) {
		double p,t,r;
		Scanner s=new Scanner(System.in);
		Logger logger=LogManager.getLogger(InterestImpl.class);
		logger.info("Enter principle, time and rate of interest\n");
		p=s.nextDouble();
		t=s.nextDouble();
		r=s.nextDouble();
		Simple_Interest S=new Simple_Interest(p,t,r);
		double si=S.Interest_calculator();
		logger.info("Simple interest for p:"+p+" t: "+t+" r "+r+" is "+si);
		Compound_Interest C=new Compound_Interest(p,t,r);
		double ci=C.Interest_calculator();
		logger.info("Compound interest for p:"+p+" t: "+t+" r "+r+" is "+ci);
	}
}