FILESEXTRAPATHS_prepend := "${THISDIR}/dbus:"

SRC_URI_append += "file://system.conf"

do_install_append() {
	install -m 0644	${WORKDIR}/system.conf ${D}${sysconfdir}/dbus-1/system.conf
}
