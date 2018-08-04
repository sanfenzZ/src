package src;

public class Player{
	static void play(int index) throws NoThisSoundException{
		if(index <= 10){
			System.out.println("一首歌。。。");
		}else{
			throw new NoThisSoundException("您播放的歌曲不存在");
	}
	}
}
