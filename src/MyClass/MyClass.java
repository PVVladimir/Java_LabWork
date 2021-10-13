package MyClass;

import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {
// Lesson 3-1
        System.out.println("***** Lesson 3-1");
        Person p = new Person("Vladimir", "JAR", 42);

        System.out.println(p.name);
        System.out.println(p.city);
        System.out.println(p.age);

// Lesson 3-2
        System.out.println("***** Lesson 3-2");
//        User[] u_arr = new User[2];
//        u_arr[0] = new User(1, "Admin", "pass1");
//        u_arr[1] = new User(2, "Guest", "pass2");

//        for (User t : u_arr) {
//            System.out.println("id = " + t.getId() + "; логин = " + t.getLogin() + "; password = " + t.getPassword());
//        }

// Lesson 3-3/4
        System.out.println("***** Lesson 3-3/4");
//        User g = new User(1, "Guest", "pass1");
//        System.out.println("id = " + g.getId() + "; логин = " + g.getLogin() + "; password = " + g.getPassword());
//        g.setId();
//        g.setLogin();
//        g.setPassword();
//        System.out.println("id = " + g.getId() + "; логин = " + g.getLogin() + "; password = " + g.getPassword());

// Lesson 3-5
        System.out.println("***** Lesson 3-5");
        System.out.println(MyMath.getCount());
        System.out.println(MyMath.add(5, 6));
        System.out.println(MyMath.getCount());
        System.out.println("5.2 + 6.9 = " + (5.2 + 6.9));
        System.out.println(MyMath.add(5.2, 6.9));
        System.out.println(MyMath.getCount());
        System.out.println(MyMath.sub(5, 6));
        System.out.println(MyMath.getCount());
        System.out.println(MyMath.mult(5.2, 6.9));
        System.out.println(MyMath.getCount());
        System.out.println(MyMath.div(5.2, 6.9));
        System.out.println(MyMath.getCount());

// Lesson 3-6
        System.out.println("***** Lesson 3-6");
        UserSocial us = new UserSocial();
        System.out.println(us.getId());
        System.out.println(us.getTextInfo());
        us.setId(7);
        System.out.println(us.getTextInfo());

        WebMaster wm = new WebMaster();
        System.out.println(wm.getId());
        System.out.println(wm.getTextInfo());
        wm.setId(9);
        wm.setUrl("ya.ru");
        System.out.println(wm.getTextInfo());

// Lesson 3-7
        System.out.println("***** Lesson 3-7");
        MyLine line = new MyLine(1, 2, 3, 4);
        System.out.println("Start x = " + line.getPointStart().x + ", y = " + line.getPointStart().y);
        line.setPointStart(9, 6);
        System.out.println("Start x = " + line.getPointStart().x + ", y = " + line.getPointStart().y);

        System.out.println("Начальная точка (" + line.getPointStart().x + ", " + line.getPointStart().y + "); Конечная точка (" + line.getPointEnd().x + ", " + line.getPointEnd().y + ");");
        System.out.println("Начальная точка (" + line.pointStart.x + ", " + line.pointStart.y + "); Конечная точка (" + line.pointEnd.x + ", " + line.pointEnd.y + ");");

// Lesson 3-8
        System.out.println("***** Lesson 3-8");
        us.printUser();
        wm.printUser();

// Lesson 3-9
        System.out.println("***** Lesson 3-9");
        us.setId(11);
        us.printUser();
        wm.setId(12);
        wm.printUser();

// Lesson 3-10
        System.out.println("***** Lesson 3-10");
        User u = new User() {
            @Override
            public void printUser() {
                System.out.println("Anonymous class");
            }
        };
        u.printUser();

// Lesson 3-11
        System.out.println("***** Lesson 3-11");
        Integer[] i_arr = {1, 2, 3, 4, 5};
        Shop<Integer> i_sh = new Shop<>(i_arr);
        i_sh.printObject();
        String[] s_arr = {"a", "b", "c", "d", "e"};
        Shop<String> s_sh = new Shop<>(s_arr);
        s_sh.printObject();

// Lesson 3-12
        System.out.println("***** Lesson 3-12");
        UserSocial new_us = new UserSocial();
        System.out.println(new_us);
        UserSocial clon_us = new_us.clone();
        System.out.println(new_us);
        System.out.println(clon_us);
        new_us.setId(22);
        clon_us.setId(33);
        System.out.println(new_us);
        System.out.println(clon_us);

        WebMaster new_wm = new WebMaster();
        WebMaster clon_wm = new_wm.clone();
        System.out.println(new_wm);
        System.out.println(clon_wm);
        new_wm.setId(44);
        System.out.println(new_wm);
        System.out.println(clon_wm);

// Lesson 3-13
        System.out.println("***** Lesson 3-13");

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr, (a, b) -> Integer.compare(b, a));
        for (Integer a : arr) System.out.print(a + " ");
        System.out.println();

// Lesson 3-14
        System.out.println("***** Lesson 3-14");
        printNum(100);
        System.out.println();
        System.out.println(calcSumm(10));
        System.out.println(numericSumm(123));
        System.out.println(numericSumm(1539));
    }

    // Рекурсивный метод суммы цифр произвольного числа
    public static int numericSumm(int x) {
        if (x % 10 == x) return x;
        else return x % 10 + numericSumm(x / 10);

    }

    // Рекурсивный метод суммы чисел от 1 до х
    public static int calcSumm(int x) {
        if (x == 1) return 1;
        return calcSumm(x - 1) + x;
    }

    // Рекурсивный метод вывода чисел от 1 до х
    public static void printNum(int x) {
        if (x > 1) printNum(x - 1);
        if (x == 50) System.out.println(x + " ");
        else System.out.print(x + " ");
    }
}
