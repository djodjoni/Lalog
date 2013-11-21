package org.djodjo.lalog;

import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * android debug logger
 */
public class ADebugLogger extends Lalogger{

    private static final Pattern classPattern = Pattern.compile("\\$\\d+$");

    public ADebugLogger(String tag) {
        super(tag);
    }

    private String getALogTag() {
        String res = "";
        res = new Throwable().getStackTrace()[3].getClassName();
        Matcher m = classPattern.matcher(res);
        if (m != null && m.find()) {
            res = m.replaceAll("");
        }
        res = res.substring(res.lastIndexOf('.') + 1);
        if(getTag()!=null) res = getTag() + "::" + res;
        return res;
    }

    @Override
    public void v(String msg, Object... args) {
        Log.v(getALogTag(), String.format(msg, args));
    }

    @Override
    public void v(Throwable tr, String msg, Object... args) {
        Log.v(getALogTag(), String.format(msg, args), tr);
    }

    @Override
    public void d(String msg, Object... args) {
        Log.d(getALogTag(), String.format(msg, args));
    }

    @Override
    public void d(Throwable tr, String msg, Object... args) {
        Log.d(getALogTag(), String.format(msg, args), tr);
    }

    @Override
    public void i(String msg, Object... args) {
        Log.i(getALogTag(), String.format(msg, args));
    }

    @Override
    public void i(Throwable tr, String msg, Object... args) {
        Log.i(getALogTag(), String.format(msg, args), tr);
    }

    @Override
    public void w(String msg, Object... args) {
        Log.w(getALogTag(), String.format(msg, args));
    }

    @Override
    public void w(Throwable tr, String msg, Object... args) {
        Log.w(getALogTag(), String.format(msg, args), tr);
    }

    @Override
    public void e(String msg, Object... args) {
        Log.e(getALogTag(), String.format(msg, args));
    }

    @Override
    public void e(Throwable tr, String msg, Object... args) {
        Log.e(getALogTag(), String.format(msg, args),tr);
    }
}
