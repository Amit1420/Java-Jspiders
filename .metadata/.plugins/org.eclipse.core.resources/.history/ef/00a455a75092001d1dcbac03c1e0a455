package com.amit.basicoops;

/*public class Employee 
{ 
	int emp_id;
	String emp_name;
	String emp_address;
	String emp_department;
	String emp_email;
	String emp_contact_number;
	int emp_salary;
	static String company_name;
	static String company_address;
	

}*/
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class Employee
{
   public static void main(String[] args) 
   {
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      Border border = new LineBorder(Color.ORANGE, 4, true);
      panel.setBorder(border);
      String[][] rec = {
         { "1", "Steve", "AUS" },
         { "2", "Virat", "IND" },
         { "3", "Kane", "NZ" },
         { "4", "David", "AUS" },
         { "5", "Ben", "ENG" },
         { "6", "Eion", "ENG" },
      };
      String[] header = { "Rank", "Player", "Country" };
      JTable table = new JTable(rec, header);
      table.setShowHorizontalLines(true);
      table.setGridColor(Color.orange);
      table.setCellSelectionEnabled(true);
      panel.add(new JScrollPane(table));
      frame.add(panel);
      frame.setSize(550, 400);
      frame.setVisible(true);
   }
}
