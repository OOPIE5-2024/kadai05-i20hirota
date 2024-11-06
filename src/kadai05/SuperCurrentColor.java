package kadai05;

import java.awt.Color;
import javax.swing.JPanel;

public class SuperCurrentColor {
  private int red = 0;
  private int green = 0;
  private int blue = 0;
  private int[] vals = {0, 128, 255};
  private JPanel colorPanel;
  
  public void changeRed() {
    red = nextBrightIndex(red);
    colorPanel.setBackground(new Color(vals[red], vals[green], vals[blue]));  
  }
  
  public void changeGreen() {
    green = nextBrightIndex(green);
    colorPanel.setBackground(new Color(vals[red], vals[green], vals[blue]));  
  }
  
  public void changeBlue() {
    blue = nextBrightIndex(blue);
    colorPanel.setBackground(new Color(vals[red], vals[green], vals[blue]));  
  }
  
  private int nextBrightIndex(int b) {
    return (b + 1) % 3;
  }
  
  public void setPanel(JPanel p) {
    colorPanel = p;
  }
}
