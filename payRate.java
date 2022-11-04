import javax.swing.JOptionPane;
public class payRate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input, name;
        
       
         
        
                
                
        
        name = JOptionPane.showInputDialog("Enter your name:");
        
       
        
         input = JOptionPane.showInputDialog("Enter your pay Rate:");
        double payRate = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter your hours worked:");
        int hours = Integer.parseInt(input);
         
        double grossPay = payRate * hours;
         
        JOptionPane.showMessageDialog(null, "Hello,"+ name);
        JOptionPane.showMessageDialog(null, "Your gross Pay is," + grossPay);
        
    }
    
}
