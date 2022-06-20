
package Utilidades;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
public class LimitedTextField extends PlainDocument{
 private int limite = 0;

    public LimitedTextField (int l) {
        this.limite = l;
    }

    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        int sobra = limite - getLength();
        int comprimento = (sobra > str.length()) ? str.length() : sobra;
        super.insertString(offs, str.substring(0, comprimento), a);
    }
}
