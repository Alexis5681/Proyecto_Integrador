
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.io.FileOutputStream;

public class ExportadorPDF {

    public void exportarTablaClientes(JTable tabla, String rutaArchivo) throws Exception {
        Document documento = new Document();
        PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
        documento.open();

        // Título
        Paragraph titulo = new Paragraph("Listado de Clientes", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.BLACK));
        titulo.setAlignment(Element.ALIGN_CENTER);
        documento.add(titulo);
        documento.add(Chunk.NEWLINE);

        // Tabla PDF
        PdfPTable tablaPDF = new PdfPTable(tabla.getColumnCount());
        tablaPDF.setWidthPercentage(100);

        // Encabezados
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            PdfPCell celda = new PdfPCell(new Phrase(tabla.getColumnName(i)));
            celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
            tablaPDF.addCell(celda);
        }

        // Filas
        TableModel model = tabla.getModel();
        for (int fila = 0; fila < model.getRowCount(); fila++) {
            for (int columna = 0; columna < model.getColumnCount(); columna++) {
                Object valor = model.getValueAt(fila, columna);
                tablaPDF.addCell(valor != null ? valor.toString() : "");
            }
        }

        documento.add(tablaPDF);
        documento.close();
    }
}
