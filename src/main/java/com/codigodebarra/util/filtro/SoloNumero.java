package com.codigodebarra.util.filtro;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class SoloNumero extends DocumentFilter {

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet as) throws BadLocationException {
        String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
        String newText = currentText.substring(0, offset) + string + currentText.substring(offset);
        if (isValidDecimal(newText)) {
            super.insertString(fb, offset, string, as);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet as) throws BadLocationException {
        String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
        String newText = currentText.substring(0, offset) + text + currentText.substring(offset + length);

        if (isValidDecimal(newText)) {
            super.replace(fb, offset, length, text, as);
        }
    }

    private boolean isValidDecimal(String text) {
        if (text.isEmpty()) {
            return true; // Permitir cadenas vacías
        }

        // Expresión regular mejorada para validar decimales con hasta 2 decimales.
        return text.matches("^\\d*(\\.\\d{0,1})?$");
    }
}
