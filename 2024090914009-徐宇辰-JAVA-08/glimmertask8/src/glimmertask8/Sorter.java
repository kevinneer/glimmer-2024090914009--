package glimmertask8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {

	public static void main(String[] args) {
		List<String> songs = MockSongs.getSongStrings();//获取歌曲列表

		//Collections.sort(songs);//对歌曲列表进行排序

		Collections.sort(songs, new SongComparator());
		for (String song : songs) {
			System.out.println(song);
		}//遍历List容器打印排序后的song
	}

}

class SongComparator implements Comparator<String>{

	//重写Comparator中的方法，让歌曲按名称长短排序
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if( o1.length() > o2.length()) {
			return -1;//o1在o2前
		}if( o1.length() < o2.length()) {
			return 1;//o1在o2后
		}else{
			return 0;//o1和o2相等，可不换
		}
		
		
		//return Integer.compare(o1.length(), o2.length());
	}
	
}
//Comparator.compare 会返回一个整数，这个整数需要符合以下规则：

//如果 o1 应该排在 o2 之前，则返回一个小于 0 的值。
//如果 o1 和 o2 相等，则返回 0。
//如果 o1 应该排在 o2 之后，则返回一个大于 0 的值。
