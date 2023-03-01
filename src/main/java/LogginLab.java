import java.util.logging.Level;
import java.util.logging.Logger;

import javax.lang.model.util.ElementScanner6;

public class LogginLab {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    private Integer threshold = 0;
    private boolean thresholdReached;

    public LogginLab() {
        this.threshold = 0;
    }

    public static void main(String[] args) {

        logger.log(Level.INFO, "Hello World!");
        logger.log(Level.SEVERE, "Terrible Error!");
        logger.log(Level.WARNING, "Not So Bad Error!");

        logger.log(Level.INFO, "****\n\tAt ZipCode, \n\twe don't use System.out.Println \n\tuntil we've earned the right.\n****");

    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public boolean thresholdExceeds(int limit) {
        if (this.threshold > limit) 
          return true;
        else
            return false;
    }

    public boolean thresholdReached(int limit){
        if (this.threshold < limit)
            return true;
        else
            return false;
    }

    // Write a method called thresholdReached, returns true if argument 'limit' is over the threshold.
    // use thresholdExceeds for a pattern.
    // Write a test for the method in the Test class.
}
