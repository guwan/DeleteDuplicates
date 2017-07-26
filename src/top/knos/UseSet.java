package top.knos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UseSet implements Processor<Integer> {

	@Override
	public List<Integer> distinct(List<Integer> list) {
		if(list.size()==1)
			return list;
		long startTime =startTime();
		Set<Integer> set=new HashSet<>();
		for(Integer i:list){
			set.add(i);
		}
		list=new ArrayList<>(set);
		printTime(list.size(),startTime);
		return list;
	}
}
