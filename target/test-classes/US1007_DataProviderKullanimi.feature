Feature: Amazonda verilen toplu olarak verilen kelimeleri aratir
  @amazon
  Scenario Outline: TC14 Kullanici listedeki tum urunler icin test tekrarlayabilmeli
    Given kullanici amazon anasayfaya gider
    Then arama kutusuna "<aranacakKelime>" yazip ENTER tusuna basar
    And arama sonuclarinin "<aranacakKelime>" icerdigini test eder
    Then sayfayi kapatir


    Examples:
    |aranacakKelime|
    |Nutella  |
    |Java     |
    |Samsung  |
    |Cannes   |
    |Nederland|
