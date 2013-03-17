SGViewer v 1.9

Lister Plugin zur Anzeige von Bildern f�r Total Commander 5.51 oder neuer.

Donationware.


*** Anmerkung ***

Im TC 5.51 die Verwendung von Irfan View im Setup-Dialog des internen Viewers (namens Lister) abschalten. Im TC 6 oder neuer ist dies nicht notwendig.


*** Unterst�tzte Bildformate ***

BMP, JPEG, PNG, GIF, TIFF (nicht alle Komprimierungsmethoden unterst�tzt), PSD, TGA, PCX, PCD, PSP, EMF, WMF.


*** Features ***

- leicht verst�ndliches Interface;
- einfache Navigation;
- Vollbildansicht;
- Slideshow;
- Zufalls-generierter Ansichtsmodus;
- Antialiasing bei geeigneten Bildern;
- Anzeige von Animation in GIF-Dateien;
- mehrsprachige Benutzeroberfl�che (Englisch, Deutsch, Franz�sisch, Koreanisch, Russisch, Spanisch, Ukrainisch, Ungarisch);
- Kopieren, Umbenennen, L�schen von Bilddateien;
- �ffnen des aktuellen Bildes in irgend einer Applikation;
- Kopieren von Bildern in die und Einf�gen aus der Zwischenablage;
- Speichern von Bildern als BMP oder JPEG;
- Bildoperationen (Rotieren, Spiegeln, usw.);
- grundlegende Funktion zum Druck von Bildern;
- unterst�tzt ijl15.dll f�r schnelles Laden von JPEGs;
- unterst�tzt libgfl220.dll und libgfle220.dll f�r verlustfreie JPEG-Umwandlung und Miniaturansicht TC-Modus;
- und vieles mehr!


*** Keyboard Shortcuts ***


 * Navigation *

Leertaste - zeige n�chste Datei (in Schleife) (wenn Zufalls-generierte Ansicht aktiviert ist - zeige zuf�llige Datei);
Backspace - zeige vorherige Datei (in Schleife);
Strg+D - zeige zuerst angezeigtes Datei (die Sie nach dem Dr�cken von F3 oder Strg-Q im TC sehen);
Pause - starte/stoppe Slideshow;
BildAb - zeige n�chste Datei (wenn letzte Datei angezeigt wird, mach nichts);
BildAuf - zeige vorherige Datei (wenn erste Datei angezeigt wird, mach nichts);
Pos1 - zeige erste Datei;
End - zeige letzte Datei;
G � zeige Dialog Gehe zu Bild Nummer;
Enf�gen(Einfg) - zeige zuf�llige Datei (ignoriere deaktivierten Zufallsmodus);
Alt+Enter oder Mittlerer Mausbutton � Vollbildmodus an/aus;
Mausrad-Bewegung rauf/runter � zeige n�chste/vorherige Bilddatei;
Entf - l�sche Bilddatei (L�schfunktion wird aktiviert);

 * Interface *

Strg+B - zeige/verstecke Statusbar;
Strg+I - Infolabel an/aus;
Strg+T - Toolbar an/aus;
Shift+Strg+T - setzt Toolbar-Position zur�ck und zeigt diese an;
B - umschalten zwischen Nur gro�e Bilder anpassen (verkleinern)/ alle Bilder anpassen;
F - Bild anpassen/zeige Bild in Originalgr��e;
NumLock Asterisk (*) - Bild anpassen;
NumLock Slash (/) - zeige Bild in Originalgr��e;
NumLock Plus (+) - Bild einzoomen;
NumLock Minus (-) - Bild auszoomen;
Strg+Mausrad-Bewegung rauf/runter � zoome Bild +/-;
Strg+Linker/Rechter Mausbutton � zoome Bild +/-;

 * Bild *

I � zeige Bildinformations-Dialog incl. EXIF f�r JPEG (Datei mu� existieren);
L - Bild nach links drehen;
R - Bild nach rechts drehen;
V - Bild vertikal spiegeln;
H - Bild horizontal spiegeln;
T - Zeige Alphakanal in 32-bit-Bildern (wenn angepasst und bei aktiviertem Antialiasing);
Shift+G - konvertiere Bild in Graustufen;
Shift+T - konvertiere Bild in Negativ;
Shift+R � zeige Dialog Bildgr��e �ndern;
Strg+R � aktuelles Bild neu laden;
Strg+S - Bild als Bitmap oder JPEG speichern;
Strg+E - Bild als Desktop-Hintergrund setzen (zentriert);
Shift+E - Bild als Desktop-Hintergrund setzen (gestreckt);
Shift+Strg+E - Bild als Desktop-Hintergrund setzen  (gekachelt);
 Shift+Strg+R - JPEGLosslessTransform - drehe Bild um 90 Grad (erfordert libgfl220.dll und libgfle220.dll);
 Shift+Strg+L - JPEGLosslessTransform - drehe Bild um 270 Grad (erfordert libgfl220.dll und libgfle220.dll);
 Shift+Strg+H - JPEGLosslessTransform - Bild horizontal spiegeln (erfordert libgfl220.dll und libgfle220.dll);
 Shift+Strg+V - JPEGLosslessTransform - Bild vertikal spiegeln (erfordert libgfl220.dll und libgfle220.dll);
 Shift+A - JPEGLosslessTransform - drehe automatisch �ber EXIF-Ausrichtungs-Wert (erfordert libgfl220.dll und libgfle220.dll);


*** Verwenden externer DLL's ***

- Zum schnellen Laden von JPEGs k�nnen Sie die Intel JPEG Library (ijl15.dll) verwenden. Sie m�ssen diese auch im Setup-Fenster auf der "JPEG"-Seite aktivieren. Das Laden von JPEG-Dateien wird um einiges schneller!
   Kopieren Sie diese DLL in das Verzeichnis SGViewer\Plugins oder ins SGViewer-Verzeichnis selbst oder ins Windows-Verzeichnis.
- Zum Verwenden des verlustfreien JPEG-Umwandlungs- und Miniaturansichts-Modus im TC you ben�tigen Sie die Dateien libgfl220.dll und libgfle220.dll von Pierre-E Gougelet.
   Kopieren Sie diese DLL's in den Ordner SGViewer\Plugins in den Ordner SGViewer oder in den Ordner Windows.
   Sie k�nnen die neue libgfl240.dll und libgfle240.dll in libgfl220.dll und libgfle220.dll umbenennen und weiterverwenden.


*** Installation ***

 * TC 5.51 *

1. Entpacken Sie die Dazeien aus dem Archiv in Ihr gew�nschtes Plugin-Verzeichnis;
2. W�hlem Sie im TC-Men� Konfiguration - Optionen;
3. �ffnen Sie die Seite "Viewer/Editor";
4. Klicken Sie auf "Internen Viewer konfigurieren";
5. Klicken Sie auf "LS-Plugins";
6. Klicken Sie auf "Hinzuf�gen" und w�hlen Sie SGViewer.wlx;
7. Dr�cken Sie "OK".

 * TC 6.5 oder neuer *

Diese Version des TC besitzt ein feature "Automatische Plugininstallation". �ffnen Sie nur das Archiv mit dem Plugin und TC fragt Sie nach der Plugin-Installation.


*** Lizenz Vereinbarung ***

  Diese Software wird "AS-IS" ohne jegliche Garantie nur zum nicht-kommerziellen Gebrauch bereitgestellt.


*** Zus�tzliche Information ***

Plugin entwickelt mit Delphi 6 unter Verwendung:
  GraphicEx (www.delphi-gems.com);
  RxLib for D6 (www.sgbsoftware.com)(?);
  JEDI VCL (http://jvcl.sourceforge.net);
  TPrintPreview (http://www.delphiarea.com);
  Toolbar2000 (http://www.jrsoftware.org/);
  EXIF von SimBa aka Dimoniusis (dimonius@mail333.com);
  TWallpaper (www.utilmind.com);
  janFX von Jan Verhoeven (torry.net);
  Drag and Drop Component Suite von Angus Johnson & Anders Melander (torry.net).
  TBX for Toolbar2000 von Alex A. Denisov(http://g32.org);
  Graphics32 von Alex A. Denisov(http://g32.org).
  dEXIF von Gerry McGuire (http://mcguirez.homestead.com).

  JPEGLosslessTransform basiert auf (GFL SDK) von Pierre-E Gougelet (http://www.xnview.com).
  Intel JPEG Library (ijl15.dll) copyrited by Intel.

  Danke an Evgueny Svertchkov (listtv@citycat.ru) f�r den Zoom.

  Eine gro�e Hilfe beim L�sen der Bugs mit P4 HT waren Alex Martemyanov (AlexMart@opfr.vrn.ru) und Systemizer (systemizer99@mtu-net.ru).

  Danke an Christian Ghisler f�r einige Tipps und Funktionen.

Ebenso dank an alle, die mich mit Ideen f�ttern und mir Bug Reports mailen.

* �bersetzer *

Franz�sische �bersetzung von Claude Charries(charries_AT_wanadoo_DOT_fr);
Spanische �bersetzung von Luis Mejia;
Deutsche �bersetzung von Kurt Lettmaier (k.lettmaier@onlinehome.de);
Rum�nische �bersetzung von Dan Lungescu (dan.lungescu@gmail.com).
Ukrainische �bersetzung von Maximus (mxmus@yandex.ru);
Ungarische �bersetzung von Laszlo Kontor (kola.11@freemail.hu).
Koreanische �bersetzung von BlueSolvit (bluesolvit@hanmail.net).


*** Changes History ***

Ver 0.1:
 * Anfangs-Release.

Ver 1.0:
 + Speichern nach BMP;
 + Vollbildansicht;
 + Slideshow;
 * kleinere �nderungen und Bug Fixes.

Ver 1.3:
 + Speichern nach JPG;
 + einige Operationen mit Bildern;
 * kleinere �nderungen und Bug Fixes.

Ver 1.5:
 + experimenteller Zoom;
 + Bild kann zentriert werden;
 + Anpassen kleiner/go�er Bilder;
 + Mausrad: Bild wechseln, mit Shift - Zoom;
 + "Gehe zu"-Dialog (G);
 + Informations-Dialog (I);
 + "Bildgr��e �ndern"-Dialog (Shift+R);
 + neue Men�eintr�ge und Shortcuts (z.B. Alt+Enter - Vollbild);
 + interne Sortierung von Dateien nach Name, Erweiterung, unsortiert, umgekehrte Sortierreihenfolge (Setup-Dialog);
 * kleinere �nderungen und Bug Fixes.

Ver 1.6:
 * Mausrad: mit Strg - Zoom;
 + Strg+Linker/Rechter Mausbutton � Zoom +/-;
 + Toolbar;
 + setze Bilder als Desktop-Hintergrund (Bild - Setze als Hintergrund);
 + unterst�tzt DLL von Pierre-E Gougelet f�r JPEGLosslessTransform;
 * Men� neu angeordnet;
 + mit Einf�gen(Einfg)-Button werden Bilder zuf�llig angezeigt;
 + Option �ndere Bild nach dem Neuladen (Setup-Dialog) �ndert Bildanzeige beim Laden des neuen Bildes;
 * kleinere �nderungen und Bug Fixes.

Ver 1.7:
 * Um 180� drehen fix: dreht jetzt tats�chlich 180 Grad (Dreht um 90 x 2);
 * vertikal/horizontal spiegeln fix: ausgetauscht;
 + Toolbar Hinweise k�nnen abgeschaltet werden (Setup-Dialog - Allgemein);
 + Statusbar-Panele automatische Gr��e (Setup-Dialog - Allgemein);
 + Pos1/Ende - zeige erstes/letztes Bild;
 + Lister-Titel kann beim Laden eines neuen Bildes den vollen Dateinamen zeigen (Setup-Dialog - Experte);
 + Datei-Operationen (kopieren, umbenennen, l�schen) (Setup-Dialog - Experte);
 + Jetzt k�nnen Sie Bilder kopieren, indem Sie die Statusbar (wenn Datei existiert) in irgend ein Verzeichnis ziehen (Desktop, ge�ffneter Ordner im TC-Dateipanel, usw.) oder in irgend ein ge�ffnetes Programm (Erlaube Dateioperationen deaktivieren);
 * kleinere �nderungen und Bug Fixes.

Ver 1.7.1 BETA:
 + Miniaturen f�r TC 6.5
 * gefixt Bug "automatisches Zur�cksetzen der Einstellungen";
 + zus�tzliche internene Datei-Sortiermethoden (nach Gr��e, nach Datum);
 * gefixt zeigt Bilder wenn Sortiermethode wechselt;
 + �ffne aktuelles Bild in Shell-Standardprogramm oder irgend einem anderen (Setup - Shell);
 + Info-Label;
 * kleinere �nderungen und Bug Fixes.

Ver 1.7.1 BETA2:
 * gefixt Miniaturen f�r TC 6.5;
 * gefixt Bug "automatisches Zur�cksetzen der Toolbar-Einstellungen";
 + neue Funktionen (im Setup-Dialog);
 * Setup-Dialog kleinere �nderungen;
 * �nderungen am Schlie�verhalten von Vollbild (interner Fix);
 * kleinere �nderungen und Bug Fixes.

Ver 1.7.5 BETA:
 * nochmal gefixt Miniaturen f�r TC 6.5;
 + neue Funktionen (im Setup-Dialog);
 + "Zuf�lliges Bild"-Modus mit Leertaste und im Slideshow-Modus;
 * Setup-Dialog kleinere �nderungen;
 * kleinere �nderungen und Bug Fixes.

Ver 1.7.6 BETA:
 + EMF, WMF Dateiormate werden unterst�tzt;
 + Unterst�tzung von mehreren Sprachen;
 * viele weitere Hinzuf�gungen/Fixes.

Ver 1.7.7:
 + neue Men�eintr�ge;
 + Toolbar kann jetzt gesperrt werden;
 + Das Plugin kann jetzt im Vollbild-Modus starten (Setup-Dialog - Experte);
 * Setup-Dialog ge�ndert (jetzt wie TC-Setup-Diaolog);
 * kleinere �nderungen und Bug Fixes.

Ver 1.8 BETA:
 + unterst�tzt ijl15.dll f�r schnelles Laden von JPEG-Dateien (Laden von JPEG wird um einiges schneller!)(Setup - JPEG);
 + unterst�tzt libgfl220.dll und libgfle220.dll f�r verlustfreien JPEG-Umwandlungs- und Miniaturansichts-Modus in TC;
 + Antialiasing f�r angepasste Bilder (kann bei gro�en Bildern zu Geschwindigkeitseinbu�en f�hren);
 * Zoom wechselt jetzt vom aktuellen Fenster;
v
Ver 1.8.1 BETA:
 * zus�tzliche Bibliotheken (ijl15.dll, libgfl220.dll, libgfle220.dll) k�nnen jetzt ins SGViewer\Plugins-Verzeichnis oder SGViewer-Verzeichnis eingef�gt werden;
 + Unterst�tzung f�r Umgebungsvariable (z.B. %COMMANDER_PATH%) im Pfad zu externer Anwendung (Setup-Dialog - Shell);
 + w�hle Antialiasing-Filter (Setup-Dialog - Erweitert);
 + automatisches Deaktivieren des Antialiasing bei gro�en Bildern (Setup-Dialog - Erweitert);
 + "�bergehen" der Meldungen f�r Mausr�der vor dem Laden des n�chsten/vorherigen Bildes durch Setzen des Wertes der "�bergehungen" im Eintrag der Setup-Datei "WheelSkipCount" (n�tzlich bei KatMouse oder alten M�usen);
 * Radscrollen �ber die Scrollbars scrollt diese statt n�chstes/vorheriges Bild zu laden;
 + w�hle Schrift f�r Info-Label (Setup-Dialog - Allgemein)
 + teste alpha-Kanal-Unterst�tzung in 32 bit Bildern (wenn m�glich und Antialiasing aktiviert) PNG und BMP: andere Modus durch dr�chen der Taste T;
 * Setup-Dialog ge�ndert;
 * kleinere �nderungen und Bug Fixes.

Ver 1.8.2 BETA:
 * gefixt "error 1400";
 + l�dt Grafiken �ber libgflX.dll (Setup-Dialog - JPEG);
  * Sie m�ssen DetectString zum �ffnen eines neuen Grafikformats manuell �ndern [LibGFL unterst�tzt nahezu 100 Formate] (f�r JPEG2000 kopiere Xjp2.dll aus dem LibGFL SDK in den Ordner mit den Dateien libgfl220.dll und libgfle220.dll);
  + Shift+BildAb\Shift+BildAuf zeigt n�chste/vorherige Seite in mehrseitigen Dateien (wie TIFF);
 * kleinere �nderungen und Bug Fixes.

Ver 1.8.3 BETA:
 + Feature Datei umbenennen;
 + wenn Bild sich im Anpassen-Modus befindet, �ffnen die Tasten links, hoch, rechts, runter n�chstes/vorheriges Bild (wie im Standard-Viewer von Win XP);
 + w�hle Anpassen-Modus bei Pluginstart (Setup-Dialog - Allgemein);
 + numerisches Sortieren in Win XP (Setup-Dialog - Allgemein);
 + einiges mehr;
 * kleinere �nderungen und Bug Fixes.

Ver 1.8.4:
 + zeige Dateigr��e in Statusbar (�ndern des Ansichts-Modus: Setup-Dialog - Erweitert. Voll vergleichbar dem Setup der Spaltengr��e im TC);
 * haupts�chlich kleinere �nderungen und Bug Fixes.

Ver 1.8.5 BETA:
 + zeige JPEG-Kommentar in JPEG-Dateien falls vorhanden (Info-Dialog);
 + drehe JPEG-Bilder entsprechend der EXIF-Ausrichtungswerte beim Laden (Setup-Dialog - JPEG);
 + drehe JPEG-Miniaturen entsprechend der EXIF-Ausrichtungswerte (Setup-Dialog - JPEG);
 + M�glichkeit zum Kopieren/Bewegen/Erzeugen des Links der Datei durch Klick der rechten Maustaste auf die Statusbar und "Ziehen" in den Explorer (Setup-Dialog - Experte);
 + automatische, verlustfreie JPEG-Umwandlung �ber EXIF-Ausrichtungswert (Tasten Shift+A, ben�tigt libgfl220.dll und libgfle220.dll);
 + behalte originales Dateidatum/-zeit bei verlustfreier JPEG-Umwandlung (Setup-Dialog - JPEG);
 + setze EXIF-Ausrichtungswert bei verlustfreier JPEG-Umwandlung zur�ck (Setup-Dialog -JPEG).

Ver 1.8.6:
 * Scrollleiste einige Fixes;
 + Meneintrag Duckvorschau standardm��ig verf�gbar (Men� Bild);
 + Zeige Bild-IPTC-Information falls vorhanden (Infodialog);
 + show GIF image comments if present (Infodialog);
 + M�glichkeit zum Setzen eines nicht transparenten Hintergrundes f�r das Info-Label (Setup-Dialog - Allgemein);
 + GIF-Animation Antialiasing (Setup-Dialog - Erweitert);
 * kleinere �nderungen und Bug Fixes.

Ver 1.8.7 RC:
 + Erlaubt Vollbildvorschau im QuickView-Modus (Experten-Einstellungen);
 + Einstellungscache zur Beschleunigung des Startens\Schlie�ens des Plugins auf austauschbaren Datentr�gern (Experten-Einstellungen);
 + Anzeige von Dateidatum/Dateizeit in der Statusleister (Setup-Dialog - Erweitert);
 * kleinere �nderungen und Bug Fixes.

Ver 1.8.7.1:
 * schwerer Bug im Zusammenhang mit animierten GIF-Grafiken gefixt: einige Bilder hinterlassen "Schweife" (nicht ordentlich ger�umter Hintergrund) beim animieren des Bildes;
 + grundlegende Arbeit mit Profilen: benennen Sie irgend ein *.profile in ein SGViewer.profile um und dessen Einstellungen werden beim ersten Pluginstart angewandt (kann bei Reinstallion des Plugins oder Installation auf einem anderen Rechner behilflich sein);
 * kleinere �nderungen und Bug Fixes.

Ver 1.8.8:
 * gefixt JPEG-drehung durch EXIF;
 + Support f�r libjfl version 2.54 (libgfl254.dll, libgfle254.dll);
 + Funktion Immer im Vordergrund (Men�);
 + Dateigr��e Zeige neue Werte: Dynamisch erweitert (x.xx k/M/G) und Wie Explorer (x.xx/xx.x/xxx) (Setupdialog - Erweitert);
 * kleinere �nderungen und Bug Fixes.

Ver 1.8.8.1:
 + Funktion "Datum/Uhrzeit letzter Zugriff statt letzter Schreibzugriff anzeigen" (Setup-Dialog - Erweitert);
 + Funktion "Eintrag "Schlie�en" dem Popup-Men� himzuf�gen" (Setup-Dialog - Erweitert);
 * kleinere �nderungen und Bug Fixes.

Ver 1.9:
 + experimentelle Funktionen Ohne Antialiasing an Breite und H�he anpassen (Men� - Setup);
 * bis zu 8 Shell-Anwendungen im Men� ohne Icons (Setup-Dialog - Shell)
 * kleinere �nderungen und Bug Fixes.


---
Vorschl�ge, W�nsche und Bug Reports sind willkommen (please send it in english)!
ProgMan13, (ProgMan13@mail.ru)
