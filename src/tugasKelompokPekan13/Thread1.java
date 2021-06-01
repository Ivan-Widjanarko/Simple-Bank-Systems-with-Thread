package tugasKelompokPekan13;

/**
 * Class untuk Thread1 sebagai Thread Pertama dengan meng-extend Thread
 *
 * @author Haidar Hanif (1806148694)
 * @author Ivan Widjanarko (1806148706)
 * @author M. As'ad Muyassir (1806199953)
 * @version 01-06-2021
 */
public class Thread1 extends Thread {
    SavingsAccount savingsAccountObject;

    /**
     * Constructor untuk Thread1
     * @param savingsAccountObject Object SavingsAccount
     */
    Thread1(SavingsAccount savingsAccountObject) {
        this.savingsAccountObject = savingsAccountObject;
    }

    /**
     * method untuk Run Thread1
     */
    public void run() {
        savingsAccountObject.deposit(20000);
        savingsAccountObject.deposit(20000);
        savingsAccountObject.deposit(20000);
        savingsAccountObject.deposit(20000);
    }
}
