class Cal3{
	int v1, v2;
	Cal3(int v1, int v2){
		this.v1 = v1; this.v2 = v2;
		System.out.println("Cal3 init!!");
	}
	public int sum() {
		return this.v1+v2;
	}
}
class Cal4 extends Cal3{
	Cal4(int v1, int v2){
		super(v1,v2);
		System.out.println("Cal4 init!!");
	}
	public int minus() {
		return this.v1-v2;
	}
}
public class InheritanceApp2 {

	public static void main(String[] args) {
       Cal3 c1 = new Cal3(2,1); 
       Cal4 c2 = new Cal4(3,1);
       System.out.println(c2.sum());
       System.out.println(c2.minus());
	}

}
