package src;

public class Player{
	static void play(int index) throws NoThisSoundException{
		if(index <= 10){
			System.out.println("һ�׸衣����");
		}else{
			throw new NoThisSoundException("�����ŵĸ���������");
	}
	}
}
