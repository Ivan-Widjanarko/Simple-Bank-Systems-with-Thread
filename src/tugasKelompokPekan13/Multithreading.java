package tugasKelompokPekan13;

/**
 * Class untuk Multithreading (Main Class)
 *
 * @author Haidar Hanif (1806148694)
 * @author Ivan Widjanarko (1806148706)
 * @author M. As'ad Muyassir (1806199953)
 * @version 01-06-2021
 */
public class Multithreading {
	
	/**
	* method untuk entry point (main method)
	* @param args Input Argumen
	*/
	public static void main(String args[]) {
		SavingsAccount savingsAccountObject = new SavingsAccount();
		
        Thread1 t1 = new Thread1(savingsAccountObject);
		Thread2 t2 = new Thread2(savingsAccountObject);
		
		t1.start();
		t2.start();
	}
}