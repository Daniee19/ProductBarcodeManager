package com.codigodebarra.util;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.Barcode39;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Barras {

    public void generarCodBarras(String nombre, String tipo) {
        try {
            Document doc = new Document();
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("codigos.pdf"));
            doc.open();

            switch (tipo) {
                case "Code 39" -> {
                    detalles_imagen(new Barcode39(), nombre, doc, pdf.getDirectContent());
                }
                case "EAN-13" -> {
                    detalles_imagen(new BarcodeEAN(), nombre, doc, pdf.getDirectContent());
                }
            }

            doc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Barras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Barras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void detalles_imagen(Barcode code, String nombre, Document doc, PdfContentByte content) throws DocumentException {
        code.setCode(nombre);
        Image img = code.createImageWithBarcode(content, BaseColor.BLACK, BaseColor.BLACK);
        doc.add(img);
    }
}
