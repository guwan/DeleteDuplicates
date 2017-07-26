package top.knos;

import java.util.List;
import java.util.ArrayList;

public class ListFor implements Processor<Integer> {

	@Override
	public List<Integer> distinct(List<Integer> list) {
		if(list.size()==1)
			return list;
		long startTime =startTime();
		List<Integer> tempList =new ArrayList<>();
		for(int i=0;i<list.size();i++){
			if(!tempList.contains(list.get(i))){
				tempList.add(list.get(i));
			}
		}
		printTime(tempList.size(),startTime);
		return tempList;
	}

}
