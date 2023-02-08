# Projektni zadatak - Testiranje web stranice --> Instar Informatika https://www.instar-informatika.hr/.

Programski jezik je Kotlin, program u kojem se radilo je IntelliJ IDEA

Testni slucajevi:

*provjera jel prikazan header - provjera jel se stranica uspjesno ucitala.
*test search box-a - nakon upisa pojma, pritisne se tipka Search i rezultati se pokazu u obliku liste.
*Filtriranje po kategorijama - u testu su oznacene posebne kategorije te su prikazane samo one.
*dodavanje u košaricu - u testu se odabire proizvod i stavlja u kosaricu, kako bi test bio uspjesan, kosarica ne smije biti prazna.
*Promjena tab-a nakon logiranja - testiramo login, korisnik mora popuniti korisnicke podatke u test file-u kako bi se test ispravno izveo, test 
otvara login dio stranice, nakon toga otvara nasumicni tab u profile-menu. Prilikom odabira drugog tab-a url se ne mjenja.


Za otvaranje projekta potrebni su ChromeDriver i FirefoxDriver (geckodriver)

Linkovi odakle su preuzeti:

ChromeDriver: https://chromedriver.chromium.org/downloads

FirefoxDriver: https://github.com/mozilla/geckodriver/releases


Testovi se pokreæu klikom na  WebTest.kt datoteku u: src/java/test package. Potrebno je kliknuti na Run ‘WebTest’ kako bi se test pokrenuo.




