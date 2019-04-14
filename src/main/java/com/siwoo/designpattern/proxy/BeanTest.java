package com.siwoo.designpattern.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by sm123tt@gmail.com on 2019-04-14
 * Project : design-pattern
 * Github : http://github.com/Siwoo-Kim
 */

public class BeanTest {

    public static void main(String[] args) {
        BeanImpl bean = new BeanImpl();
        bean.setName("Joe Javabean");

        Bean proxyBean = getOwner(bean);
        proxyBean.setInterests("bowling, Go");
        System.out.println(proxyBean.getName());
        System.out.println(proxyBean.getInterests());
        //proxyBean.setHotOrNotRating(19);

        proxyBean = getNonOwner(bean);
        proxyBean.setHotOrNotRating(19);

        proxyBean.setInterests("changing by others should not be allowed.");
    }

    static Bean getNonOwner(Bean bean) {
        return (Bean) Proxy.newProxyInstance(bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                new BeanNonOwnerInvocationHandler(bean));
    }

    static Bean getOwner(Bean bean) {
        return (Bean) Proxy.newProxyInstance(bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                new BeanOwnerInvocationHandler(bean));
    }
}
