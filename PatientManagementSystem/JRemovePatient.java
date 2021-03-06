/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static hastatakip.JTable.*;

/**
 * @author esmasert
 */
public class JRemovePatient extends javax.swing.JFrame {

    /**
     * Creates new form HastayiSil
     */

    static int flagHastayiSil = 0;
    static int countt = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEvet;
    private javax.swing.JButton btnHayir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public JRemovePatient() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        setDefaultCloseOperation(JNewPatientAppointmentInf.DISPOSE_ON_CLOSE);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JRemovePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JRemovePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JRemovePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JRemovePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JRemovePatient().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEvet = new javax.swing.JButton();
        btnHayir = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
                jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
                jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
                jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
                jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hastanin tum bilgilerini silmek istediginize emin");

        jLabel2.setText("misiniz?");

        btnEvet.setText("Evet");
        btnEvet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvetActionPerformed(evt);
            }
        });

        btnHayir.setText("Hayir");
        btnHayir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHayirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(btnHayir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEvet, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(99, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnEvet)
                                        .addComponent(btnHayir))
                                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHayirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHayirActionPerformed
        // TODO add your handling code here:

        flagHastayiSil = 1;

        //JHastaKaydiYok HastaKaydiYokFrame = new JHastaKaydiYok();
        //HastaKaydiYokFrame.setVisible(true);

        dispose();

    }//GEN-LAST:event_btnHayirActionPerformed

    private void btnEvetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvetActionPerformed
        // TODO add your handling code here:
        //countt = 0;

        System.out.println(ayiriciTcNo);


        //// MAGICALLY LINE'I SILEMEDIGIMIZ ICIN, HER FILE'I KOPYALIYCAZ MECBUR (O LINE HARIC) ////

        try {
            SilmeIslemi("hastaBilgileri.txt", ayiriciTcNo);
            SilmeIslemi("hastaBilgileriDogumTarihiIle.txt", ayiriciTcNo);
            SilmeIslemi("randevuBilgileri.txt", ayiriciTcNo);
            int cnt = countt;

            while (cnt > 0) {
                SilmeIslemi("randevuBilgileri.txt", ayiriciTcNo);
                cnt--;
                System.out.println("\nCNT");
                System.out.println(cnt);
            }
        } catch (IOException ex) {
            Logger.getLogger(JRemovePatient.class.getName()).log(Level.SEVERE, null, ex);
        }

        // KAYDET VE YENI PENCEREYI AC //

        JTable JTableFrame = new JTable();
        JTableFrame.setVisible(true);

        setVisible(false); //you can't see me!
        dispose(); //Destroy the JFrame object

        JOptionPane.showMessageDialog(this, "Hastanin tum bilgileri ba??ar??yla silindi ve liste g??ncellendi.");

        flagHastayiSil = 2;

        //JHastaKaydiYok framei = new JHastaKaydiYok();
        //framei.dispose();

    }//GEN-LAST:event_btnEvetActionPerformed

    public String SilinecekLineiBulma(String fileName, String TcNolar) throws IOException {

        countt = 0;

        File f1 = new File(fileName); //Creation of File Descriptor for input file
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        //String input="34690101228";   // Input word to be searched
        int firstcnt = 0;
        String silinceeekk = null;

        while ((s = br.readLine()) != null)   //Reading Content from the file
        {
            words = s.split(" / ");  //Split the word using space

            for (String word : words) {
                if (word.equals(TcNolar))   //Search for the given word
                {
                    countt++;    //If Present increase the count by one
                    SonWords = s.split(" / ");  //Split the word using space
                    silinceeekk = s;

                }
            }
        }

        if (SonWords == null) {
            System.out.println("Tc No bulunamadi.");
        }

        fr.close();

        return silinceeekk;

    }

    public String[] SilmeIslemi(String fileName, String TcNolar) throws IOException {


        File inputFile = new File(fileName);
        File tempFile = new File("myTempFile.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String lineToRemove = SilinecekLineiBulma(fileName, TcNolar);
        String currentLine;

        while ((currentLine = reader.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            if (trimmedLine.equals(lineToRemove)) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        boolean successful = tempFile.renameTo(inputFile);

        if (successful) {
            System.out.println("successful");
        } else {
            System.out.println("Deleting line operation failed.");
        }

        return null;

    }
    // End of variables declaration//GEN-END:variables
}
