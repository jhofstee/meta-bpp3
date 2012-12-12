SUMMARY = "Add root user with root password."
SECTION = "base"
PR = "r0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

SRC_URI = "file://passwd \
           file://shadow \
           file://login.defs \
	   file://group"

S = "${WORKDIR}"

do_install () {
	install -m 0755 -d ${D}${sysconfdir}
	install -m 0644 ${WORKDIR}/passwd ${D}${sysconfdir}/passwd
	install -m 0600 ${WORKDIR}/shadow ${D}${sysconfdir}/shadow
	install -m 0644 ${WORKDIR}/login.defs ${D}${sysconfdir}/login.defs
	install -m 0644 ${WORKDIR}/group ${D}${sysconfdir}/group
}

PACKAGES = "${PN}-doc ${PN} ${PN}-dev ${PN}-dbg"
FILES_${PN} = "/"

PACKAGE_ARCH = "${MACHINE_ARCH}"

CONFFILES_${PN} = "${sysconfdir}/shadow ${sysconfdir}/passwd ${sysconfdir}/login.defs ${sysconfdir}/group"
