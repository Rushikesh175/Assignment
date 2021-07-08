package Assignment;
import java.util.*;
public class Assignment2 {
	static StringBuffer getImage(String s1)
    {
            StringBuffer sb=new StringBuffer(s1);
            StringBuffer s2=sb.reverse();
            return s2;
        
    }
  public static void main(String[] args) {
    String s1;
        Scanner scan=new Scanner(System.in);
        s1=scan.nextLine();
        StringBuffer s3=getImage(s1);
        System.out.println(s1+"|"+s3);
      
  }
}

	  


