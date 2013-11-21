package org.djodjo.lalog;

public interface ILalogger {



    String getTag();
    boolean isActive();
    void setActive(boolean active);

    void v (String msg, Object... args); //2
    void v (Throwable tr, String msg, Object... args);
    void d (String msg, Object... args); //3
    void d (Throwable tr, String msg, Object... args);
    void i (String msg, Object... args); //4
    void i (Throwable tr, String msg, Object... args);
    void w (String msg, Object... args); //5
    void w (Throwable tr, String msg, Object... args);
    void e (String msg, Object... args); //6
    void e (Throwable tr, String msg, Object... args);
}
