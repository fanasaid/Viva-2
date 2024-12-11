/**
 *
 * @sya 2024
 * 
 * program requirements :
 * 1. store name, id, marks
 * 2. display list student with marks 
 * 3. find highest mark
 * 4. calculate average
 * 5. list below average 
 * 
 */
public class V2Q5 {

    
    public static void main(String[] args) {
    //main method is provided

    String[] studentID = {"S0001", "S0002", "S0003", "S0004", "S0005", "S0006"};
    String[] studentName = {"John", "Cindy", "Alex", "Ali", "Rosli", "Roger"};
    int[] mark = {59, 62, 21, 36, 85, 74};
    
    String[][] studentInfo = getStudentInfo(studentID, studentName, mark);
    
        System.out.println("List of Students and their Marks: ");
        printStudentInfo(studentInfo);
        
        System.out.println("Student with highest marks: ");
        findStudentWithHighestMarks(studentInfo);
        
        double average = findAverage(mark);
        System.out.println("Average mark: "+average);
        
        System.out.println("\nStudents scoring below the average: ");
        listStudentBelowAverage(studentInfo, average);
        
    }
    

    public static String[][] getStudentInfo(String[] id,String[] name,int[] mark){
      String[][] info = new String[name.length][2];
      
      for(int i = 0; i<name.length; i++){
          String idName = id[i] + " - " + name[i];
          String markStudent = String.valueOf(mark[i]);
          //String.valueOf() : converts int mark into string
          
          info[i][0] = idName;
          info[i][1] = markStudent;
      }
        
    return info;
    }
    
    public static void printStudentInfo(String[][] info){
        
        for(int i=0; i<info.length; i++){
            
            /**
             *info.length returns number of rows
             *formatting used, in 15 space of characters left aligned 
             *%s indicate placement of string
             *%n or \n to generate new line
             */
            
            System.out.printf("%-15s : %s\n", info[i][0], info[i][1]);
            
        }System.out.println("");
    }
    
    public static void findStudentWithHighestMarks(String[][] info){
        String[] highestMark = null;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<info.length;i++){   
        int mark = Integer.parseInt(info[i][1]);
        //Integer.parseInt() : convert string mark in info into integer value for comparing max
        
            if(mark>max){
                max = mark;
                highestMark = info[i][0].split(" - ");
                //arrayname.split(): separates id from name in info 
            }
        }
        System.out.println(highestMark[1]+" : "+max);
        System.out.println("");
    }
    
    public static double findAverage(int[] mark){
     double sum=0, ave ;    
     for(int i=0; i<mark.length;i++){
         double markStudent = Double.valueOf(mark[i]);
         sum += markStudent;
     }
     
     return ave = sum/mark.length;
    }
    
    public static void listStudentBelowAverage(String[][] info,double ave){
        int count = 0;
        
        for(int i=0; i<info.length; i++){
            int mark = Integer.parseInt(info[i][1]);
            //convert string info into integer for marks comparison
            if(mark<ave){
                count++;
                //count used to determine size of belowAve[][] array
            }
        }
        
        String[][] belowAve = new String[count][2];
        int j=0;
        //use j to keep track of count aka size of belowAve array   
        
        while(j!=count){
        for (int i=0; i<info.length;i++){
            int mark = Integer.parseInt(info[i][1]);
            
            if(mark<ave){
                
                belowAve[j][0] = info[i][0];
                belowAve[j][1] = info[i][1];
                //adding info for students scoring below average to array  
                
                String name[] = belowAve[j][0].split(" - "); //separating string id from name
                System.out.println(name[1]+" : "+belowAve[j][1]);
                j++;
            }
            
        }
        }
        
    }
}
