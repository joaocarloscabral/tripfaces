# tripfaces

![tripfaces](https://raw.githubt.com/joaocarloscabral/tripfaces/master/public/img/logo-tiny.jpg "tripfaces")

Trip.js is a jQuery plugin that can help you customize a tutorial trip easily with more flexibilities. Right now Trip.js support lots of useful stuffs like **keyboard binding**, **animations**, **changing themes** ... etc. If you want to highly customize your own tutorial trip, then Trip.js is definitely worth to give it a try !

# Version

0.0.1-SNAPSHOT

# Setup 

* include //TODO maven example

# Documentation

Please check the [setup](http://eragonj.github.io/Trip.js/doc-setup.html) and [configuration](http://eragonj.github.io/Trip.js/doc-configuration.html) here !

# How to Contribute

# Key Binding

Trip.js would detect following keys to do relative actions after loading it.

* Right and Down arrows  - Go to next trip
* Left and Up arrows     - Go back to previous trip
* Space                  - pause / resume trip
* Esc                    - Stop trip

# API

* trip.start()  - start your trip
* trip.stop()   - stop your trip
* trip.pause()  - pause / resume your trip ( same as trip.resume() )
* trip.resume() - pause / resume your trip ( same as trip.pause()  )
* trip.next()   - jump to next step
* trip.prev()   - jump back to previous step

# TODO

* Add data-x to define steps ( make the setup easier )
* Add UI for pause/play/stop to make users know how to interact
* Don't depend on jQuery

# Author
EragonJ ( eragonj@eragonj.me )

# License
MIT

# Special Thanks

* @EragonJ - Trip.js
