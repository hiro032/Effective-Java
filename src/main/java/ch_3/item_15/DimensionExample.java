package ch_3.item_15;

import java.awt.Button;
import java.awt.Dimension;

public class DimensionExample {

	public static void main(String[] args) {
		Button button = new Button("btn");
		Dimension size = button.getSize();

		double height = size.getHeight(); // 값 자체를 노출 & 수정 가능한 상태
		double width = size.getWidth();
	}
}
