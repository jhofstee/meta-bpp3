SUMMARY = "Root file system image for bpp3 board"
DESCRIPTION = "Root FS for bpp3"

PR="r1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
			file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
		"

inherit core-image

IMAGE_INSTALL = " \
	packagegroup-custom-image-bpp3 \
	"

bla = " \
	bash \
	bzip2 \
	cronie \
	curl \
	dbus \
	e2fsprogs \
	iproute2 \
	ldd \
	less \
	libevent \
	libsegfault \
	mtd-utils \
	nano \
	openssh \
	openssh-sftp-server \
	ppp \
	ppp-dialin \
	ppp-minconn \
	ppp-tools \
	python-datetime \
	python-dbus \
	python-elementtree \
	python-pygobject \
	python-io \
	python-logging \
	python-math \
	python-netclient \
	python-stringold \
	python-subprocess \
	python-threading \
	python-xml \
	python-zlib \
	screen \
	strace \
	u-boot-env-tools \
	util-linux \
	zip \
	libqt-embeddedcore4 \
	libqt-embeddeddbus4 \
	libqt-embeddeddeclarative4 \
	libqt-embeddedgui4 \
	libqt-embeddedscript4 \
	qt4-embedded-fonts-ttf-dejavu \
	qt4-embedded-fonts-ttf-vera \
	qt4-embedded-plugin-imageformat-gif \
	qt4-embedded-plugin-imageformat-ico \
	qt4-embedded-plugin-imageformat-jpeg \
	qt4-embedded-plugin-imageformat-tiff \
	qt4-embedded-qmlviewer \
"

IMAGE_FSTYPES = "tar.gz"

