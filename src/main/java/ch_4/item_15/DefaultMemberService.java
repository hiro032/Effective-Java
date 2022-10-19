package ch_4.item_15;

public class DefaultMemberService implements MemberSerivce{

	private String name;

	private class PrivateClass {
		public void printName() {
			System.out.println("name = " + name);
		}
	}

	private static class StaticPrivateClass {
		public void printName() {

		}
	}
}
