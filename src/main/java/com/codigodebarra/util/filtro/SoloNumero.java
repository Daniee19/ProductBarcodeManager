package com.codigodebarra.util.filtro;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class SoloNumero extends DocumentFilter {

    //Método para insertar en un textfield
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet as) throws BadLocationException {
        if (string.matches("[0-9,\\.]+")) {
            super.insertString(fb, offset, string, as);
        }
    }

    //Metodo para evitar que se pegue texto que no coincida con la expresión
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet as) throws BadLocationException {
        if (text.matches("[0-9,\\.]+")) {
            super.replace(fb, offset, length, text, as);
        }
    }
}
