import com.encore.vending.VendingMachine;
import com.encore.vending.VendingMachineGuide;

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine("if");

        // 자판기 초기화면이 보여지고 로직 구현되면 좋겠다.
//        vendingMachine.init();

        VendingMachineGuide vendingMachineGuide = new VendingMachineGuide("switch");
        vendingMachineGuide.init();


    }



}
