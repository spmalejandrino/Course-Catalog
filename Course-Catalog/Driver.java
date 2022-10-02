import java.awt.*;           //Use the Abstract Window Toolkit
import java.awt.event.*;     //Use the Abstract Window Toolkit event processing
import javax.swing.*;        //To use SWING interface components such as frames


/**
 * The Driver class presents a simple GUI that can be used to search courses. The
 * GUI allows the user to specify a department to use as a search criterion.
 * 
 * @author Computer Science Department 
 * @version November, 2007
 */
public class Driver implements ActionListener
{   private CourseCatalog catalog = new CourseCatalog();
    private JFrame frame = new JFrame("DePauw SOC Searcher");
    private JButton searchButton = new JButton("SEARCH");
    private JComboBox departmentCombo = new JComboBox();
    private JComboBox competencyCombo = new JComboBox();   
   
    
  
    /*
     * The constructor for the Driver class creates the GUI and calls
     * a method to fill the department combo box with initial values. It
     * then displays this comboBox on the pane.
     */
    public Driver()
    {         
       //By default a gridlayout has one row
       frame.getContentPane().setLayout(new GridLayout()); 
       fillDepartmentCombo();
       
       frame.getContentPane().setLayout(new GridLayout());
       fillCompetencyCombo();
      
       
       searchButton.addActionListener(this);      //Add the search button's action    
       frame.getContentPane().add(searchButton);
       frame.pack();
       frame.setVisible(true);
   }
      
    
    /*
     * This method fills the departmentCombo box with initial values. 
     */
    public void fillDepartmentCombo()
    { 
      departmentCombo.addItem("ALL");
      departmentCombo.addItem("ARTH");
      departmentCombo.addItem("COMM");
      departmentCombo.addItem("CSC");
      departmentCombo.addItem("HIST");
      departmentCombo.addItem("MATH");
      departmentCombo.addItem("PE");   
      departmentCombo.addItem("SOC");
      departmentCombo.addItem("SPAN");
    
     
      frame.getContentPane().add(departmentCombo);
    }
    
    public void fillCompetencyCombo(){
        competencyCombo.addItem("W");
        competencyCombo.addItem("Q");
        competencyCombo.addItem("S");
        
        frame.getContentPane().add(competencyCombo);
    }
   
    
    /*
     * This method is called when the user clicks on a button in the Interface.
     * The method checks to see if the user clicked on the SEARCH button.  If so,
     * it prints the department that is currently selected by the Department
     * Combo box.
     */
    public void actionPerformed(ActionEvent event)
    { 
      if (event.getSource().equals(searchButton))
      {   
          String selectedDept = departmentCombo.getSelectedItem().toString();
          String competency = competencyCombo.getSelectedItem().toString();
         
          System.out.println ("Selected department is: " + selectedDept);
          catalog.printSelectedCourses(selectedDept, competency);
      }
    } 
    
}
