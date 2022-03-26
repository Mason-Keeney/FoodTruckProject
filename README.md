## Food Truck Project

### Week 2 Weekend Project Skill Distillery

## Overview

This was likely one of the faster finishes for a project/lab for me so far, after figuring out how to work with the classes more effectively I was able to create a working piece of software. The FoodTruckApp, while it currently has a Main Method for the sake of this project, it doesn't need one, this was one of my stretch goals, to make a program that another piece of software could call a run method with the appropriate arguments and have it work. Once the static main is removed, I believe it would do so. The FoodTruckApp prompts the user for the Name, Food and Rating of up-to 5 trucks, assigns those ratings to FoodTrucks within an array, and then allows the user to show the trucks they entered, get the average of their ratings, print the highest rating (it even accounts for a two-way tie, I didn't go so far as to account for a 3, 4, or 5-way tie, I just wanted to get the logic to work).
The FoodTruck class itself is just a blueprint for the FoodTrucks, when instantiated the FoodTruck will generate a pseudo-random 10-digit id number using a static idShift field, with a leading number that is incremented on it's own, this should lead to a unique ID for way more than 5 food trucks, but it doesn't account for the relatively small (and impossible for the number we are using) chance of a repeating number. I am aware of this issue and am eager to learn how to resolve it in the future!

## Technologies/Skills Used

* Java
* Eclipse
* Git
* GitHub
* Terminal

## Lessons Learned
As stated in the above this was a faster finish for me, I wasn't really sure what stretch goals to add in this case, because we were doing a lot of things that I haven't done all together. I also, wasn't sure what kind of technologies would make this better, short of things I haven't seen at all (e.g. adding a GUI, using a database, or a hashmap, etc.). For now, those are as mysterious to me as our dear great, great grandclass Object, by which all classes extend.

Some lessons though: using non-static fields and methods in the class that has it's own main, this was interesting and lead to my decision to create a run method and make it so that the class could potentially be used on its own. I think however, that the most valuable lesson I learned is that ONE of our instructors is sneaky, making us put the object and the app in different packages just to let it break until we figured out how to fix it! 