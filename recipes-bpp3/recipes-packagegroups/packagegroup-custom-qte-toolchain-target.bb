DESCRIPTION = "Target packages for the bpp3 Embedded SDK"
LICENSE = "MIT"

PR = "r1"

inherit packagegroup

# no idea..
PACKAGEGROUP_DISABLE_COMPLEMENTARY = "1"

# add the development version of the bpp3 package to the qte sdk
RDEPENDS_${PN} += " \
        packagegroup-core-standalone-sdk-target \
        qt4-embedded-mkspecs \
	packagegroup-custom-image-bpp3-dev \
        "

