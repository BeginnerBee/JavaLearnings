package week06.aufgabe03;

class MyException extends Exception {
}

class MySubException extends MyException {
}

public class ExceptionTheory {

    void test1(int x) throws Exception {
        try {
            if (x == 0) {
                throw new Exception();
            } else if (x == 1) {
                throw new MyException();
            } else if (x == 2) {
                throw new MySubException();
            }
        } catch (MySubException e) {
            System.out.println("First catch");
        } catch (MyException e) {
            System.out.println("Second catch");
        } finally {
            System.out.println("Finally");
        }
    }

    void test2(int x) {
        try {
            try {
                if (x == 0) {
                    throw new MyException();
                } else {
                    throw new MySubException();
                }
            } catch (MySubException s) {
                System.out.println("Inner");
            }
        } catch (MyException s) {
            System.out.println("Outer");
        }
    }

    void test3() throws Exception {
        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println("First catch");
            throw e;
        } catch (Exception e) {
            System.out.println("Second catch");
            throw e;
        }
    }

    void test4() {
        try {
            throw new RuntimeException("Test");
        } finally {
            ((String) null).length();
        }
    }

    void subCall1() throws RuntimeException {
    }

    void subCall2() throws MyException {
    }

    void test5() {
        subCall1();
    }

    void test6() {
      try {
        subCall2();
      } catch (MyException e) {
        e.printStackTrace();
      }
    }

    public static void main(String[] args) {
      ExceptionTheory t = new ExceptionTheory();
        t.test5();
    }
}
