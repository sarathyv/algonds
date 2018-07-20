package com.company.algonds.java;

public class CustomClassLoader extends ClassLoader{
    public CustomClassLoader(ClassLoader parent) {
        super(parent);
    }
    public Class getClass(String name) throws ClassNotFoundException {
        byte[] b = loadClassFromFTP(name);
        return defineClass(name, b, 0, b.length);
    }
    @Override
    public Class loadClass(String name) throws ClassNotFoundException {
        if (name.startsWith("com.company.algonds")) {
            System.out.println("Loading Class from Custom Class Loader");
            return getClass(name);
        }
        return super.loadClass(name);
    }
    private byte[] loadClassFromFTP(String fileName)  {

        return new byte[0];
    }
}
