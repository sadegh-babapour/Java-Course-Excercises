import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/*
 * Created by JFormDesigner on Tue Oct 30 22:52:01 MDT 2018
 */



/**
 * @author sadegh
 */
public class MyForm extends JFrame {
    public MyForm() {
        initComponents();
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void button1MouseClicked(MouseEvent e) {
        String id = JOptionPane.showInputDialog(null, "Enter The New Student ID", "new node", JOptionPane.QUESTION_MESSAGE);
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button4MouseClicked(MouseEvent e) {

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - sadegh
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        panel4 = new JPanel();
        label1 = new JLabel();
        panel5 = new JPanel();
        scrollPane4 = new JScrollPane();
        textPane1 = new JTextPane();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(new GridLayout(1, 1));
        }
        contentPane.add(panel1, BorderLayout.EAST);

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayout(1, 1));
        }
        contentPane.add(panel2, BorderLayout.WEST);

        //======== panel3 ========
        {

            //---- button1 ----
            button1.setText("Insert");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });

            //---- button2 ----
            button2.setText("Find");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });

            //---- button3 ----
            button3.setText("Browse");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                    button3MouseClicked(e);
                }
            });

            //---- button4 ----
            button4.setText("Create Tree From File");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(button1)
                        .addGap(53, 53, 53)
                        .addComponent(button2)
                        .addGap(66, 66, 66)
                        .addComponent(button3)
                        .addGap(74, 74, 74)
                        .addComponent(button4)
                        .addContainerGap(1, Short.MAX_VALUE))
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1)
                            .addComponent(button2)
                            .addComponent(button3)
                            .addComponent(button4)))
            );
        }
        contentPane.add(panel3, BorderLayout.SOUTH);

        //======== panel4 ========
        {
            panel4.setLayout(new GridLayout(1, 1));

            //---- label1 ----
            label1.setText("An Application to Maintain Student Records");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            panel4.add(label1);
        }
        contentPane.add(panel4, BorderLayout.NORTH);

        //======== panel5 ========
        {
            panel5.setLayout(new GridBagLayout());
            ((GridBagLayout)panel5.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel5.getLayout()).rowHeights = new int[] {0, 0, 0};
            ((GridBagLayout)panel5.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panel5.getLayout()).rowWeights = new double[] {1.0, 0.0, 1.0E-4};

            //======== scrollPane4 ========
            {
                scrollPane4.setOpaque(false);
                scrollPane4.setViewportView(textPane1);
            }
            panel5.add(scrollPane4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel5, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - sadegh
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel panel4;
    private JLabel label1;
    private JPanel panel5;
    private JScrollPane scrollPane4;
    private JTextPane textPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
