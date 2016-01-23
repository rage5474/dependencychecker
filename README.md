## Eclipse Feature - DependencyChecker

### When does this Eclipse Feature help you?
* You developing with Eclipse.
* You have many Eclipse Plug-ins or OSGi Bundles.
* You have architecture rules, that define which dependencies are allowed and which not.
* You want to get immediately warnings in your Eclipse as soon as a wrong dependency is added. 

### How can I install this Eclipse Feature?
Installation can be done via Eclipse Update-Site:
https://github.com/rage5474/dependencychecker.updatesite/raw/master

### How can I get the development environment to extend this feature?
* Download Eclipse Installer from here: https://eclipse.org/downloads/
* Start Eclipse Installer.
* Switch to advanced mode.
* Select 'Eclipse for RCP and RAP Developers' and click Next.
* Add following two project files and click Next:
	* https://raw.githubusercontent.com/rage5474/oomph.setup/master/rage-oss.setup
	* https://raw.githubusercontent.com/rage5474/oomph.setup/master/rage-dependency-checker-source.setup 
* Select your install directory and click Finish.
* Wait until a new Eclipse is opened and all projects are imported. 

### Under which license is this Eclipse Feature published?
EPL 1.0. See http://www.eclipse.org/org/documents/epl-v10.php.