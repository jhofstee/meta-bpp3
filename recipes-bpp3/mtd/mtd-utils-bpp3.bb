DESCRIPTION = "Tools for managing memory technology devices."
SECTION = "base"
DEPENDS = "zlib lzo e2fsprogs util-linux"
HOMEPAGE = "http://www.linux-mtd.infradead.org/"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3 \
                    file://include/common.h;beginline=1;endline=17;md5=ba05b07912a44ea2bf81ce409380049c"

SRCREV = "d970b4850204553b8cc3bcba6d7219945b15d67c"
SRC_URI = "git://git.infradead.org/mtd-utils.git;protocol=git \
		file://add-exclusion-to-mkfs-jffs2-git-2.patch"

S = "${WORKDIR}/git/"

PR = "r0"
FILES_${PN}-staticdev = "ubi-utils/libubi.a ${libdir}/*.a"

EXTRA_OEMAKE = "'CC=${CC}' 'CFLAGS=${CFLAGS} -I${S}/include -DWITHOUT_XATTR' 'BUILDDIR=${S}'"

do_install () {
	oe_runmake install DESTDIR=${D} SBINDIR=${sbindir} MANDIR=${mandir} INCLUDEDIR=${includedir}
	install -d ${D}${includedir}/mtd/
	install -d ${D}${libdir}/
	for f in ${S}/include/mtd/*.h; do
		install -m 0644 $f ${D}${includedir}/mtd/
	done
	install -m 0644 ubi-utils/include/libubi.h ${D}${includedir}/mtd/
	oe_libinstall -a -C ubi-utils libubi ${D}${libdir}/
}

PARALLEL_MAKE = ""

BBCLASSEXTEND = "native nativesdk"
