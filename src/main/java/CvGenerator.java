import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.io.image.ImageDataFactory;

public class CvGenerator {
    // Erişim düzenleyici: private (Encapsulation)
    private String adSoyad;
    private String okul;
    private String numara;

    // Nesne yaşam döngüsü başlangıcı: Constructor
    public CvGenerator() {
        this.adSoyad = "Doruk Yılmaz";
        this.okul = "Kırklareli Üniversitesi - Yazılım Mühendisliği";
        this.numara = "5250505091";
    }

    public void pdfOlustur(String dosyaYolu, String fotoYolu) {
        try {
            PdfWriter writer = new PdfWriter(dosyaYolu);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            document.add(new Paragraph("ÖZGEÇMİŞ").setBold().setFontSize(20));
            
            try {
                Image foto = new Image(ImageDataFactory.create(fotoYolu));
                foto.setWidth(100);
                document.add(foto);
            } catch (Exception e) {
                document.add(new Paragraph("[Fotograf Bulunamadi - photo.jpg eklenmeli]"));
            }

            document.add(new Paragraph("\nKişisel Bilgiler").setBold().setFontSize(14));
            document.add(new Paragraph("Ad Soyad: " + adSoyad));
            document.add(new Paragraph("Eğitim: " + okul));
            document.add(new Paragraph("Öğrenci No: " + numara));

            document.add(new Paragraph("\nİş Deneyimleri").setBold().setFontSize(14));
            document.add(new Paragraph("1. Sistem Geliştirici Stajyeri - Tech A.Ş. (2024-2025)\n- Java ile C tabanlı bağlı liste algoritmalarının entegrasyon testleri."));
            document.add(new Paragraph("2. Junior Backend Developer - Kırklareli Bilişim (2025-2026)\n- Veritabanı optimizasyonu ve API Gateway tasarımları."));
            document.add(new Paragraph("3. Freelance Yazılım Uzmanı - Global IT (2026-Günümüz)\n- Sistem kayıtlarının loglanması ve mikroservis mimarisi geliştirme."));

            document.close();
            System.out.println("PDF oluşturuldu: " + dosyaYolu);
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}