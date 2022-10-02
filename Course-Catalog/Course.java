/**
 * The Course class allows information about courses at a University to be stored and manipulated.
 * Each Course has a department, a course number and a number of credits. Each course also has 
 * a competency status field which can be W (writing), Q (quantitatve), S (speaking). If the course 
 * is not a W, Q, or S course its competency field should be X.  Each couprse also has a group field
 * which can be any of the groups 1, 2, 3, 4, 5, 6 (or 0 if the course does not carry group credit).
 * 
 * This version of the class uses Strings to store each instance field.
 * 
 * Methods are provided to construct a new course, to print a course, and to access any of the courses 
 * instance fields.
 * @author Computer Science Department 
 * @version October, 2007, Version 1.0
 */


public class Course
{   String department;    //For example "CSC"
    String courseNumber;  //For example 121
    String credit;        //For example 1.0 or 0.5 or 0.25
    String competency;    //Can be 'W', 'Q', 'S', or 'X' (for none)
    String distArea;         //Can be AH, LA, SM, SS or X (for no distArea)

   
    /* Constructor for a Course.  This method takes initial values for the course's fields as 
     * parameters and then assigns the instance fields values based on these parameters.
     * @param initDepartment - Value to initialize department instance field to.
     * @param initCourseNumber - Value to initialize course number instance field to.
     * @param initCompetency - Value to initialize competency instance field to.
     * @param initCredit - Value to initalize credit instance field to.
     * @param initGroup - Value to initialize group instance field to.
     */
    public Course(String initDepartment, String initCourseNumber, String initCompetency, 
                  String initCredit, String initDistArea)
    {
       department = initDepartment.toUpperCase();     //Convert initDepartment to upper case and store it
       courseNumber = initCourseNumber;
       competency = initCompetency;
       credit = initCredit;
       distArea = initDistArea;
    }

    
    
    /* This method displays all of the fields for a Course with the department and course
     * number displayed together (e.g., CSC121).  The number of credits the course is worth
     * are also displayed along with an indication of whether or not the course carries group
     * or competency credit.
     */
    public void displayCourse()
    {
      System.out.println("******************************************");
      System.out.println("Department and number: " + department + courseNumber);
      
      System.out.println ("Credit: " + credit);
      
      if ( competency.equals("X") || competency.equals("x"))
         System.out.println ("Competency: none");
      else
         System.out.println ("Competency: " + competency);
     
      if (! distArea.equals("X"))   
         System.out.println ("DistArea: " + distArea);
      else
         System.out.println ("DistArea: none");
    }
    
    
    /* Simple accessor that returns the department for a course.
     * @return - A String which is the department for the Course.
     */
    public String getDepartment()
    {  return department;
    }
    
    
    /* Simple accessor that returns the course Number for a course.
     * @return - An String which is the course number for the Course.
     */
    public String getCourseNumber()
    {  return courseNumber;
    }
    
    
    /* Simple accessor that returns the competency status for a course.
     * @return - A String (W, Q, S) which is competency for the Course or X
     * if there is no competency for this course.
     */
    public String getCompetency()
    {  return competency;
    }
    
    
    /* Simple accessor that returns the number of credits the course is worth.
     * @return - A String which is the number of credits for the Course.
     */
    public String getCredit()
    {  return credit;
    }
    
    
    /* Simple accessor that returns the group the course belongs to.
     * @return - A String which is the group number of 0 if there is no group for this course.
     */
    public String getDistArea()
    {  return distArea;
    }
}

