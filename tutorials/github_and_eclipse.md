# Using GitHub and Eclipse

This [tutorial](https://github.com/collab-uniba/socialcde4eclipse/wiki/How-to-import-a-GitHub-project-into-Eclipse) was actually helpful. It's not the same as our eclipse, but it's closer than most other tutorials.

## Setting up Eclipse with a Repository

1. In Eclipse, go to `Window` -> `Show View` -> `Other` and go down the list that pops up until you find `Git`. Click on Git to open it and select the view `Git Repositories`. A window labeled `Git Repositories` should pop up in your view (bottom left?).
1. In the `Git Repositories` window click on the link `Clone repository`
   1. This will bring up a window which asks you to give the remote information, where it asked for the uri. Paste in the link you get when you press the green "Clone or Download" button on your repository main page.
   1. If all is well it will slice up the uri into the host and respository paths.
   1. Now you can enter your github usrname and password. Unless you *really* like entering your username and password frequently, I recommend you also click the Store in Secure Store checkbox. Add the hints as it asks. Click next.
   1. It will ask you which branch you would like, at this point, you should only have `master` make sure it's selected. Click next.
   1. It will ask you to select a location to store the local respository (all of the files it has pulled) make a note of the location you create the repository. It will also ask you to name the Remote, origin is the only correct answer. Click Finish.
   1. If all goes well you should now have a repository in your `Git Repositories` view.
1. Go to `New` and create a new Java project. 
   1. Unclick the `Use Default Option` box and browse to the location where you stored your the local files. Add a new name.
   1. Now you should have a project backed in your repository. All of the files in the repository have a little orange cyliner in the one corner. As you change files, their filename will have a ">" in front of it.
   
