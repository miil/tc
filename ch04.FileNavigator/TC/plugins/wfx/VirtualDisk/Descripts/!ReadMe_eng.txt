Virtual Disk, Version 1.31 Final
  FS-plugin for Total Commander that allows to mount disk images as additional virtual
  drives in system.

Author of the plugin: Konstantin Vlasov, 2009
Homepage: http://flint-inc.ru/
E-mail:   support@flint_inc.ru

The driver is based on the open-source project FileDisk by Bo Branten, 2009
Homepage: http://www.acc.umu.se/~bosse/
E-mail:   bosse@acc.umu.se


Description
-----------

This plugin allows to mount disk images as additional drives. It works only under WinNT
systems starting with Windows 2000 (32- and 64-bit).
When an image is mounted, there is a new drive appears in the system. Its letter is
specified earlier, and the new drive contains all the content of the image file.

The following three modes are available:
  1. HDD - emulation of local hard disk drive. In this mode one can mount images of single
     partitions of hard drives formatted in FAT or NTFS system, and also images of floppy
     diskettes and flash-drives with the FAT file system.
  2. FDD - emulation of floppy drive. This mode allows to mount all the same images as
     in HDD mode, except for the NTFS partitions (Windows does not allow to use NTFS on
     floppies).
  3. CD/DVD - CD-drive emulation (from the point of view of the system, there is no
     difference between CD and DVD). This mode is used for mounting CD- and DVD-disk
     images. One can use ISO format and sometimes - BIN- and NRG-images. (Unfortunately,
     the exact information, when BIN- and NRG-images can be mounted, is absent.)

Also for the HDD and FDD modes there is the "Read only" modifier that allows to disable
modifying of the image mounted. CD-drive emulation is always performed in Read-Only mode.


Installing
----------

Before installing the plugin, it is necessary to install disk driver. Call the context
menu for the file vd_filedisk.inf in the VD_Driver subfolder and select the "Install"
command. The system will then install the driver vd_filedisk.sys and ask to reboot the
computer. Note that rebooting is necessary for the driver (and hence the plugin) to work!

  If you don't have the "Install" command in the context menu of the INF-file, you can
  use the old methode of installing the driver: copy the vd_filedisk.sys file in the
  Windows\System32\Drivers\ folder, then import the file vd_filedisk.reg into the registry
  by double-clicking it, and restart the computer.

IMPORTANT!!!
In 64-bit Windows versions all the operations described above on installing the driver
must be performed only from Windows Explorer! If one performs them from Total Commander,
the driver will not be installed! This happens because TC is a 32-bit application and in
64-bit Windows it works in the 32-bit environment emulation mode.
Besides, 64-bit systems (starting from Windows Vista) allow to work with signed drivers
only. Since driver signing is quite an expensive procedure and is available only for
juridical persons, my driver is unsigned. To make it work, you need to press F8 during
system boot and select "Disable Driver Signature Enforcement". All complaints are to be
directed to Microsoft.

Then you may install the plugin VirtualDisk.wfx itself by usual way: go to Configuration
dialog, select Operation, then press FS-Plugins button, in the dialog appeared press Add
and then select WFX-file of the plugin. Also you can use the automatic plugin installation
feature that was added in Total Commander 6.50: in this case the plugin will be installed
automatically when you open the archive with the plugin.
But note that in any case you need to install the driver manually, as described above!


Work with plugin
----------------

After installing a new folder appears in Total Commander's Network Neighbourhood -
"Virtual Disks". In this folder a list of image files is present. At first this list is
empty. To add images just copy image file in plugin's folder. The image is not copied
itself, plugin just remembers a link on it. To exclude the image from the list, simply
delete it by usual way - original file will not be corrupted or deleted.

For customizing the image parameters, press Enter or Alt+Enter, or just select
"Properties" from right-click context menu. The Properties dialog will appear. In this
dialog you can see full path to the image file, its current status (mounted/unmounted),
and also you can select drive letter and mounting mode (HDD/FDD/CD).
To mount image press Mount button. If the image is mounted, the Unmount button is shown
instead.

On rebooting the computer all mounted images become unmounted. There is an option "Mount
on reboot" that allows to remount the necessary images back: if the image was mounted just
before the reboot it is mounted again, else it remains unmounted.
If some errors occur during this auto-remount process, they are written into log file
VirtualDisk.log that is present in the plugin's folder.


IMPORTANT NOTES for work with plugin:
-------------------------------------

1. It is undesirable to mount/unmount images in different instances of Total Commander.
   There can be a situation when one copy of TC says the image is mounted, and another one
   says, that it is unmounted. At present many of such situations are automatically
   resolved but there can be unaccounted situations.
   For those who likes experiments I have a suggestion - please, test this plugin: how
   does it work in several copies of TC simultaneously? I cannot find all the bad
   situations by myself, you can help me find them.
   For bad situations there is an additional button on Settings dialog - "Toggle state".
   This button just toggles the software flag of mounting and it does not affect real
   mounting of the images.
2. CD-images can be mounted only in CD-mode, FAT-images in HDD and FDD modes, and
   NTFS-images only in HDD mode. Otherwise the image will be mounted, the virtual disk
   will appear, but on trying to access it you will get the error that the drive is not
   formatted.
3. The new drive is not visible for programs that get drives list from list of system
   devices. This is so, because this new drive is not a system device but just a logical
   drive. In future versions I'll try to add creation of the appropriate system device.


FAQ (Frequently Asked Questions)
--------------------------------

Q. I've installed the plugin, try to mount an image and get the error:
     Error while creating the virtual drive!
     The driver is probably not installed.
A. For the plugin to work it is necessary to install the driver; it should be installed
   manually, automatic installation of the plugin in TC does not install the driver! How
   to install the driver you may read above, in the section "Installing".

Q. On trying to mount the image I get the following error:
     Error while creating the virtual drive!
     There are too many drives of this type mounted already.
A. By default, the driver allows to mount only 4 devices of each type (i.e. 4 virtual
   FDDs, 4 CDs and 4 HDDs). If you need more, you may change this value in the system
   registry:
     [HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\VD_FileDisk\Parameters]
     NumberOfDevices=dword:00000004
   After that you'll need to reboot the computer.

Q. When mounting the image the new drive is created, but I cannot access it: an error is
   shown.
A. This means that the format of the image is not supported by the plugin (more exactly -
   by the driver). Make sure that you haven't accidentally mounted CD/DVD-image as HDD or
   vice versa. Also note that the set of supported formats is currently very limited (see
   the section "Description" for details).

Q. In my Windows x64 the plugin does not mount images. What's wrong?
A. Maybe, you have installed the driver incorrectly. In 64-bit Windows systems the driver
   should be installed only from Windows Explorer, not from Total Commander, because TC is
   a 32-bit application; for such applications Windows x64 substitutes the system folders
   and registry keys. As the result, the installing of the driver is performed into a
   wrong folder.
   Besides, if you have Windows Vista or later, the driver will not be loaded unless you
   select the item for permitting to load unsigned drivers when you boot your system (see
   the chapter "Installing" above for details).


Just in case, I write here this WARNING:
----------------------------------------

My plugin works with low-level Windows functions, and this is not safe. I cannot guarantee
that the program works absolutely correctly (especially because I haven't work much with
programming of drivers). So, I distribute this plugin "as is", without any guarantees and
promises. Use it on your own risk.
I just want to add, that as much as I can I will try to correct all bugs found. After all,
I use this plugin myself, and I'm interested in its safe and correct work...
