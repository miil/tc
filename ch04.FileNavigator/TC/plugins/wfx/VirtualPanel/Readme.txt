VirtualPanel plugin for Total Commander
---------------------------------------
(English section is below)

Реализация временной панели для Total Commander:
+ может хранить ссылки на файлы и каталоги, а также виртуальные каталоги
+ импорт/экспорт содержимого всей VP или отдельных папок
+ импорт/экспорт списков имен файлов (например, m3u)
+ ведение лог-файла
+ удаление файлов физически при зажатой клавише Shift
+ корректная обработка операций копирования/перемещения
+ поддержка внутренних команд, расширяющих возможности (выполните команду <? для списка команд)
+ возможность выполнять команды блоками, а также создавать файлы скриптов
+ автовыполняемые скрипты при загрузке состояния или при входе в каталог


1. Файл конфигурации

Путь к файлу конфигурации Total Commander сообщает модулю при инициализации. Если этого не было сделано (например, версия программы ниже 5.51) или существует INI файл с именем модуля в его папке, этот файл будет использоваться как файл конфигурации.

Путь к файлу конфигурации можно узнать в окне свойств модуля (в сетевом окружении Total Commander).
Параметры:
	DefFileList - путь и имя файла автозагружаемого состояния;
	AutoUpdateName - скрипт с таким именем будет выполняться при каждом обновлении каталога;
	EnableAutoScripts - маска выполнения автоматических скриптов;
	LogPath - путь и имя лог-файла;
	LogEnabled - маска протоколируемых событий;
	VirtualFolderIcon - путь и имя файла (также индекс через запятую) значка виртуального каталога.

Параметр EnableAutoScripts содержит следующие биты: 1 - выполнять скрипты обновления каталога (если указано имя файла скрипта в параметре AutoUpdateName), 2 - выполнять при каждом просмотре содержимого каталога (при поиске файлов и синхронизации), а не только при ручном входе в каталог, 4 - выполнять скрипт >Autoexec при загрузке файла состояния, 8 - не выдавать запрос на выполнение скрипта >Autoexec.

Если указан файл состояния по умолчанию, его содержимое будет загружаться автоматически при инициализации VP, а также сохраняться в этот файл при финализации. Если у файла установлен атрибут только для чтения, сохранение производиться не будет.

Протоколирование можно включать независимо для нескольких групп событий (1 - действия, 2 - статусные сообщения, 4 - изменение атрибутов, 8 - операции поиска). Для включения всех категорий можно использовать значение -1.
Если значок виртуальной папки не указан, будет использоваться значок по умолчанию.


2. Общие возможности

Модуль поддерживает следующие типы объектов:
	Ссылка на файл/каталог - может находиться только в виртуальном каталоге, создается при добавлении физического файла на панель VP посредством операций копирования (только для файлов) или с помощью внутренней команды (и для каталогов), при обращении к ней происходит обращение к физическому объекту;
	Виртуальный каталог - обычный тип каталога, создается при копировании папок, а также при использовании команды создания каталога из интерфейса TC;
	Виртуальный файл - объект, не ссылающийся на физический файл, но отображаемый на панели VP в виде файла (его поле реального объекта может быть пустым, но может содержать скрипт).

Реализованы все функции, поддерживаемые интерфейсом модулей файловых систем Total Commander (запуск, добавление, перемещение, копирование, удаление, отображене свойств). Если при удалении одного или нескольких объектов держать зажатой клавишу Shift, будет показан диалог подтверждения удаления физических файлов (диалог будет показан в любом случае при попытке удаления файла внутри физического каталога ). При копировании папки на панель VP происходит копирование структуры ее подкаталогов посредством виртуальных папок, а также добавление в них ссылок на файлы. Таким образом невозможно создать ссылку на физический каталог, т.к. TC будет дублировать его структуру. Для создания ссылки на физический каталог необходимо использовать внутренние команды.

Вы можете запускать программы посредством ссылок на файлы, при этом программа будет запущена из текущей папки (если вы находитесь в виртуальной папке, программа будет запущена из своей папки), а также указывать параметры командной строки, как в обычных папках.


3. Внутренние команды и скрипты

Команды расширяют функциональность модуля, позволяя выполнять действия, недоступные из интерфейса TC напрямую. Каждая команда начинается с символа '<', в одной командной строке можно указать несколько команд одну за другой. Последовательность команд образует скрипт.

Поддерживаемые внутренние команды:

	? (или любая неподдерживаемая команда)
		Отображает окно со списком поддерживаемых команд;
	exec <command>
		Выполняет указанную команду, как если бы ее ввели в командной строке;
	del [/r] <virtual_path>
		Удаляет объект VP, поддерживаются маски, дополнительный параметр /r необходимо указывать для удаления непустых виртуальных папок. Удаление физических объектов посредством данной команды невозможно;
	add <virtual_path> [{<physical_path_or_script>}]
		Добавляет ссылку на физический файл/каталог, виртуальную папку, или файл скрипта, в зависимости от значения второго параметра (скрипт необходимо заключать в фигурные скобки);
	put <virtual_path> [/l] <physical_path_and_mask>
		Позволяет добавить в виртуальную папку ссылки на указанные файлы из физического каталога или из набора списков файлов (при указании параметра /l);
	load <filelist_path> [<virtual_path>]
		Добавляет к содержимому указанной виртуальной папки содержимое файла состояния VP; если виртуальный путь не указан, выполняется загрузка файлав корневую папку VP, с удалением всего предыдущего содержимого;
	save [<filelist_path> [<virtual_path>]]
		Экспортирует содержимое всей структуры VP или указанной виртуальной папки в файл состояния;
	deflist <filelist_path>
		Позволяет задать используемый по умолчанию файл состояния;
	log {<full_path_to_file> | <mask>}
		Задает маску событий для лога или имя лог-файла;
	eas <mask>
		Задает маску запуска автовыполняемых скриптов;
	silent
		Позволяет отключить информационные сообщения и сообщения об ошибках во время выполнения остальных команд скрипта.

Если вместо параметра указать символ '?', пользователю будет предложено ввести его значение во время выполнения команды.

При добавлении файла скрипта скрипт нужно заключить в фигурные скобки, в противном случае команды в скрипте будут выполнены немедленно. Переменные окружения раскрываются автоматически (для файлов скрипта - при выполнении).

Имя файла скрипта должно начинаться с символа >. Файлы скрипта с атрибутом только для чтения невозможно удалить без снятия атрибута. Для файлов скрипта можно задать произвольный файл значка непосредственно в самом скрипте, для этого в конец скрипта нужно поместить два знака начала команды ("<<") и путь к файлу со значком (при необходимости также можно указать индекс значка через запятую).

Пример команды создания файла скрипта >Refresh для автоматической загрузки видео файлов в текущую виртуальную папку из нескольких физических:
<add >Refresh{<silent<del *.*<put . D:\Video\*.avi<put . /l E:\Video\*.lst}

Пример добавления музыкальных файлов, содержащихся в нескольких m3u-списках в папке D:\Music, в папку \Music панели VP:
<put \Music /l D:\Music\*.m3u


4. Получение информации о файлах/каталогах на панели VP

Собственных информационных полей модуль не содержит, но так как он является модулем временной панели, поддерживаются все поля других информационных модулей, а также стандартные поля TC (например, комментарий, путь или имя файла).

Есть несколько способов получить содержимое файла скрипта. Один из них - с помощью поля Obj_RealPath из модуля NTLinks (он показывает содержимое скрипта для файлов скриптов). Также есть один способ, интересный принципом получения текста - нужно установить курсор на файл скрипта и нажать F3, при этом TC покажет сообщение об ошибке открытия файла, в котором будет приведен текст скрипта (TC в этом сообщении пишет некорректное имя файла, который не получилось открыть).


Обсуждение пока только здесь (на английском): http://www.ghisler.ch/board/viewtopic.php?t=24293



VirtualPanel plugin for Total Commander
---------------------------------------
(English section)

If you find errors in this readme file, please help me to fix them.

Temporary panel plugin for Total Commander:
+ keeps links to files and folders, and virtual folders
+ import/export of whole contents or separate directories
+ import/export of usual filelists (like m3u)
+ log file
+ asks for physical removing if Shift is down
+ correct copy/move operations processing
+ internal commands for extra functions (execute <? command for help)
+ batch commands execution and script files support
+ auto-executed scripts on load state or enter directory


1. Configuration file

Total Commander during loading plugin passes INI file name. If not (e.g. Total Commander version earlier than 5.51) or if INI with plugin's name exists near the plugin, this file will be used as configuration file.

You may open plugin properties to get path to INI file.
Parameters:
	DefFileList - path to default state file;
	AutoUpdateName - name of script file that will be executed on enter directory;
	EnableAutoScripts - automatic scripts execution flags;
	LogPath - path to log file;
	LogEnabled - log event mask;
	VirtualFolderIcon - virtual folder icon path and index after comma.

Parameter EnableAutoScripts supports following bits: 1 - use auto-execution scripts on enter directory (if AutoUpdateName contains its name), 2 - execute enter directory script on each folder list (also during file search/sync) instead of execution only on manual browse, 4 - execute >Autoexec script on load state file, 8 - don't ask confirmation on >Autoexec script file execution.
	
If DefFileList parameter is specified, this file will be loaded automatically on VP start and saved on exit TC. If you set read-only attribute, this file won't be replaced.

You may enable log for some types of events (1 - actions, 2 - status messages, 4 - attributes setting, 8 - find operations). To enable all events you may use -1 value as mask.


2. General features

Following object types are supported:
	Physical file/folder link - may be situated in virtual folder only, created when you add file into VP by copying (only for files) or with help of internal command (also for folders), you may access physical object via this link;
	Virtual folder - usual folder, TC creates it when you copy folder into VP or when you make new folder;
	Virtual file - object that have no link to physical file but TC shows it as a file (it may contain empty real path field or internal script in it).

All supported by Total Commander's FS interface functions are realized (execution, adding, moving, copying, removing, properties displaying). When you hold Shift while confirm deletion, plugin will ask you for physical files remove confirmation (confirmation is asked always when you remove files within physical folder link). When you copy folder into VP, TC copies its structure with virtual folders and file links, you can't create physical folder link directly. You need to use internal commands for adding physical folder links.

When you execute application via file links, program launches from its directory (if you're in virtual folder) or from current physical folder (if you're inside of physical folder link).


3. Internal commands and scripts

Commands allow to extend plugin functionality. They allow to perform actions unavailable directly from TC interface. Each command must be started with '<' character, you may specify more than one command sequentially in command line. Script is a sequence of commands.

Supported internal commands:

	? (or any unsupported command)
		Shows message with list of supported commands;
	exec <command>
		Executes command as if you enter it in command line;
	del [/r] <virtual_path>
		Removes VP object, wildcards are supported, additional parameter /r enables removing of non-empty folders. You can't remove physical object with this command;
	add <virtual_path> [{<physical_path_or_script>}]
		Adds physical file/folder link or a virtual folder or a script file depending on second parameter's value (you must enclose script into braces);
	put <virtual_path> [/l] <physical_path_and_mask>
		Allows to add links to specified physical objects or to objects taken from specified file lists (with additional parameter /l);
	load <filelist_path> [<virtual_path>]
		Adds to contents of specified virtual folder objects from specified VP state file; if virtual path is omitted, command clears VP and loads specified state file as root;
	save [<filelist_path> [<virtual_path>]]
		Exports whole VP contents or contents of specified virtual folder into state file;
	deflist <filelist_path>
		Sets default state file;
	log {<full_path_to_file> | <mask>}
		Sets log file path or log events mask;
	eas <mask>
		Sets auto-execution flags;
	silent
		Disables information and error messages until end of current script.

You may replace any parameter with '?' symbol if you want this parameter to be asked during script execution.

When you create script file, you must enclose script into braces. If not, commands inside of script will be executed immediately. You may use environment variables in commands and scripts - they are expanded automatically (variables inside script files will be expanded only during file execution).

Script file name must be started with '>' character. You may set read-only attribute for script file in order to protect it from removing. Script file has special icon, but you may also specify any external icon. You should specify external icon path (and index after comma, if need) after pair of less characters ("<<") at the end of script.

Example of command to create >Refresh script file that will load video files from some physical folders into current virtual folder:
<add >Refresh{<silent<del *.*<put . D:\Video\*.avi<put . /l E:\Video\*.lst}

Example of command to add to \Music virtual folder all files from m3u lists in D:\Music physical folder:
<put \Music /l D:\Music\*.m3u


4. Getting information about VP objects

Plugin have no own content fields but temporary panel plugin supports all content plugins fields and standard fields for physical files and folders (e.g. comment field or path field).

There are a lot of ways to get script file contents. One of them is to use Obj_RealPath field of NTLinks plugin (it shows script text for script files). Also there is an interesting way to get script text - you should place cursor onto script file and press F3 key. TC will show you error message with script text.


Full description and discussion: http://www.ghisler.ch/board/viewtopic.php?t=24293



History:

2009-12-09	1.0.0.180
	+ added change case only renaming
	+ if INI with plugin's name exists near the plugin, this file is used as configuration file
	+ shows error message if configuration isn't saved (e.g. no write permission to INI)
	* null settings are not saved now when plugin loaded during installation
	* some minor fixes

2009-11-05	1.0.0.166
	* error opening script file mesage if file doesn't exist
	* error copying file within VP - file was moved instead

2009-10-26	1.0.0.162
	* division by zero when copy empty files from VP
	* new FsExtractCustomIcon function extracts non-standard icons in background and causes TC to use less GDI objects
	+ special delete physical files confirmation dialog
	+ del command supports wildcards and keeps read-only files
	+ autoexecuted scripts - on load list and on list directory contents
	+ this Readme file :)

2009-10-18	1.0.0.121
	* exception in load command
	* set attributes for internal objects not always worked
	+ expanding of environment variables in commands and scripts except braced blocks
	+ import/export partial folder
	+ put command allows to add physical files and entire filelists (e.g. playlists, full/relative paths) by mask
	+ export command to export just physical names from virtual folder (e.g. to make playlist)
	+ load command clears VP contents only if executed w/o second parameter
	+ you can't delete read-only script files (protection)
	+ added panels refreshing after VP operations

2000-10-12	1.0.0.97
	* log was always disabled at startup
	+ log event groups
	+ correct initialization for older TC versions (w/o FsSetDefaultParams func support)
	+ support full internal paths starting from plugin name (for Ctrl+Shift+Enter)
	+ add command supports nested blocks of commands in braces

2000-10-12	1.0.0.83
	+ batch script support
	+ if command parameter equals to "?", it is asked (useful for scripts)

2009-10-10	1.0.0.36
	* bug in filelist importing when line end was at the end of buffer

2009-10-10	1.0.0.xx
	! first public release
	+ virtual files/folders, links to physical files/folders
	+ internal commands for add/delete objects, for import/export filelist, for default filelist
	+ correct handling of links by TC
	+ correct copy/move operations between physical paths
	+ physical files confirmation dialog if Shift is held
