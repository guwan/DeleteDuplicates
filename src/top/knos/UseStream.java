package top.knos;

import java.util.List;
import java.util.stream.Collectors;

public class UseStream implements Processor<Integer> {
	@Override
	public List<Integer> distinct(List<Integer> list) {
		if (list.size() == 1)
			return list;
		long startTime = startTime();
		
		list = list.stream().distinct().collect(Collectors.toList());
		printTime(list.size(), startTime);
		return list;
	}

}
