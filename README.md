# Java ile Otomatik CV Oluşturma

## Proje Hakkında

Bu proje, Java programlama dili kullanılarak geliştirilmiş bir CV oluşturma uygulamasıdır. Program, kişisel bilgileri ve iş deneyimlerini PDF formatında bir özgeçmişe dönüştürür. Ayrıca CV içerisine fotoğraf eklenmesini sağlar.

## Kullanılan Teknolojiler

* Java
* Maven
* iText PDF Kütüphanesi
* PDF

## Proje Özellikleri

* PDF formatında CV oluşturma
* Kişisel bilgileri görüntüleme
* Eğitim bilgilerini ekleme
* İş deneyimlerini listeleme
* CV'ye fotoğraf ekleme

## Nesne Yönelimli Programlama (OOP)

Projede nesne yönelimli programlamanın temel kavramları kullanılmıştır:

* **Sınıf (Class):** `CvGenerator` sınıfı, CV oluşturma işlemlerini gerçekleştirir.
* **Nesne (Object):** `Main` sınıfında `CvGenerator` sınıfından bir nesne oluşturulur.
* **Yapıcı Metot (Constructor):** Kişisel bilgilerin başlangıç değerleri atanır.
* **Kapsülleme (Encapsulation):** Kişisel bilgiler `private` değişkenlerle tanımlanır.
* **Metotlar (Methods):** `pdfOlustur()` metodu PDF dosyasının oluşturulmasını sağlar.

## Proje Dosyaları

* `Main.java`: Programın başlangıç noktasıdır.
* `CvGenerator.java`: CV oluşturma işlemlerini içerir.
* `pom.xml`: Maven bağımlılıklarını ve proje ayarlarını içerir.
* `photo.jpg`: CV içerisinde kullanılacak fotoğraftır.
* `Doruk_Yılmaz_CV.pdf`: Oluşturulan CV dosyasıdır.

## Kurulum ve Çalıştırma

1. Bilgisayarda Java JDK kurulu olmalıdır.
2. Proje bir Maven projesi olarak açılmalıdır.
3. Maven bağımlılıklarının yüklenmesi beklenmelidir.
4. `Main.java` dosyası çalıştırılmalıdır.
5. Program çalıştığında CV PDF dosyası oluşturulur.

## Kullanılan Kütüphane

PDF oluşturma işlemleri için iText kütüphanesi kullanılmıştır. Gerekli bağımlılık `pom.xml` dosyasında tanımlanmıştır.

## Sonuç

Bu proje sayesinde Java ile sınıf, nesne, yapıcı metot ve kapsülleme gibi nesne yönelimli programlama kavramları uygulanmış; kişisel bilgileri ve iş deneyimlerini içeren bir PDF özgeçmiş oluşturulmuştur.
