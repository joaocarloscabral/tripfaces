# tripfaces

![tripfaces](https://raw.github.com/joaocarloscabral/tripfaces/master/public/img/logo-tiny.jpg "tripfaces")

Tripfaces is a simple composite component for JSF projects that can help you customize a tutorial trip easily with more flexibilities. This project is based on [Trip.js](http://eragonj.github.io/Trip.js/) and the objective is keep the JSF code more clean. 
Right now tripfaces and Trip.js support lots of useful stuffs like **keyboard binding**, **animations**, **changing themes** ... etc. If you want to highly customize your own tutorial trip on your JSF project, then Tripfaces is definitely worth to give it a try !

# Version

0.0.1-SNAPSHOT

# Setup 

* pom.xml

```xml
<dependencies>
	<dependency>
	  <groupId>org.tripfaces</groupId>
	  <artifactId>components</artifactId>
	  <version>0.0.1-SNAPSHOT</version>
	  <type>war</type>
	</dependency>
</dependencies>
...
<repositories>
...
	<repository>
		<id>oss-sonatype</id>
		<name>oss-sonatype</name>
		<url>https://oss.sonatype.org/content/repositories/snapshots/</url>
		<snapshots>
			<enabled>true</enabled>
		</snapshots>
	</repository>
</repositories>
```			
* xhtml file
```xhtml
<ui:composition xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:trip="http://tripfaces.org/components"
	template="../templates/template.xhtml">
	
	...
	
	<trip:tour widgetVar="trip" >
		<trip:message value="#{messages.hi_my_name_tripfaces}" target="title"  />
	</trip:tour>
	
	...
	
	<h:outputText id="title" value="#{messages.hello_tripfaces}"/>
	
	<h:commandButton value="#{messages.start_trip}" type="button" onclick="trip.start()"/>
</ui:composition
```
   			


# Documentation

Please check our documentation on [tripfaces site](http://tripfaces.org) 

# Key Binding

Tripfaces would detect following keys to do relative actions after loading it.

* Right and Down arrows  - Go to next trip
* Left and Up arrows     - Go back to previous trip
* Space                  - pause / resume trip
* Esc                    - Stop trip

# API (widgetVar)

* widgetVar.start()  - start your trip
* widgetVar.stop()   - stop your trip
* widgetVar.pause()  - pause / resume your trip ( same as widgetVar.resume() )
* widgetVar.resume() - pause / resume your trip ( same as widgetVar.pause()  )
* widgetVar.next()   - jump to next step
* widgetVar.prev()   - jump back to previous step

# TODO

* Ajax listener 
* Autostart

# Author
* JSF implementation - João Carlos Cabral (kjocabral@gmail.com)
* Trip.js - EragonJ ( eragonj@eragonj.me )

# License
MIT

# Special Thanks

* @EragonJ - Trip.js
