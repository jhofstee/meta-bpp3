FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}_${PV}:"

SRC_URI_append += "file://startapp.sh"

do_install_append() {
	install -m 0755 ${WORKDIR}/startapp.sh	${D}${sysconfdir}/init.d
	ln -sf ../init.d/startapp.sh ${D}${sysconfdir}/rc5.d/S60startapp.sh
}
