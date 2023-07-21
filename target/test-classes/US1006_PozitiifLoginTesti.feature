Feature: US1005 Pozitif Login Testi
  @qd
  Scenario:TC11 Kullanici gecerli username ve gecerli password ile giris yapabilmeli

    Given Kullanici "qdUrl" sitesine gider
    And Kullanici cookie'i kabul eder
    Then anasayfada login linkine click yapar
    And email kutusuna "qdGecerliUsername" yazar
    And password kutusuna "qdGecerliPassword" yazar
    When loginOl butonuna basar
    Then basarili olarak giris yapildigini test eder
    And sayfayi kapatir


  @qd
  Scenario:TC12 Kullanici gecersiz username ve gecerli password ile giris yapamamalı

    Given Kullanici "qdUrl" sitesine gider
    And Kullanici cookie'i kabul eder
    Then anasayfada login linkine click yapar
    And email kutusuna "qdGecersizUsername" yazar
    And password kutusuna "qdGecerliPassword" yazar
    When loginOl butonuna basar
    Then basarili olarak giris yapilamadigini test eder
    And sayfayi kapatir

  @qd
  Scenario:TC13 Kullanici gecerli username ve gecersiz password ile giris yapamamalı

    Given Kullanici "qdUrl" sitesine gider
    And Kullanici cookie'i kabul eder
    Then anasayfada login linkine click yapar
    And email kutusuna "qdGecerliUsername" yazar
    And password kutusuna "qdGecersizPassword" yazar
    When loginOl butonuna basar
    Then basarili olarak giris yapilamadigini test eder
    And sayfayi kapatir