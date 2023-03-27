package cn.iocoder.learning.bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;

public class Example003 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException {
        Dog d=new Dog();
        System.out.println(d.hello());
    }

}
