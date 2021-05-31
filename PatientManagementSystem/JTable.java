/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author esmasert
 */
public class JTable extends javax.swing.JFrame {


    static String[] words = null;  //Intialize the word Array
    static String[] SonWords = null;  //Intialize the word Array
    static String[] DogumTarihiWords = null;
    static String[] DTwords = null;
    //List<List<String>> TrackMuayeneler = new ArrayList<List<String>>();
    static ArrayList<ArrayList<String>> TrackMuayeneler = new ArrayList<ArrayList<String>>();
    //static ArrayList<String> TrackMuayeneler = new ArrayList<String>();


    static String infoHastaIsmi;
    static String infoTcNo;
    static String infoHastaYasi;
    static String infoSikayet;
    static String infoMuayene;
    static String infoTahlil;
    static String infoTeshis;
    static String infoTedavi;
    static String infoDogumTarihi;


    static String infoTarih;
    static String infoSaat;
    static String ayiriciTcNo;


    String info;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHastaAra;
    private javax.swing.JButton btnYeniHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHastaList;
    private javax.swing.JTextField txtArama;


    /**
     * Creates new form JTable
     */
    public JTable() {

        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        setDefaultCloseOperation(JTable.EXIT_ON_CLOSE);

        UpdateTable();

    }

    public static void putLabelText(JLabel label, String infoString) {
        label.setText(infoString);
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
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTable().setVisible(true);
            }
        });
    }

    public void UpdateTable() {


        String filePath = "hastaBilgileri.txt";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel) tableHastaList.getModel();
            //model.setColumnIdentifiers(columnsName);


            String[] geciciArray = new String[2];
            String[] geciciArray2 = new String[2];

            geciciArray[0] = columnsName[0];
            geciciArray[1] = columnsName[1];


            model.setColumnIdentifiers(geciciArray);

            // get lines from txt file
            Object[] tableLines = br.lines().toArray();

            // extratct data from lines
            // set data to jtable model
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(" / ");

                geciciArray2[0] = dataRow[0];
                geciciArray2[1] = dataRow[1];

                model.addRow(geciciArray2);
            }


            tableHastaList.setAutoCreateRowSorter(true);

            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableHastaList.getModel());
            tableHastaList.setRowSorter(sorter);

            ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
            //sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
            sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);


        } catch (Exception ex) {
            Logger.getLogger(JTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void demo_sort(String[][] hastaListt) {

        Arrays.sort(hastaListt, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String time1 = entry1[0];
                final String time2 = entry2[0];
                return time1.compareTo(time2);
            }
        });

        for (final String[] s : hastaListt) {
            System.out.println(s[0] + " " + s[1]);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableHastaList = new javax.swing.JTable();
        btnYeniHasta = new javax.swing.JButton();
        txtArama = new javax.swing.JTextField();
        btnHastaAra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableHastaList.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Isim Soyisim", "Tc No"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tableHastaList.getTableHeader().setReorderingAllowed(false);
        tableHastaList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHastaListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableHastaList);
        if (tableHastaList.getColumnModel().getColumnCount() > 0) {
            tableHastaList.getColumnModel().getColumn(0).setResizable(false);
            tableHastaList.getColumnModel().getColumn(1).setResizable(false);
        }

        btnYeniHasta.setText("Yeni Hasta");
        btnYeniHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniHastaActionPerformed(evt);
            }
        });

        btnHastaAra.setText("Hasta Ara");
        btnHastaAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHastaAraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Hasta Listesi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(69, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnYeniHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnHastaAra)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnYeniHasta)
                                        .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnHastaAra))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYeniHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniHastaActionPerformed
        // TODO add your handling code here:

        // code to load data
        // validation for not leaving blank data

        JNewPatient YeniHastaFrame = new JNewPatient();
        YeniHastaFrame.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnYeniHastaActionPerformed

    private void btnHastaAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHastaAraActionPerformed
        // TODO add your handling code here:


        String aramaYazisi = txtArama.getText();

        System.out.println("\n\n ARAMA YAZISIII:");
        System.out.println(aramaYazisi);

        String filePath = "hastaBilgileri.txt";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel) tableHastaList.getModel();
            //model.setColumnIdentifiers(columnsName);


            String[] geciciArray = new String[2];
            String[] geciciArray2 = new String[2];

            geciciArray[0] = columnsName[0];
            geciciArray[1] = columnsName[1];


            model.setColumnIdentifiers(geciciArray);

            // get lines from txt file
            Object[] tableLines = br.lines().toArray();

            model.setRowCount(0);


            // extratct data from lines
            // set data to jtable model
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(" / ");
                String dataRow0Kuccukharf = dataRow[0].toLowerCase();
                String dataRow0Boyukharf = dataRow[0].toUpperCase();


                if (dataRow[0].contains(aramaYazisi) || dataRow[1].contains(aramaYazisi) || dataRow0Kuccukharf.contains(aramaYazisi) || dataRow0Boyukharf.contains(aramaYazisi))   //Search for the given word
                {

                    geciciArray2[0] = dataRow[0];
                    geciciArray2[1] = dataRow[1];

                    model.addRow(geciciArray2);

                }
            }

        } catch (Exception ex) {
            Logger.getLogger(JTable.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnHastaAraActionPerformed

    public String[] wordListiGuncelle(String[] YeniWordList) throws IOException {

        infoHastaIsmi = YeniWordList[0];
        infoTcNo = YeniWordList[1];
        infoSikayet = YeniWordList[2];
        infoMuayene = YeniWordList[3];
        infoTahlil = YeniWordList[4];
        infoTeshis = YeniWordList[5];
        infoTedavi = YeniWordList[6];
        infoTarih = YeniWordList[7];
        //infoSaat = wordList[8];

        return null;
    }

    public String[] HastaYasiWordListiGuncelle(String[] YeniWordListt) throws IOException {

        infoHastaIsmi = YeniWordListt[0];
        infoTcNo = YeniWordListt[1];
        infoDogumTarihi = YeniWordListt[2];

        return null;
    }

    private void tableHastaListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHastaListMouseClicked
        // TODO add your handling code here:

        dispose();

        //int index = tableHastaList.getSelectedRow();

        int index = tableHastaList.convertRowIndexToModel(tableHastaList.getSelectedRow());

        TableModel model = tableHastaList.getModel();

        ayiriciTcNo = (String) model.getValueAt(index, 1);

        System.out.println("ayiriciTcNo:");

        System.out.println(ayiriciTcNo);


        ///////   DOGUM TARIHINI ALIYORUZ   //////////


        String[] DTwordList = new String[0];

        try {
            DTwordList = DogumTarihiSearch(ayiriciTcNo);

            infoDogumTarihi = DTwordList[2];

            System.out.println("\n\n ******** BI BAK OGLUMMMM ********");

            System.out.println(infoDogumTarihi);

        } catch (IOException ex) {
            Logger.getLogger(JTable.class.getName()).log(Level.SEVERE, null, ex);
        }


        /////// BITTI ///////


        try {

            String[] wordList = new String[0];

            TrackMuayeneSayisi(ayiriciTcNo);

            wordList = WordSearch(ayiriciTcNo);

            if (countTcNo(ayiriciTcNo) == 0) {

                wordList = WordSearchHastaListesi(ayiriciTcNo);
                System.out.println(wordList[1]);
                System.out.println(wordList.length);

            }

            infoHastaIsmi = wordList[0];
            infoTcNo = wordList[1];

            if (wordList.length < 5) {

                JPatientRegistrationNotFound HastaKaydiYokFrame = new JPatientRegistrationNotFound();
                HastaKaydiYokFrame.setVisible(true);

            } else {

                wordListiGuncelle(wordList);
                HastaYasiWordListiGuncelle(DTwordList);
                //infoSaat = wordList[8];

                JPatientInformation HastaBilgileriFrame = new JPatientInformation();
                HastaBilgileriFrame.setVisible(true);

            }

        } catch (IOException ex) {
            Logger.getLogger(JTable.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            countTcNo(ayiriciTcNo);
        } catch (IOException ex) {
            Logger.getLogger(JTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tableHastaListMouseClicked

    public int countTcNo(String TcNolar) throws IOException {

        File f2 = new File("randevuBilgileri.txt"); //Creation of File Descriptor for input file
        FileReader fr = new FileReader(f2);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        //String input="34690101228";   // Input word to be searched
        int count = 0;   //Intialize the word to zero

        while ((s = br.readLine()) != null)   //Reading Content from the file
        {
            words = s.split(" / ");  //Split the word using space

            for (String word : words) {
                if (word.equals(TcNolar))   //Search for the given word
                {
                    count++;    //If Present increase the count by one
                }
            }
        }

        if (count != 0)  //Check for count not equal to zero
        {
            System.out.println("The given word is present for " + count + " Times in the file");

        } else {
            System.out.println("The given word is not present in the file");
        }

        fr.close();

        return count;

    }

    public String[] DogumTarihiSearch(String TcNolar) throws IOException {

        File f1 = new File("hastaBilgileriDogumTarihiIle.txt"); //Creation of File Descriptor for input file
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        //String input="34690101228";   // Input word to be searched
        int count = 0;   //Intialize the word to zero

        while ((s = br.readLine()) != null)   //Reading Content from the file
        {
            DTwords = s.split(" / ");  //Split the word using space

            for (String word : DTwords) {
                if (word.equals(TcNolar))   //Search for the given word
                {
                    count++;    //If Present increase the count by one
                    DogumTarihiWords = s.split(" / ");  //Split the word using space
                }
            }
        }

        if (DogumTarihiWords == null) {
            System.out.println("Dogum tarihi bulunamadi.");
        }

        fr.close();
        return DogumTarihiWords;

    }

    public String[] WordSearch(String TcNolar) throws IOException {


        File f1 = new File("randevuBilgileri.txt"); //Creation of File Descriptor for input file
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        //String input="34690101228";   // Input word to be searched
        int count = 0;   //Intialize the word to zero

        while ((s = br.readLine()) != null)   //Reading Content from the file
        {
            words = s.split(" / ");  //Split the word using space

            for (String word : words) {
                if (word.equals(TcNolar))   //Search for the given word
                {
                    count++;    //If Present increase the count by one
                    SonWords = s.split(" / ");  //Split the word using space
                }
            }
        }

        if (SonWords == null) {
            System.out.println("Tc No bulunamadi.");
        }

        fr.close();
        return SonWords;

    }

    public String[] TrackMuayeneSayisi(String TcNolar) throws IOException {

        TrackMuayeneler.clear();

        File f1 = new File("randevuBilgileri.txt"); //Creation of File Descriptor for input file
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        //String input="34690101228";   // Input word to be searched
        int count = 0;   //Intialize the word to zero
        int a = 0;
        //
        //TrackMuayeneler.clear();

        while ((s = br.readLine()) != null)   //Reading Content from the file
        {
            words = s.split(" / ");  //Split the word using space

            ArrayList<String> anliklist = new ArrayList<String>();


            for (String word : words) {
                if (word.equals(TcNolar))   //Search for the given word
                {
                    count++;    //If Present increase the count by one
                    SonWords = s.split(" / ");  //Split the word using space

                    //Collections.addAll(TrackMuayeneler, SonWords);

                    for (int k = 0; k < SonWords.length; k++) {

                        anliklist.add(SonWords[k]);

                    }

                    TrackMuayeneler.add(anliklist);
                    a += 1;

                }
            }
        }

        if (SonWords == null) {

            System.out.println("Tc No bulunamadi.");
        }

        fr.close();
        return SonWords;

    }

    public String[] WordSearchHastaListesi(String TcNolar) throws IOException {


        File f1 = new File("hastaBilgileri.txt"); //Creation of File Descriptor for input file
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        //String input="34690101228";   // Input word to be searched
        int count = 0;   //Intialize the word to zero
        while ((s = br.readLine()) != null)   //Reading Content from the file
        {
            words = s.split(" / ");  //Split the word using space

            for (String word : words) {
                if (word.equals(TcNolar))   //Search for the given word
                {
                    count++;    //If Present increase the count by one
                    SonWords = s.split(" / ");  //Split the word using space

                }

            }
        }

        if (SonWords == null) {

            System.out.println("Tc No bulunamadi.");
        }

        fr.close();
        return SonWords;

    }
    // End of variables declaration//GEN-END:variables


}
