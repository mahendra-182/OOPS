import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PR34 extends JFrame {

    public PR34() {
        setTitle("PR34 - Student Registration");
        setSize(400, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        JTextField rollField  = new JTextField();
        JTextField nameField  = new JTextField();
        JTextField ageField   = new JTextField();
        JTextField emailField = new JTextField();
        JButton    submit     = new JButton("Submit");

        add(new JLabel("Roll No:"));  add(rollField);
        add(new JLabel("Name:"));     add(nameField);
        add(new JLabel("Age:"));      add(ageField);
        add(new JLabel("Email:"));    add(emailField);
        add(new JLabel(""));          add(submit);

        submit.addActionListener(e -> {
            try {
                int roll = Integer.parseInt(rollField.getText().trim());
                int age  = Integer.parseInt(ageField.getText().trim());
                String email = emailField.getText().trim();

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email");
                }

                JOptionPane.showMessageDialog(this,
                    "Success!\nRoll: " + roll +
                    "\nName: " + nameField.getText() +
                    "\nAge: " + age +
                    "\nEmail: " + email,
                    "Registration Successful", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                    "Roll No and Age must be integers",
                    "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                    ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PR34();
    }
}