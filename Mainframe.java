import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Mainframe extends JFrame {

    final private Font mainFont= new Font("Segoe print",Font.BOLD,18);

    JTextField tffName, tflName;
    JLabel lbWelcome;

    public void initialize(){
        /********form panel */
        JLabel lbfname= new JLabel("First Name");
        lbfname.setFont(mainFont);

        tffName=new JTextField();
        tffName.setFont(mainFont);

        JLabel lblname= new JLabel("Last Name");
        lblname.setFont(mainFont);

        tflName=new JTextField();
        tflName.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));//4rows and 1 col

        formPanel.add(lbfname);
        formPanel.add(tffName);
        formPanel.add(lblname);
        formPanel.add(tflName);
        //form design end

        /*Welcome label */
        lbWelcome=new JLabel();
        lbWelcome.setFont(mainFont);

        //welcome label end


        /*Button panel */

        /*ok button */
        JButton btnOK= new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tffName.getText();
                String lastName = tflName.getText();
                lbWelcome.setText("Hello "+firstName+" "+lastName);
            }
            
        });
        //ok button end

        /*clear button */
        JButton btnClear= new JButton("CLEAR");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tffName.setText("");
                tflName.setText("");
                lbWelcome.setText("");
            }
            
        });
        //clear button end
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2,5,5));
        buttonPanel.add(btnOK);
        buttonPanel.add(btnClear);

        //button panel end

        /*main panel contain 1 form,1 welcome text,1 button panel */
        JPanel mainPanel= new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128,255));
        mainPanel.add(formPanel,BorderLayout.NORTH);//adding form to the main panel
        mainPanel.add(lbWelcome,BorderLayout.CENTER);
        mainPanel.add(buttonPanel,BorderLayout.SOUTH);
        //end of main panel

        add(mainPanel);



        setTitle("Welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Mainframe myFrame= new Mainframe();
        myFrame.initialize();
    }
}
