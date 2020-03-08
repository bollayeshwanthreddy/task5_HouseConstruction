package Houseconstruction_log4j;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class House_main {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		Logger logger=LogManager.getLogger(House_main.class);
	/*	int type = 0;
		if (!(material =="Standard"))
			 type=1;
		else if (!(material =="AboveStandard"))
			 type=2;
		else if (!(material =="HighStandard"))
			 type=3;
		else if (!(material =="HighStandardandAutomated"))
			 type=4; */
		while (true) {		
			
			logger.info("Enter area of house");
			int house_area=s.nextInt();
			double cost;
			logger.info("Enter material type (integer)");
			logger.info("\n1.Standard\n2.AboveStandard\n3.HighStandard\n4.HighStandardandAutomated\n5.exit\n");
			int material=s.nextInt();
			House h=new House(material);
			
			switch(material) {
			
			case 1: cost=1200*house_area;
					logger.info("cost of house construction :"+cost);
					break;
			case 2: cost=1500*house_area;
					logger.info("cost of house construction :"+cost);
					break;
			
			case 3: cost=1800*house_area;
					logger.info("cost of house construction :"+cost);
					break;
			
			case 4: cost=2500*house_area;
					logger.info("cost of house construction :"+cost);
					break;
			case 5: return;	
			default: logger.info("No such material \n enter again");
					 break ;
			}
		}
		
		
	}
}