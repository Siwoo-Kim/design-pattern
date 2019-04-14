package com.siwoo.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BeanNonOwnerInvocationHandler implements InvocationHandler {
    private Bean bean;

    public BeanNonOwnerInvocationHandler(Bean bean) {
        this.bean = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(bean, args);
            } else if (method.getName().equals("setHotOrNotRating"))
                return method.invoke(bean, args);
            else if (method.getName().startsWith("set"))
                throw new IllegalAccessException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
