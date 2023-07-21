Feature: US1008 liste olarak verilen kullanicilar ile negatif login testi
  @qdnegatif
  Scenario Outline: TC15 Liste olarak verilen kullanicilar ile negatif login testi yapilabilmeli
    Given kullanici "qdUrl" anasayfaya gider
    And Kullanici cookie'i kabul eder
    Then anasayfada login linkine click yapar
    And email kutusuna listeden "<kullaniciAdi>" yazar
    And password kutusuna listeden "<password>" yazar
    When loginOl butonuna basar
    And basarili olarak giris yapilamadigini test eder
    Then sayfayi kapatir

    Examples:
    |kullaniciAdi|password|
    |selgun|12345|
    |mustafa|23456|
    |sevda |3435272|
    |aysegul|457890|
    |seher|857577|

