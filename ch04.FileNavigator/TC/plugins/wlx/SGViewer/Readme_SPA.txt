SGViewer v 1.8.7.1

Plugin de Lister para Total Commander 5.51 o posterior, para ver imágenes..

Donationware.


*** Nota ***

En TC 5.51 desactive el uso de Irfan View en el diálogo de configuración del visualizador interno (llamado Lister). En TC 6 o mayor no necesita hacer esto.


*** Formatos de imágenes soportados ***

BMP, JPEG, PNG, GIF, TIFF (no todos los métodos de compresión soportados), PSD, TGA, PCX, PCD, PSP, EMF, WMF.


*** Características ***

- interfaz inteligible;
- navegación fácil;
- vista a pantalla completa;
- diapositivas;
- modo de vista aleatoria;
- antialias para imágenes reajustadas;
- ver animación en GIF;
- interfaz de usuario multiidioma (inglés, francés, alemán, húngaro, coreano, ruso, español, ucraniano);
- copiar, mover, borrar archivos de imágenes;
- abrir imagen actual en alguna aplicación;
- copiar imagen y pegar desde el portapapeles;
- guardar imágenes como BMP o JPEG;
- operaciones de imagen (rotar, espejo, etc.);
- función básica para imprimir imágenes;
- soporta ijl15.dll para carga rápida de JPEG;
- soporta libgfl220.dll y libgfle220.dll para transformación JPEG sin pérdida y modo de vista en miniaturas de TC;
- ¡y mucho más!


*** Atajos de teclado ***


 * Navegación *

Espaciadora - mostrar archivo siguiente (enlazado) (si vista aleatoria esta activada - muestra un archivo aleatorio);
Retroceso - mostrar el archivo anterior (enlazado);
Ctrl+D - mostrar el archivo principal (primero) visto (el que vio luego F3 o Ctrl-Q presionado en TC);
Pausa(Inter) - iniciar/parar diapositivas;
AvPág - mostrar el archivo siguiente (si mostraba el último archivo no hace nada);
RePág - mostrar el archivo anterior (si mostraba el primer archivo no hace nada);
Inicio - mostrar el primer archivo;
Fin - mostrar el último archivo.
G – mostrar el diálogo Ir a la imagen por número;
Insert(Ins) - mostrar archivo aleatorio (ignora desactivado del modo aleatorio);
Alt+Enter o Botón medio del mouse – alterna el modo de pantalla completa;
Deslizar rueda del mouse arriba/abajo – muestra archivo de imagen siguiente/anterior;
Supr - borrar archivo de imagen (la función borrar debe estar activada);
 
 * Interfaz *

Ctrl+B - mostrar/ocultar barra de estado;
Ctrl+I - alterna etiqueta de info;
Ctrl+T - alterna barra de herramientas;
Shift+Ctrl+T - reiniciar posición de barra de herramientas y mostrarla;
B - alternar ajustar solo imágenes grandes (encoger)/ ajustar todas las imágenes;
F - ajustar/mostrar imagen en su tamaño original;
Asterisco gris (*) - ajustar imagen; 
Barra gris (/) - mostrar imagen en tamaño original;
Más gris (+) - zoom + imagen
Menos gris (-) - zoom - imagen
Ctrl+Deslizar rueda del mouse arriba/abajo – zoom +/- imagen;
Ctrl+botón izquierdo/derecho del mouse – zoom +/- imagen;

 * Imagen *

I – mostrar diálogo de info de imagen incluyendo EXIF para JPEG (debe existir el archivo);
L - rotar imagen a la izquierda;
R - rotar imagen a la derecha;
V - voltear imagen en vertical;
H - voltear imagen en horizontal;
T - mostrar canal alfa en imágenes de 32 bits (con ajuste y antialias activados);
Shift+G - convertir imagen a escala de grises;
Shift+T - convertir imagen a negativo;
Shift+R – mostrar diálogo de Redimensionar imagen;
Ctrl+R – recargar imagan actual;
Ctrl+S - guardar imagen como bitmap o JPEG;
Ctrl+E - fijar imagen como papel tapiz del Escritorio (centrado);
Shift+E - establecer imagen como papel tapiz del Escritorio (estirado);
Shift+Ctrl+E - establecer imagen como papel tapiz del Escritorio (mosaico);
 Shift+Ctrl+R - JPEGLosslessTransform - rotar la imagen en 90 grados (necesita libgfl220.dll y libgfle220.dll);
 Shift+Ctrl+L - JPEGLosslessTransform - rotar la imagen en 270 grados (necesita libgfl220.dll y libgfle220.dll);
 Shift+Ctrl+H - JPEGLosslessTransform - voltear imagen en horizontal (necesita libgfl220.dll y libgfle220.dll);
 Shift+Ctrl+V - JPEGLosslessTransform - voltear imagen en vertical (necesita libgfl220.dll y libgfle220.dll);
 Shift+A - JPEGLosslessTransform - automático por valor de Orientación EXIF (necesita libgfl220.dll y libgfle220.dll);


*** Usando DLL's externas ***

- Para carga rápida de JPEG debe usar Intel JPEG Library (ijl15.dll). Además debe habilitarlo en la ventana ce Configuración en la página "JPEG". ¡La velocidad de carga de JPEG se incrementa varias veces!
   Copiar esta dll a la carpeta Windows.
- Para usar transformación JPEG sin pérdida y modo de vista en miniaturas en TC necesita libgfl220.dll y libgfle220.dll de Pierre-E Gougelet.
   Copiar esta dll a la carpeta de Windows.
   Puede renombrar los nuevos libgfl240.dll y libgfle240.dll a libgfl220.dll y libgfle220.dll y usarlos.


*** Instalar ***

 * TC 5.51 * 

1. Descomprimir archivos desde el empaquetado a su carpeta de plugins;
2. Seleccionar en el menú de TC Configuración - Opciones;
3. Abrir página "Editar/Ver";
4. Presionar botón "Configurar visualizador interno";
5. Presionar botón "LS-Plugins";
6. Presionar botón "Agregar" y seleccionar SGViewer.wlx;
7. Presionar "Aceptar".

 * TC 6.5 o posterior *

Esta versión de TC tiene la característica "autoinstalar plugin". Solo ingrese al archivo con el plugin y TC pregunta acerca de instalar el plugin.. 


*** Acuerdo de Licencia ***

  Este programa es entregado "TAL-CUAL" sin garantía de ninguna clase solo para uso no comercial.


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

También gracias a todos quienes me dan ideas y reportan bugs por email.

 * Traductores *

Traducción al francés por Claude Charries(charries_AT_wanadoo_DOT_fr);
Traducción al español por Luis Mejía.
Traducción al alemán por Kurt Lettmaier (k.lettmaier@onlinehome.de);
Traducción al rumano por Dan Lungescu (dan.lungescu@gmail.com);
Traducción al ucraniano por Maximus (mxmus@yandex.ru);
Traducción al húngaro por Laszlo Kontor (kola.11@freemail.hu);
Traducción al coreano por BlueSolvit (bluesolvit@hanmail.net).

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
 + algunas operaciones con imágenes;
 * cambios menores y correcciones.

Ver 1.5:
 + zoom experimental;
 + la imagen puede ser centrada;
 + ajustar imágenes pequeñas/grandes;
 + rueda del mouse: cambiar imagen, con Shift - zoom;
 + Ir al diálogo (G);
 + Diálogo de información (I);
 + Redimensionar diálogo (Shift+R);
 + nuevos ítems de menú y atajos (ex., Alt+Enter - pantalla completa);
 + ordenamiento interno de archivos por nombre, extensión, sin orden, inverso (diálogo Configurar);
 * cambios menores y correcciones.

Ver 1.6:
 * rueda del mouse: con Ctrl - zoom;
 + Ctrl+botón izquierdo/derecho del mouse - zoom +/-;
 + barra de herramientas;
 + establecer imágenes como papel tapiz al Escritorio (Imagen - Establecer como papel tapiz);
 + soporta DLL de Pierre-E Gougelet para JPEGLosslessTransform;
 * menu reorganizado;
 + con tecla Insert(Ins) muestra imagen aleatoria;
 + opción Cambiar imagen luego de cargar (diálogo Configurar) cambia trazado de imagen al cargar nueva imagen;
 * cambios menores y correcciones.

Ver 1.7:
 * arreglado Rotar 180: ahora realmente rota 180 grados (Rotar 90 x 2);
 * arreglados Volteo Vertical y Volteo Horizontal: intercambiados;
 + consejos de la barra de herramientas pueden ser desactivados (diálogo Configurar - Principal);
 + autodimensionar paneles de barra de estado (diálogo Configurar - Principal);
 + Inicio/Fin - mostrar primera/última imagen;
 + título de Lister puede mostrar nombre completo del archivo al cargar nueva imagen (diálogo Configurar - Experto);
 + Operaciones de archivo (copiar, mover, borrar) (diálogo Configurar - Experto);
 + ahora puede "arrastrar" la barra de estado para copiar imagen (si el archivo existe) a otra carpeta (Escritorio, directorio abierto en panel de archivos de TC, etc.) o a cualquier programa abierto (ignora desactivado de Operaciones de archivo);
 * cambios menores y correcciones.

Ver 1.7.1 BETA:
 + miniaturas para TC 6.5
 * arreglado bug "auto setup reset";
 + agregados métodos adicionales de ordenamiento interno de archivos (por tamaño, por fecha);
 * arreglado mostrar imágenes cuando el método de orden ha cambiado;
 + abrir imagen actual en programa predeterminado del entorno o algún otro (Configurar - Entorno);
 + etiqueta de información;
 * cambios menores y correcciones.

Ver 1.7.1 BETA2:
 * corregido diapositivas para TC 6.5;
 * arreglado bug "auto toolbar setup reset";
 + nuevas funciones (en diálogo Configurar);
 * cambios menores al diálogo Configurar;
 * cambiado cerrar pantalla completa (corrección interna);
 * cambios menores y correcciones.

Ver 1.7.5 BETA:
 * corregido diapositivas para TC 6.5 otra vez;
 + nuevas funciones (en diálogo Configurar);
 + modo "vista aleatoria" con tecla Espaciadora y en modo Diapositiva;
 * cambios menores al diálogo Configurar;
 * cambios menores y correcciones.

Ver 1.7.6 BETA:
 + soporta formatos de archivos EMF, WMF;
 + Soporte multiidioma;
 * muchas otras adiciones/correcciones.

Ver 1.7.7:
 + nuevos ítems de menú;
 + ahora la barra de herramientas puede ser bloqueada;
 + ahora el plugin puede iniciar en modo de pantalla completa (diálogo Configurar - Experto);
 * cambiado diálogo Configurar  (ahora semejante al diálogo Configurar de TC);
 * cambios menores y correcciones.

Ver 1.8 BETA:
 + soporta ijl15.dll para carga rápida de archivo JPEG (¡acelerara la carga de JPEG varias veces!)(Configurar - JPEG);
 + soporta libgfl220.dll y libgfle220.dll para transformación JPEG sin pérdida y modo de vista en miniaturas en TC;
 + antialias para imágenes reajustadas (puede enlentecer la vista de imágenes grandes);
 * ahora cambia zoom actual;
 * cambios menores y correcciones.

Ver 1.8.1 BETA:
 * las bibliotecas adicionales (ijl15.dll, libgfl220.dll, libgfle220.dll) ahora pueden ser puestas en la carpeta SGViewer\Plugins o la carpeta SGViewer;
 + soporta variables de entorno (ej. %COMMANDER_PATH%) en la ruta a aplicaciones externas (Diálogo Configurar - Entorno);
 + seleccionar filtro antialias (Diálogo Configurar - Avanzado);
 + desactiva antialias automáticamente para imágenes grandes (Diálogo Configurar - Avanzado);
 + "saltar" mensajes de rueda del mouse antes de cargar imagen siguiente/anteriorge colocando el valor de "saltos" en el archivo configurar, entrada "WheelSkipCount" (útil si usa KatMouse (o un mouse antiguo);
 * rueda de scroll sobre barras de desplazamiento desliza en lugar de cargar imagen siguiente/anterior;
 + seleccionar fuente para Etiqueta de Info (Diálogo Configurar - Principal)
 + soporta prueba de canal alfa en imágenes de 32 bits (si Ajustar y Antialias están activados) PNG y BMP: cambiar modo presionando el botón T;
 * diálogo Configurar cambiado;
 * cambios menores y correcciones.

Ver 1.8.2 BETA:
 * arreglado "error 1400";
 + cargar gráficos usando libgflX.dll (diálogo Configurar - JPEG);
 * necesita cambiar manualmente DetectString para abrir nuevos formatos gráficos [LibGFL soporta cerca de 100 formatos] (para JPEG2000 copiar Xjp2.dll desde LibGFL SDK a la carpeta con los archivos libgfl220.dll y libgfle220.dll);
 + Shift+AvPág\Shift+RePág muestra páginas siguiente\anterior en archivos multipágina (como TIFF);
 * cambios menores y correcciones.

Ver 1.8.3 BETA:
 + capacidad de renombrar archivos;
 + si la imagen está en Modo Ajuste, los botones izquierda,arriba\derecha,abajo abren la imagen anterior\siguiente (como el visor estándar de Win XP);
 + seleccionar Modo de Ajuste al iniciar el plugin (diálogo Configurar - Principal);
 + orden numérico en Win XP (diálogo Configurar - Principal);
 + algo más;
 * cambios menores y correcciones.

Ver 1.8.4:
 + mostrar tamaño de archivo en la barra de estado (cambiar modo de vista: diálogo Configurar - Avanzado. Relativo a la columna de tamaño en TC);
 * lo principal está en cambios menores y correcciones.

Ver 1.8.5 BETA:
 + mostrar comentario JPEG en archivos JPEG si existe (diálogo Info);
 + rotar imágenes JPEG de acuerdo al valor de Orientación EXIF al cargar (diálogo Configurar - JPEG);
 + rotar miniaturas JPEG de acuerdo al valor de Orientación EXIF (diálogo Configurar - JPEG);
 + capacidad para copiar/mover/crear enlace de archivo con click derecho del mouse en la barra de estado y "arrastrar" al Explorador (diálogo Configurar - Experto);
 + JPEG Lossless Transform automática por valor de Orientación EXIF (botones Shift+A, necesita libgfl220.dll y libgfle220.dll);
 + mantener fecha/hora original en JPEG Lossless Transform (diálogo Configurar - JPEG);
 + reiniciar valor de Orientación EXIF en JPEG Lossless Transform (diálogo Configurar - JPEG).

Ver 1.8.6:
 * algunos arreglos a barras de desplazamiento;
 + ítem de menú Impresión previa disponibel por defecto (menú Imagen);
 + mostrar información de imagen IPTC si existe (diálogo Info);
 + mostrar comentarios de imagen GIF si existen (diálogo Info);
 + capacidad para establecer fondo no transparente para etiqueta Info (diálogo Configurar - Principal);
 + antialias en animación GIF (diálogo Configurar - Avanzado);
 * cambios menores y correcciones.

Ver 1.8.7 RC:
 + permite pantalla completa en modo Vista Rápida (diálogo Configurar - Experto);
 + precarga de opciones para acelerar iniciar\cerrar el plugin desde dispositivos removibles (diálogo Configurar - Experto);
 + mostrar fecha & hora del archivo en la barra de estado (diálogo Configurar - Avanzado);
 * mejoras y correcciones.

Ver 1.8.7.1:
 * arreglado grave error con imágenes GIF animadas: algunas imágenes dejan "colas" (no limpian adecuadamente el fondo) cuando la imagen es animada;
 + trabajo básico con perfiles: renombrar cualquier *.profile a SGViewer.profile y las opciones en él serán usadas en el primer uso del plugin (puede ayudar cuando reinstala el plugin o instala en una nueva computadora);
 * cambios menores y correcciones.


---
Sugerencias, peticiones y reportes de bugs son bienvenidos!
ProgMan13, (ProgMan13@mail.ru)
