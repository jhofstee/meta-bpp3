SUMMARY = "U-Boot enviroment tools"
DESCRIPTION = "install fw_setenv, fw_printenv "

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb \
                    file://README;beginline=1;endline=22;md5=78b195c11cb6ef63e6985140db7d7bab"

#FILESDIR = "${@os.path.dirname(d.getVar('FILE',1))}/u-boot-testing-git/${MACHINE}"

SRCREV = "8b10652d6d9cc05023b5a6b73840078066f95a50"

PV = "git${SRCPV}"
PR = "r0"

SRC_URI = "git://git.denx.de/u-boot.git;protocol=git \
	  file://0001-drop-config-from-env.patch \
	   "

S = "${WORKDIR}/git"

inherit autotools

do_compile () {
        oe_runmake HOSTCC="${CC}" HOSTSTRIP="${STRIP}" env
}

do_install () {
	install -d ${D}${sysconfdir} ${D}/usr/bin
        install ${S}/tools/env/fw_printenv ${D}/usr/bin
        ln -sf fw_printenv ${D}/usr/bin/fw_setenv
}
