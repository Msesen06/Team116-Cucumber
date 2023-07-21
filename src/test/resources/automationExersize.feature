Feature: US1009 Automation Exersize Testi
  Scenario: TC16 sayfada hesap acabilmeli
  Given kullanici "autoexersizeUrl" anasayfaya gider
    And user sign linkine click yapar
    And user Create an account bolumune email adresi girer
    And signUp butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Create Account butonuna basar
    Then hesap olustugunu test edin
    And sayfayi kapatir
    

    
    #1.https://automationexercise.com/ sayfasina gidelim
    #2.Cucumber ile asagidaki testi yapalim
    # Given user web sayfasinda
    # And user sign up linkine tiklar
    # And user Create an account bölümüne email adresi girer
    # And signUp butonuna basar
    # And user kisisel bilgilerini ve iletisim bilgilerini girer
    # And user Create Account butonuna basar
    # Then hesap olustugunu test edin