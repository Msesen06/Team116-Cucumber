Feature: US1005 Webdriveruniversity Testi
  @maamut
  Scenario: TC01 Kullanici sitede surf yapabilmeli
  Given Kullanici "webdriveruniversityUrl" sitesine gider
  Then Login Portal a kadar iner
  And Login Portal'a tiklar
  And Diger windowa gecer
  And username ve password kutularina deger yazdirir
  And login butonuna basar
  And Popup'ta cikan yazinin -validation failed- oldugunu test edin
  Then Ok tusuna basar ve Popup'i kapatir
  And ilk sayfaya geri doner
  When ilk sayfaya donuldugunu test eder
  And  tum sayfalari kapatir









   #1."http://webdriveruniversity.com/" adresine gidin
    #2."Login Portal" a kadar asagi inin
    #3."Login Portal" a tiklayin
    #4.Diger window'a gecin
    #5."username" ve "password" kutularina deger yazdirin
    #6."login" butonuna basin
    #7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
    #8.Ok diyerek Popup'i kapatin
    #9.Ilk sayfaya geri donun
    #10.Ilk sayfaya donuldugunu test edin