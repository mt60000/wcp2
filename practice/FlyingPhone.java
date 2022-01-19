package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	private int minute;
	
	public FlyingPhone(int minute) {
		this.minute = minute;
	}
	
	public void fly() {
		System.out.println(this.minute + " 分間、飛びます。");
	}
	
	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}
	
	public void powerOff() {
		Flying.super.powerOff();
	}
}
