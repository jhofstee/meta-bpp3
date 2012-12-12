FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}_${PV}:"

SRC_URI_append += " file://startapp.sh \
	"

do_install_append () {
#
# Create install device independent scripts
#
	install -m 0755    ${WORKDIR}/startapp.sh	${D}${sysconfdir}/init.d

#
# Create runlevel links
#
	ln -sf		../init.d/startapp.sh	${D}${sysconfdir}/rc5.d/S60startapp.sh
}
