package tp2.grupal;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import java.util.Random;
import javax.swing.JOptionPane;


public class Secreto extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Secreto.class.getName());

    private int ayudas;
    private int intentos;
    private int codigoSecreto;
    Random random = new Random();
    
    
    public Secreto() {
        
        initComponents();       
        codigoSecreto = random.nextInt(900) + 100; // Al abrir la aplicación se genera un número entre 100 y 999.
      
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JDesktopPane();
        Panel1 = new javax.swing.JPanel();
        Amarillo = new javax.swing.JPasswordField();
        Verde = new javax.swing.JPasswordField();
        Violeta = new javax.swing.JPasswordField();
        pistas = new javax.swing.JLabel();
        revelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroIntento = new javax.swing.JTextField();
        Panel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Fondo.setBackground(new java.awt.Color(0, 153, 153));

        Panel1.setBackground(new java.awt.Color(204, 204, 204));
        Panel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Amarillo.setEditable(false);
        Amarillo.setBackground(new java.awt.Color(255, 255, 153));
        Amarillo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Amarillo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Amarillo.setText("$");
        Amarillo.setEchoChar('$');
        Amarillo.addActionListener(this::AmarilloActionPerformed);

        Verde.setEditable(false);
        Verde.setBackground(new java.awt.Color(153, 255, 153));
        Verde.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Verde.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Verde.setText("$");
        Verde.setEchoChar('$');

        Violeta.setEditable(false);
        Violeta.setBackground(new java.awt.Color(204, 153, 255));
        Violeta.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Violeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Violeta.setText("$");
        Violeta.setToolTipText("");
        Violeta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Violeta.setEchoChar('$');
        Violeta.setName(""); // NOI18N

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(Violeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(Amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(Verde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Verde, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Violeta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pistas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pistas.setForeground(new java.awt.Color(255, 255, 102));
        pistas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pistas.setText("Por favor, ingresa exactamente 3 números.");
        pistas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 204), null));

        revelar.setBackground(new java.awt.Color(210, 220, 221));
        revelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        revelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tp2/grupal/Imagen boton.jpeg"))); // NOI18N
        revelar.setText("Revelar");
        revelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        revelar.addActionListener(this::revelarActionPerformed);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Codigo Secreto");

        Panel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Escribe 3 dígitos + ENTER");

        txtNumeroIntento.setBackground(new java.awt.Color(255, 204, 204));
        txtNumeroIntento.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), java.awt.Color.lightGray));
        txtNumeroIntento.addActionListener(this::txtNumeroIntentoActionPerformed);
        txtNumeroIntento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroIntentoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroIntento, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroIntento, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Panel3.setBackground(new java.awt.Color(0, 153, 153));
        Panel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Fondo.setLayer(Panel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(pistas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(revelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Panel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Panel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(pistas, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(revelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pistas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(revelar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    // AGREGO MÉTODO REUTILIZABLE. Adivinar el número con o sin intentos.
    private void victoria() {
        JOptionPane.showMessageDialog(this, "¡Ganaste! Cantidad de intentos: " + intentos);
    }    
    
    private void txtNumeroIntentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroIntentoActionPerformed
   
        // No utilizo validación mediante este método manejador.
        // El enunciado también menciona Action Event/ActionPerformed, 
        // sin embargo la parte que especifica qué hacer con el número completo
        // figura dentro de Key Event txtIntentoKeyTyped.
        
    }//GEN-LAST:event_txtNumeroIntentoActionPerformed
     
    
    private void revelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revelarActionPerformed
        
    }//GEN-LAST:event_revelarActionPerformed

    private void AmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmarilloActionPerformed
       
    }//GEN-LAST:event_AmarilloActionPerformed

    
    // AGREGO MÉTODO MANEJADOR. (Consigna: Validación al Teclear (Key Event txtIntentoKeyTyped))
    private void txtNumeroIntentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroIntentoKeyTyped
        
        
        String input = txtNumeroIntento.getText() + evt.getKeyChar();
        
        if (!input.matches("\\d+") || input.length() > 3) {
            
            evt.consume();
            
        }
        
        if (input.length() == 3) {
            
            intentos++;

            int numeroIngresado = Integer.parseInt(input);
    
            if (numeroIngresado > codigoSecreto) {
                
                pistas.setText("Más bajo");
            } 
            else if (numeroIngresado < codigoSecreto) {
                
                pistas.setText("Más alto");
            }
            else if (numeroIngresado == codigoSecreto){
                
                pistas.setText("¡Excelente! ¡Adivinaste el código!");
                victoria();
            }
            
        }
        
        
        
    }//GEN-LAST:event_txtNumeroIntentoKeyTyped

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        
        java.awt.EventQueue.invokeLater(() -> new Secreto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Amarillo;
    private javax.swing.JDesktopPane Fondo;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPasswordField Verde;
    private javax.swing.JPasswordField Violeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel pistas;
    private javax.swing.JButton revelar;
    private javax.swing.JTextField txtNumeroIntento;
    // End of variables declaration//GEN-END:variables
}
