# fix behavior of base do_install_prepend - its overwrite ready to use uImage by uncompresses Image
require linux-bpp3.inc

# Mark archs/machines that this kernel supports
#DEFAULT_PREFERENCE = "-1"
#DEFAULT_PREFERENCE_mcx = "1"

# This was introduced to remove uImage from /boot and save 3MB
KERNEL_DROPIMAGE = "y"

PR = "r1"

S = "${WORKDIR}/linux-bpp3_v3.7.1_2"

SRC_URI = "https://github.com/jhofstee/linux/archive/bpp3_v3.7.1_2.zip"
SRC_URI[sha256sum] = "d95c7a558bdd526b382568b4d926cf25827259b5e6e6fbf96941b22b8f9b3dd5"
