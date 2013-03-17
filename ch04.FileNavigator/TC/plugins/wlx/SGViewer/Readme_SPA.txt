SGViewer v 1.8.7.1

Plugin de Lister para Total Commander 5.51 o posterior, para ver im�genes..

Donationware.


*** Nota ***

En TC 5.51 desactive el uso de Irfan View en el di�logo de configuraci�n del visualizador interno (llamado Lister). En TC 6 o mayor no necesita hacer esto.


*** Formatos de im�genes soportados ***

BMP, JPEG, PNG, GIF, TIFF (no todos los m�todos de compresi�n soportados), PSD, TGA, PCX, PCD, PSP, EMF, WMF.


*** Caracter�sticas ***

- interfaz inteligible;
- navegaci�n f�cil;
- vista a pantalla completa;
- diapositivas;
- modo de vista aleatoria;
- antialias para im�genes reajustadas;
- ver animaci�n en GIF;
- interfaz de usuario multiidioma (ingl�s, franc�s, alem�n, h�ngaro, coreano, ruso, espa�ol, ucraniano);
- copiar, mover, borrar archivos de im�genes;
- abrir imagen actual en alguna aplicaci�n;
- copiar imagen y pegar desde el portapapeles;
- guardar im�genes como BMP o JPEG;
- operaciones de imagen (rotar, espejo, etc.);
- funci�n b�sica para imprimir im�genes;
- soporta ijl15.dll para carga r�pida de JPEG;
- soporta libgfl220.dll y libgfle220.dll para transformaci�n JPEG sin p�rdida y modo de vista en miniaturas de TC;
- �y mucho m�s!


*** Atajos de teclado ***


 * Navegaci�n *

Espaciadora - mostrar archivo siguiente (enlazado) (si vista aleatoria esta activada - muestra un archivo aleatorio);
Retroceso - mostrar el archivo anterior (enlazado);
Ctrl+D - mostrar el archivo principal (primero) visto (el que vio luego F3 o Ctrl-Q presionado en TC);
Pausa(Inter) - iniciar/parar diapositivas;
AvP�g - mostrar el archivo siguiente (si mostraba el �ltimo archivo no hace nada);
ReP�g - mostrar el archivo anterior (si mostraba el primer archivo no hace nada);
Inicio - mostrar el primer archivo;
Fin - mostrar el �ltimo archivo.
G � mostrar el di�logo Ir a la imagen por n�mero;
Insert(Ins) - mostrar archivo aleatorio (ignora desactivado del modo aleatorio);
Alt+Enter o Bot�n medio del mouse � alterna el modo de pantalla completa;
Deslizar rueda del mouse arriba/abajo � muestra archivo de imagen siguiente/anterior;
Supr - borrar archivo de imagen (la funci�n borrar debe estar activada);
 
 * Interfaz *

Ctrl+B - mostrar/ocultar barra de estado;
Ctrl+I - alterna etiqueta de info;
Ctrl+T - alterna barra de herramientas;
Shift+Ctrl+T - reiniciar posici�n de barra de herramientas y mostrarla;
B - alternar ajustar solo im�genes grandes (encoger)/ ajustar todas las im�genes;
F - ajustar/mostrar imagen en su tama�o original;
Asterisco gris (*) - ajustar imagen; 
Barra gris (/) - mostrar imagen en tama�o original;
M�s gris (+) - zoom + imagen
Menos gris (-) - zoom - imagen
Ctrl+Deslizar rueda del mouse arriba/abajo � zoom +/- imagen;
Ctrl+bot�n izquierdo/derecho del mouse � zoom +/- imagen;

 * Imagen *

I � mostrar di�logo de info de imagen incluyendo EXIF para JPEG (debe existir el archivo);
L - rotar imagen a la izquierda;
R - rotar imagen a la derecha;
V - voltear imagen en vertical;
H - voltear imagen en horizontal;
T - mostrar canal alfa en im�genes de 32 bits (con ajuste y antialias activados);
Shift+G - convertir imagen a escala de grises;
Shift+T - convertir imagen a negativo;
Shift+R � mostrar di�logo de Redimensionar imagen;
Ctrl+R � recargar imagan actual;
Ctrl+S - guardar imagen como bitmap o JPEG;
Ctrl+E - fijar imagen como papel tapiz del Escritorio (centrado);
Shift+E - establecer imagen como papel tapiz del Escritorio (estirado);
Shift+Ctrl+E - establecer imagen como papel tapiz del Escritorio (mosaico);
 Shift+Ctrl+R - JPEGLosslessTransform - rotar la imagen en 90 grados (necesita libgfl220.dll y libgfle220.dll);
 Shift+Ctrl+L - JPEGLosslessTransform - rotar la imagen en 270 grados (necesita libgfl220.dll y libgfle220.dll);
 Shift+Ctrl+H - JPEGLosslessTransform - voltear imagen en horizontal (necesita libgfl220.dll y libgfle220.dll);
 Shift+Ctrl+V - JPEGLosslessTransform - voltear imagen en vertical (necesita libgfl220.dll y libgfle220.dll);
 Shift+A - JPEGLosslessTransform - autom�tico por valor de Orientaci�n EXIF (necesita libgfl220.dll y libgfle220.dll);


*** Usando DLL's externas ***

- Para carga r�pida de JPEG debe usar Intel JPEG Library (ijl15.dll). Adem�s debe habilitarlo en la ventana ce Configuraci�n en la p�gina "JPEG". �La velocidad de carga de JPEG se incrementa varias veces!
   Copiar esta dll a la carpeta Windows.
- Para usar transformaci�n JPEG sin p�rdida y modo de vista en miniaturas en TC necesita libgfl220.dll y libgfle220.dll de Pierre-E Gougelet.
   Copiar esta dll a la carpeta de Windows.
   Puede renombrar los nuevos libgfl240.dll y libgfle240.dll a libgfl220.dll y libgfle220.dll y usarlos.


*** Instalar ***

 * TC 5.51 * 

1. Descomprimir archivos desde el empaquetado a su carpeta de plugins;
2. Seleccionar en el men� de TC Configuraci�n - Opciones;
3. Abrir p�gina "Editar/Ver";
4. Presionar bot�n "Configurar visualizador interno";
5. Presionar bot�n "LS-Plugins";
6. Presionar bot�n "Agregar" y seleccionar SGViewer.wlx;
7. Presionar "Aceptar".

 * TC 6.5 o posterior *

Esta versi�n de TC tiene la caracter�stica "autoinstalar plugin". Solo ingrese al archivo con el plugin y TC pregunta acerca de instalar el plugin.. 


*** Acuerdo de Licencia ***

  Este programa es entregado "TAL-CUAL" sin garant�a de ninguna clase solo para uso no comercial.


*** Info adicional ***

Plugin desarrollado con Delphi 6 usando:
  GraphicEx (www.delphi-gems.com);
  RxLib fox D6 (www.sgbsoftware.com)(?);
  JEDI VCL (http://jvcl.sourceforge.net);
  TPrintPreview (http://www.delphiarea.com);
  Toolbar2000 (http://www.jrsoftware.org/);
  EXIF de SimBa aka Dimoniusis (dimonius@mail333.com);
  TWallpaper (www.utilmind.com);
  janFX de Jan Verhoeven (torry.net);
  Drag and Drop Component Suite por Angus Johnson & Anders Melander (torry.net).
  TBX for Toolbar2000 de Alex A. Denisov(http://g32.org);
  Graphics32 de Alex A. Denisov(http://g32.org);
  dEXIF por Gerry McGuire (http://mcguirez.homestead.com).

  JPEGLosslessTransform basado en (GFL SDK) de Pierre-E Gougelet (http://www.xnview.com).
  Intel JPEG Library (ijl15.dll) copyright por Intel.

  Gracias a Evgueny Svertchkov (listtv@citycat.ru) por Zoom.

  Una gran ayuda pas resolver bugs con P4 HT de Alex Martemyanov (AlexMart@opfr.vrn.ru) y Systemizer (systemizer99@mtu-net.ru).

  Gracias a Christian Ghisler por algunos comentarios y funciones.

Tambi�n gracias a todos quienes me dan ideas y reportan bugs por email.

 * Traductores *

Traducci�n al franc�s por Claude Charries(charries_AT_wanadoo_DOT_fr);
Traducci�n al espa�ol por Luis Mej�a.
Traducci�n al alem�n por Kurt Lettmaier (k.lettmaier@onlinehome.de);
Traducci�n al rumano por Dan Lungescu (dan.lungescu@gmail.com);
Traducci�n al ucraniano por Maximus (mxmus@yandex.ru);
Traducci�n al h�ngaro por Laszlo Kontor (kola.11@freemail.hu);
Traducci�n al coreano por BlueSolvit (bluesolvit@hanmail.net).

*** Historial de cambios ***

Ver 0.1:
 * lanzamiento inicial.

Ver 1.0:
 + guardar a BMP;
 + vista en pantalla completa;
 + diapositivas;
 * cambios menores y correcciones.

Ver 1.3:
 + guardar a JPG;
 + algunas operaciones con im�genes;
 * cambios menores y correcciones.

Ver 1.5:
 + zoom experimental;
 + la imagen puede ser centrada;
 + ajustar im�genes peque�as/grandes;
 + rueda del mouse: cambiar imagen, con Shift - zoom;
 + Ir al di�logo (G);
 + Di�logo de informaci�n (I);
 + Redimensionar di�logo (Shift+R);
 + nuevos �tems de men� y atajos (ex., Alt+Enter - pantalla completa);
 + ordenamiento interno de archivos por nombre, extensi�n, sin orden, inverso (di�logo Configurar);
 * cambios menores y correcciones.

Ver 1.6:
 * rueda del mouse: con Ctrl - zoom;
 + Ctrl+bot�n izquierdo/derecho del mouse - zoom +/-;
 + barra de herramientas;
 + establecer im�genes como papel tapiz al Escritorio (Imagen - Establecer como papel tapiz);
 + soporta DLL de Pierre-E Gougelet para JPEGLosslessTransform;
 * menu reorganizado;
 + con tecla Insert(Ins) muestra imagen aleatoria;
 + opci�n Cambiar imagen luego de cargar (di�logo Configurar) cambia trazado de imagen al cargar nueva imagen;
 * cambios menores y correcciones.

Ver 1.7:
 * arreglado Rotar 180: ahora realmente rota 180 grados (Rotar 90 x 2);
 * arreglados Volteo Vertical y Volteo Horizontal: intercambiados;
 + consejos de la barra de herramientas pueden ser desactivados (di�logo Configurar - Principal);
 + autodimensionar paneles de barra de estado (di�logo Configurar - Principal);
 + Inicio/Fin - mostrar primera/�ltima imagen;
 + t�tulo de Lister puede mostrar nombre completo del archivo al cargar nueva imagen (di�logo Configurar - Experto);
 + Operaciones de archivo (copiar, mover, borrar) (di�logo Configurar - Experto);
 + ahora puede "arrastrar" la barra de estado para copiar imagen (si el archivo existe) a otra carpeta (Escritorio, directorio abierto en panel de archivos de TC, etc.) o a cualquier programa abierto (ignora desactivado de Operaciones de archivo);
 * cambios menores y correcciones.

Ver 1.7.1 BETA:
 + miniaturas para TC 6.5
 * arreglado bug "auto setup reset";
 + agregados m�todos adicionales de ordenamiento interno de archivos (por tama�o, por fecha);
 * arreglado mostrar im�genes cuando el m�todo de orden ha cambiado;
 + abrir imagen actual en programa predeterminado del entorno o alg�n otro (Configurar - Entorno);
 + etiqueta de informaci�n;
 * cambios menores y correcciones.

Ver 1.7.1 BETA2:
 * corregido diapositivas para TC 6.5;
 * arreglado bug "auto toolbar setup reset";
 + nuevas funciones (en di�logo Configurar);
 * cambios menores al di�logo Configurar;
 * cambiado cerrar pantalla completa (correcci�n interna);
 * cambios menores y correcciones.

Ver 1.7.5 BETA:
 * corregido diapositivas para TC 6.5 otra vez;
 + nuevas funciones (en di�logo Configurar);
 + modo "vista aleatoria" con tecla Espaciadora y en modo Diapositiva;
 * cambios menores al di�logo Configurar;
 * cambios menores y correcciones.

Ver 1.7.6 BETA:
 + soporta formatos de archivos EMF, WMF;
 + Soporte multiidioma;
 * muchas otras adiciones/correcciones.

Ver 1.7.7:
 + nuevos �tems de men�;
 + ahora la barra de herramientas puede ser bloqueada;
 + ahora el plugin puede iniciar en modo de pantalla completa (di�logo Configurar - Experto);
 * cambiado di�logo Configurar  (ahora semejante al di�logo Configurar de TC);
 * cambios menores y correcciones.

Ver 1.8 BETA:
 + soporta ijl15.dll para carga r�pida de archivo JPEG (�acelerara la carga de JPEG varias veces!)(Configurar - JPEG);
 + soporta libgfl220.dll y libgfle220.dll para transformaci�n JPEG sin p�rdida y modo de vista en miniaturas en TC;
 + antialias para im�genes reajustadas (puede enlentecer la vista de im�genes grandes);
 * ahora cambia zoom actual;
 * cambios menores y correcciones.

Ver 1.8.1 BETA:
 * las bibliotecas adicionales (ijl15.dll, libgfl220.dll, libgfle220.dll) ahora pueden ser puestas en la carpeta SGViewer\Plugins o la carpeta SGViewer;
 + soporta variables de entorno (ej. %COMMANDER_PATH%) en la ruta a aplicaciones externas (Di�logo Configurar - Entorno);
 + seleccionar filtro antialias (Di�logo Configurar - Avanzado);
 + desactiva antialias autom�ticamente para im�genes grandes (Di�logo Configurar - Avanzado);
 + "saltar" mensajes de rueda del mouse antes de cargar imagen siguiente/anteriorge colocando el valor de "saltos" en el archivo configurar, entrada "WheelSkipCount" (�til si usa KatMouse (o un mouse antiguo);
 * rueda de scroll sobre barras de desplazamiento desliza en lugar de cargar imagen siguiente/anterior;
 + seleccionar fuente para Etiqueta de Info (Di�logo Configurar - Principal)
 + soporta prueba de canal alfa en im�genes de 32 bits (si Ajustar y Antialias est�n activados) PNG y BMP: cambiar modo presionando el bot�n T;
 * di�logo Configurar cambiado;
 * cambios menores y correcciones.

Ver 1.8.2 BETA:
 * arreglado "error 1400";
 + cargar gr�ficos usando libgflX.dll (di�logo Configurar - JPEG);
 * necesita cambiar manualmente DetectString para abrir nuevos formatos gr�ficos [LibGFL soporta cerca de 100 formatos] (para JPEG2000 copiar Xjp2.dll desde LibGFL SDK a la carpeta con los archivos libgfl220.dll y libgfle220.dll);
 + Shift+AvP�g\Shift+ReP�g muestra p�ginas siguiente\anterior en archivos multip�gina (como TIFF);
 * cambios menores y correcciones.

Ver 1.8.3 BETA:
 + capacidad de renombrar archivos;
 + si la imagen est� en Modo Ajuste, los botones izquierda,arriba\derecha,abajo abren la imagen anterior\siguiente (como el visor est�ndar de Win XP);
 + seleccionar Modo de Ajuste al iniciar el plugin (di�logo Configurar - Principal);
 + orden num�rico en Win XP (di�logo Configurar - Principal);
 + algo m�s;
 * cambios menores y correcciones.

Ver 1.8.4:
 + mostrar tama�o de archivo en la barra de estado (cambiar modo de vista: di�logo Configurar - Avanzado. Relativo a la columna de tama�o en TC);
 * lo principal est� en cambios menores y correcciones.

Ver 1.8.5 BETA:
 + mostrar comentario JPEG en archivos JPEG si existe (di�logo Info);
 + rotar im�genes JPEG de acuerdo al valor de Orientaci�n EXIF al cargar (di�logo Configurar - JPEG);
 + rotar miniaturas JPEG de acuerdo al valor de Orientaci�n EXIF (di�logo Configurar - JPEG);
 + capacidad para copiar/mover/crear enlace de archivo con click derecho del mouse en la barra de estado y "arrastrar" al Explorador (di�logo Configurar - Experto);
 + JPEG Lossless Transform autom�tica por valor de Orientaci�n EXIF (botones Shift+A, necesita libgfl220.dll y libgfle220.dll);
 + mantener fecha/hora original en JPEG Lossless Transform (di�logo Configurar - JPEG);
 + reiniciar valor de Orientaci�n EXIF en JPEG Lossless Transform (di�logo Configurar - JPEG).

Ver 1.8.6:
 * algunos arreglos a barras de desplazamiento;
 + �tem de men� Impresi�n previa disponibel por defecto (men� Imagen);
 + mostrar informaci�n de imagen IPTC si existe (di�logo Info);
 + mostrar comentarios de imagen GIF si existen (di�logo Info);
 + capacidad para establecer fondo no transparente para etiqueta Info (di�logo Configurar - Principal);
 + antialias en animaci�n GIF (di�logo Configurar - Avanzado);
 * cambios menores y correcciones.

Ver 1.8.7 RC:
 + permite pantalla completa en modo Vista R�pida (di�logo Configurar - Experto);
 + precarga de opciones para acelerar iniciar\cerrar el plugin desde dispositivos removibles (di�logo Configurar - Experto);
 + mostrar fecha & hora del archivo en la barra de estado (di�logo Configurar - Avanzado);
 * mejoras y correcciones.

Ver 1.8.7.1:
 * arreglado grave error con im�genes GIF animadas: algunas im�genes dejan "colas" (no limpian adecuadamente el fondo) cuando la imagen es animada;
 + trabajo b�sico con perfiles: renombrar cualquier *.profile a SGViewer.profile y las opciones en �l ser�n usadas en el primer uso del plugin (puede ayudar cuando reinstala el plugin o instala en una nueva computadora);
 * cambios menores y correcciones.


---
Sugerencias, peticiones y reportes de bugs son bienvenidos!
ProgMan13, (ProgMan13@mail.ru)
