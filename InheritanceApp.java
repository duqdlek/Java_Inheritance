class Cal{
int sum(int v1, int v2) {
	return v1 + v2;
    }   

int sum(int v1, int v2, int v3) {
	return this.sum(v1, v2) + v3; //this �� �ڱ��ڽ�
}
}

class Cal1 extends Cal{
	int minus(int v1, int v2) {
	    return v1 - v2;
	}
	//Overriding (�θ� Ŭ������ �θ��� �ű�ٰ� ��� �߰�)
    int sum(int v1, int v2) {
	System.out.println("Cal1!!");
    return super.sum(v1, v2); //super�� �θ�
    }
    
    
    //overloading (Overriding�� ����ؼ� sum�̶�� �̸��� ���� �����ϴ� �����ε�����)
/*    int sum(int v1, int v2, int v3) {
    return v1 + v2+v3;
    }
   */ 
    
}

class InheritanceApp{ 
public static void main(String[] args) {
	Cal c1 = new Cal ();
	System.out.println(c1.sum(2, 3));
//	System.out.println(c1.sum(2, 1,3));
	Cal1 c2 = new Cal1 ();
	System.out.println(c2.minus(3, 2));
	System.out.println(c2.sum(2, 3));
    }
}