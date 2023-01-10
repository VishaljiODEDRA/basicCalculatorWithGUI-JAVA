

public class Calculator {
	private double res=0;
		
	
	public double getRes() {
		return res;
	}


	public void setRes(int res) {
		this.res = res;
	}


	public void addition (double num1,double num2){
		res = num1+num2;
	}
	public void substracton(double num1,double num2) {
		res = num1-num2;
	}
	public void multiplication(double num1,double num2) {
		res = num1*num2;
	}
	public void division(double num1,double num2) {
		res = num1/num2;
	}
}