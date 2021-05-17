<<<<<<< HEAD
# Vizsgafeladat

A feladatok megoldásához az IDEA fejlesztőeszközt használd! 
Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz. A `pom.xml` tartalmát nyugodtan át lehet másolni. 
Projekt, könyvtár, repository neve legyen: `zarovizsga-potpotvizsga`. 
GroupId: `hu.nive.ujratervezes`, artifactId: `zarovizsga-potpotvizsga`. Csomagnév: `hu.nive.ujratervezes.zarovizsga`.

A feladatok megoldásához ajánlom figyelembe a cheet sheetet:

https://github.com/Training360/strukturavalto-java-public/blob/master/cheet-sheet/cheet-sheet.md

Először másold át magadhoz a teszteseteket, majd commitolj azonnal!

Az öt feladatra 3 órád van összesen!

Old meg a feladatokat, minden feladat megoldását egy külön commitban
add be!
Ha letelik az idő első commitodhoz képest és nem fejezted be, megint commitolj, akkor is,
ha nem vagy kész! Utána nyugodtan folytathatod a megoldást, akár több órát is
ülhetsz felette, ha kész vagy, commitolj!

## Unique finder

Hozd létre a `UniqueFinder` osztályt, és abban a `uniqueChars` metódust, ami paraméternek kap egy `String`-et, és 
térjen vissza az abban levő karakterek listájával. Minden karakter csak egyszer szerepeljen a listában, az inputban nézett első előfordulásának megfelelő helyen.

Ha a metódus null-t kap paraméterben, akkor dobj `IllegalArgumentException`-t!

## Count chars

Hozdd létre a `DaVinciCode` osztályt, és abban a `decode` metódust, ami paraméternek várja egy file elérési útját és a keresett karaktert, ami lehet `'0'`, `'1'` vagy `'x'`.

Ha paraméterként nem ezen karakterek egyikét kapja, akkor dobjon egy kivételt!

A fájl `0`, `1` és `x` karaktereket tartalmaz. A metódus térjen vissza azzal, hogy a második paraméterben kapott karakter hányszor szerepel a fájlban.

Hozzunk létre egy egyszerű alkalmazást, amivel egy akvárium működését modellezhetjük.

## Halak (OOP feladatrész, 20 pont, hozzá tartozó teszt: FishTest)

Minden halnak van neve, súlya grammban és színe.

Emellett minden hal számára elérhetőek az alábbi metódusok:

- `status()`: adja vissza a hal adatait egy Stringben, pl `Dory, weight: 9, color: blue, short-term memory loss: true`

- `feed()`: megnöveli a hal súlyát, a pontos implementáció a hal fajtájától függ.

### Clownfish

A bohóchal 1 grammot hízik etetéskor.

### Tang

A tang 1 grammot hízik etetéskor, és rövidtávú-memória zavarban szenvedhet.

### Kong

A kong 2 grammot hízik etetéskor.

## Akvárium (Collections feladatrész, 20 pont, hozzá tartozó teszt: AquariumTest)

Az Aquarium osztálynak az alábbi metódusai vannak:

- `addFish()`, amivel halakat lehet hozzáadni

- `feed()`, ami megeteti az összes halat az akváriumban, és ezzel megnöveli a súlyukat

- `removeFish()`, eltávolít minden olyan halat az akváriumból, ami legalább 11 grammos

- `getStatus()`, ami visszaadja a halak státuszát egy String listában

# House cup

Minerva McGalagony megelégelte, hogy Dumbledore mennyire lazán veszi a házak pontversenyét, és saját kezébe vette a dolgokat. Mostantól a pontokat transzparens módon, adatbázisban fogjuk vezetni.

## Adatbázis

Az adatbázisban egyetlen tábla van `house_points` néven, az alábbi oszlopokkal:

- `house_name varchar`
- `student_name varchar`
- `points_earned int`

Egy hallgató többször is szerezhet pontot a tanév során a házának, ilyenkor az több rekordban lesz rögzítve. Például:

| house_name | student_name    | points_earned |
|------------|-----------------|--------------:|
| Gryffindor | Harry Potter    | 50            |
| Slytherin  | Draco Malfoy    | 10            |
| Slytherin  | Draco Malfoy    | 20            |
| Gryffindor | Harry Potter    | -15           |
| Hufflepuff | Cedric Diggory  | 25            |

## Java alkalmazás

Hozd létre a `HouseCup` osztályt, ami konstruktor paraméterben megkapja az adatbázis eléréshez szükséges `DataSource` példányt. Az osztályban hozd létre az alábbi metódusokat:

- `getPointsOfHouse(String houdse)`: adja vissza, hogy a paraméterként megadott ház mennyi pontot szerzett

____________________________________________________
## Számjegyek

A `Words` osztálynak legyen egy `boolean hasMoreDigits(String s)` metódusa,
mely visszaadja, hogy a szóvan több számjegy van-e, mint többi karakter.
Azaz a `aa111` szóban három számjegy van és kettő többi, azaz `true`
értéket ad vissza.

## Takarítás

Legyen egy `Cleanable` interfészed, annak `int clean()` és `String getAddress()`
metódusa. Ez azt jelenti, hogy valamit ki lehet takarítani (amit visszaad a metódus,
az a takarítás ára), valamint lennie kell egy címének is.

Legyen két osztály, mely implementálja, a `House` és a `Office`! 
A `House` egy családi ház, melynek meg lehessen adni a címét és az alapterületét.
A ház kitakarítása négyzetméterenként 80 Ft.
Az `Office` egy iroda, melynek meg lehessen adni a címét, az alapterületét és a szintek
számát. Az iroda kitakarítása négyzetméterenként 100 Ft. Természetesen az összes
szintet számolni kell.

Legyen egy `CleaningService` osztály, mely nyilvántartja az ingatlanokat. A következő metódusokat implementáld:

* `void add(Cleanable cleanable)` - hozzáaad egy ingatlant
* `int cleanAll()` - kitakarítja az összes ingatlant, és visszaadja, hogy mennyibe került, ezután nem 
    marad egy ingatlan sem
* `int cleanOnlyOffices()` - kitakarítja csak az irodákat, és visszaadja, hogy mennyibe került. Ezután
    csak a házak maradnak. 
* `List<Cleanable> findByAddressPart(String address)` - visszaadja azokat az ingatlanokat,
melynek címében szerepel a paraméterként megadott érték
* `String getAddresses()` - visszaadja az ingatlanok címeit vesszővel és egy szóközzel
    elválasztva

Ez két feladatnak számít, első az osztályok és interfész
létrehozása, és a `CleaningService` osztály első metódusa egy feladat. A többi metódus
még egy feladatnak számít.
    
## Emberek

A `People` osztályban implementáld a `int getNumberOfMales(String path)` metódust!
A metódus paraméterként megkapja egy fájl elérési útvonalát. A tesztesetben ez a
`src/test/resources/people.csv`, így ebbe
a könyvtárba tedd a fájlt!

A fájl formátuma:

```plain
id,first_name,last_name,email,gender,ip_address
1,Rebekkah,Lashmore,rlashmore0@rambler.ru,Male,140.220.218.69
2,Chiquia,Konmann,ckonmann1@auda.org.au,Male,54.83.30.17
3,Gloria,Bascomb,gbascomb2@ebay.co.uk,Male,67.210.132.201

```

A metódus adja vissza, hogy hány férfi van a fájlban!

## Emberek, de adatbázisban

A `PeopleDao` osztályba dolgozz, mely egy `DataSource`-ot kap konstruktorban.
A `PeopleDaoTest` hívja meg, ott van a `DataSource` deklarálva.
Nyugodtan írd át a benne lévő értékeket.

Legyen egy `String findIpByName(String firstName, String lastName) `
metódusa, mely adatbázisból visszaadja az adott névhez tartozó
ip címet! A teszteset a `V1__people.sql` állományt futtatja le Flyway-jel.
Létrehoz egy `people` táblát, amiből a lényeges a `first_name`, `last_name` és
az `ip_address`
oszlop. Adatokat is beszúrja.

__________________________________________________________________

## Számjegyek

A `DigitsCounter` osztálynak legyen egy `int getCountOfDigits(String s)` metódusa,
mely megszámolja, hogy hány különböző számjegy van a bemeneti Stringben.

## Kutyák

Legyen egy `Dog` ősosztályod, annak egy `name` és `happiness` attribútuma.
Az osztályt ne lehessen példányosítani! A konstruktora paraméterül kapja meg
a kutya nevét! A `happiness` értéke `0` legyen! Legyenek az attribútumokhoz
getterek! Legyen egy `void feed()` és egy `void play(int hours)` metódusa is,
de ezek ne legyenek implementálva.

Legyen két leszármazottja, a `Beagle` és a `Husky`! Konstruktornak meg lehessen adni a nevet!
Ha meghívod a `Beagle` `feed()` metódusát, akkor a boldágságértéke kettővel nőjjön!
Ha a `play()` metódusát, akkor a paraméterként átadott órák száma szorozva kettővel
nőjjön a boldogságértéke!

Ha meghívod a `Husky` `feed()` metódusát, akkor a boldágságértéke néggyel nőjjön!
Ha a `play()` metódusát, akkor a paraméterként átadott órák száma szorozva hárommal
nőjjön a boldogságértéke!

Legyen egy `Kennel` osztály, mely nyilvántartja a kutyákat. A következő metódusokat implementáld:

* `void addDog(Dog dog)` - hozzáaad egy kutyát
* `feedAll()` - összes kutya `feed()` metódusát meghívja
* `Dog findByName(String name)` - kikeresi a kutyát név alapján, kivételt dob, ha nem találja
* `void playWith(String name, int hours)` - a paraméterként megadott kutyát kikeresi, és meghívja a `play()`
    metódusát az átadott `hours` paraméterrel
* `List<String> getHappyDogNames(int minHappiness)` - visszaadja azon kutyák neveit, melyeknek
    boldogsága nagyobb, mint a paraméterként átadott érték

Ez két feladatnak számít, első a `Dog`, `Husky` `Beagle` és `Kennel` osztályok
létrehozása, és a `Kennel` osztály első két metódusa egy feladat. A másik három metódus
még egy feladatnak számít.
    
## Munkaórák

A `WorkHours` osztályban implementáld a `String minWork(String file)` metódust!
A metódus paraméterként megkapja egy fájl elérési útvonalát. A tesztesetben ez a
`src/test/resources/hu/nive/ujratervezes/zarovizsga/workhours/workhours.txt`, így ebbe
a könyvtárba tedd a fájlt!

A fájl formátuma:

```plain
John Doe,8,2021-01-01
Jack Doe,7,2021-01-02
Jack Doe,8,2021-01-03
John Doe,2,2021-01-04
John Doe,8,2021-01-05
John Doe,7,2021-01-06
```

A dolgozó neve, mennyi órát dolgozott egy nap, és a nap.
Azt kell visszaadni, hogy ki melyik nap dolgozott a legkevesebbet.
A fenti fájl alapján John Doe 2021-01-04-én csak 2 órát dolgozott,
így a következő Stringet kell visszaadni: `John Doe: 2021-01-04`.
Egy napra, egy alkalmazotthoz mindig csak egy sor van.

## Kutyafajták

A `DogTypes` osztályba dolgozz, mely egy `DataSource`-ot kap konstruktorba.
A `DogTypesTest` hívja meg, ott van a `DataSource` deklarálva.
Nyugodtan írd át a benne lévő értékeket.

Legyen egy `List<String> getDogsByCountry(String country)`
metódusa, mely adatbázisból visszaadja az adott országhoz tartozó
kutyafajtákat! A teszteset a `V1__dogs.sql` állományt futtatja le Flyway-jel.
Létrehoz egy `dog_types` táblát, amiből a lényeges a `name` és a `country`
oszlop. Adatokat is beszúrja.
Ha lassú, akkor csak azokat a sorokat hagyd benne, amiben szerepel
a `HUNGARY` szó!

Vigyázz, a metódus kisbetűsen kapja az ország nevét, de az adatbázisban csupa nagybetűsen szerepel.
Vigyázz, a kutyák fajtái nagybetűkkel vannak, de kisbetűkkel kell visszaadni.
(Konvertálásokat végezheted Javaban vagy SQL-ben is.)

Név szerint sorbarendezve add vissza őket!  
  
=======
# zarovizsga
Exam
>>>>>>> origin/master
