require u-boot.inc

# SPL build
UBOOT_BINARY = "u-boot.img"
UBOOT_IMAGE = "u-boot-${MACHINE}-${PV}-${PR}.img"
UBOOT_SYMLINK = "u-boot-${MACHINE}.img"

PV = "2012.07"
PR = "r0"

# No patches for other machines yet
COMPATIBLE_MACHINE = "(mcx)"

SRC_URI = "git://github.com/jhofstee/u-boot.git;branch=remotes/origin/bpp3_dev7;protocol=git; \
          "

LICENSE = "GPLv2+"
# We use the revision in order to avoid having to fetch it from the repo during parse
SRCREV = "54ecf99adc2e1c5c8d170d1b122abaec1e167134"

LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb \
                    file://README;beginline=1;endline=22;md5=78b195c11cb6ef63e6985140db7d7bab"

S = "${WORKDIR}/git"
