/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PatientManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.logging.Level;
import java.util.logging.Logger;

import static hastatakip.JHastayiSil.flagHastayiSil;
import static hastatakip.JTable.*;

/**
 * @author esmasert
 */
public class JPatientInformation extends javax.swing.JFrame {

    static int flag = 0;
    static int HastaYasi;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeriDon;
    private javax.swing.JButton btnHBGoster;
    private javax.swing.JButton btnHastayiSil;
    private javax.swing.JButton btnYazdir;
    private javax.swing.JButton btnYeniBulguEkle;
    private javax.swing.JComboBox<String> cboxMuayene;
    private javax.swing.JFormattedTextField jFormattedTextField1;

    /*
    
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {

        if (page > 0) { // We have only one page, and 'page' is zero-based 
            return NO_SUCH_PAGE;
        }

        // User (0,0) is typically outside the imageable area, so we must
        // translate by the X and Y values in the PageFormat to avoid clipping
        
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        // Now we perform our rendering
        g.drawString("Hello world!", 100, 100);

        // tell the caller that this page is part of the printed document
        return PAGE_EXISTS;
    }
    
    */
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblHastaAdiSoyadi;
    private javax.swing.JLabel lblHastaYasi;
    private javax.swing.JLabel lblMuayene;
    private javax.swing.JLabel lblMuayeneSayisi;
    private javax.swing.JLabel lblSikayet;
    private javax.swing.JLabel lblTahlil;
    private javax.swing.JLabel lblTarih;
    private javax.swing.JLabel lblTedavi;
    private javax.swing.JLabel lblTeshis;
    /**
     * Creates new form HastaBilgileri
     */
    public JPatientInformation() throws IOException {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        setDefaultCloseOperation(JNewPatientAppointmentInf.DISPOSE_ON_CLOSE);


        JTable nc = new JTable();

        nc.putLabelText(lblHastaAdiSoyadi, infoHastaIsmi);
        nc.putLabelText(lblSikayet, infoSikayet);
        nc.putLabelText(lblMuayene, infoMuayene);
        nc.putLabelText(lblTahlil, infoTahlil);
        nc.putLabelText(lblTeshis, infoTeshis);
        nc.putLabelText(lblTedavi, infoTedavi);

        nc.putLabelText(lblTarih, infoTarih);
        //nc.putLabelText(lblSaat,infoSaat);


        int intmuayeneSayisi = nc.countTcNo(ayiriciTcNo);
        String strmuayeneSayisi = Integer.toString(intmuayeneSayisi);

        nc.putLabelText(lblMuayeneSayisi, strmuayeneSayisi);


        //////// calculating age  //////////

        String DTyili = Character.toString(infoDogumTarihi.charAt(6)) + Character.toString(infoDogumTarihi.charAt(7)) + Character.toString(infoDogumTarihi.charAt(8)) + Character.toString(infoDogumTarihi.charAt(9));
        int currYearr = Year.now().getValue();

        HastaYasi = currYearr - Integer.parseInt(DTyili);

        nc.putLabelText(lblHastaYasi, Integer.toString(HastaYasi));


        //ArrayList<String> oylesineList = new ArrayList<String>();

        //cboxMuayene.removeAllElements();
        //cboxMuayene.setSelectedIndex(0);

        //JComboBox myBox = new JComboBox(dataVector);
        //DefaultComboBoxModel theModel = (DefaultComboBoxModel)cboxMuayene.getModel();
        //cboxMuayene.removeAllItems();

        cboxMuayene.removeAllItems();

        if (intmuayeneSayisi > 1) {


            for (int k = 0; k < TrackMuayeneler.size(); k++) {


                cboxMuayene.addItem(TrackMuayeneler.get(k).get(7));
                Object cmboitem = cboxMuayene.getSelectedItem();
                System.out.println(cmboitem);

            }

        }

        System.out.println(TrackMuayeneler);

        System.out.println(TrackMuayeneler.size());


        int size = cboxMuayene.getItemCount();
        for (int i = 0; i < size; i++) {
            String item = cboxMuayene.getItemAt(i);
            System.out.println("Item at " + i + " = " + item);
        }

        //cboxMuayene.removeItemAt(1);

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
            java.util.logging.Logger.getLogger(JPatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JPatientInformation().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(JPatientInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        lblHastaAdiSoyadi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSikayet = new javax.swing.JLabel();
        lblMuayene = new javax.swing.JLabel();
        lblTahlil = new javax.swing.JLabel();
        lblTeshis = new javax.swing.JLabel();
        lblTedavi = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnYeniBulguEkle = new javax.swing.JButton();
        btnGeriDon = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblMuayeneSayisi = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTarih = new javax.swing.JLabel();
        cboxMuayene = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnYazdir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblHastaYasi = new javax.swing.JLabel();
        btnHBGoster = new javax.swing.JButton();
        btnHastayiSil = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHastaAdiSoyadi.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblHastaAdiSoyadi.setForeground(new java.awt.Color(0, 102, 102));
        lblHastaAdiSoyadi.setText("Hasta Adi Soyadi");
        lblHastaAdiSoyadi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }

            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblHastaAdiSoyadiAncestorAdded(evt);
            }

            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(46, 136, 196));
        jLabel2.setText("Hasta Bilgileri");

        jLabel1.setText("??ikayet:");

        jLabel3.setText("Muayene:");

        jLabel4.setText("Tahlil:");

        jLabel5.setText("Te??his:");

        jLabel6.setText("Tedavi:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("En Son Kaydediler Bilgiler:");

        lblSikayet.setText("Sikayet");

        lblMuayene.setText("Muayene");

        lblTahlil.setText("Tahlil");

        lblTeshis.setText("Teshis");

        lblTedavi.setText("Tedavi");

        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("PDF");

        btnYeniBulguEkle.setText("Yeni Bulgu Ekle");
        btnYeniBulguEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniBulguEkleActionPerformed(evt);
            }
        });

        btnGeriDon.setText("Geri D??n");
        btnGeriDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriDonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("Muayene Say??s??:");

        lblMuayeneSayisi.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblMuayeneSayisi.setText("Muayene Say??s??");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Muayene Tarihi:");

        lblTarih.setBackground(new java.awt.Color(255, 255, 255));
        lblTarih.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblTarih.setForeground(new java.awt.Color(0, 102, 102));
        lblTarih.setText("Tarih");

        cboxMuayene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMuayeneActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("Muayene Se??iniz:");

        btnYazdir.setIcon(new javax.swing.ImageIcon("/Users/esmasert/NetBeansProjects/HastaTakip/printiconsmall.png")); // NOI18N
        btnYazdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYazdirActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Ya??:");

        lblHastaYasi.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblHastaYasi.setForeground(new java.awt.Color(0, 102, 102));
        lblHastaYasi.setText("HastaYa????");

        btnHBGoster.setText("Hasta Bilgilerini Goster");
        btnHBGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHBGosterActionPerformed(evt);
            }
        });

        btnHastayiSil.setText("Hastayi Sil");
        btnHastayiSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHastayiSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6))
                                                .addGap(87, 87, 87)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblSikayet, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                                                .addGap(344, 344, 344))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addGap(19, 19, 19)
                                                                        .addComponent(jLabel13)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                                                        .addComponent(lblTahlil, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(109, 109, 109))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(lblMuayene, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGap(103, 103, 103))
                                                                .addComponent(lblTeshis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblTedavi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(btnGeriDon)
                                                .addGap(32, 32, 32)
                                                .addComponent(btnHastayiSil)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnHBGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(btnYeniBulguEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(76, 76, 76))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblHastaAdiSoyadi)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(2, 2, 2)
                                                                .addComponent(jLabel11)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lblHastaYasi)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(357, 357, 357))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel8)
                                                                                        .addComponent(jLabel10))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(cboxMuayene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(lblMuayeneSayisi)))
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(btnYazdir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel9)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(lblTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(45, 45, 45))))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel2)
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblTarih)
                                                        .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnYazdir))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(lblHastaAdiSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblHastaYasi)
                                                        .addComponent(jLabel11))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(lblMuayeneSayisi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblSikayet, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(cboxMuayene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMuayene, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(lblTahlil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTeshis, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTedavi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnYeniBulguEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGeriDon)
                                        .addComponent(btnHBGoster)
                                        .addComponent(btnHastayiSil))
                                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYeniBulguEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniBulguEkleActionPerformed
        // TODO add your handling code here:

        JNewPatientExamination YeniHastaBulgulariFrame = new JNewPatientExamination();
        YeniHastaBulgulariFrame.setVisible(true);

        //setVisible(false); //you can't see me!
        dispose(); //Destroy the JFrame object

    }//GEN-LAST:event_btnYeniBulguEkleActionPerformed

    private void btnGeriDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriDonActionPerformed
        // TODO add your handling code here:

        JTable JTableFrame = new JTable();
        JTableFrame.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnGeriDonActionPerformed

    public String[] TarihSearch(String TcNolar, String SecilmisTarih) throws IOException {


        String[] wordsofTrh = null;
        String[] SonWordsofTrh = null;


        File f1 = new File("randevuBilgileri.txt"); //Creation of File Descriptor for input file
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        //String input="34690101228";   // Input word to be searched
        int count = 0;   //Intialize the word to zero


        while ((s = br.readLine()) != null)   //Reading Content from the file
        {
            wordsofTrh = s.split(" / ");  //Split the word using space

            System.out.println("\n****************** WORDS ************************");

            if (wordsofTrh.length == 8) {

                String word = wordsofTrh[1];
                String word2 = wordsofTrh[7];

                if (word.equals(TcNolar))   //Search for the given word
                {
                    if (word2.equals(SecilmisTarih)) {
                        SonWordsofTrh = s.split(" / ");  //Split the word using space


                    }
                }

            }

            //int lenScTrh = wordsofTrh.length;
            //int lenScTrhMinusOne = lenScTrh - 1;
            /*
            for (int i=0;i<wordsofTrh.length-1;i++) {
                    out2.print(hastaRandevuBilgileriData[i]);
                    out2.print(" / ");
                }*/

            System.out.println(wordsofTrh.length);
            /*
            String word = wordsofTrh[1];
            String word2 = wordsofTrh[7];



            if (word.equals(TcNolar))   //Search for the given word
            {
                if (word2.equals(SecilmisTarih)) {
                    SonWordsofTrh=s.split(" / ");  //Split the word using space
                }
            }   */

        }


        if (SonWordsofTrh == null) {
            System.out.println("Tc No bulunamadi.");
        }

        fr.close();
        return SonWordsofTrh;

        /*
        String g[] = {"a"};

        System.out.println("BLA BLA BLA");

        return g;

        */

    }

    public void putLabelText2() throws IOException {

        JTable nc = new JTable();

        nc.putLabelText(lblHastaAdiSoyadi, infoHastaIsmi);
        nc.putLabelText(lblSikayet, infoSikayet);
        nc.putLabelText(lblMuayene, infoMuayene);
        nc.putLabelText(lblTahlil, infoTahlil);
        nc.putLabelText(lblTeshis, infoTeshis);
        nc.putLabelText(lblTedavi, infoTedavi);

        nc.putLabelText(lblTarih, infoTarih);
        //nc.putLabelText(lblSaat,infoSaat);

        nc.putLabelText(lblHastaYasi, Integer.toString(HastaYasi));


        int intmuayeneSayisi = nc.countTcNo(ayiriciTcNo);
        String strmuayeneSayisi = Integer.toString(intmuayeneSayisi);

        nc.putLabelText(lblMuayeneSayisi, strmuayeneSayisi);
    }

    private void cboxMuayeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMuayeneActionPerformed
        // TODO add your handling code here:

        String secilenTarih = String.valueOf(cboxMuayene.getSelectedItem());

        System.out.println("Secilen Tarih: ");

        System.out.println(secilenTarih);


        //String[] p = null;
        try {
            SonWords = TarihSearch(ayiriciTcNo, secilenTarih);
        } catch (IOException ex) {
            Logger.getLogger(JPatientInformation.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < SonWords.length - 1; i++) {
            System.out.println(SonWords[i]);
        }

        flag = 1;

        JTable methodd = new JTable();
        try {
            methodd.wordListiGuncelle(SonWords);
        } catch (IOException ex) {
            Logger.getLogger(JPatientInformation.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            putLabelText2();

            /*
            JHastaBilgileri HastaBilgileriFrameDevami = null;
            try {
            HastaBilgileriFrameDevami = new JHastaBilgileri();
            } catch (IOException ex) {
            Logger.getLogger(JHastaBilgileri.class.getName()).log(Level.SEVERE, null, ex);
            }

            */
        } catch (IOException ex) {
            Logger.getLogger(JPatientInformation.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_cboxMuayeneActionPerformed

    private void btnYazdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYazdirActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnYazdirActionPerformed

    private void lblHastaAdiSoyadiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblHastaAdiSoyadiAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHastaAdiSoyadiAncestorAdded

    private void btnHBGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHBGosterActionPerformed
        // TODO add your handling code here:

        JShowPatientInformationsAndUpdate HastaBilgileriniGosterVeGuncelleFrame = new JShowPatientInformationsAndUpdate();
        HastaBilgileriniGosterVeGuncelleFrame.setVisible(true);

    }//GEN-LAST:event_btnHBGosterActionPerformed

    private void btnHastayiSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHastayiSilActionPerformed
        // TODO add your handling code here:

        JRemovePatient HastayiSilFrame = new JRemovePatient();
        HastayiSilFrame.setVisible(true);

        System.out.println(flagHastayiSil);

        if (flagHastayiSil == 1) {

            System.out.println(ayiriciTcNo);
        }

        //dispose();
    }//GEN-LAST:event_btnHastayiSilActionPerformed
    // End of variables declaration//GEN-END:variables

}
