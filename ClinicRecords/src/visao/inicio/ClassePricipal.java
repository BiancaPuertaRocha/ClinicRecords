package visao.inicio;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ClassePricipal {

    public static void main(String args[]) {

        try {
            // select Look and Feel

            UIManager.removeAuxiliaryLookAndFeel(UIManager.getLookAndFeel());

            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel");
            /*"LookAndFeelcom.jtattoo.plaf.acryl.AcrylLookAndFeel""com.easynth.lookandfeel.EaSynthLookAndFeel"*/
            // start application
            Inicio tela = new Inicio();
           // SwingUtilities.updateComponentTreeUI(tela);

            tela.setVisible(true);

        } catch (Exception ex) {
            ex.printStackTrace();
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException ex1) {
                Logger.getLogger(ClassePricipal.class.getName()).log(Level.SEVERE, null, ex1);
            } catch (InstantiationException ex1) {
                Logger.getLogger(ClassePricipal.class.getName()).log(Level.SEVERE, null, ex1);
            } catch (IllegalAccessException ex1) {
                Logger.getLogger(ClassePricipal.class.getName()).log(Level.SEVERE, null, ex1);
            } catch (UnsupportedLookAndFeelException ex1) {
                Logger.getLogger(ClassePricipal.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        // restante do método main aqui...
    }

}
