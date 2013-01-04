SUMMARY = "Root file system image for bpp3 board"
DESCRIPTION = "Root FS for bpp3"

PR="r1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
			file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
		"

inherit core-image

IMAGE_INSTALL = "packagegroup-custom-image-bpp3"
IMAGE_FSTYPES = "tar.gz"

