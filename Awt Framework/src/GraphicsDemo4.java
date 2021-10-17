import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class StudentInformation
{
    public static void main(String[] args)
    {
      Frame f=new Frame();
      f.setSize(700,900);
      f.setTitle("Student");
      f.setLocation(500,50);
      f.setBackground(Color.yellow);
      f.setForeground(Color.red);
      f.setLayout(null);
      
      f.addWindowListener(new WindowAdapter()
      {  public void windowClosing(WindowEvent e)
      { System.exit(0);
               } });
      Font f1=new Font("Arail",Font.BOLD,20);
      
      Label stitle=new Label("STUDENT INFORMATION");
      stitle.setBounds(200,50,300,20);
      stitle.setFont(f1);
      f.add(stitle);
       
      Label sname=new Label("NAME");
      sname.setBounds(50,100,90, 20);
      f.add(sname);
       
      TextField textName=new TextField();
      textName.setBounds(160,100,190,20);
      f.add(textName);
       
      Label saddress=new Label("ADDRESS");
      saddress.setBounds(50,130,90, 20);
      f.add(saddress);
       
      TextArea textaddress=new TextArea();
      textaddress.setBounds(160,130,190,50);
      f.add(textaddress);
       
      Label shobbies=new Label("HOBBIES");
      shobbies.setBounds(50,230,90, 20);
      f.add(shobbies);
       
      Checkbox sreading=new Checkbox("CRICKET");
      sreading.setBounds(160,230,90,20);
      f.add(sreading);
       
      Checkbox swriting=new Checkbox("GAME");
      swriting.setBounds(260,230,90,20);
      f.add(swriting);
       
      Label sgender=new Label("GENDER");
      sgender.setBounds(50,260,90, 20);
      f.add(sgender);
       
      CheckboxGroup cbg=new CheckboxGroup();
       
      Checkbox cbmale=new Checkbox("male",cbg,true);
      cbmale.setBounds(160,260,90,20);
      f.add(cbmale);
       
      Checkbox cbfemale=new Checkbox("female",cbg,true);
      cbfemale.setBounds(280,260,90,20);
      f.add(cbfemale);
       
      Label sage=new Label("AGE");
      sage.setBounds(50,280,90, 20);
      f.add(sage);
       
      Choice cage=new Choice();
      for(int ctr=1;ctr<=100;ctr++)
      { cage.add(Integer.toString(ctr)); }
       
      cage.setBounds(160,280,90,20);
      f.add(cage);
       
      Label squalification=new Label("QUALIFICATION");
      squalification.setBounds(50,320,90, 20);
      f.add(squalification);
       
      List quali=new List();
      quali.add("10th");
      quali.add("12th");
      quali.add("Gradutation");
      quali.add("PostGradutation");
      quali.setBounds(160,320,90,100);
      f.add(quali);
       
      Button btnSubmit=new Button("save record");
      btnSubmit.setBounds(100,450,90,20);
      f.add(btnSubmit);
      f.setVisible(true);
    
    }
}
