package Utilidades;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JMenu;
/**
 *
 * @author AJFILHO
 */
public class AtualizadorHorario extends Thread {
    private JMenu hr;
    private boolean mostrarData;
    private JMenu data;
    public AtualizadorHorario(JMenu hora, JMenu data) {
        this.hr = hora;
        this.data=data;
    }
    public void mostrarData(boolean mostrar) {
        if (mostrar) {
            this.mostrarData = true;
        } else {
            this.mostrarData = false;
        }
    }
    @Override
    public void run() {
        try {
            while (true) {
                Date d = new Date();
                StringBuffer data = new StringBuffer();
                if (mostrarData) {
                    SimpleDateFormat sdfData = new SimpleDateFormat("dd.MM.yyyy");
                    data.append(sdfData.format(d));
                    
                    this.data.setText(" "+data.toString()+"      " );
                    this.data.revalidate();
                }
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                this.hr.setText(" "+ sdf.format(d)+"         ");
                Thread.sleep(1000);
                this.hr.revalidate();
            }
        } catch (InterruptedException ex) {
            System.out.println("Problema na atualização da data/hora");
            ex.printStackTrace();
        }
    }
}