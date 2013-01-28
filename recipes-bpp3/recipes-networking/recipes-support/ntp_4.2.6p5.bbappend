FILESEXTRAPATHS_prepend := "${THISDIR}/ntp:"

LICENSE = "MIT"

SRC_URI += "file://ntp.conf \
	file://ntpdate.config \
	"

do_install_append () {
	install -m 0644 ${WORKDIR}/ntp.conf ${D}${sysconfdir}/ntp.conf
	install -m 0644 ${WORKDIR}/ntpdate.config ${D}${sysconfdir}/default/ntpdate
}
