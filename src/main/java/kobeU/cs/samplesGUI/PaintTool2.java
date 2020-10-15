package kobeU.cs.samplesGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintTool2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PaintTool2");
        frame.setContentPane(new PaintTool2().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel contentPane;
    private JButton btnUndo;
    private CustomView customView;
    private JButton btnReset;

    public PaintTool2() {
        btnUndo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customView.undo();
            }
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customView.reset();
            }
        });
        customView.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                customView.mousePressed(e.getPoint());
            }
        });
        customView.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                customView.mouseReleased(e.getPoint());
            }
        });
        customView.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                customView.mouseDragged(e.getPoint());
            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0, 0));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        contentPane.add(panel1, BorderLayout.SOUTH);
        btnUndo = new JButton();
        btnUndo.setText("undo");
        panel1.add(btnUndo);
        btnReset = new JButton();
        btnReset.setText("reset");
        btnReset.setMnemonic('R');
        btnReset.setDisplayedMnemonicIndex(0);
        panel1.add(btnReset);
        customView = new CustomView();
        customView.setPreferredSize(new Dimension(600, 400));
        contentPane.add(customView, BorderLayout.CENTER);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }
}
