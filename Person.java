public class Person {
    String fullName;
    int age;

    public Person(){
    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(fullName + " говорит Вам приветики!");
    }

    public void talk(){
        System.out.println(fullName + " говорит Вам приветики!");
    }
}

//Создать класс Person, который содержит:
//a) поля fullName, age.
//б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то Person говорит".
//в) Добавьте два конструктора - Person() и Person(fullName, age).
//Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
