# Bottlerocket

### Requirement

* You have information on videos for a show, a list of images associated with a 
show, and a list of video ads associated with a show all considered "assets".
* Each asset has an ID, a name, a type indicator, an URL, and an expiration 
date. Videos have an expiration date, and a Movie/Full Episode/Clip indicator.
* Images can be represented by a base asset. Ads a product description.
* Containers describe a collection of assets.
* Containers can be considered a "show" with information that includes an ID, 
name, description, and assets.
* Create a program that generates at least one container with many assets 
(at least one of each type) with all properties set.
* The program should visit each asset and print information about that asset 
specific to the type of asset it is.

### Development ###

This application is built with the following:

- [Scala](http://www.scala-lang.org/) version 2.11.7
- [SBT](http://www.scala-sbt.org/) version 0.13.8

### Assumption ###

I assume you have installed the following:

*  [Scala](http://www.scala-lang.org/download/)
*  [SBT](http://www.scala-sbt.org/download.html)

I assume the following when developing the code:

* Each asset (video, image and video ad) has the base asset (an id, a 
name, a type indicator, an url and expiration date).
* Videos has two extra types (expiration date and indicator represents either 
movie, full episode or clip indicator).
* Video ads has one extra type (product description).
* Containers contains list of videos, images and video ads.
* A show contains an id, name, description and a list of containers.

### Running the Code ###

Follow these steps to run the code:

1. Download this repository
2. `Unzip` the downloaded repository.
3. `cd` into the this directory.
3. Enter `sbt run` to execute.
