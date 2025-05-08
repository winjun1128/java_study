package study.Inherit.Inherit02;

import study.Inherit.Inherit01.Parent;

public class HideChild extends Parent {
	public HideChild() {
		super(0);
	}
	public void printInfo() {
		System.out.println(money);
	}
}
