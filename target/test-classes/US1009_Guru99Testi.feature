Feature: US1009 Guru99 Testi
  @guru
  Scenario: TC01 Kullanici sayfada kendini musteri olrak ekleyebilmeli
  Given Kullanici "demoguruUrl" sitesine gider
  Then sayfanin Title inin Telecom icerdigini test eder
  And add custumer sayfasina gider
  And Formu doldurup musteri ekler
  And musteri eklendigini dogrular
  And kullanicinin customer idsini yazdirir
  Then sayfayi kapatir







  #1- https://demo.guru99.com/telecom/index.html adresine gidin
  #2- Sayfanın title’ında Telecom yazdığını doğrulayın
  #3- Add Costumer sayfasına gidin
  #4- Formu doldurup müşteri ekleyin
  #5- Kaydın başarıyla yapıldığı doğrulayın
  #6- Kullanıcının costumer id’sini yazdırın
  #7- Pencereyi kapatın