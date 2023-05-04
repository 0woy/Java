package Week9;

interface WashingMachine{
	public void startButtonPressed();
	public void pauseButtonPressed();
	public int chageSpeed(int speed);
	public void stopButtonPressed();
}

interface DryCourse{
	public void dry();
}

class WashingDryMachine implements WashingMachine, DryCourse{
	private int speed;
	public void startButtonPressed() {
		System.out.println("세탁기가 빨래를 시작하였습니다.");
	}
	public void pauseButtonPressed() {
		System.out.println("세탁기가 빨래를 일시 중지 하였습니다.");
	}
	public int chageSpeed(int speed) {
		switch (speed) {
		case 1: {
			this.speed = 20;
		}
		case 2:
			this.speed =50;
			break;
		case 3:
			this.speed =100;
			break;
		}
		return this.speed;
	}
	public void stopButtonPressed() {
		System.out.println("세탁기가 빨래를 중지하였습니다.");
	}
	public void dry() {
		System.out.println("세탁이 완료되어 건조하기 시작하였습니다.");
	}
}

public class Q3 {

	public static void main(String[] args) {
		WashingDryMachine machine = new WashingDryMachine();
		machine.startButtonPressed();
		System.out.println("세탁기의 속도는 "+machine.chageSpeed(3));
		machine.stopButtonPressed();
		machine.pauseButtonPressed();
		machine.dry();

	}

}
