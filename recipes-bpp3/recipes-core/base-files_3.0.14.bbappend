FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}_${PV}:"

SRC_URI += "file://fw_env.config \
		file://avahi-daemon \
	"

do_install_append () {
	install -d ${D}${sysconfdir}
	install -d ${D}${sysconfdir}/default
	install -m 0644 ${WORKDIR}/fw_env.config ${D}${sysconfdir}/fw_env.config
	install -m 0644 ${WORKDIR}/avahi-daemon ${D}${sysconfdir}/default/avahi-daemon
}
