public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Person personSecond = new Person("Пупыркин Василий Геннадьевич", 34);

        person.move();
        person.talk();

        personSecond.move();
        personSecond.talk();

        Phone phone = new Phone();
        Phone phoneSecond = new Phone("+7-981-123-56-78", "Nokia");
        Phone phoneThird = new Phone("+7-981-678-65-88", "One Plus", 1280);

        System.out.println(phone.number + " " + phone.model + " " + phone.weight);
        System.out.println(phoneSecond.number + " " + phoneSecond.model + " " + phoneSecond.weight);
        System.out.println(phoneThird.number + " " + phoneThird.model + " " + phoneThird.weight);

        phone.receiveCall("Олег");
        phone.getNumber();

        phoneSecond.receiveCall("Катюха");
        phoneSecond.getNumber();


        phoneThird.receiveCall("Иван");
        phoneThird.getNumber();

        double[][] arraySecond = new double[][] {{1.2, 1.5}, {2.5, 6.8}};
        Matrix matrix = new Matrix(arraySecond);

        matrix.additionOfArrays(matrix);
    }
}
