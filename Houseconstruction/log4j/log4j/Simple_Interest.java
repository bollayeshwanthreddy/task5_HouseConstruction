package log4j;

public class Simple_Interest extends Abstract_Interest {
		double p,t,r;
		Simple_Interest(double p,double t,double r){
			this.p=p;
			this.t=t;
			this.r=r;
		}
		
		double Interest_calculator() {
			double Si;
			Si=(p*t*r)/100;
			return Si;
		}
}