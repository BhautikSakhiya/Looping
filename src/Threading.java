//      //USING CLASS
//
//class AA extends Thread{
//    public void run(){
//        for(int i = 0; i <= 8; i++){
//            System.out.println("AA");
//            try {
//                Thread.sleep(1500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//class BB extends Thread{
//    public void run() {
//        for (int i = 0; i <= 8; i++){
//            System.out.println("BB");
//            try {
//                Thread.sleep(1500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//public class Threading {
//    public static void main(String[] args) {
//        AA aa = new AA();
//        BB bb = new BB();
//        aa.start();
//        try {           // IT WILL GIVE EXTRA TIME TO CALL METHOD bb.
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        bb.start();
//    }
//}


//      //USING INTERFACE WHICH HELPS TO IMPLEMENT CONCEPT OF MULTIPLE INHERITANCE
//
//class AA implements Runnable{
//    public void run() {
//        for (int i = 0; i <= 8; i++) {
//            System.out.println("AA");
//            try {
//                Thread.sleep(1500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//class BB implements Runnable{
//    public void run() {
//        for (int i = 0; i <= 8; i++) {
//            System.out.println("BB");
//            try {
//                Thread.sleep(1500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//public class Threading {
//    public static void main(String[] args) {
//        AA aa = new AA();
//        BB bb = new BB();
//
//        Thread t1 = new Thread(aa);
//        Thread t2 = new Thread(bb);
//
//        t1.start();
//        try {
//            Thread.sleep(50);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        t2.start();
//    }
//}


//      //USING ANONYMOUS FUNCTION
//
//public class Threading {
//    public static void main(String[] args) {
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 8; i++){
//                    System.out.println("In AA");
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        };
//
//        Runnable r2 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 8; i++){
//                    System.out.println("In BB");
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        };
//
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);
//
//        t1.start();
//        try {
//            Thread.sleep(50);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        t2.start();
//    }
//}


      //USING LAMBDA FUNCTION

public class Threading {
    public static void main(String[] args) {
        Runnable r1 = () -> {
                for (int i = 0; i <= 8; i++){
                    System.out.println("In AA");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };

        Runnable r2 = () ->{
                for (int i = 0; i <= 8; i++){
                    System.out.println("In BB");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}