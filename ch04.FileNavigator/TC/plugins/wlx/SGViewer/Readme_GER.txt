SGViewer v 1.9

Lister Plugin zur Anzeige von Bildern für Total Commander 5.51 oder neuer.

Donationware.


*** Anmerkung ***

Im TC 5.51 die Verwendung von Irfan View im Setup-Dialog des internen Viewers (namens Lister) abschalten. Im TC 6 oder neuer ist dies nicht notwendig.


*** Unterstützte Bildformate ***

BMP, JPEG, PNG, GIF, TIFF (nicht alle Komprimierungsmethoden unterstützt), PSD, TGA, PCX, PCD, PSP, EMF, WMF.


*** Features ***

- leicht verständliches Interface;
- einfache Navigation;
- Vollbildansicht;
- Slideshow;
- Zufalls-generierter Ansichtsmodus;
- Antialiasing bei geeigneten Bildern;
- Anzeige von Animation in GIF-Dateien;
- mehrsprachige Benutzeroberfläche (Englisch, Deutsch, Französisch, Koreanisch, Russisch, Spanisch, Ukrainisch, Ungarisch);
- Kopieren, Umbenennen, Löschen von Bilddateien;
- Öffnen des aktuellen Bildes in irgend einer Applikation;
- Kopieren von Bildern in die und Einfügen aus der Zwischenablage;
- Speichern von Bildern als BMP oder JPEG;
- Bildoperationen (Rotieren, Spiegeln, usw.);
- grundlegende Funktion zum Druck von Bildern;
- unterstützt ijl15.dll für schnelles Laden von JPEGs;
- unterstützt libgfl220.dll und libgfle220.dll für verlustfreie JPEG-Umwandlung und Miniaturansicht TC-Modus;
- und vieles mehr!


*** Keyboard Shortcuts ***


 * Navigation *

Leertaste - zeige nächste Datei (in Schleife) (wenn Zufalls-generierte Ansicht aktiviert ist - zeige zufällige Datei);
Backspace - zeige vorherige Datei (in Schleife);
Strg+D - zeige zuerst angezeigtes Datei (die Sie nach dem Drücken von F3 oder Strg-Q im TC sehen);
Pause - starte/stoppe Slideshow;
BildAb - zeige nächste Datei (wenn letzte Datei angezeigt wird, mach nichts);
BildAuf - zeige vorherige Datei (wenn erste Datei angezeigt wird, mach nichts);
Pos1 - zeige erste Datei;
End - zeige letzte Datei;
G – zeige Dialog Gehe zu Bild Nummer;
Enfügen(Einfg) - zeige zufällige Datei (ignoriere deaktivierten Zufallsmodus);
Alt+Enter oder Mittlerer Mausbutton – Vollbildmodus an/aus;
Mausrad-Bewegung rauf/runter – zeige nächste/vorherige Bilddatei;
Entf - lösche Bilddatei (Löschfunktion wird aktiviert);

 * Interface *

Strg+B - zeige/verstecke Statusbar;
Strg+I - Infolabel an/aus;
Strg+T - Toolbar an/aus;
Shift+Strg+T - setzt Toolbar-Position zurück und zeigt diese an;
B - umschalten zwischen Nur große Bilder anpassen (verkleinern)/ alle Bilder anpassen;
F - Bild anpassen/zeige Bild in Originalgröße;
NumLock Asterisk (*) - Bild anpassen;
NumLock Slash (/) - zeige Bild in Originalgröße;
NumLock Plus (+) - Bild einzoomen;
NumLock Minus (-) - Bild auszoomen;
Strg+Mausrad-Bewegung rauf/runter – zoome Bild +/-;
Strg+Linker/Rechter Mausbutton – zoome Bild +/-;

 * Bild *

I – zeige Bildinformations-Dialog incl. EXIF für JPEG (Datei muß existieren);
L - Bild nach links drehen;
R - Bild nach rechts drehen;
V - Bild vertikal spiegeln;
H - Bild horizontal spiegeln;
T - Zeige Alphakanal in 32-bit-Bildern (wenn angepasst und bei aktiviertem Antialiasing);
Shift+G - konvertiere Bild in Graustufen;
Shift+T - konvertiere Bild in Negativ;
Shift+R – zeige Dialog Bildgröße ändern;
Strg+R – aktuelles Bild neu laden;
Strg+S - Bild als Bitmap oder JPEG speichern;
Strg+E - Bild als Desktop-Hintergrund setzen (zentriert);
Shift+E - Bild als Desktop-Hintergrund setzen (gestreckt);
Shift+Strg+E - Bild als Desktop-Hintergrund setzen  (gekachelt);
 Shift+Strg+R - JPEGLosslessTransform - drehe Bild um 90 Grad (erfordert libgfl220.dll und libgfle220.dll);
 Shift+Strg+L - JPEGLosslessTransform - drehe Bild um 270 Grad (erfordert libgfl220.dll und libgfle220.dll);
 Shift+Strg+H - JPEGLosslessTransform - Bild horizontal spiegeln (erfordert libgfl220.dll und libgfle220.dll);
 Shift+Strg+V - JPEGLosslessTransform - Bild vertikal spiegeln (erfordert libgfl220.dll und libgfle220.dll);
 Shift+A - JPEGLosslessTransform - drehe automatisch über EXIF-Ausrichtungs-Wert (erfordert libgfl220.dll und libgfle220.dll);


*** Verwenden externer DLL's ***

- Zum schnellen Laden von JPEGs können Sie die Intel JPEG Library (ijl15.dll) verwenden. Sie müssen diese auch im Setup-Fenster auf der "JPEG"-Seite aktivieren. Das Laden von JPEG-Dateien wird um einiges schneller!
   Kopieren Sie diese DLL in das Verzeichnis SGViewer\Plugins oder ins SGViewer-Verzeichnis selbst oder ins Windows-Verzeichnis.
- Zum Verwenden des verlustfreien JPEG-Umwandlungs- und Miniaturansichts-Modus im TC you benötigen Sie die Dateien libgfl220.dll und libgfle220.dll von Pierre-E Gougelet.
   Kopieren Sie diese DLL's in den Ordner SGViewer\Plugins in den Ordner SGViewer oder in den Ordner Windows.
   Sie können die neue libgfl240.dll und libgfle240.dll in libgfl220.dll und libgfle220.dll umbenennen und weiterverwenden.


*** Installation ***

 * TC 5.51 *

1. Entpacken Sie die Dazeien aus dem Archiv in Ihr gewünschtes Plugin-Verzeichnis;
2. Wählem Sie im TC-Menü Konfiguration - Optionen;
3. Öffnen Sie die Seite "Viewer/Editor";
4. Klicken Sie auf "Internen Viewer konfigurieren";
5. Klicken Sie auf "LS-Plugins";
6. Klicken Sie auf "Hinzufügen" und wählen Sie SGViewer.wlx;
7. Drücken Sie "OK".

 * TC 6.5 oder neuer *

Diese Version des TC besitzt ein feature "Automatische Plugininstallation". öffnen Sie nur das Archiv mit dem Plugin und TC fragt Sie nach der Plugin-Installation.


*** Lizenz Vereinbarung ***

  Diese Software wird "AS-IS" ohne jegliche Garantie nur zum nicht-kommerziellen Gebrauch bereitgestellt.


*** Zusätzliche Information ***

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

  Danke an Evgueny Svertchkov (listtv@citycat.ru) für den Zoom.

  Eine große Hilfe beim Lösen der Bugs mit P4 HT waren Alex Martemyanov (AlexMart@opfr.vrn.ru) und Systemizer (systemizer99@mtu-net.ru).

  Danke an Christian Ghisler für einige Tipps und Funktionen.

Ebenso dank an alle, die mich mit Ideen füttern und mir Bug Reports mailen.

* Übersetzer *

Französische Übersetzung von Claude Charries(charries_AT_wanadoo_DOT_fr);
Spanische Übersetzung von Luis Mejia;
Deutsche Übersetzung von Kurt Lettmaier (k.lettmaier@onlinehome.de);
Rumänische Übersetzung von Dan Lungescu (dan.lungescu@gmail.com).
Ukrainische Übersetzung von Maximus (mxmus@yandex.ru);
Ungarische Übersetzung von Laszlo Kontor (kola.11@freemail.hu).
Koreanische Übersetzung von BlueSolvit (bluesolvit@hanmail.net).


*** Changes History ***

Ver 0.1:
 * Anfangs-Release.

Ver 1.0:
 + Speichern nach BMP;
 + Vollbildansicht;
 + Slideshow;
 * kleinere Änderungen und Bug Fixes.

Ver 1.3:
 + Speichern nach JPG;
 + einige Operationen mit Bildern;
 * kleinere Änderungen und Bug Fixes.

Ver 1.5:
 + experimenteller Zoom;
 + Bild kann zentriert werden;
 + Anpassen kleiner/goßer Bilder;
 + Mausrad: Bild wechseln, mit Shift - Zoom;
 + "Gehe zu"-Dialog (G);
 + Informations-Dialog (I);
 + "Bildgröße ändern"-Dialog (Shift+R);
 + neue Menüeinträge und Shortcuts (z.B. Alt+Enter - Vollbild);
 + interne Sortierung von Dateien nach Name, Erweiterung, unsortiert, umgekehrte Sortierreihenfolge (Setup-Dialog);
 * kleinere Änderungen und Bug Fixes.

Ver 1.6:
 * Mausrad: mit Strg - Zoom;
 + Strg+Linker/Rechter Mausbutton – Zoom +/-;
 + Toolbar;
 + setze Bilder als Desktop-Hintergrund (Bild - Setze als Hintergrund);
 + unterstützt DLL von Pierre-E Gougelet für JPEGLosslessTransform;
 * Menü neu angeordnet;
 + mit Einfügen(Einfg)-Button werden Bilder zufällig angezeigt;
 + Option Ändere Bild nach dem Neuladen (Setup-Dialog) ändert Bildanzeige beim Laden des neuen Bildes;
 * kleinere Änderungen und Bug Fixes.

Ver 1.7:
 * Um 180° drehen fix: dreht jetzt tatsächlich 180 Grad (Dreht um 90 x 2);
 * vertikal/horizontal spiegeln fix: ausgetauscht;
 + Toolbar Hinweise können abgeschaltet werden (Setup-Dialog - Allgemein);
 + Statusbar-Panele automatische Größe (Setup-Dialog - Allgemein);
 + Pos1/Ende - zeige erstes/letztes Bild;
 + Lister-Titel kann beim Laden eines neuen Bildes den vollen Dateinamen zeigen (Setup-Dialog - Experte);
 + Datei-Operationen (kopieren, umbenennen, löschen) (Setup-Dialog - Experte);
 + Jetzt können Sie Bilder kopieren, indem Sie die Statusbar (wenn Datei existiert) in irgend ein Verzeichnis ziehen (Desktop, geöffneter Ordner im TC-Dateipanel, usw.) oder in irgend ein geöffnetes Programm (Erlaube Dateioperationen deaktivieren);
 * kleinere Änderungen und Bug Fixes.

Ver 1.7.1 BETA:
 + Miniaturen für TC 6.5
 * gefixt Bug "automatisches Zurücksetzen der Einstellungen";
 + zusätzliche internene Datei-Sortiermethoden (nach Größe, nach Datum);
 * gefixt zeigt Bilder wenn Sortiermethode wechselt;
 + öffne aktuelles Bild in Shell-Standardprogramm oder irgend einem anderen (Setup - Shell);
 + Info-Label;
 * kleinere Änderungen und Bug Fixes.

Ver 1.7.1 BETA2:
 * gefixt Miniaturen für TC 6.5;
 * gefixt Bug "automatisches Zurücksetzen der Toolbar-Einstellungen";
 + neue Funktionen (im Setup-Dialog);
 * Setup-Dialog kleinere Änderungen;
 * Änderungen am Schließverhalten von Vollbild (interner Fix);
 * kleinere Änderungen und Bug Fixes.

Ver 1.7.5 BETA:
 * nochmal gefixt Miniaturen für TC 6.5;
 + neue Funktionen (im Setup-Dialog);
 + "Zufälliges Bild"-Modus mit Leertaste und im Slideshow-Modus;
 * Setup-Dialog kleinere Änderungen;
 * kleinere Änderungen und Bug Fixes.

Ver 1.7.6 BETA:
 + EMF, WMF Dateiormate werden unterstützt;
 + Unterstützung von mehreren Sprachen;
 * viele weitere Hinzufügungen/Fixes.

Ver 1.7.7:
 + neue Menüeinträge;
 + Toolbar kann jetzt gesperrt werden;
 + Das Plugin kann jetzt im Vollbild-Modus starten (Setup-Dialog - Experte);
 * Setup-Dialog geändert (jetzt wie TC-Setup-Diaolog);
 * kleinere Änderungen und Bug Fixes.

Ver 1.8 BETA:
 + unterstützt ijl15.dll für schnelles Laden von JPEG-Dateien (Laden von JPEG wird um einiges schneller!)(Setup - JPEG);
 + unterstützt libgfl220.dll und libgfle220.dll für verlustfreien JPEG-Umwandlungs- und Miniaturansichts-Modus in TC;
 + Antialiasing für angepasste Bilder (kann bei großen Bildern zu Geschwindigkeitseinbußen führen);
 * Zoom wechselt jetzt vom aktuellen Fenster;
v
Ver 1.8.1 BETA:
 * zusätzliche Bibliotheken (ijl15.dll, libgfl220.dll, libgfle220.dll) können jetzt ins SGViewer\Plugins-Verzeichnis oder SGViewer-Verzeichnis eingefügt werden;
 + Unterstützung für Umgebungsvariable (z.B. %COMMANDER_PATH%) im Pfad zu externer Anwendung (Setup-Dialog - Shell);
 + wähle Antialiasing-Filter (Setup-Dialog - Erweitert);
 + automatisches Deaktivieren des Antialiasing bei großen Bildern (Setup-Dialog - Erweitert);
 + "Übergehen" der Meldungen für Mausräder vor dem Laden des nächsten/vorherigen Bildes durch Setzen des Wertes der "Übergehungen" im Eintrag der Setup-Datei "WheelSkipCount" (nützlich bei KatMouse oder alten Mäusen);
 * Radscrollen über die Scrollbars scrollt diese statt nächstes/vorheriges Bild zu laden;
 + wähle Schrift für Info-Label (Setup-Dialog - Allgemein)
 + teste alpha-Kanal-Unterstützung in 32 bit Bildern (wenn möglich und Antialiasing aktiviert) PNG und BMP: andere Modus durch drüchen der Taste T;
 * Setup-Dialog geändert;
 * kleinere Änderungen und Bug Fixes.

Ver 1.8.2 BETA:
 * gefixt "error 1400";
 + lädt Grafiken über libgflX.dll (Setup-Dialog - JPEG);
  * Sie müssen DetectString zum öffnen eines neuen Grafikformats manuell ändern [LibGFL unterstützt nahezu 100 Formate] (für JPEG2000 kopiere Xjp2.dll aus dem LibGFL SDK in den Ordner mit den Dateien libgfl220.dll und libgfle220.dll);
  + Shift+BildAb\Shift+BildAuf zeigt nächste/vorherige Seite in mehrseitigen Dateien (wie TIFF);
 * kleinere Änderungen und Bug Fixes.

Ver 1.8.3 BETA:
 + Feature Datei umbenennen;
 + wenn Bild sich im Anpassen-Modus befindet, öffnen die Tasten links, hoch, rechts, runter nächstes/vorheriges Bild (wie im Standard-Viewer von Win XP);
 + wähle Anpassen-Modus bei Pluginstart (Setup-Dialog - Allgemein);
 + numerisches Sortieren in Win XP (Setup-Dialog - Allgemein);
 + einiges mehr;
 * kleinere Änderungen und Bug Fixes.

Ver 1.8.4:
 + zeige Dateigröße in Statusbar (Ändern des Ansichts-Modus: Setup-Dialog - Erweitert. Voll vergleichbar dem Setup der Spaltengröße im TC);
 * hauptsächlich kleinere Änderungen und Bug Fixes.

Ver 1.8.5 BETA:
 + zeige JPEG-Kommentar in JPEG-Dateien falls vorhanden (Info-Dialog);
 + drehe JPEG-Bilder entsprechend der EXIF-Ausrichtungswerte beim Laden (Setup-Dialog - JPEG);
 + drehe JPEG-Miniaturen entsprechend der EXIF-Ausrichtungswerte (Setup-Dialog - JPEG);
 + Möglichkeit zum Kopieren/Bewegen/Erzeugen des Links der Datei durch Klick der rechten Maustaste auf die Statusbar und "Ziehen" in den Explorer (Setup-Dialog - Experte);
 + automatische, verlustfreie JPEG-Umwandlung über EXIF-Ausrichtungswert (Tasten Shift+A, benötigt libgfl220.dll und libgfle220.dll);
 + behalte originales Dateidatum/-zeit bei verlustfreier JPEG-Umwandlung (Setup-Dialog - JPEG);
 + setze EXIF-Ausrichtungswert bei verlustfreier JPEG-Umwandlung zurück (Setup-Dialog -JPEG).

Ver 1.8.6:
 * Scrollleiste einige Fixes;
 + Meneintrag Duckvorschau standardmäßig verfügbar (Menü Bild);
 + Zeige Bild-IPTC-Information falls vorhanden (Infodialog);
 + show GIF image comments if present (Infodialog);
 + Möglichkeit zum Setzen eines nicht transparenten Hintergrundes für das Info-Label (Setup-Dialog - Allgemein);
 + GIF-Animation Antialiasing (Setup-Dialog - Erweitert);
 * kleinere Änderungen und Bug Fixes.

Ver 1.8.7 RC:
 + Erlaubt Vollbildvorschau im QuickView-Modus (Experten-Einstellungen);
 + Einstellungscache zur Beschleunigung des Startens\Schließens des Plugins auf austauschbaren Datenträgern (Experten-Einstellungen);
 + Anzeige von Dateidatum/Dateizeit in der Statusleister (Setup-Dialog - Erweitert);
 * kleinere Änderungen und Bug Fixes.

Ver 1.8.7.1:
 * schwerer Bug im Zusammenhang mit animierten GIF-Grafiken gefixt: einige Bilder hinterlassen "Schweife" (nicht ordentlich geräumter Hintergrund) beim animieren des Bildes;
 + grundlegende Arbeit mit Profilen: benennen Sie irgend ein *.profile in ein SGViewer.profile um und dessen Einstellungen werden beim ersten Pluginstart angewandt (kann bei Reinstallion des Plugins oder Installation auf einem anderen Rechner behilflich sein);
 * kleinere Änderungen und Bug Fixes.

Ver 1.8.8:
 * gefixt JPEG-drehung durch EXIF;
 + Support für libjfl version 2.54 (libgfl254.dll, libgfle254.dll);
 + Funktion Immer im Vordergrund (Menü);
 + Dateigröße Zeige neue Werte: Dynamisch erweitert (x.xx k/M/G) und Wie Explorer (x.xx/xx.x/xxx) (Setupdialog - Erweitert);
 * kleinere Änderungen und Bug Fixes.

Ver 1.8.8.1:
 + Funktion "Datum/Uhrzeit letzter Zugriff statt letzter Schreibzugriff anzeigen" (Setup-Dialog - Erweitert);
 + Funktion "Eintrag "Schließen" dem Popup-Menü himzufügen" (Setup-Dialog - Erweitert);
 * kleinere Änderungen und Bug Fixes.

Ver 1.9:
 + experimentelle Funktionen Ohne Antialiasing an Breite und Höhe anpassen (Menü - Setup);
 * bis zu 8 Shell-Anwendungen im Menü ohne Icons (Setup-Dialog - Shell)
 * kleinere Änderungen und Bug Fixes.


---
Vorschläge, Wünsche und Bug Reports sind willkommen (please send it in english)!
ProgMan13, (ProgMan13@mail.ru)
