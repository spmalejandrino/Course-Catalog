import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * The CourseCatalog class reads a set of courses from the file coursedata.txt.  Each
 * course consists of a department, a course number, a credit amount, a competency (W, Q, S, 
 * or X), and a group designation (1, 2, 3, 4, 5, 6 or 0 for  no group).
 * 
 * The class provides methods for searching for courses based on specific criterion.
 * 
 * @author Computer Science Department 
 * @version November, 2007
 */
public class CourseCatalog
{   private ArrayList<Course> courseList;  //An ArrayList of courses
    
    
    /*
     * The constructor for the CourseCatalog class initializes the ArrayList to be empty
     * and reads courses from the file displaying them on the console. You will be modifying
     * this constructor so that it adds the courses to the ArrayList instead of displaying
     * them on the console.
     */
    public CourseCatalog()
    {  courseList = new ArrayList<Course>();  
       String department;
       String courseNumber;
       String credit;
       String competency;
       String distributionArea;
       
       
        
       try
       {
           FileReader reader = new FileReader("coursedata.txt");
           Scanner in = new Scanner(reader);
       
           while(in.hasNextLine())   
           {  department = in.nextLine();  
              courseNumber = in.nextLine();
              credit = in.nextLine();     
              competency = in.nextLine();
              distributionArea = in.nextLine();  
              Course theCourse = new Course(department, courseNumber, competency, credit, distributionArea);
              //theCourse.displayCourse();  //You will be replacing this line 
              courseList.add(theCourse);
          }
          in.close();  //Close the file when we are done reading it
       } catch (IOException exception)
       {
          System.out.println("Error processing file: " + exception);
       }   
    }
        
      

    /*
     * You will be completing this method.  When completed the method should
     * print all of the courses in the ArrayList which have a department that
     * matches the parameter.  Remember to use .equals to compare strings.
     */
    public void printSelectedCourses(String department, String competency)
    {  
        int count = 0;
        for(int i=0; i< courseList.size(); i++)
        {   
            if(courseList.get(i).department.equals(department) && courseList.get(i).competency.equals(competency)){
                courseList.get(i).displayCourse();
                count++;
            }
        }
        if (count == 0){
            System.out.println("None found");
        }
    }


}
