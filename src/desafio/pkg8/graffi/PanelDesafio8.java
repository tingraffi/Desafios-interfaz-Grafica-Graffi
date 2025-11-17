/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package desafio.pkg8.graffi;

/**
 *
 * @author Usuario
 */

import java.util.ArrayList;

public class PanelDesafio8 extends javax.swing.JPanel {

    // Declaro la lista para guardar los nombres de usuario aquí
    ArrayList<String> listaUsuarios = new ArrayList<>();
    
    /**
     * Creates new form PanelDesafio8
     */
    public PanelDesafio8() {
        initComponents();
        txtMostrarUsuarios.setEditable(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingContrasena = new javax.swing.JPasswordField();
        ingMail = new javax.swing.JTextField();
        lblIngreseUserYPass = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrarUsuarios = new javax.swing.JTextArea();
        btnMostrarUsers = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(ingContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 90, -1));
        add(ingMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, 20));

        lblIngreseUserYPass.setText("Ingrese Usuario y Contrasena");
        add(lblIngreseUserYPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 140, -1));

        txtMostrarUsuarios.setColumns(20);
        txtMostrarUsuarios.setRows(5);
        jScrollPane1.setViewportView(txtMostrarUsuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        btnMostrarUsers.setText("Mostrar Usuarios");
        btnMostrarUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarUsersActionPerformed(evt);
            }
        });
        add(btnMostrarUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
// 1. Obtenemos el texto del campo de usuario y de contraseña
    String usuario = ingMail.getText(); // Reemplaza 'ingMail' por el nombre de tu variable de JTextField
    String contrasena = new String(ingContrasena.getPassword()); // Reemplaza 'ingContrasena' por el nombre de tu JPasswordField

    // 2. Verificamos que los campos no estén vacíos
    if (usuario.isEmpty() || contrasena.isEmpty()) {
        // Mostramos un mensaje de error si falta algún dato
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese usuario y contraseña.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    } else {
        // 3. Si no están vacíos, agregamos el usuario a nuestra lista
        listaUsuarios.add(usuario);
        
        // Mostramos un mensaje de confirmación
        javax.swing.JOptionPane.showMessageDialog(this, "Usuario '" + usuario + "' guardado correctamente.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        // 4. Limpiamos los campos para el próximo ingreso
        ingMail.setText("");
        ingContrasena.setText("");
    }    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnMostrarUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarUsersActionPerformed
 // 1. Creamos un objeto para construir el texto que se mostrará
    StringBuilder usuariosMostrados = new StringBuilder();

    // 2. Verificamos si la lista de usuarios está vacía
    if (listaUsuarios.isEmpty()) {
        usuariosMostrados.append("No hay usuarios registrados.");
    } else {
        // 3. Si hay usuarios, los recorremos y los agregamos al StringBuilder
        usuariosMostrados.append("--- Lista de Usuarios ---\n");
        for (String usuario : listaUsuarios) {
            usuariosMostrados.append(usuario).append("\n"); // Agregamos cada usuario y un salto de línea
        }
    }

    // 4. Finalmente, establecemos el texto construido en el JTextArea
    // Reemplaza 'txtMostrarUsuarios' por el nombre de la variable de tu JTextArea
    txtMostrarUsuarios.setText(usuariosMostrados.toString());    }//GEN-LAST:event_btnMostrarUsersActionPerformed

    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new PanelDesafio8().setVisible(true);
        }
    });
}
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMostrarUsers;
    private javax.swing.JPasswordField ingContrasena;
    private javax.swing.JTextField ingMail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIngreseUserYPass;
    private javax.swing.JTextArea txtMostrarUsuarios;
    // End of variables declaration//GEN-END:variables
}
