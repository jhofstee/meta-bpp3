# fix behavior of base do_install_prepend - its overwrite ready to use uImage by uncompresses Image
require linux-bpp3.inc

# Mark archs/machines that this kernel supports
DEFAULT_PREFERENCE = "-1"
DEFAULT_PREFERENCE_mcx = "1"

# This was introduced to remove uImage from /boot and save 3MB
KERNEL_DROPIMAGE = "y"

#LINUX_VERSION ?= "3.1.0"

PR = "r1"
#PV = "${LINUX_VERSION}+git${SRCPV}"

SRCREV = "589becde24a1b237194c6d86d733335653e7ac02"

S = "${WORKDIR}/git"

LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRC_URI = "git://github.com/jhofstee/linux.git;branch=remotes/origin/bpp3_devel5;protocol=git \
           file://defconfig"
