# Sleep Shift Android Application

A familiar problem for people who have traveled across time zones is dealing with the effects of jet lag. If not accounted for, jet lag, in addition to making people feel sleepy, will render them unalert, unfocused, and stressed, which in turn may lead to poor decision making. Many people are unfamiliar with jet lag alleviating techniques and try to combat the effects of jet lag by trying to sleep a bit more on the plane or ingesting more caffeine, but not only do these "solutions" avoid solving the underlying problem regarding their body's circadian rhythm, they may also make their jet lag worse. 

This application attempts to alleviate jet lag by guiding users through scientifically verified strategies of combating jet lag. Users should prepare to use the app several days in advance, adjusting the user's sleep cycle day by day to match their desired sleep schedule at their destination. The handheld application will help users strategize and plan out this shift, while the watch application will help users monitor their adherence to their strategy.

This application was built from scratch and served as the final project for the course CS 160 User Inferface Desgin and Development at University of California, Berkeley. Project members include David Ju, Ianto Xi, Tatiana Ferreyra, and Josef Nunez.

## Responsiblities and Contributions

I was largely responsible for building the app backend, designing and configuring app screens, debugging errors in the app’s input pipeline, setting up the wearable data layer to sync information between mobile and watch devices, and ensuring that sensor data was interpreted correctly. I also routinely performed heuristic evaluations and contextual inquiry to continuously make improvements to the app’s UI. 

## Usage

The APK files for both the mobile and wear app are provided in the git repository, available to install on the device or emulator of your choice. This application also requires that Google Maps must be installed, and GPS location services must be enabled to have your current location automatically determined by our Place Picker.

This application uses Google services, so if you would like to build this app locally you must provide your own Google Developer's Key. Insert your key in the strings.xml file under the name google_api_key.

## Poster Presentation

![](/images/sleep-shift-poster.png)<!-- .element height="40%" width="40%" -->

[Click here to view poster as a high-resolution PDF](https://www.dropbox.com/s/cmizv5yyuinbssc/Sleep_Shift_Poster.pdf?dl=0)