# Overview

This program creates a window in the middle of the screen and draws a 'dot'. If the dot does not appear the first time, 
stop the program and run it again (I think I have a problem with threading or something). The name of the program 
comes from my original plan to be able to create a program that had multiple 'cars' that could be moved around the 
screen by the user. 

Although not good practice, this program has two main functions. One that runs the classes that make up the creation
and display for the 'cars' part of the program (this main function is located within the 'Game' class). The other
main function is located within the 'Collections' class. For ease of access and reference I have included both in the 
same java package. 

This was a huge learning experience for me that is far from over. I thought it would be pretty easy to create a simple
'game' where the user could move an object around the screen, but it ended up being much harder than I anticipated. As 
the program stands right now, the user can't move an object around the screen. However, during the process I learned tons 
about Java libraries and classes, integrating the built in Java libraries, and creating windows. 

I believe that the reason 
I was not able to get an object moving was because I had the structure of the classes set up wrong. It could also have to 
do with my use of JFrame and JPanel. It could also be that I was trying to get Java to behave like Python. Either way, 
I learned a lot, got frustrated some, but ultimately I will count this as a win. I accomplished a lot for my first time
dabbling in Java.


[Software Demo Video](https://youtu.be/AT7emjQAaOM)

# Development Environment

Java 18.0.1.1
IntelliJ IDE

Utilized Libraries:
Swing, awt, util

# Useful Websites

* [Java Game Tutorial](https://www.youtube.com/watch?v=1gir2R7G9ws)
* [Stack Overflow - Add Window to Container](https://stackoverflow.com/questions/16879703/java-error-illegalargumentexception-adding-a-window-to-a-container)
* [Snake Game Python Tutorial](https://zetcode.com/javagames/snake/)
* [EDUCBA - JFrame vs JPanel](https://www.educba.com/jpanel-vs-jframe/)
* [Collections Tutorial](https://beginnersbook.com/2013/12/hashmap-in-java-with-example/)
* [Journal Dev - Lists](https://www.journaldev.com/33297/java-list-add-addall-methods)


# Future Work

* Get the dot moving around the screen (Likely has to do with my class separation).
* Add some objects that can also randomly spawn on the screen.
* Add collision handling.
* More practice ;)