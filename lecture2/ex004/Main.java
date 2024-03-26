package lecture2.ex004;

public class Main {
    public static void main(String[] args) {
        String fileName = "example";
        String content = "Пример текста для сохранения";

        FileSaver pdfFileSaver = new PdfFileSaver();
        pdfFileSaver.save(fileName + ".pdf", content);

        FileSaver txtFileSaver = new TextFileSaver();
        txtFileSaver.save(fileName + ".txt", content);

        FileSaver docFileSaver = new WordFileSaver();
        docFileSaver.save(fileName + ".docx", content);
    }
}