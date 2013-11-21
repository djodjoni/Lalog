package org.djodjo.lalog.example;

import android.app.Application;

import org.djodjo.lalog.ADebugLogger;
import org.djodjo.lalog.ErrorWarningLogger;
import org.djodjo.lalog.Lalog;

public class ExampleLalogApp extends Application {
    public static final String TAG_ADEBUG = "adebug";
    public static final String TAG_REPORTER = "reporter";

    @Override public void onCreate() {
            super.onCreate();
                Lalog.addLalogger(new ADebugLogger(TAG_ADEBUG));
            Lalog.addLalogger(new ErrorReporter(TAG_REPORTER));
        }

        /** logger for error and warning level logs, useful for crittercism and alike */
        private static class ErrorReporter extends ErrorWarningLogger {

            private ErrorReporter(String tag) {
                super(tag);
            }

            @Override
            public void w(String msg, Object... args) {
                System.out.println("Warning: " + String.format(msg, args));
            }

            @Override
            public void w(Throwable tr, String msg, Object... args) {
                //TODO log exception
            }

            @Override
            public void e(String msg, Object... args) {
                System.out.println("Error: " + String.format(msg, args));
            }

            @Override
            public void e(Throwable tr, String msg, Object... args) {
                //TODO log exception
            }
        }
}
