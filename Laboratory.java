

public class Laboratory {
     
	int a;
    String b;

	public static void main(String[] args) {
	Laboratory l1 = new Laboratory ();
		String c;
    //  System.out.println(c);                           // 메소드에서 변수 초기화 안하면 에러
        System.out.println(l1.b);                       // 클래스에선 변수 초기화 안해도 컴파일러가 자동 할당
	}

}
