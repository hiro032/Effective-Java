# public 클래스에서는 public 필드가 아닌 접근자 메서드를 사용하라

- 클라이언트 코드가 필드를 직접 사용하면 캡슐화의 장점을 제공하지 못한다.
- 필드를 변경하려면 API를 변경해야 하기에 확장에 자유롭지 못하다.
- 내부를 노출한 Dimension 클래스의 성능 문제는 아직도 해결하지 못했다.

```java
import java.awt.Button;
import java.awt.Dimension;

class DimensionExample {

	public static void main(String[] args) {
		Button button = new Button("my btn");

		button.setBounds(0, 0, 10, 15);

        Dimension size = button.getSize();

		System.out.println(size.height); // Dimension의 값 그 자체를 출력하게 된다.
		System.out.println(size.width); // Dimension의 값 그 자체를 출력하게 된다.
		
		doSomething(size);
	}

	private static void doSomething(Dimension dimension) {
		dimension.height = 123; // 값을 바꿈
	}

}
```

Dimension 클래스의 경우 내부 필드를 그대로 노출 시킨다.

내부 필드를 여러곳에서 사용한다면, 한번 값이 바뀌게 되는 순간 모든 곳에 영향이 전파된다. 










