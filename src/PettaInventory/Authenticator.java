/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PettaInventory;
/**
 *
 * @author MasterPaulo
 */
public class Authenticator extends javax.swing.JFrame {
    //public static mainFrame cashier;
    public static final String icon = "icona.png";
    private static final String password[]= {"315","master315", "petta315", "hyperion",
                     "bonacua", "bagagnan", "hadap", "laguilles", "rodriguez"};

    public Authenticator() {
        super("Petta Invantory - Authentication");
        initComponents();
        setLocationRelativeTo(null);
    }
    public boolean isValid(String pass){
        for(int i=0; i<password.length; i++)
            if(pass.equals(password[i]))
                return true;
        return false;
    }
    public void authenticate(){
        String attempt =passField.getText();
        if(isValid(attempt)){
            this.setAlwaysOnTop(true);
            this.setContentPane(new LoadingPanel());
            this.setVisible(true);
            //dispose();
        }
        else{
            passField.setText("");
            label.setText("Invalid. Try again.");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        secretPanel = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        okButton = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/"+Authenticator.icon)));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        secretPanel.setOpaque(false);
        secretPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secretPanelMouseClicked(evt);
            }
        });
        getContentPane().add(secretPanel);
        secretPanel.setBounds(440, 90, 20, 30);

        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Enter Password");
        getContentPane().add(label);
        label.setBounds(240, 250, 140, 14);

        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passFieldKeyPressed(evt);
            }
        });
        getContentPane().add(passField);
        passField.setBounds(230, 270, 160, 20);

        okButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/okIcon.png"))); // NOI18N
        okButton.setOpaque(false);
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton);
        okButton.setBounds(280, 300, 50, 50);

        image.setForeground(new java.awt.Color(255, 255, 255));
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cover.jpg"))); // NOI18N
        image.setText("Enter Password");
        getContentPane().add(image);
        image.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        authenticate();
    }//GEN-LAST:event_okButtonActionPerformed

    private void passFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyPressed
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER)
            authenticate();
    }//GEN-LAST:event_passFieldKeyPressed

    private void secretPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretPanelMouseClicked
        String pass ="";
        for(int i=4;i<password.length;i++)
            pass+=(" > " + password[i] + "\n");
        javax.swing.JOptionPane.showMessageDialog(null, "Passwords:\n"+ pass);
    }//GEN-LAST:event_secretPanelMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JLabel label;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField passField;
    private javax.swing.JPanel secretPanel;
    // End of variables declaration//GEN-END:variables
}