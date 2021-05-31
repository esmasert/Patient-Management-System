/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystem;

import java.awt.*;

/**
 * @author esmasert
 */
public class MonitorPatient {

    /**
     * @param args the command line arguments
     */

    public MonitorPatient() {

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("dcLogo.png")));

    }

    public static void main(String[] args) {
        // TODO code application logic here


        JEnterPage GirisPageFrame = new JEnterPage();
        GirisPageFrame.setVisible(true);

    }
    
    
    /*
    private void setIconImage(){
        
    }*/

    private void setIconImage(Image image) {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("dcLogo.png")));
    }

}
