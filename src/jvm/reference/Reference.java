package jvm.reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Reference {
    public static void main(String[] args) {
        //强引用
        final Object o = new Object();
        //软引用
        final SoftReference<Object> softReference = new SoftReference<>(o);
        //弱引用
        final WeakReference<Object> objectWeakReference = new WeakReference<>(o);
        //虚引用
    }
}

