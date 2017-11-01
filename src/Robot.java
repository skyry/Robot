public class Robot {

    // Текущая координата Х
    int x = 0;

    // Текущая координата Y
    int y = 0;

    // Текущий курс (в градусах)
    int course = 0;

    // Печать координат робота
    void printCoordinates() {
        System.out.println(x + "," + y);
    }

    // Передвижение на дистанцию distance
    void forward(int distance) {

        // Обращение к полю объекта Х
        x = x + distance * Math.cos(course / 180 * Math.PI);

        // Обращение к полю объекта Y
        y = y + distance * Math.sin(course / 180 * Math.PI);

    }


}
