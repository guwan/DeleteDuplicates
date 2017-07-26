package top.knos;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		//Generate 10000 data repeats 5 times
		for(int i=0;i<100000;i++){
			for(int j=0;j<50;j++){
				list.add(i);
			}
		}

		//ListFor listFor=new ListFor();
		//listFor.distinct(list);
		UseSet useSet=new UseSet();
		useSet.distinct(list);
		UseStream sd=new UseStream();
		sd.distinct(list);
		UseParallelStream psd=new UseParallelStream();
		psd.distinct(list);
	}

}
