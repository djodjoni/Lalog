package org.djodjo.lalog;

/**
 * useful to extend for crash logger
 */
public abstract class ErrorWarningLogger extends Lalogger {

    protected ErrorWarningLogger(String tag) {
        super(tag);
    }

    @Override
    public void v(String msg, Object... args) {
    }

    @Override
    public void v(Throwable tr, String msg, Object... args) {
    }

    @Override
    public void d(String msg, Object... args) {
    }

    @Override
    public void d(Throwable tr, String msg, Object... args) {
    }

    @Override
    public void i(String msg, Object... args) {
    }

    @Override
    public void i(Throwable tr, String msg, Object... args) {
    }

}
