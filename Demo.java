import javax.swing.*;
import java.awt.event.*;

class Demo {
    public JFrame jframe;

    public Demo() {
        jframe = new JFrame("STUDENT REGISTRATION FORM");

        JLabel name1 = new JLabel("FIRST NAME");
        name1.setBounds(10, 5, 100, 40);
        JTextField firstname = new JTextField();
        firstname.setBounds(110, 10, 120, 30);

        JLabel name2 = new JLabel("LAST NAME");
        name2.setBounds(10, 30, 100, 50);
        JTextField lastname = new JTextField();
        lastname.setBounds(110, 40, 120, 30);

        JLabel date = new JLabel("DATE OF BIRTH");
        date.setBounds(10, 60, 110, 50);
        JTextField birthdate = new JTextField();
        birthdate.setBounds(110, 70, 120, 30);

        JLabel mail = new JLabel("EMAIL ID");
        mail.setBounds(10, 90, 110, 50);
        JTextField email = new JTextField();
        email.setBounds(110, 100, 120, 30);

        JLabel mob = new JLabel("MOBILE NO");
        mob.setBounds(10, 120, 130, 50);
        JTextField no1 = new JTextField();
        no1.setBounds(110, 130, 120, 30);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(10, 155, 60, 50);
        JRadioButton button1 = new JRadioButton("Male");
        button1.setBounds(110, 170, 80, 20);
        JRadioButton button2 = new JRadioButton("Female");
        button2.setBounds(200, 170, 100, 20);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(button1);
        genderGroup.add(button2);

        JLabel address = new JLabel("ADDRESS");
        address.setBounds(10, 180, 60, 50);
        JTextArea address1 = new JTextArea();
        address1.setBounds(110, 200, 180, 70);

        JLabel city = new JLabel("CITY");
        city.setBounds(10, 270, 60, 50);
        JTextField city1 = new JTextField();
        city1.setBounds(110, 280, 120, 30);

        JLabel pincode = new JLabel("PINCODE");
        pincode.setBounds(10, 300, 60, 50);
        JTextField pincode1 = new JTextField();
        pincode1.setBounds(110, 310, 120, 30);

        JLabel state = new JLabel("STATE");
        state.setBounds(10, 330, 60, 50);
        JTextField state1 = new JTextField();
        state1.setBounds(110, 340, 120, 30);

        JLabel country = new JLabel("COUNTRY");
        country.setBounds(10, 360, 60, 50);
        JTextField country1 = new JTextField("INDIA");
        country1.setBounds(110, 370, 120, 30);

        JLabel course = new JLabel("COURSES APPLIED FOR");
        course.setBounds(10, 390, 150, 50);
        JRadioButton button3 = new JRadioButton("BCA");
        button3.setBounds(160, 405, 70, 20);
        JRadioButton button4 = new JRadioButton("B.COM");
        button4.setBounds(230, 405, 70, 20);
        JRadioButton button5 = new JRadioButton("B.SC");
        button5.setBounds(300, 405, 70, 20);

        ButtonGroup courseGroup = new ButtonGroup();
        courseGroup.add(button3);
        courseGroup.add(button4);
        courseGroup.add(button5);

        JButton button6 = new JButton("SUBMIT");
        button6.setBounds(100, 440, 100, 30);

        jframe.add(name1);
        jframe.add(name2);
        jframe.add(firstname);
        jframe.add(lastname);
        jframe.add(date);
        jframe.add(birthdate);
        jframe.add(mail);
        jframe.add(email);
        jframe.add(mob);
        jframe.add(no1);
        jframe.add(gender);
        jframe.add(button1);
        jframe.add(button2);
        jframe.add(address);
        jframe.add(address1);
        jframe.add(city);
        jframe.add(city1);
        jframe.add(pincode);
        jframe.add(pincode1);
        jframe.add(state);
        jframe.add(state1);
        jframe.add(country);
        jframe.add(country1);
        jframe.add(course);
        jframe.add(button3);
        jframe.add(button4);
        jframe.add(button5);
        jframe.add(button6);

        jframe.setLayout(null);
        jframe.setSize(500, 550);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new Demo();
    }
}
