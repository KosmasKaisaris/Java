package udemyTutorialChapter15;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainChallenge1And2 {

    public static void main(String[] args) {

        final BankAccount account = new BankAccount("12345-678", 1000.00);
//        Thread t1 = new Thread() {
//            public void run() {
//                account.deposit(300.00);
//                account.withdraw(50.00);
//            }
//        };
//        Thread t2 = new Thread() {
//            public void run() {
//                account.deposit(203.75);
//                account.withdraw(100.00);
//            }
//        };

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.00);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.00);
            }
        });

        t1.start();
        t2.start();

    }

    static class BankAccount {

        private double balance;
        private String accountNumber;

        private Lock lock;

        public BankAccount(String accountNumber, double balance) {
            this.balance = balance;
            this.accountNumber = accountNumber;
            this.lock = new ReentrantLock();
        }

//        public synchronized void deposit(double amount) {
//            balance += amount;
//        }
//
//        public synchronized void withdraw(double amount) {
//            balance -= amount;
//        }

        //        public  void deposit(double amount) {
//           synchronized (this){
//               balance+=amount;
//           }
//        }
//
//        public void withdraw(double amount) {
//            synchronized (this){
//                balance-=amount;
//            }
//        }
//        public void deposit(double amount) {
//            lock.lock();
//            try{
//                balance+=amount;
//            }finally {
//                lock.unlock();
//            }
//        }
//
//        public void withdraw(double amount) {
//           lock.lock();
//           try{
//               balance-=amount;
//           }finally {
//               lock.unlock();
//           }
//        }

        public void deposit(double amount) {
            boolean status = false;
            try {
                if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    try {
                        balance += amount;
                        status = true;
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("Could not get the lock");
                }
            } catch (InterruptedException e) {
                //nothing here
            }

            System.out.println("Transaction status = " + status);
        }

        public void withdraw(double amount) {
            boolean status = false;
            try {
                if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    try {
                        balance -= amount;
                        status = true;
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("Could not get the lock");
                }
            } catch (InterruptedException e) {
                // do nothing
            }
            System.out.println("Transaction status = " + status);
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void printAccountNumber() {
            System.out.println("Account number = " + accountNumber);
        }


    }
}
