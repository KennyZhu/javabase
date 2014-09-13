package com.yunnar.core.framework.common;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created with IntelliJ IDEA.
 * User: KennyZhu
 * Date: 2014-7-20
 * Time: 12:58
 */
public final class GuiceHolder {
    private static GuiceHolder instance;
    private static final Object lock = new Object();
    private static Injector injector = Guice.createInjector();

    public Injector getInjector() {
        return injector;
    }

    private GuiceHolder() {
    }

    public static GuiceHolder getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new GuiceHolder();
                }
            }
        }
        return instance;
    }
}
