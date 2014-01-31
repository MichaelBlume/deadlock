package deadlock;

import clojure.lang.PersistentHashSet;
import clojure.lang.RT;
import clojure.lang.Symbol;

public class DeadLockMain {

  public static void main(String[] args) {
    new Thread(new Runnable() {

      public void run() {
        RT.var("clojure.core", "require").invoke(Symbol.intern("deadlock"));
      }
      
    }).start();
    PersistentHashSet.EMPTY.cons(5);

  }

}
