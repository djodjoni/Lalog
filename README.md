Lalog
=====

Light Android Log - easily log and manage different loggers like log4j but much more simplified. specifically done for android.

_____

A single log statement can trigger different loggers

Active loggers can be configured differently for different build types

Loggers can be identified by TAG and can be easily paused or resumed at runtime

Example
========

Check LalogExample example code for details.

Add logger
----
  Lalog.addLalogger(new ADebugLogger(TAG_ADEBUG));
  
Pause/Resume Logger
----
  Lalog.getLalogger(someTag).setActive(((CheckBox)checkBox).isChecked());

Just Log
----
  Lalog.d("someone checked me");
  
  Lalog.e("unreal checked error ");
