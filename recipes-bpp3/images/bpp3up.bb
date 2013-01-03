SUMMARY = "Root file system image for bpp3 board"
DESCRIPTION = "Root FS includes the following functionality: 				\
		Busybox: standard for ELDK 5.2 (syslogd removed) 			\
		mtd-utils: standard for ELDK 5.2 					\
		base-files: standard script for ELDK 5.2 (/var/log placement changed) 	\
		tinylogin: standard for ELDK 5.2 					\
		sysvinit: standard for ELDK 5.2 (bootlogd removed)			\
		initscripts: modified standard script for ELDK 5.2			\
		"


SRC_URI = "file://rcS.swupdate"

IMAGE_INSTALL = " \
	base-files \
	base-passwd \
	busybox \
	initscripts-swupdate \
	mtd-utils \
	tinylogin \
	sysvinit \
	u-boot-env-tools \
	 "

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
		   "

# This variable is triggered to check if sysvinit must be overwritten by a single rcS
export SYSVINIT = "no"

LICENSE = "MIT"
PR="r1"

IMAGE_CLASSES += " image_types_uboot"

IMAGE_FSTYPES = "ext2.gz.u-boot"
#IMAGE_FSTYPES = "tar.gz"

IMAGE_DEVICE_TABLE="${COREBASE}/meta-bpp3/recipes-bpp3/files/device_table.txt"
IMAGE_ROOTFS_SIZE = "16384"

inherit image

remove_locale_data_files() {
	printf "Post processing local %s\n" ${IMAGE_ROOTFS}${libdir}/locale
	rm -rf ${IMAGE_ROOTFS}${libdir}/locale
}

# remove not needed ipkg informations
ROOTFS_POSTPROCESS_COMMAND += "remove_packaging_data_files ; "
ROOTFS_POSTPROCESS_COMMAND += "remove_locale_data_files ; "
