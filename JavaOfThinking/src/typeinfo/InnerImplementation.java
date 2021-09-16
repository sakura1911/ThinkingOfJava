package typeinfo;

import interfacea.A;

import java.awt.desktop.AppHiddenEvent;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-16 16:39
 **/

public class InnerImplementation {

    public static void main(String[] args) throws Exception {
        A a = InnerA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // Reflection still gets into the private class:
        HiddenImplementation.callHiddenMethod(a, "g");
        HiddenImplementation.callHiddenMethod(a, "u");
        HiddenImplementation.callHiddenMethod(a, "v");
        HiddenImplementation.callHiddenMethod(a, "w");
    }
}

class InnerA {
    private static class C implements A {
        public void f() {
            System.out.println("public C.f()");
        }

        public void g() {
            System.out.println("public C.g()");
        }

        void u() {
            System.out.println("package C.u()");
        }

        protected void v() {
            System.out.println("protected C.v()");
        }

        private void w() {
            System.out.println("private C.w()");
        }
    }

    public static A makeA() {
        return new C();
    }
}
