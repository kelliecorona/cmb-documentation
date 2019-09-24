ModelBuilder User's Guide
============================

ModelBuilder is a customizable application to help you
(1) describe a simulation's input deck in enough detail that it can be passed to
a solver and
(2) create input files for a variety of solvers in different simulation packages
using your description.
Generally speaking most work-flows involve

+ specifying the governing equations of state of the
  system to be simulated, their free parameters, and
  other quantities required by the simulation;
+ importing, constructing, or fitting a geometric model of
  the physical domain of the simulation;
+ discretizing the geometric model into a mesh suitable for
  approximating functions which enable users to make a
  decision based on the outcome of the simulation; <fix wording>
+ associating material properties, boundary and initial
  conditions, and other attributes to regions of the model and mesh.
+ queueing the simulation (or an ensemble of simulations)
  for execution;
+ monitoring simulation progress and inspecting results
  after the simulation has run;
+ integrating simulation results, experimental measurements,
  and other knowledge to make a decision to distil information from simulation data.

As a superset of |paraview|, an application traditionally used for the
visualization and analysis of simulation results, ModelBuilder exposes
ParaView's functionality as an extension of it's own feature set.

.. |paraview| raw:: html

   <a href="http://paraview.org/" target="_blank"> ParaView </a>

.. toctree::
   :maxdepth: 2
   :caption: Contents:

   introduction
   installation
   getting-started