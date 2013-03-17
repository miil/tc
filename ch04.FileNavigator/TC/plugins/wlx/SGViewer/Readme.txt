SGViewer v 1.9.1

Lister plugin for Total Commander 5.51 or later for view images.

Donationware.


*** Note ***

In TC 5.51 turn off using Irfan View on internal viewer (named is Lister) setup dialog. In TC 6 or higher you no need do this.


*** Supported image formats ***

BMP, JPEG, PNG, GIF, TIFF (not all compression methods supported), PSD, TGA, PCX, PCD, PSP, EMF, WMF.


*** Features ***

- intelligible interface;
- easy navigation;
- full screen view;
- slideshow;
- random view mode;
- antialiasing for fitted images;
- view animation in GIF;
- multilingual user interface (English, French, German, Hungarian, Korean, Russian, Spanish, Ukrainian);
- copying, moving, deleting image files;
- open current image in any application;
- copy image to and paste from Clipboard;
- save images to BMP or JPEG;
- image operations (rotate, mirror, etc.);
- basic function for print images;
- support ijl15.dll for fast JPEG load;
- support libgfl220.dll and libgfle220.dll for JPEG Lossless Transform and thumb's view TC mode;
- and many more!


*** Keyboard shortcuts ***


 * Navigation *

Space - show next file (looped) (if Random view enabled - show random file);
Backspace - show previous file (looped);
Ctrl+D - show main (first) viewed file (who you see after F3 or Ctrl-Q pressed in TC);
Pause(Break) - run/stop slideshow;
PageDown - show next file (if last file showed then do nothing);
PageUp - show previous file (if first file showed then do nothing);
Home - show first file;
End - show last file.
G – show Go to image by number dialog;
Insert(Ins) - show random file (ignore Random mode disabling);
Alt+Enter or Middle mouse button – toggles full screen mode;
Mouse wheel scrolling up/down – show next/previous image file;
Del - delete image file (delete function will be enabled);
 
 * Interface *

Ctrl+B - show/hide status bar;
Ctrl+I - toggles info label;
Ctrl+T - toggles toolbar;
Shift+Ctrl+T - reset toolbar position and showed it;
B - toggle fit only big images (shrink)/ fit all images;
F - fit image/show image in original size;
Gray asterisk (*) - fit image; 
Gray slash (/) - show image in original size;
Gray plus (+) - zoom + image;
Gray minus (-) - zoom - image;
Ctrl+Mouse wheel scrolling up/down – zoom +/- image;
Ctrl+Left/right mouse button – zoom +/- image;

 * Image *

I – show Image info dialog including EXIF for JPEG (file must exist);
L - rotate image left;
R - rotate image right;
V - flip image vertical;
H - flip image horizontal;
T - show alpha channel in 32 bit images (if fit and antialiasing enabled);
Shift+G - convert image to grayscale;
Shift+T - convert image to negative;
Shift+R – show Resize image dialog;
Ctrl+R – reload current image;
Ctrl+S - save image as bitmap or JPEG;
Ctrl+E - set image as Desktop wallpaper (centered);
Shift+E - set image as Desktop wallpaper (stretched);
Shift+Ctrl+E - set image as Desktop wallpaper (tiled);
 Shift+Ctrl+R - JPEGLosslessTransform - rotate image on 90  degrees (need libgfl220.dll and libgfle220.dll);
 Shift+Ctrl+L - JPEGLosslessTransform - rotate image on 270 degrees (need libgfl220.dll and libgfle220.dll);
 Shift+Ctrl+H - JPEGLosslessTransform - flip image horizontal (need libgfl220.dll and libgfle220.dll);
 Shift+Ctrl+V - JPEGLosslessTransform - flip image vertical (need libgfl220.dll and libgfle220.dll);
 Shift+A - JPEGLosslessTransform - automatic by EXIF Orientation value (need libgfl220.dll and libgfle220.dll);


*** Using external DLL's ***

- For fast JPEG load you may use Intel JPEG Library (ijl15.dll). Also enable it in Setup window on "JPEG" page. Loading speed of JPEG files increasing to more times!
   Copy this dll to SGViewer\Plugins folder or SGViewer folder, or Windows folder.
- For using JPEG Lossless Transform and thumb's view mode in TC you need libgfl220.dll and libgfle220.dll from Pierre-E Gougelet.
   Copy this dll's to SGViewer\Plugins folder or SGViewer folder, or Windows folder.
   You may rename new libgfl240.dll and libgfle240.dll to libgfl220.dll and libgfle220.dll and use it.


*** Installing ***

 * TC 5.51 * 

1. Unpack files from archive to the your plugins folder;
2. Select in TC menu Configuration - Options;
3. Open "Edit/View" page;
4. Press button "Configure internal viewer";
5. Press button "LS-Plugins";
6. Press button "Add" and select SGViewer.wlx;
7. Press "OK".

 * TC 6.5 or later *

This version of TC has "auto install plugin" feature. Just enter to archive with plugin and TC ask you about plugin installing. 


*** License agrement ***

  This software provided "AS-IS" without warranty of any kind for non-commercial use only.


*** Additional info ***

Plugin developed with Delphi 6 using:
  GraphicEx (www.delphi-gems.com);
  RxLib for D6 (www.sgbsoftware.com)(?);
  JEDI VCL (http://jvcl.sourceforge.net);
  TPrintPreview (http://www.delphiarea.com);
  Toolbar2000 (http://www.jrsoftware.org/);
  EXIF from SimBa aka Dimoniusis (dimonius@mail333.com);
  TWallpaper (www.utilmind.com);
  janFX from Jan Verhoeven (torry.net);
  Drag and Drop Component Suite by Angus Johnson & Anders Melander (torry.net).
  TBX for Toolbar2000 from Alex A. Denisov (http://g32.org);
  Graphics32 from Alex A. Denisov (http://g32.org);
  dEXIF by Gerry McGuire (http://mcguirez.homestead.com).

  JPEGLosslessTransform based on (GFL SDK) from Pierre-E Gougelet (http://www.xnview.com).
  Intel JPEG Library (ijl15.dll) copyrited by Intel.

  Thanks to Evgueny Svertchkov (listtv@citycat.ru) for Zoom.

  Big help to solve bugs with P4 HT from Alex Martemyanov (AlexMart@opfr.vrn.ru) and Systemizer (systemizer99@mtu-net.ru).

  Thanks to Christian Ghisler for some hints and functions.

Also Thanks all who give me ideas and mail me bug reports.

 * Translators *

French translation by Claude Charries(charries_AT_wanadoo_DOT_fr);
Spanish translation by Luis Mejia;
German translation by Kurt Lettmaier (k.lettmaier@onlinehome.de);
Romanian translation by Dan Lungescu (dan.lungescu@gmail.com);
Ukrainian translation by Maximus (mxmus@yandex.ru);
Hungarian translation by Laszlo Kontor (kola.11@freemail.hu);
Korean translation by BlueSolvit (bluesolvit@hanmail.net).

*** Changes history ***

Ver 0.1:
 * initial release.

Ver 1.0:
 + saving to BMP;
 + full screen view;
 + slideshow;
 * minor changes and bug fixes.

Ver 1.3:
 + saving to JPG;
 + some operations with image;
 * minor changes and bug fixes.

Ver 1.5:
 + experimental zoom;
 + image can be centered;
 + fit small/big images;
 + mouse wheel: change image, with Shift - zoom;
 + Go to dialog (G);
 + information dialog (I);
 + Resize dialog (Shift+R);
 + new menu items and shortcuts (ex., Alt+Enter - fullscreen);
 + internal sorting files by name, extension, unsorted, reverse sort (Setup dialog);
 * minor changes and bug fixes.

Ver 1.6:
 * mouse wheel: with Ctrl - zoom;
 + Ctrl+Left/Right mouse button – zoom +/-;
 + toolbar;
 + set images as wallpaper to Desktop (Image - Set As Wallpaper);
 + support DLL from Pierre-E Gougelet for JPEGLosslessTransform;
 * menu rearranged;
 + with Insert(Ins) button random image showed;
 + option Change Image After Load (Setup dialog) changes image drawing on loading new image;
 * minor changes and bug fixes.

Ver 1.7:
 * Rotate 180 fix: now really rotate 180 degrees (Rotate 90 x 2);
 * Flip Vertical and Flip Horizontal fix: exchanged;
 + toolbar hints can be off (Setup Dialog - Main);
 + auto size panels of status bar (Setup Dialog - Main);
 + Home/End - show first/last image;
 + Lister caption can show full file name on loading new image (Setup Dialog - Expert);
 + File operations (copy, move, delete) (Setup Dialog - Expert);
 + now you can by "dragging" status bar copy image (if file exist) to any folder(Desktop, opened dir on TC file panel, etc.) or to any opened program (ignore File operations disabling);
 * minor changes and bug fixes.

Ver 1.7.1 BETA:
 + thumb's for TC 6.5
 * fix "auto setup reset" bug;
 + added additional internal files sorting methods (by size, by date);
 * fix showing images when sorting method changed;
 + open current image in shell default program or any other (Setup - Shell);
 + information label;
 * minor changes and bug fixes.

Ver 1.7.1 BETA2:
 * fixed thumb's for TC 6.5;
 * fix "auto toolbar setup reset" bug;
 + new functions (in Setup dialog);
 * Setup dialog minor changes;
 * full screen closing changed (internal fix);
 * minor changes and bug fixes.

Ver 1.7.5 BETA:
 * fixed thumb's for TC 6.5 again;
 + new functions (in Setup dialog);
 + "rundom view" mode by Space button and in Slideshow mode;
 * Setup dialog minor changes;
 * minor changes and bug fixes.

Ver 1.7.6 BETA:
 + EMF, WMF file format support;
 + Multilingual support;
 * many other additions/fixes.

Ver 1.7.7:
 + new menu items;
 + toolbar can be locked now;
 + plugin now can start in Full screen mode (Setup dialog - Expert);
 * Setup dialog changed (now like TC setup diaolog);
 * minor changes and bug fixes.

Ver 1.8 BETA:
 + support ijl15.dll for fast load JPEG files (speed up loadin JPEG to more times!)(Setup - JPEG);
 + support libgfl220.dll and libgfle220.dll for JPEG Lossless Transform and thumb's view mode in TC;
 + antialiasing for fitted images (may slow down showing big images);
 * zoom changing from current now;
 * minor changes and bug fixes.

Ver 1.8.1 BETA:
 * additional libraries (ijl15.dll, libgfl220.dll, libgfle220.dll) now can be putted to SGViewer\Plugins folder or SGViewer folder;
 + support environment variables (ex. %COMMANDER_PATH%) in path to external applications (Setup dialog - Shell);
 + select antialiasing filter (Setup dialog - Advanced);
 + automatic antialiasing disabling for big images (Setup dialog - Advanced);
 + "skip" wheels messages from mouse before load next/prev image by setting value of "skip's" in setup file "WheelSkipCount" entry (useful if KatMouse (or old mouse) used);
 * wheel scroll over scroll bars scroll's it's instead of loading next/prev image;
 + select font for Info Label (Setup dialog - Main)
 + test alpha channel support in 32 bit images (if Fit and Antialiasing enabled) PNG and BMP: change mode by pressing T button;
 * Setup dialog changed;
 * minor changes and bug fixes.

Ver 1.8.2 BETA:
 * fix "error 1400";
 + loading graphic's using libgflX.dll (Setup dialog - JPEG);
  * you need manually changing DetectString for open new graphic format [LibGFL support near 100 formats] (for JPEG2000 copy Xjp2.dll from LibGFL SDK to folder with files libgfl220.dll and libgfle220.dll);
  + Shift+PgDown\Shift+PgUp show next\previous page in multipage files (like TIFF);
 * minor changes and bug fixes.

Ver 1.8.3 BETA:
 + file rename feature;
 + if image is in Fit Mode, buttons left,up\right,down opens previous\next image (like standard viewer of Win XP);
 + select Fit Mode on plugin start (Setup dialog - Main);
 + numeric sort in Win XP (Setup dialog - Main);
 + some more;
 * minor changes and bug fixes.

Ver 1.8.4:
 + display file size in status bar (view mode change: Setup dialog - Advanced. Full related to TC column size setup);
 * main is minor changes and bug fixes.

Ver 1.8.5 BETA:
 + show JPEG comment in JPEG files if present (Info dialog);
 + rotate JPEG images according to EXIF Orientation value on load (Setup dialog - JPEG);
 + rotate JPEG thumbnails according to EXIF Orientation value (Setup dialog - JPEG);
 + ability to copy/move/create link of file by right mouse click on status bar and "drag" it to Explorer (Setup dialog - Expert);
 + automatic JPEG Lossless Transform by EXIF Orientation value (Shift+A buttons, need libgfl220.dll and libgfle220.dll);
 + keep original file date/time on JPEG Lossless Transform (Setup dialog - JPEG);
 + reset EXIF Orientation value on JPEG Lossless Transform (Setup dialog - JPEG).

Ver 1.8.6:
 * scrollbars some fixes;
 + menu item Print Preview available by default (menu Image);
 + show image IPTC information if present (Info dialog);
 + show GIF image comments if present (Info dialog);
 + ability to set non transparent background for Info label (Setup Dialog - Main);
 + GIF animation antialiasing (Setup Dialog - Advanced);
 * minor changes and bug fixes.

Ver 1.8.7 RC:
 + allow full screen preview in Quick View mode (Setup dialog - Expert);
 + settings cache for speed up start\close plugin from removable devices (Setup dialog - Expert);
 + display file date & time in status bar (Setup dialog - Advanced);
 * improvements and bug fixes.

Ver 1.8.7.1:
 * big bug with animated GIF images fixed: some images leave "tails" (not properly clear background) when image is animated;
 + basic work with profiles: rename any *.profile to SGViewer.profile and settings from it will be used on first start of plugin (may help when reinstall plugin or install on new computer);
 * minor changes and bug fixes.

Ver 1.8.8:
 * fixed JPEG rotation by EXIF;
 + support libjfl version 2.54 (libgfl254.dll, libgfle254.dll);
 + Stay On Top function (Menu);
 + File Size Display new values: Dynamic Extended (x.xx k/M/G) and Like Explorer (x.xx/xx.x/xxx) (Setup dialog - Advanced);
 * minor changes and bug fixes.

Ver 1.8.8.1:
 + "Display Last Access Date" function (Setup dialog - Advanced);
 + "Add "Close" Item to Popup Menu" function (Setup dialog - Advanced);
 * minor changes and bug fixes.

Ver 1.9:
 + experimental Fit width and height functions without antialiasing (Menu - Setup);
 * up to 8 shell applications in menu without icons (Setup dialog - Shell)
 * minor changes and bug fixes.

Ver 1.9.1:
 + some new TC7 functions supported (introduced in Public beta 2);
 + toolbar glyphs can be loaded from Toolbar.bmp;
 * minor changes and bug fixes.


---
Suggestions, Wishes and bug reports are welcome!
ProgMan13, (ProgMan13@mail.ru)