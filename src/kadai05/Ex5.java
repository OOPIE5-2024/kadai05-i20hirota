package kadai05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import kadai04.CurrentColor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex5 {

  private JFrame frame;
  private JPanel panel_1;
  private SuperCurrentColor crrntBckColor = new SuperCurrentColor();

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ex5 window = new Ex5();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Ex5() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel panel = new JPanel();
    frame.getContentPane().add(panel, BorderLayout.NORTH);
    panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    
    JButton btnRed = new JButton("Red");
    btnRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        crrntBckColor.changeRed();
      }
    });
    panel.add(btnRed);
    
    JButton btnGreen = new JButton("Green");
    btnGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        crrntBckColor.changeGreen();
      }
    });
    panel.add(btnGreen);
    
    JButton btnBlue = new JButton("Blue");
    btnBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        crrntBckColor.changeBlue();
      }
    });
    panel.add(btnBlue);
    
    panel_1 = new JPanel();
    frame.getContentPane().add(panel_1, BorderLayout.CENTER);
    
    crrntBckColor.setPanel(panel_1);
  }

}
