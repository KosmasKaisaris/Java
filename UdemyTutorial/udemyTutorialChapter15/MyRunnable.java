package udemyTutorialChapter15;

import static udemyTutorialChapter15.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run");
    }
}
