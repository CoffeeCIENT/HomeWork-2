//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog.2 = " + dog);
        System.out.println("cat.2 = " + cat);
        System.out.println("paper.2 = " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog.3 = " + dog);
        System.out.println("cat.3 = " + cat);
        System.out.println("paper.3 = " + paper);
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend.2 = " + friend);
        friend = friend / 7;
        System.out.println("friend.3 = " + friend);
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog.2 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog.3 = " + frog);
        frog = frog + 4;
        System.out.println("frog.4 = " + frog);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Общая масса двух бойцов = " + boxer1 + boxer2);
        System.out.println("Разница между массами бойцов = " + (boxer2 - boxer1));
        System.out.println("Остаток от деления между двумя весами = " + (boxer2 % boxer1));
        var totalWorkHours = 640;
        var workHours = 8;
        System.out.println("Всего работников в компании — " + (totalWorkHours / workHours) + " человек.");
        var workers = (totalWorkHours / workHours) +  94;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + (totalWorkHours / workers) + " часа работы может быть поделено между сотрудниками.");
    }
}