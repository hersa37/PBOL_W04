import javax.swing.*;

public class HJFrame extends JFrame {



    public HJFrame() {
        final int frameX = 450;
        final int frameY = 140;
        final int marginLeft = 15;
        final int marginRight = frameX - marginLeft;
        final int marginTop = 15;
        final int marginBottom = frameY - marginTop;
        final int compHeight = 25;
        final int compWidth = compHeight * 3;

        this.setSize(frameX, frameY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Find");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("Keyword:");
        label.setBounds(marginLeft, marginTop, compWidth, compHeight);
        panel.add(label);

        JTextField tf = new JTextField();
        tf.setBounds(marginLeft, marginTop + compHeight, marginRight - marginLeft, compHeight);
        panel.add(tf);

        JButton button = new JButton();
        button.setText("Find");
        button.setBounds(marginLeft, marginBottom - 2* compHeight, compHeight * 3 , compHeight);
        panel.add(button);
        this.add(panel);
        this.setVisible(true);

    }


    public static void main(String[] args) {
        new HJFrame();


    }
}
