package deadlock;

import clojure.lang.PersistentHashSet;
import clojure.lang.RT;

public class DeadLockMain {

  public static void main(String[] args) {
    new Thread(new Runnable() {

      public void run() {
        RT.var("clojure.core", "require");
      }
      
    }).start();
    PersistentHashSet.EMPTY.cons(5);

  }

}
