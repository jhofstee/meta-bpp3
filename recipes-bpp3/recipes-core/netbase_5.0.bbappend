FILESEXTRAPATHS_prepend := "${THISDIR}/netbase:"

SRC_URI_append += "file://interfaces"

do_install_append() {
	install -m 0644	${WORKDIR}/interfaces ${D}${sysconfdir}/network/interfaces
}
