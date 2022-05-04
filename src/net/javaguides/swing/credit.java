package net.javaguides.swing;

public class credit {

	public float cred_deposit(float amt, float cred, int times) {
		float temp = 0.0f;
		
		if(cred < 1000) {
			temp = (( amt * times ) / 1000 );
			cred += temp;
		}
		return cred;
	}
	
	public float cred_withdraw(float amt, float cred, int times) {
		float temp = 0.0f;
		
		if(cred > 0) {
			temp = (float) ((( amt * times ) / 1000 ) * 0.7);
			cred -= temp;
		}
		return cred;
	}
	
}
