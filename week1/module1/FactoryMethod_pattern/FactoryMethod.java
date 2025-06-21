interface WordDocument{
    public void create();
}
interface PdfDocument{
    public void create();
}
interface ExcelDocument{
    public void create();
}
class ConcreteWord implements WordDocument{
    public void create(){
        System.out.println("word document created");
    }
}
class ConcretePdf implements PdfDocument{
    public void create(){
        System.out.println("pdf document craeted");
    }
}
class ConcreteExcel implements ExcelDocument{
    public void create(){
        System.out.println("excel document created");
    }
}
abstract class DocumentFactory{
    public abstract Object createDocument();
}
class WordDocumentary extends DocumentFactory{
    public  WordDocument createDocument(){
        return new ConcreteWord();
    }
}
class pdfDocumentary extends DocumentFactory{
    public PdfDocument createDocument(){
        return new ConcretePdf();
    }
}
class ExcelDocumentary extends DocumentFactory{
    public ExcelDocument createDocument(){
        return new ConcreteExcel();
    }
}
public class FactoryMethod {
    public static void main(String args[]){
        DocumentFactory wf=new WordDocumentary();
        WordDocument word1=(WordDocument) wf.createDocument();
        word1.create();
        DocumentFactory pf=new pdfDocumentary();
        PdfDocument pdf1=(PdfDocument)pf.createDocument();
        pdf1.create();
        DocumentFactory ef=new ExcelDocumentary();
        ExcelDocument excel1=(ExcelDocument) ef.createDocument();
        excel1.create();
    }
}
