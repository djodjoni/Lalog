package org.djodjo.lalog;


public abstract class Lalogger implements ILalogger {

    protected String TAG = null;
    protected boolean mActive = true;

    public Lalogger() {
    }

    public Lalogger(String tag) {
        TAG = tag;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isActive() {
        return mActive;
    }

    @Override
    public void setActive(boolean active) {
        mActive = active;
    }

}
