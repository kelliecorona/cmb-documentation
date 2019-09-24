Getting ModelBuilder
====================

Downloading ModelBuilder
------------------------

ModelBuilder can be downloaded from the |cmbsite_link|.

.. |cmbsite_link| raw:: html

   <a href="http://www.computationalmodelbuilder.org/download/" target="_blank">
   Official Site </a>

.. Note::
    ModelBuilder v6 is currently in development, but nightly builds are
    available.

Building ModelBuilder from Source
---------------------------------

Because ModelBuilder has many dependencies, such as OpenCV, ParaView, Qt, and
SMTK, the code base is separated into |cmbsuperbuild-git|, which contains all
dependencies, and |cmb-git|, which contains only ModelBuilder.

.. |cmbsuperbuild-git| raw:: html

   <a href="https://gitlab.kitware.com/cmb/cmb-superbuild" target="_blank">
   CMB-SuperBuild </a>

.. |cmb-git| raw:: html

   <a href="https://gitlab.kitware.com/cmb/cmb" target="_blank"> CMB </a>

All users should begin by checking out the CMB-SuperBuild repository.  In
CMB-SuperBuild, ModelBuilder can be built in two different modes: developer mode
and release mode.

If configured in the developer mode, all ModelBuilder dependencies are
built and a config file "cmb-Developer-Config.cmake" is generated.
The user should check out and build the CMB project outside the
CMB-SuperBuild, using the superbuild's contents to satisfy CMB's dependencies.
Doing so separates ModelBuilder and its dependencies to enable the user to
easily rebuild ModelBuilder.

If configured in the release mode, ModelBuilder and
everything it needs is built with no need to checkout the CMB repository.

.. seealso::

    |cmbsuperbuild-git| for more instructions.