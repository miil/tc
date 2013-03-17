SGViewer v 1.8.6

Extensie Lister pentru Total Commander 5.51 sau ulterior, pentru vizualizarea imaginilor.

Donationware.


*** Not� ***

�n TC 5.51 trebuie dezactivat� vizualizarea imaginilor �n IrfanView (�n panoul de configurare Lister). �n TC 6 sau ulterior, acest lucru nu mai este necesar.


*** Formate grafice redate ***

BMP, JPEG, PNG, GIF, TIFF (nu toate metodele de compresie), PSD, TGA, PCX, PCD, PSP, EMF, WMF.


*** Func�ii ***

- interfa�� inteligibil�;
- navigare facil�;
- expunere �n mod Tot ecranul;
- diafilm;
- prezentare aleatoare;
- antialiasing pentru imaginile potrivite;
- redare anima�ie GIF;
- interfa�� multilingv� (englez�, francez�, german�, rom�n�, rus�, spaniol�);
- copiere, mutare, eliminare a fi�ierelor grafice;
- deschidere imagini �n orice aplica�ie;
- copiere imagine �n �i punere din Clipboard;
- salvare imagini ca BMP sau JPEG;
- opera�ii cu imagini (rotire, �ntoarcere etc.);
- opera�ii elementare de tip�rire a imaginilor;
- utilizare ijl15.dll pentru �nc�rcare rapid JPEG;
- utilizare libgfl220.dll �i libgfle220.dll pentru transformare f�r� pierderi JPEG (Lossless Transform) �i modul "miniaturi" al TC;
- �i multe altele!


*** Taste func�ionale ***


 * Navigare *

Spa�iu - expunere fi�ier urm�tor (ordonat) (la ordine aleatoare - expunere un fi�ier, aleator);
Backspace - expunere fi�ier anterior (ordonat);
Ctrl+D - expunere fi�ier principal (primul afi�at, cel afi�at cu F3 sau Ctrl-Q �n TC);
Pause(Break) - pornire/oprire diafilm;
PageDown - expunere fi�ier urm�tor (dup� ultimul: nici o ac�iune);
PageUp - expunere fi�ier anterior (dup� primul: nici o ac�iune);
Home - expunere primul fi�ier;
End - expunere ultimul fi�ier;
G � expunere panou Alegere imagine dup� num�r;
Insert(Ins) - expunere fi�ier aleator (f�r� activarea prezent�rii aleatoare);
Alt+Enter sau Buton mijloc maus � comutare mod Tot ecranul;
Roti�� maus sus/jos � expunere fi�ier urm�tor/anterior;
Del - eliminare fi�ier (trebuie activat� posibilitate elimin�rii);
 
 * Interfa�� *

Ctrl+B - expunere/ascundere bar� status;
Ctrl+I - expunere/ascundere etichet�;
Ctrl+T - expunere/ascundere pupitru;
Shift+Ctrl+T - expunere pupitru �n pozi�ia standard;
B - comutare potrivire doar imagini mari (mic�orare)/ potrivire toate imaginile;
F - potrivire imagine/scalare imagine 1:1;
* numeric - potrivire imagine; 
/ numeric - scalare 1:1;
+ numeric - scalare + imagine;
- numeric - scalare - image;
Ctrl+Roti�� maus sus/jos � scalare +/- imagine;
Ctrl+Buton st�nga/dreapta maus � scalare +/- imagine;

 * Imagine *

I � expunere panou Informa�ii imagine, incluz�nd EXIF pentru JPEG (fi�ierul trebuie s� existe);
L - rotire imagine la st�nga;
R - rotire imagine la dreapta;
V - �ntoarcere imagine pe vertical�;
H - �ntoarcere imagine pe orizontal�;
T - expunere canal alfa �n imagini pe 32 de bi�i (dac� sunt activate potrivirea �i antialiasing-ul);
Shift+G - imagine alb-negru;
Shift+T - negativ imagine;
Shift+R � expunere panou Dimensionare imagine;
Ctrl+R � re�c�rcare imagine curent�;
Ctrl+S - salvare imagine ca BMP sau JPEG;
Ctrl+E - punere imagine ca tapet pe birou (centrat);
Shift+E - punere imagine ca tapet pe birou (potrivit);
Shift+Ctrl+E - punere imagine ca tapet pe birou (multiplicat);
 Shift+Ctrl+R - JPEGLosslessTransform - rotire imagine cu 90 de grade (necesit� libgfl220.dll �i libgfle220.dll);
 Shift+Ctrl+L - JPEGLosslessTransform - rotire imagine cu 270 de grade (necesit� libgfl220.dll �i libgfle220.dll);
 Shift+Ctrl+H - JPEGLosslessTransform - �ntoarcere imagine pe orizontal� (necesit� libgfl220.dll �i libgfle220.dll);
 Shift+Ctrl+V - JPEGLosslessTransform - �ntoarcere imagine pe vertical� (necesit� libgfl220.dll �i libgfle220.dll);
 Shift+A - JPEGLosslessTransform - automat, dup� valoarea orient�rii EXIF (necesit� libgfl220.dll �i libgfle220.dll);


*** Utilizare DLL-uri externe ***

- Pentru �nc�rcarea rapid a fi�ierelor JPEG se poate folosi Intel JPEG Library (ijl15.dll). Trebuie activat �n panoul de configurare, �n pagina "JPEG". Fi�ierele JPEG sunt �nc�rcare de c�teva ori mai rapid!
   DLL-ul trebuie copiat �ntr-unul din dosarele: SGViewer\Plugins, SGViewer sau Windows.
- Pentru folosirea JPEG Lossless Transform �i a modului "miniaturi" �n TC, e nevoie de libgfl220.dll �i libgfle220.dll, ale lui Pierre-E Gougelet.
   DLL-urile trebuie copiate �ntr-unul din dosarele: SGViewer\Plugins, SGViewer sau Windows.


*** Instalare ***

 * TC 5.51 * 

1. Despachetare fi�iere �n dosarul extensiilor (plugin);
2. Alegere �n meniul TC: Configurare - Op�iuni;
3. Afi�are pagin� "Editare/Vizualizare";
4. Ap�sare buton "Configurare vizor intern";
5. Ap�sare buton "Plug-in-uri LS";
6. Ap�sare buton "Adaug�" �i alegere SGViewer.wlx;
7. Ap�sare "OK".

 * TC 6.5 sau ulterior *

Aceast� versiune a TC are func�iunea "instalare extensii automat". La intrarea �n pachetul cu extensia, TC te va �ntreba dac� vrei s� instaleze extensia. 


*** Licen�a ***

  Acest software e furnizat "AS-IS" ("a�a cum este"), f�r� nici o clauz�, doar pentru utilizarea non-comercial�.


*** Informa�ii auxiliare ***

Extensie dezvoltat� �n Delphi 6, folosind:
  GraphicEx (www.delphi-gems.com);
  RxLib for D6 (www.sgbsoftware.com)(?);
  JEDI VCL (http://jvcl.sourceforge.net);
  TPrintPreview (http://www.delphiarea.com);
  Toolbar2000 (http://www.jrsoftware.org/);
  EXIF, de la SimBa aka Dimoniusis (dimonius@mail333.com);
  TWallpaper (www.utilmind.com);
  janFX, de la Jan Verhoeven (torry.net);
  Drag and Drop Component Suite, de Angus Johnson & Anders Melander (torry.net).
  TBX for Toolbar2000, de la Alex A. Denisov(http://g32.org);
  Graphics32, de la Alex A. Denisov(http://g32.org).
  dEXIF, de la Gerry McGuire (http://mcguirez.homestead.com).

  JPEGLosslessTransform, bazat pe (GFL SDK), de la Pierre-E Gougelet (http://www.xnview.com).
  Intel JPEG Library (ijl15.dll), licen�iat de Intel.

  Mul�umiri lui Evgueny Svertchkov (listtv@citycat.ru) pentru Zoom.

  Ajutor important pentru rezolvarea disfunc�iilor cu P4 HT din partea lui Alex Martemyanov (AlexMart@opfr.vrn.ru) �i Systemizer (systemizer99@mtu-net.ru).

  Mul�umiri lui Christian Ghisler pentru c�teva sfaturi �i func�ii.

Mul�umiri, de asemenea, tuturor celor care mi-au dat idei �i mi-au semnalat disfunc�ii.

 * Traduc�tori *

Traducerea �n francez� de Claude Charries (charries_AT_wanadoo_DOT_fr);
Traducerea �n spaniol� de Luis Mejia;
Traducerea �n german� de Kurt Lettmaier (k.lettmaier@onlinehome.de);
Traducerea �n rom�n� de Dan Lungescu (dan.lungescu@gmail.com).
Traducerea �n ucrainean� de Maximus (mxmus@yandex.ru).


*** Istoric ***

Ver 0.1:
 * realizarea ini�ial�.

Ver 1.0:
 + salvare ca BMP;
 + expunere �n mod Tot ecranul;
 + diafilm;
 * modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.3:
 + salvare ca JPG;
 + c�teva opera�ii cu imagini;
 * modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.5:
 + scalare (experimental);
 + centrare imagini;
 + potrivire imagini mici/mari;
 + roti�� maus: schimbare imagine, cu Shift - scalare;
 + panou alegere imagine dup� num�r (G);
 + panou informa�ii imagine (I);
 + panou dimensionare imagine (Shift+R);
 + noi elemente meniu �i taste func�ionale (ex.: Alt+Enter - Tot ecranul);
 + ordonare intern� dup� nume, extensie, nicicum, ordine invers� (Configurare);
 * modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.6:
 * roti�� maus: cu Ctrl - scalare;
 + Ctrl+Buton st�nga/dreapta maus � scalare +/-;
 + pupitru (bar� butoane);
 + punere imagini ca tapet birou (Imagine - Punere ca tapet);
 + utilizare DLL de la Pierre-E Gougelet pentru JPEGLosslessTransform;
 * meniu reproiectat;
 + prezentare imagine aleator cu butonul Insert (Ins);
 + op�iune Avansare dup� �nc�rcare (Configurare) - imaginea este proiectat� la �nc�rcarea sa;
 * modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.7:
 * Corectare rotire cu 180 de grade (90 x 2);
 * Corectare �ntoarcere pe vertical� �i orizontal�;
 + posibilitate ascundere indica�ii butoane (Configurare - Generalit��i);
 + auto-dimensionare rubrici bar� status (Configurare - Generalit��i);
 + Home/End - expunere prima/ultima imagine;
 + bara de titlu Lister poate con�ine numele �ntreg al fi�ierului expus (Configurare - Expert);
 + Opera�ii fi�iere (copiere, mutare, eliminare) (Configurare - Expert);
 + posibilitate copiere fi�ier �n orice dosar (Birou, dosar deschis �n TC etc.) sau deschidere �n orice aplica�ie, prin "tragerea" simbolului din bara de status (fi�ierul trebuie s� existe; este ignorat� dezactivarea opera�iilor cu fi�iere);
 * modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.7.1 BETA:
 + miniaturi �n TC 6.5
 * rezolvare disfunc�ie "pierdere configura�ie";
 + metode noi ordonare fi�iere (dup� m�rime, dup� dat�);
 * corectare expunere imagini dup� schimbare ordonare;
 + deschidere imagine curent� �n aplica�ia asociat� extensiei sau �n oricare alta (Configura�ie - Sistem);
 + etichet� informativ�;
 * modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.7.1 BETA2:
 * corectare miniaturi �n TC 6.5;
 * rezolvare disfunc�ie "pierdere configura�ie pupitru";
 + func�ii noi (�n Configurare);
 * modific�ri minore �n panou Configurare;
 * corectare �nchidere mod Tot ecranul;
 * modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.7.5 BETA:
 * re-corectare miniaturi �n TC 6.5;
 + func�ii noi (�n panou Configurare);
 + mod "prezentare aleatoare" prin butonul Spa�iu �i �n modul Diafilm;
 * modific�ri minore �n panou Configurare;
 * modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.7.6 BETA:
 + expunere formate EMF �i WMF;
 + interfa�� multilingv�;
 * multe alte ad�ug�ri/corecturi.

Ver 1.7.7:
 + noi elemente meniu;
 + posibilitate blocare pupitru;
 + posibilitate lansare �n mod Tot ecranul (Configurare - Expert);
 * modificare panou Configurare (design ca al panoului de configurare TC);
 * modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.8 BETA:
 + utilizare ijl15.dll pentru �nc�rcare rapid fi�iere JPEG (vitez� de c�teva ori mai mare!) (Configurare - JPEG);
 + utilizare libgfl220.dll �i libgfle220.dll pentru transformarea f�r� pierderi JPEG (JPEG Lossless Transform) �i modul "miniaturi" �n TC;
 + antialiasing pentru imaginile potrivite (poate �ncetini expunerea imaginilor mari);
 * scalare pe baza sc�rii curente;
 * modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.8.1 BETA:
 * bibliotecile auxiliare (ijl15.dll, libgfl220.dll, libgfle220.dll) pot fi incluse �n dosarele SGViewer\Plugins sau SGViewer;
 + utilizare variabile sistem (ex. %COMMANDER_PATH%) �n localizarea aplica�iilor externe (Configurare - Sistem);
 + alegere filtru antialiasing (Configurare - Suplimentar);
 + posibilitate dezactivare automat antialiasing la imagini mari (Configurare - Suplimentar);
 + "ignorare" mesaje roti�� maus �nainte de �nc�rcarea imaginii urm�toare/anterioare, prin stabilirea valorii "WheelSkipCount" �n fi�ierul de configurare (util �n cazul unui maus KatMouse sau mai vechi);
 * mi�carea roti�ei mausului deasupra barelor de defilare are ca efect defilarea, nu expunerea fi�ierului anterior/urm�tor;
 + alegere set litere pentru eticheta informativ� (Cofigurare - Generalit��i)
 + folosire test alpha channel pentru imagini pe 32 de octe�i (dac� sunt activate Potrivire �i Antialiasing) PNG �i BMP: comutare mod prin tasta T;
 * modificare panou Configurare;
 * modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.8.2 BETA:
 * corectare "eroare 1400";
 + �nc�rcare imagini folosind libgflX.dll (Configurare - JPEG);
 * trebuie schimbat manual DetectString pentru �nc�rcarea noilor formate de fi�ier [LibGFL �n�elege aproape 100 de formate] (pentru JPEG2000 copiaz� Xjp2.dll din LibGFL SDK �n dosarul cu fi�ierele libgfl220.dll �i libgfle220.dll);
 + Shift+PgDown/Shift+PgUp expun pagina urm�toare/anterioar� �n fi�ierele cu mai multe pagini (precum TIFF);
 * modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.8.3 BETA:
 + rebotezare fi�ier;
 + �n modul Potrivire imagine, butoanele St�nga,Sus/Dreapta,Jos expun imaginea anterioar�/urm�toare (ca �n vizorul standard al Windows XP);
 + alegere Mod Potrivire la lansarea SGViewer (Configurare - Generalit��i);
 + ordonare numeric �n Windows XP (Configurare - Generalit��i);
 + alte elemente;
 * modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.8.4:
 + expunere m�rime fi�ier �n bar� status (Configurare - Suplimentar. Conformare dup� l��imi coloane TC);
 * �n principal modific�ri minore �i �nl�tur�ri disfunc�ii.

Ver 1.8.5 BETA:
 + expunere comentarii JPEG, dac� exist�, �n fi�iere JPEG (panou Informa�ii imagine);
 + rotire imagini JPEG la �nc�rcare, pe baza valorii orient�rii EXIF (Configurare - JPEG);
 + rotire miniaturi JPEG pe baza valorii orient�rii EXIF (Configurare - JPEG);
 + posibilitate copiere/mutare/creare lansator prin clic-dreapta pe bara de status �i tragere �n Explorer (Configurare - Expert);
 + aplicare automat JPEG Lossless Transform pe baza valorii orient�rii EXIF (tastele Shift+A, necesit� libgfl220.dll �i libgfle220.dll);
 + p�strare dat�/or� fi�ier original la JPEG Lossless Transform (Configurare - JPEG);
 + �nl�turare valoare orientare EXIF la JPEG Lossless Transform (Configurare -JPEG).

Ver 1.8.6:
 * corecturi pentru barele de defilare;
 + elementul de meniu Mostr� tip�rire activat �n mod implicit (meniu Imagine);
 + prezentare informa�ii IPTC imagine, dac� exist� (panou Informa�ii imagine);
 + prezentare comentarii imagine GIF, dac� exist� (panou Informa�ii imagine);
 + posibilitate alegere fundal opac pentru eticheta informativ� (Configurare - Generalit��i);
 + antialising anima�ie GIF (Configurare - Suplimentar);
 * modific�ri minore �i �nl�tur�ri disfunc�ii.


---
Sugestiile, dorin�ele �i semnalarea disfunc�iilor sunt binevenite!
ProgMan13, (ProgMan13@mail.ru)
