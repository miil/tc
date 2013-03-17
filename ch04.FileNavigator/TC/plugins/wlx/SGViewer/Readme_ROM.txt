SGViewer v 1.8.6

Extensie Lister pentru Total Commander 5.51 sau ulterior, pentru vizualizarea imaginilor.

Donationware.


*** Notã ***

În TC 5.51 trebuie dezactivatã vizualizarea imaginilor în IrfanView (în panoul de configurare Lister). În TC 6 sau ulterior, acest lucru nu mai este necesar.


*** Formate grafice redate ***

BMP, JPEG, PNG, GIF, TIFF (nu toate metodele de compresie), PSD, TGA, PCX, PCD, PSP, EMF, WMF.


*** Funcþii ***

- interfaþã inteligibilã;
- navigare facilã;
- expunere în mod Tot ecranul;
- diafilm;
- prezentare aleatoare;
- antialiasing pentru imaginile potrivite;
- redare animaþie GIF;
- interfaþã multilingvã (englezã, francezã, germanã, românã, rusã, spaniolã);
- copiere, mutare, eliminare a fiºierelor grafice;
- deschidere imagini în orice aplicaþie;
- copiere imagine în ºi punere din Clipboard;
- salvare imagini ca BMP sau JPEG;
- operaþii cu imagini (rotire, întoarcere etc.);
- operaþii elementare de tipãrire a imaginilor;
- utilizare ijl15.dll pentru încãrcare rapid JPEG;
- utilizare libgfl220.dll ºi libgfle220.dll pentru transformare fãrã pierderi JPEG (Lossless Transform) ºi modul "miniaturi" al TC;
- ºi multe altele!


*** Taste funcþionale ***


 * Navigare *

Spaþiu - expunere fiºier urmãtor (ordonat) (la ordine aleatoare - expunere un fiºier, aleator);
Backspace - expunere fiºier anterior (ordonat);
Ctrl+D - expunere fiºier principal (primul afiºat, cel afiºat cu F3 sau Ctrl-Q în TC);
Pause(Break) - pornire/oprire diafilm;
PageDown - expunere fiºier urmãtor (dupã ultimul: nici o acþiune);
PageUp - expunere fiºier anterior (dupã primul: nici o acþiune);
Home - expunere primul fiºier;
End - expunere ultimul fiºier;
G – expunere panou Alegere imagine dupã numãr;
Insert(Ins) - expunere fiºier aleator (fãrã activarea prezentãrii aleatoare);
Alt+Enter sau Buton mijloc maus – comutare mod Tot ecranul;
Rotiþã maus sus/jos – expunere fiºier urmãtor/anterior;
Del - eliminare fiºier (trebuie activatã posibilitate eliminãrii);
 
 * Interfaþã *

Ctrl+B - expunere/ascundere barã status;
Ctrl+I - expunere/ascundere etichetã;
Ctrl+T - expunere/ascundere pupitru;
Shift+Ctrl+T - expunere pupitru în poziþia standard;
B - comutare potrivire doar imagini mari (micºorare)/ potrivire toate imaginile;
F - potrivire imagine/scalare imagine 1:1;
* numeric - potrivire imagine; 
/ numeric - scalare 1:1;
+ numeric - scalare + imagine;
- numeric - scalare - image;
Ctrl+Rotiþã maus sus/jos – scalare +/- imagine;
Ctrl+Buton stânga/dreapta maus – scalare +/- imagine;

 * Imagine *

I – expunere panou Informaþii imagine, incluzând EXIF pentru JPEG (fiºierul trebuie sã existe);
L - rotire imagine la stânga;
R - rotire imagine la dreapta;
V - întoarcere imagine pe verticalã;
H - întoarcere imagine pe orizontalã;
T - expunere canal alfa în imagini pe 32 de biþi (dacã sunt activate potrivirea ºi antialiasing-ul);
Shift+G - imagine alb-negru;
Shift+T - negativ imagine;
Shift+R – expunere panou Dimensionare imagine;
Ctrl+R – reîcãrcare imagine curentã;
Ctrl+S - salvare imagine ca BMP sau JPEG;
Ctrl+E - punere imagine ca tapet pe birou (centrat);
Shift+E - punere imagine ca tapet pe birou (potrivit);
Shift+Ctrl+E - punere imagine ca tapet pe birou (multiplicat);
 Shift+Ctrl+R - JPEGLosslessTransform - rotire imagine cu 90 de grade (necesitã libgfl220.dll ºi libgfle220.dll);
 Shift+Ctrl+L - JPEGLosslessTransform - rotire imagine cu 270 de grade (necesitã libgfl220.dll ºi libgfle220.dll);
 Shift+Ctrl+H - JPEGLosslessTransform - întoarcere imagine pe orizontalã (necesitã libgfl220.dll ºi libgfle220.dll);
 Shift+Ctrl+V - JPEGLosslessTransform - întoarcere imagine pe verticalã (necesitã libgfl220.dll ºi libgfle220.dll);
 Shift+A - JPEGLosslessTransform - automat, dupã valoarea orientãrii EXIF (necesitã libgfl220.dll ºi libgfle220.dll);


*** Utilizare DLL-uri externe ***

- Pentru încãrcarea rapid a fiºierelor JPEG se poate folosi Intel JPEG Library (ijl15.dll). Trebuie activat în panoul de configurare, în pagina "JPEG". Fiºierele JPEG sunt încãrcare de câteva ori mai rapid!
   DLL-ul trebuie copiat într-unul din dosarele: SGViewer\Plugins, SGViewer sau Windows.
- Pentru folosirea JPEG Lossless Transform ºi a modului "miniaturi" în TC, e nevoie de libgfl220.dll ºi libgfle220.dll, ale lui Pierre-E Gougelet.
   DLL-urile trebuie copiate într-unul din dosarele: SGViewer\Plugins, SGViewer sau Windows.


*** Instalare ***

 * TC 5.51 * 

1. Despachetare fiºiere în dosarul extensiilor (plugin);
2. Alegere în meniul TC: Configurare - Opþiuni;
3. Afiºare paginã "Editare/Vizualizare";
4. Apãsare buton "Configurare vizor intern";
5. Apãsare buton "Plug-in-uri LS";
6. Apãsare buton "Adaugã" ºi alegere SGViewer.wlx;
7. Apãsare "OK".

 * TC 6.5 sau ulterior *

Aceastã versiune a TC are funcþiunea "instalare extensii automat". La intrarea în pachetul cu extensia, TC te va întreba dacã vrei sã instaleze extensia. 


*** Licenþa ***

  Acest software e furnizat "AS-IS" ("aºa cum este"), fãrã nici o clauzã, doar pentru utilizarea non-comercialã.


*** Informaþii auxiliare ***

Extensie dezvoltatã în Delphi 6, folosind:
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
  Intel JPEG Library (ijl15.dll), licenþiat de Intel.

  Mulþumiri lui Evgueny Svertchkov (listtv@citycat.ru) pentru Zoom.

  Ajutor important pentru rezolvarea disfuncþiilor cu P4 HT din partea lui Alex Martemyanov (AlexMart@opfr.vrn.ru) ºi Systemizer (systemizer99@mtu-net.ru).

  Mulþumiri lui Christian Ghisler pentru câteva sfaturi ºi funcþii.

Mulþumiri, de asemenea, tuturor celor care mi-au dat idei ºi mi-au semnalat disfuncþii.

 * Traducãtori *

Traducerea în francezã de Claude Charries (charries_AT_wanadoo_DOT_fr);
Traducerea în spaniolã de Luis Mejia;
Traducerea în germanã de Kurt Lettmaier (k.lettmaier@onlinehome.de);
Traducerea în românã de Dan Lungescu (dan.lungescu@gmail.com).
Traducerea în ucraineanã de Maximus (mxmus@yandex.ru).


*** Istoric ***

Ver 0.1:
 * realizarea iniþialã.

Ver 1.0:
 + salvare ca BMP;
 + expunere în mod Tot ecranul;
 + diafilm;
 * modificãri minore ºi înlãturãri disfuncþii.

Ver 1.3:
 + salvare ca JPG;
 + câteva operaþii cu imagini;
 * modificãri minore ºi înlãturãri disfuncþii.

Ver 1.5:
 + scalare (experimental);
 + centrare imagini;
 + potrivire imagini mici/mari;
 + rotiþã maus: schimbare imagine, cu Shift - scalare;
 + panou alegere imagine dupã numãr (G);
 + panou informaþii imagine (I);
 + panou dimensionare imagine (Shift+R);
 + noi elemente meniu ºi taste funcþionale (ex.: Alt+Enter - Tot ecranul);
 + ordonare internã dupã nume, extensie, nicicum, ordine inversã (Configurare);
 * modificãri minore ºi înlãturãri disfuncþii.

Ver 1.6:
 * rotiþã maus: cu Ctrl - scalare;
 + Ctrl+Buton stânga/dreapta maus – scalare +/-;
 + pupitru (barã butoane);
 + punere imagini ca tapet birou (Imagine - Punere ca tapet);
 + utilizare DLL de la Pierre-E Gougelet pentru JPEGLosslessTransform;
 * meniu reproiectat;
 + prezentare imagine aleator cu butonul Insert (Ins);
 + opþiune Avansare dupã încãrcare (Configurare) - imaginea este proiectatã la încãrcarea sa;
 * modificãri minore ºi înlãturãri disfuncþii.

Ver 1.7:
 * Corectare rotire cu 180 de grade (90 x 2);
 * Corectare întoarcere pe verticalã ºi orizontalã;
 + posibilitate ascundere indicaþii butoane (Configurare - Generalitãþi);
 + auto-dimensionare rubrici barã status (Configurare - Generalitãþi);
 + Home/End - expunere prima/ultima imagine;
 + bara de titlu Lister poate conþine numele întreg al fiºierului expus (Configurare - Expert);
 + Operaþii fiºiere (copiere, mutare, eliminare) (Configurare - Expert);
 + posibilitate copiere fiºier în orice dosar (Birou, dosar deschis în TC etc.) sau deschidere în orice aplicaþie, prin "tragerea" simbolului din bara de status (fiºierul trebuie sã existe; este ignoratã dezactivarea operaþiilor cu fiºiere);
 * modificãri minore ºi înlãturãri disfuncþii.

Ver 1.7.1 BETA:
 + miniaturi în TC 6.5
 * rezolvare disfuncþie "pierdere configuraþie";
 + metode noi ordonare fiºiere (dupã mãrime, dupã datã);
 * corectare expunere imagini dupã schimbare ordonare;
 + deschidere imagine curentã în aplicaþia asociatã extensiei sau în oricare alta (Configuraþie - Sistem);
 + etichetã informativã;
 * modificãri minore ºi înlãturãri disfuncþii.

Ver 1.7.1 BETA2:
 * corectare miniaturi în TC 6.5;
 * rezolvare disfuncþie "pierdere configuraþie pupitru";
 + funcþii noi (în Configurare);
 * modificãri minore în panou Configurare;
 * corectare închidere mod Tot ecranul;
 * modificãri minore ºi înlãturãri disfuncþii.

Ver 1.7.5 BETA:
 * re-corectare miniaturi în TC 6.5;
 + funcþii noi (în panou Configurare);
 + mod "prezentare aleatoare" prin butonul Spaþiu ºi în modul Diafilm;
 * modificãri minore în panou Configurare;
 * modificãri minore ºi înlãturãri disfuncþii.

Ver 1.7.6 BETA:
 + expunere formate EMF ºi WMF;
 + interfaþã multilingvã;
 * multe alte adãugãri/corecturi.

Ver 1.7.7:
 + noi elemente meniu;
 + posibilitate blocare pupitru;
 + posibilitate lansare în mod Tot ecranul (Configurare - Expert);
 * modificare panou Configurare (design ca al panoului de configurare TC);
 * modificãri minore ºi înlãturãri disfuncþii.

Ver 1.8 BETA:
 + utilizare ijl15.dll pentru încãrcare rapid fiºiere JPEG (vitezã de câteva ori mai mare!) (Configurare - JPEG);
 + utilizare libgfl220.dll ºi libgfle220.dll pentru transformarea fãrã pierderi JPEG (JPEG Lossless Transform) ºi modul "miniaturi" în TC;
 + antialiasing pentru imaginile potrivite (poate încetini expunerea imaginilor mari);
 * scalare pe baza scãrii curente;
 * modificãri minore ºi înlãturãri disfuncþii.

Ver 1.8.1 BETA:
 * bibliotecile auxiliare (ijl15.dll, libgfl220.dll, libgfle220.dll) pot fi incluse în dosarele SGViewer\Plugins sau SGViewer;
 + utilizare variabile sistem (ex. %COMMANDER_PATH%) în localizarea aplicaþiilor externe (Configurare - Sistem);
 + alegere filtru antialiasing (Configurare - Suplimentar);
 + posibilitate dezactivare automat antialiasing la imagini mari (Configurare - Suplimentar);
 + "ignorare" mesaje rotiþã maus înainte de încãrcarea imaginii urmãtoare/anterioare, prin stabilirea valorii "WheelSkipCount" în fiºierul de configurare (util în cazul unui maus KatMouse sau mai vechi);
 * miºcarea rotiþei mausului deasupra barelor de defilare are ca efect defilarea, nu expunerea fiºierului anterior/urmãtor;
 + alegere set litere pentru eticheta informativã (Cofigurare - Generalitãþi)
 + folosire test alpha channel pentru imagini pe 32 de octeþi (dacã sunt activate Potrivire ºi Antialiasing) PNG ºi BMP: comutare mod prin tasta T;
 * modificare panou Configurare;
 * modificãri minore ºi înlãturãri disfuncþii.

Ver 1.8.2 BETA:
 * corectare "eroare 1400";
 + încãrcare imagini folosind libgflX.dll (Configurare - JPEG);
 * trebuie schimbat manual DetectString pentru încãrcarea noilor formate de fiºier [LibGFL înþelege aproape 100 de formate] (pentru JPEG2000 copiazã Xjp2.dll din LibGFL SDK în dosarul cu fiºierele libgfl220.dll ºi libgfle220.dll);
 + Shift+PgDown/Shift+PgUp expun pagina urmãtoare/anterioarã în fiºierele cu mai multe pagini (precum TIFF);
 * modificãri minore ºi înlãturãri disfuncþii.

Ver 1.8.3 BETA:
 + rebotezare fiºier;
 + în modul Potrivire imagine, butoanele Stânga,Sus/Dreapta,Jos expun imaginea anterioarã/urmãtoare (ca în vizorul standard al Windows XP);
 + alegere Mod Potrivire la lansarea SGViewer (Configurare - Generalitãþi);
 + ordonare numeric în Windows XP (Configurare - Generalitãþi);
 + alte elemente;
 * modificãri minore ºi înlãturãri disfuncþii.

Ver 1.8.4:
 + expunere mãrime fiºier în barã status (Configurare - Suplimentar. Conformare dupã lãþimi coloane TC);
 * în principal modificãri minore ºi înlãturãri disfuncþii.

Ver 1.8.5 BETA:
 + expunere comentarii JPEG, dacã existã, în fiºiere JPEG (panou Informaþii imagine);
 + rotire imagini JPEG la încãrcare, pe baza valorii orientãrii EXIF (Configurare - JPEG);
 + rotire miniaturi JPEG pe baza valorii orientãrii EXIF (Configurare - JPEG);
 + posibilitate copiere/mutare/creare lansator prin clic-dreapta pe bara de status ºi tragere în Explorer (Configurare - Expert);
 + aplicare automat JPEG Lossless Transform pe baza valorii orientãrii EXIF (tastele Shift+A, necesitã libgfl220.dll ºi libgfle220.dll);
 + pãstrare datã/orã fiºier original la JPEG Lossless Transform (Configurare - JPEG);
 + înlãturare valoare orientare EXIF la JPEG Lossless Transform (Configurare -JPEG).

Ver 1.8.6:
 * corecturi pentru barele de defilare;
 + elementul de meniu Mostrã tipãrire activat în mod implicit (meniu Imagine);
 + prezentare informaþii IPTC imagine, dacã existã (panou Informaþii imagine);
 + prezentare comentarii imagine GIF, dacã existã (panou Informaþii imagine);
 + posibilitate alegere fundal opac pentru eticheta informativã (Configurare - Generalitãþi);
 + antialising animaþie GIF (Configurare - Suplimentar);
 * modificãri minore ºi înlãturãri disfuncþii.


---
Sugestiile, dorinþele ºi semnalarea disfuncþiilor sunt binevenite!
ProgMan13, (ProgMan13@mail.ru)
