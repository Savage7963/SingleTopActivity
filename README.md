#Android activity and its Lauch modes
##SingleTopActivity


###What is Android Activity “launchMode”?

Launch mode is an Android OS command that determines how the activity should be started. It specifies how every new action should be linked to the existing task. Before proceeding, you must first grasp the following critical topics:

####Tasks
####Back Stack
##Types of Launch Modes for Activities
Without further ado, coming to the topic, we will be seeing that primarily there are four different types of Launch Modes, which depend upon the type of launch you desire for your Android App. They are viz:

###1. Standard

This is the default launch mode of activity (If not specified). It launches a new instance of an activity in the task from which it was launched. Numerous instances of the activity can be generated, and multiple instances of the activity can be assigned to the same or separate tasks. In other words, you can create the same activity multiple times in the same task as well as in different tasks.

Syntax: 

#####<activity android:launchMode=”standard” />
#####Example: Assume you have A, B, C, and D activities, and Activity B has “launch mode = standard.” You are now launching Activity B once more – State of Activity Stack before Launch B. A to B to C to D. The state of the Activity Stack following startup B.
 

###2. Single Top

If an instance of the activity already exists at the top of the current task in this launch mode, no new instance will be generated, and the Android system will send the intent data through onNewIntent (). If an instance does not exist on top of the task, a new instance will be generated. You can use this launch mode to generate numerous instances of the same activity within the same task or across tasks, but only if the identical instance does not already exist at the top of the stack.

Syntax:

#####<activity android:launchMode=”singleTop” />

#####Example: Assume you have A, B, C, and D activities, with D having “launch mode = singleTop.” You are now resuming your activity. D – The state of the Activity Stack before starting D is A to B to C to D. After launching the D activity, the state of the Activity Stack is as follows: A to B to C to D (Here, the old instance is invoked, and the intent data is sent through the onNewIntent() callback.)
