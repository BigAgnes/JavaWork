
public class Phone {
    String number;
    String model;
    int weight;

    public Phone(){
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Вам звонит " + name);
    }

    public String getNumber(){
        return this.number;
    }
}

//a) Создайте класс Phone, который содержит переменные number, model и weight.
//б) Создайте три экземпляра этого класса.
//в) Выведите на консоль значения их переменных.
//г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//ж) Добавить конструктор без параметров.
