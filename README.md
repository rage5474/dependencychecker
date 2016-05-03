[![Build Status](https://travis-ci.org/rage5474/dependencychecker.svg?branch=master)](https://travis-ci.org/rage5474/dependencychecker)

## Eclipse Feature - DependencyChecker + Component DSL (CDSL)

### When does this Eclipse Feature help you?
* You developing with Eclipse.
* You have many Eclipse Plug-ins or OSGi Bundles.
* You have architecture rules, that define which dependencies are allowed and which not.
* You want to get immediately warnings in your Eclipse as soon as a wrong dependency is added. 

### How can I install this Eclipse Feature?
Installation can be done via Eclipse Update-Site:
 * https://github.com/rage5474/dependencychecker.updatesite/raw/master
 * To get both feature Checker and DSL -> Select all. 

### Try it out
* Create a new project to create a dependency checker file with the Component DSL, e.g. org.example.cdsl.
* Create a file with the extension cdsl in the new plug-in, e.g. example.cdsl.
* Open the file and describe your components. After saving example.cdsl a new file should be created in the folder src-gen (this is your dependencychecker file).
* To activate this file go to Window --> Preferences -> Dependency Checker Preferences and add the path to your checker file, e.g. org.example.cdsl/src-gen/example.dependencychecker .
* Now each change of a manifest file in your workspace will be checked. 

### How works the CDSL (by example)

    //New Component with name UI
    comp UI {
        // Describe all plug-ins of this component
        // Wildcard symbol '*' is allowed
        idents : org.example.ui*;
    }
    
    //New Component with name CORE
    comp CORE {
        // Describe public plug-ins of this component
        // Wildcard symbol '*' is allowed
        ports : org.example.core.api;
        
        // Describe all plug-ins of this component
        // Wildcard symbol '*' is allowed
        idents : org.example.core*;
        
        // Describe which components are not allowed to imported.   
        forbidden : UI; 
    }
    
    //Create a dependencychecker file with following components
    dval example {
        comps : CORE UI;
    }

### CLI 
Download link: https://www.googledrive.com/host/0BzgxECnugKH8V05YekdmbVNWNEU/dval/dval/snapshots/latest/product

### How can I get the development environment to extend this feature?
* Download Eclipse Installer from here: https://eclipse.org/downloads/
* Start Eclipse Installer.
* Switch to advanced mode.
* Select 'Eclipse Modeling Tools' and click Next.
* Add following two project files and click Next:
	* https://raw.githubusercontent.com/rage5474/oomph.setup/master/rage-oss.setup
	* https://raw.githubusercontent.com/rage5474/oomph.setup/master/rage-dependency-checker-source.setup 
* Select your install directory and click Finish.
* Wait until a new Eclipse is opened and all projects are imported.
* Open file de.ragedev.cdsl.target.target (in plug-in de.ragedev.cdsl.target) and click 'Set as Target Platform'.
* To run a example, select the project de.ragedev.cdsl, click-right and select Run As -> Eclipse Application
* To build everything: 
    * Select the file pom.xml in the plug-in de.raphaelgeissler.dependencychecker.tycho.aggregator
	* Right-Click -> Run As -> Maven build .. 
	* Add 'clean package' in Goals
	* Click Run

### Under which license is this Eclipse Feature published?
EPL 1.0. See http://www.eclipse.org/org/documents/epl-v10.php.
