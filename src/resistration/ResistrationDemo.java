package Resistration;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import static javax.swing.JFrame.EXIT_ON_CLOSE; 
class ResistrationDemo
    extends JFrame 
    implements ActionListener { 

    private Container c;  
    private JLabel title,name,email,mno,gender,dob,add,res; 
    private JTextField tname,temail,tmno; 
    private JRadioButton male,female; 
    private ButtonGroup gengp; 
    private JComboBox date,month,year; 
    private JTextArea tadd,tout,resadd; 
    private JCheckBox term; 
    private JButton sub,reset;  
    private String dates[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
    private String months[] 
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec" }; 
    private String years[] 
        = { "1995", "1996", "1997", "1998", 
            "1999", "2000", "2001", "2002", 
            "2003", "2004", "2005", "2006", 
            "2007", "2008", "2009", "2010", 
            "2011", "2012", "2013", "2014", 
            "2015", "2016", "2017", "2018", 
            "2019" }; 
   
    public ResistrationDemo() 
    { 
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Registration Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setBounds(300, 10,300, 40); 
        title.setForeground(Color.DARK_GRAY);
        c.add(title); 
  
        name = new JLabel("Name    :"); 
        name.setFont(new Font("Arial", Font.PLAIN, 18)); 
        name.setBounds(100,60,100,20);
        c.add(name); 
  
        tname = new JTextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tname.setBounds(200, 60,190,27); 
        c.add(tname);
        
        email = new JLabel("Email     :"); 
        email.setFont(new Font("Arial", Font.PLAIN, 18)); 
        email.setBounds(100,105,100,20);
        c.add(email); 
  
        temail = new JTextField(); 
        temail.setFont(new Font("Arial", Font.PLAIN, 15)); 
        temail.setBounds(200, 105,190,27); 
        c.add(temail);
  
        mno = new JLabel("Mobile   :"); 
        mno.setFont(new Font("Arial", Font.PLAIN, 18)); 
        mno.setBounds(100,150,100,20); 
        c.add(mno); 
  
        tmno = new JTextField(); 
        tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tmno.setBounds(200,147,190, 27);  
        c.add(tmno); 
  
        gender = new JLabel("Gender  :"); 
        gender.setFont(new Font("Arial", Font.PLAIN, 18)); 
        gender.setBounds(100,200,100, 20); 
        c.add(gender); 
  
        male = new JRadioButton("Male"); 
        male.setFont(new Font("Arial", Font.PLAIN, 16)); 
        male.setSelected(true); 
        male.setBounds(200,200,80, 20); 
        c.add(male); 
  
        female = new JRadioButton("Female"); 
        female.setFont(new Font("Arial", Font.PLAIN, 16)); 
        female.setSelected(false); 
        female.setBounds(275,200,80, 20);
        c.add(female); 
  
        gengp = new ButtonGroup(); 
        gengp.add(male); 
        gengp.add(female); 
  
        dob = new JLabel("DOB      :"); 
        dob.setFont(new Font("Arial", Font.PLAIN, 18)); 
        dob.setBounds(100,250,100, 20); 
        c.add(dob); 
  
        date = new JComboBox(dates); 
        date.setFont(new Font("Arial", Font.PLAIN, 16)); 
        date.setBounds(200,250,50, 20); 
        c.add(date);   
  
        month = new JComboBox(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setBounds(250,250,60, 20);  
        c.add(month); 
  
        year = new JComboBox(years); 
        year.setFont(new Font("Arial", Font.PLAIN, 16)); 
        year.setBounds(310,250,75, 20); 
        c.add(year); 
  
        add = new JLabel("Address :"); 
        add.setFont(new Font("Arial", Font.PLAIN, 18)); 
        add.setBounds(100,300,100, 20); 
        c.add(add); 
  
        tadd = new JTextArea(); 
        tadd.setFont(new Font("Arial", Font.PLAIN, 16)); 
        tadd.setBounds(200,300,200, 75);  
        tadd.setLineWrap(true); 
        c.add(tadd); 
  
        term = new JCheckBox("Accept Terms And Conditions."); 
        term.setFont(new Font("Arial", Font.PLAIN, 16)); 
        term.setBounds(150,400,250, 20); 
        c.add(term); 
  
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 16)); 
        sub.setBounds(150,450,100, 20); 
        sub.addActionListener(this); 
        c.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 16)); 
        reset.setBounds(270,450,100, 20);  
        reset.addActionListener(this); 
        c.add(reset); 
  
        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 16)); 
        tout.setBounds(500,100,300, 400); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
  
        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setBounds(100,500,500, 25);  
        c.add(res); 
  
        resadd = new JTextArea(); 
        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        resadd.setBounds(580,175,200, 75); 
        resadd.setLineWrap(true); 
        c.add(resadd); 
     
    } 
    @Override
    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == sub) { 
            if (term.isSelected()) { 
                String data1; 
                String data = "Name : "+ tname.getText() + "\n"
                        +"Email :"+temail.getText()+"\n" 
                        +"Mobile : "+ tmno.getText() + "\n"; 
                if (male.isSelected()) 
                    data1 = "Gender : Male"+ "\n"; 
                else
                    data1 = "Gender : Female"+ "\n"; 
                String data2 = "DOB : " + (String)date.getSelectedItem() 
                      + "/" + (String)month.getSelectedItem() 
                      + "/" + (String)year.getSelectedItem() 
                      + "\n"; 
  
                String data3 = "Address : " + tadd.getText(); 
                tout.setText(data + data1 + data2 + data3); 
                tout.setEditable(false); 
                res.setText("Registration Successfully.."); 
            } 
            else { 
                tout.setText(""); 
                resadd.setText(""); 
                res.setText("Please accept the terms & conditions.."); 
            } 
        } 
  
        else if (e.getSource() == reset) { 
            String def = null; 
            tname.setText(def); 
            temail.setText(def);
            tadd.setText(def); 
            tmno.setText(def); 
            res.setText(def); 
            tout.setText(def); 
            term.setSelected(false); 
            date.setSelectedIndex(0); 
            month.setSelectedIndex(0); 
            year.setSelectedIndex(0); 
            resadd.setText(def); 
        } 
    } 
} 
 
class RegistrationDemo { 
  
    public static void main(String[] args)
    { 
       ResistrationDemo f = new ResistrationDemo(); 
       f.setTitle("Registration Form"); 
        f.setBounds(300, 90, 900, 600); 
        f.setDefaultCloseOperation(EXIT_ON_CLOSE); 
       f.setVisible(true);
    } 
} 
