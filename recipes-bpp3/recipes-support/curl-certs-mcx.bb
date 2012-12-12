DESCRIPTION = "Extract CA Certs from mozilla.org"
SECTION = "console/network"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

SRC_URI = "file://cacert.pem \
	"

PR = "r0"

S = "${WORKDIR}"

do_install () {
	install -d ${D}/${sysconfdir}/ssl
	install -d ${D}/${sysconfdir}/ssl/certs
	install -m 644 ${S}/cacert.pem ${D}${sysconfdir}/ssl/certs
}

PACKAGES = "${PN}"
FILES_${PN} = "/"

PACKAGE_ARCH = "${MACHINE_ARCH}"

CONFFILES_${PN} = ""
