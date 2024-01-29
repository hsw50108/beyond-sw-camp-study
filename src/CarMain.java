import com.encore.car.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        // Car 객체 생성 후 인스턴스 소유의 메서드 호출
        car.engineInfo();

        Car car1 = new Car("디젤");
        car1.engineInfo();

        Car car2 = new Car("가솔린");
        car2.engineInfo();



    }

}
