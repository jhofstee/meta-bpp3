DESCRIPTION = "rootfs for the bpp3"

inherit packagegroup

LICENSE = "MIT"

PACKAGES = "\
         packagegroup-custom-image-bpp3 \
         "

RDEPENDS_packagegroup-custom-image-bpp3 = "\
	packagegroup-core-boot \
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
