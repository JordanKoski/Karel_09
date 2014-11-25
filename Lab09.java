/**
 * A robot moves along a row, collecting piles of beepers and placing them one square to
 * the right.
 * 
 * @author <Jordan Koski>
 * @version <>
 *
 */

import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane;

public class Lab09 {
	 
	 public static void main(String[] jordans) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+"lab09"+".map");
		 Display.setSize(10, 10);
		 Athlete jordan = new Athlete(1, 1, Display.EAST, 0);

       int count1 = 0;
       int count2 = 0;
       int count3 = 0;
       int count4 = 0;
       int count5 = 0;
       int count6 = 0;
       
       while (jordan.nextToABeeper()) {
       jordan.pickBeeper();
       count1++;
       }
       jordan.move();
       
       while (jordan.nextToABeeper()) {
       jordan.pickBeeper();
       count2++;
       }

       if (jordan.hasBeepers()){
         for (int k = 0; k < count1; count1--){
            jordan.putBeeper();
       }
       }
       jordan.move();
       
       while (jordan.nextToABeeper()) {
       jordan.pickBeeper();
       count3++;
       }

       if (jordan.hasBeepers()){
         for (int t = 0; t < count2; count2--){
            jordan.putBeeper();
       }     
    } 
       jordan.move();
      
       while (jordan.nextToABeeper()) {
       jordan.pickBeeper();
       count4++;
       }
       
      
       if (jordan.hasBeepers()){
         for (int t = 0; t < count3; count3--){
            jordan.putBeeper();
      }
      jordan.move();
      
      while (jordan.nextToABeeper()) {
       jordan.pickBeeper();
       count5++;
       }
       
      
       if (jordan.hasBeepers()){
         for (int t = 0; t < count4; count4--){
            jordan.putBeeper();
      }
}
      jordan.move();
      
     while (jordan.nextToABeeper()) {
       jordan.pickBeeper();
       count6++;
       }
       
      
       if (jordan.hasBeepers()){
         for (int t = 0; t < count5; count5--){
            jordan.putBeeper();
}
}
      jordan.move();
      
      if (jordan.hasBeepers()){
        for (int t = 0; t < count6; count6--){
            jordan.putBeeper();
}
}

    }
}
 }
   