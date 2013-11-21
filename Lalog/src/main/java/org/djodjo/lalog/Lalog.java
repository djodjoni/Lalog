package org.djodjo.lalog;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
Main class to manage and perform logging and loggers.
Loggers can be controllable (created with TAG) or not
 */

public final class Lalog {

    private static final List<ILalogger> laloggers = new CopyOnWriteArrayList<ILalogger>();

    private Lalog(){}

    public static void addLalogger(ILalogger lalogger) {
        if(lalogger.getTag()==null || getLalogger(lalogger.getTag())==null)
            laloggers.add(lalogger);
    }

    public static final ILalogger getLalogger(String tag) {
        for(ILalogger lalogger:laloggers) {
            if(lalogger.getTag()!=null && lalogger.getTag().equals(tag))
                return lalogger;
        }
        return null;
    }

    public static final boolean isActive(String tag) {
        ILalogger lalogger = getLalogger(tag);
        if(lalogger!=null) return lalogger.isActive();
        return false;
    }

    public static final void setActive(String tag, boolean active) {
        ILalogger lalogger = getLalogger(tag);
        if(lalogger!=null) lalogger.setActive(active);
    }

    public static void v(String msg, Object... args) {
        for(ILalogger lalogger:laloggers) {
            if(lalogger.isActive()) {
                lalogger.v(msg, args);
            }
        }
    }

    public static void v(Throwable tr, String msg, Object... args) {
        for(ILalogger lalogger:laloggers) {
            if(lalogger.isActive()) {
                lalogger.v(tr, msg, args);
            }
        }
    }

    public static void d(String msg, Object... args) {
        for(ILalogger lalogger:laloggers) {
            if(lalogger.isActive()) {
                lalogger.d(msg, args);
            }
        }
    }

    public static void d(Throwable tr, String msg, Object... args) {
        for(ILalogger lalogger:laloggers) {
            if(lalogger.isActive()) {
                lalogger.d(tr, msg, args);
            }
        }
    }

    public static void i(String msg, Object... args) {
        for(ILalogger lalogger:laloggers) {
            if(lalogger.isActive()) {
                lalogger.i(msg, args);
            }
        }
    }

    public static void i(Throwable tr, String msg, Object... args) {
        for(ILalogger lalogger:laloggers) {
            if(lalogger.isActive()) {
                lalogger.i(tr, msg, args);
            }
        }
    }

    public static void w(String msg, Object... args) {
        for(ILalogger lalogger:laloggers) {
            if(lalogger.isActive()) {
                lalogger.w(msg, args);
            }
        }
    }

    public static void w(Throwable tr, String msg, Object... args) {
        for(ILalogger lalogger:laloggers) {
            if(lalogger.isActive()) {
                lalogger.w(tr, msg, args);
            }
        }
    }

    public static void e(String msg, Object... args) {
        for(ILalogger lalogger:laloggers) {
            if(lalogger.isActive()) {
                lalogger.e(msg, args);
            }
        }
    }

    public static void e(Throwable tr, String msg, Object... args) {
        for(ILalogger lalogger:laloggers) {
            if(lalogger.isActive()) {
                lalogger.e(tr, msg, args);
            }
        }
    }

}
