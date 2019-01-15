# COMP 1502 - GitHub Tutorial

The intention for today is to practice getting used to GitHub.

## Activity 1 - Check-out, change and check-in

We need to begin by checking out our repository from GitHub, we do this by creating a **new empty directory** (your local repository), **going into it** and finally by initalizing git:

* Set up git for the directory: `git init`
* Tell your local repository about github: `git remote add origin <Your GitHub URL>.git`
* Get the existing source code from the repository: `git pull origin master`

Now all of the files in the "remote" repository will be copied to your "local" repository.

Once you have the tutorial respository checked out then you can edit it this file to say "I DID IT" below. (This is a job for emacs!)

Type *I DID IT* here: 

Finally check your code back in:

* See what's changed: `git status`
* Add the files that have changed to your commit (a commit is like an envelope of new stuff) `git add assignment.md` (you can also use `git add -A`)
* Create the commit: `git commit -m "I added I DID IT to a file"`
* Send the commit back to GitHub `git push origin master`

## Activity 2 - Editing in GitHub

Change to GitHub and look at how your change has been brought in. If you look at the commits you can see what's been added. Any text file can be edited through GitHub's text editor, but usually it will be better to check the files out edit them using your outside tools and then check them back in. We'll test editing a text file using the web interface just to ensure that we can. Edit the the file to say I DID THIS TOO below then click commit at the bottom of the page.

Type *I DID THIS TOO* here: I DID THIS TOO

With GitHub it automatically parses markdown language on any text file that ends .md (like this one). If you want to learn to make your documents fancy I suggest [looking up the rules.](https://guides.github.com/features/mastering-markdown/). It's basically a weird cousin to HTML. 

## Activity 3 - Pull Request

Pull requests are the way you can communicate with your colleagues that the work you've been working on is done and you need to add it to the big project you're working on. For now that's beyond what we need, but the pull request provides a forum for feed back on a project, so we will be able to use it to give you feedback on your assignments.

In order to have a pull request you will need to create a new branch of your repository. To do that, in your local repository (on ins), do the following:

* Update your local repository: `git pull origin master`
* Create the branch you will work on: `git branch assignment` 
* Switch to the assignment branch: `git checkout assignment`
* Make a change: `echo "New File" >> test.md`
* Save the change to git: `git add test.md` then `git commit -m "My Instructor made me make this"
* Push the **branch** back to GitHub: `git push origin assignment`

Now in GitHub you can see in the code section there will be a dropdown for branch were you can select master or assignment, all of you work from now on will go into assignment.

Finally we need to create the pull request. 

* Go to the *Pull Request* link at the top of the page
* Click the *New Pull Request* button
* In the **compare** drop down pick *assignment*
* GitHub will show you what changed. 
* Click *Create New Pull Request*
* Write any notes you might have and give your assignment a good name
* Click *Create Pull Request*
* Now your instructor will be able to see your submission and provide feedback.


Branches are used for a lot in git, but at *this* point we will only use the assignment branch for every assignment.
