package tugasKelompokPekan13;

/**
 * Class untuk Thread2 sebagai Thread Kedua dengan meng-extend Thread
 *
 * @author Haidar Hanif (1806148694)
 * @author Ivan Widjanarko (1806148706)
 * @author M. As'ad Muyassir (1806199953)
 * @version 01-06-2021
 */
public class Thread2 extends Thread {
    SavingsAccount savingsAccountObject;

    /**
     * Constructor untuk Thread2
     * @param savingsAccountObject Object SavingsAccount
     */
    Thread2(SavingsAccount savingsAccountObject) {
        this.savingsAccountObject = savingsAccountObject;
    }

    /**
     * method untuk Run Thread2
     */
    public void run() {
        savingsAccountObject.withdraw(2000);
        savingsAccountObject.withdraw(2000);
        savingsAccountObject.withdraw(2000);
        savingsAccountObject.withdraw(2000);
        savingsAccountObject.withdraw(2000);
    }
}
